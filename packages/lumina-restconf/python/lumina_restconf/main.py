#!/usr/bin/env python3
# -*- mode: python; python-indent: 4 -*-
import ncs
import requests, json, uuid
from requests.auth import HTTPBasicAuth

# ------------------------------------------------
# SUBSCRIBER ITERATOR OBJECT
# ------------------------------------------------
class LuminaController(ncs.cdb.Subscriber):
  """This subscriber subscribes to changes in the..."""

  # custom initializer which gets called from the
  # constructor (__int__)
  def init(self):
    self.log.info(f'LuminaController: register subscription')
    rc = self.register('/evpn:evpn', priority=100)
    self.log.info(f'LuminaController: registered subscription {rc}')

  # Initate your local state
  def pre_iterate(self):
    self.log.info('LuminaController: pre_iterate')
    return []

  # Iterate over the change set
  def iterate(self, keypath, op, oldval, newval, state):
    self.log.info(f'Subscriber set: {keypath} {op} {newval}')
    try:
      # Do stuff, e.g test for kind of operation...
      obj = None
      if "/evpn:evpn/sites/site{lum" in str(keypath):
        obj = 'site'
      elif "/evpn:evpn/connections/connection{lum" in str(keypath):
        obj = 'connection'
      if obj:
        key = str(keypath[0][0].as_pyval())
        self.log.info(f'{obj} changed: {keypath[0][0]} {op}')
        if op in [ncs.MOP_MODIFIED, ncs.MOP_CREATED]:
          state.append(('PUT', obj, key))
        elif op in [ncs.MOP_DELETED]:
          state.append(('DELETE', obj, key))
        else:
          self.log.info(f'Unknown {obj} change: {keypath[0][0]} {op} {newval}')
        return ncs.ITER_CONTINUE

      if op == ncs.MOP_MODIFIED:
        self.log.info(f'Ignoring modified: {keypath} {op} {newval}')
      elif op == ncs.MOP_VALUE_SET:
        self.log.info(f'Ignoring set: {keypath} {op} {newval}')
      elif op == ncs.MOP_CREATED:
        self.log.info(f'Ignoring create: {keypath} {op} {newval}')
      elif op == ncs.MOP_DELETED:
        self.log.info(f'Ignoring delete: {keypath} {op} {newval}')
      return ncs.ITER_RECURSE
    except Exception as ex:
      self.log.info(f'Subscriber exception: {ex}')
      return ncs.ITER_RECURSE

#Subscriber set: /evpn:evpn/sites/site{lum1}/name 4 lum1
#Subscriber set: /evpn:evpn/sites/site{lum1}/name 4 lum1
#Subscriber set: /evpn:evpn/sites/site{lum1}/ipv4-address 4 1.1.1.1
#Subscriber set: /evpn:evpn/sites/site{lum1}/ipv4-address 4 1.1.1.1
#Subscriber set: /evpn:evpn/sites/site{lum1}/device 4 adv7
#Subscriber set: /evpn:evpn/sites/site{lum1}/device 4 adv7

  # This will run in a separate thread to avoid a transaction deadlock
  def post_iterate(self, state):
    def gen_xml(t, root_path, key, elem):
      try:
        elem_val = t.get_elem(f'{root_path}{{{key}}}/{elem}')
        return f'<{elem}>{elem_val.as_pyval()}</{elem}>'
      except:
        return ''

    self.log.info('LuminaController: post_iterate, state=', state)
    try:
      restconf_edits = []
      with ncs.maapi.Maapi() as m:
        m.start_user_session('admin', 'test_context')
        with m.start_read_trans() as t:
          for num, item in enumerate(state):
            (op, obj, key) = item
            self.log.info(f"Post-iterate processing: {num} {op} {obj} {key}")
            if op == 'DELETE':
              restconf_edits += [f"""  <edit>
    <edit-id>{num}</edit-id>
    <operation>remove</operation> 
    <target>/evpn:evpn/{obj}s/{obj}={key}</target> 
  </edit>
"""]
            elif op == 'PUT':
              name = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'name')
              device = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'device')
              interface = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'interface')
              ipv4_address = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'ipv4-address')
              ipv6_address = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'ipv6-address')
              a = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'a')
              z = gen_xml(t, f'/evpn:evpn/{obj}s/{obj}', key, 'z')
              payload = f"{name}{device}{interface}{ipv4_address}{ipv6_address}{a}{z}"
              restconf_edits += [f"""  <edit>
    <edit-id>{num}</edit-id>
    <operation>replace</operation> 
    <target>/evpn:evpn/{obj}s/{obj}={key}</target> 
    <value>
      <{obj} xmlns="http://example.com/eantc20/evpn">{payload}</{obj}>
    </value>
  </edit>
"""]
      restconf_msg = f"""<yang-patch xmlns="urn:ietf:params:xml:ns:yang:ietf-yang-patch">
  <patch-id>nso-changes</patch-id>
  {"".join(restconf_edits)}
</yang-patch>"""

      self.log.info(f"Send RESTCONF msg: {restconf_msg}")
      self.restconf_patch(restconf_msg)

    except Exception as ex:
      self.log.info(f'Post-iterator exception: {ex}')

  # determine if post_iterate() should run
  def should_post_iterate(self, state):
      return state != []

  def restconf_patch(self, body):
    #url = 'http://192.168.10.190:38181/restconf/data'
    url = "http://127.0.0.1:18008/restconf/data"
    headers = {
      "Accept": "application/yang-data+xml",
      "Content-Type": "application/yang-patch+xml",
    }
    response = requests.patch(
      url,
      auth=HTTPBasicAuth('admin', 'admin'),
      params=None,
      headers=headers,
      data=body
    )
    self.log.info(f"Received RESTCONF reply: {response}")

# ---------------------------------------------
# COMPONENT THREAD THAT WILL BE STARTED BY NCS.
# ---------------------------------------------
class Main(ncs.application.Application):
  def setup(self):
    # The application class sets up logging for us. It is accessible
    # through 'self.log' and is a ncs.log.Log instance.
    self.log.info('LuminaController RUNNING')
    try:
      # Create your subscriber
      self.sub = LuminaController(app=self)
      self.sub.start()
      self.log.info('LuminaController subscriber STARTED')

    except Exception as ex:
      self.log.info(f'LuminaController exception {ex}')

    # If we registered any callback(s) above, the Application class
    # took care of creating a daemon (related to the service/action point).

    # When this setup method is finished, all registrations are
    # considered done and the application is 'started'.

  def teardown(self):
    # When the application is finished (which would happen if NCS went
    # down, packages were reloaded or some error occurred) this teardown
    # method will be called.

    self.sub.stop()
    self.log.info('LuminaController FINISHED')

def get(restconf_path):
  url = 'http://192.168.10.190:38181/restconf/' + restconf_path
  headers = []
  body = None
  response = requests.get(
    url,
    auth=HTTPBasicAuth('admin', 'admin'),
    params=None,
    headers=headers,
    data=json.dumps(body)
  )
  return response.json()

def main():
  parsed_json = get('config/network-topology:network-topology/topology/topology-netconf')
  print(json.dumps(parsed_json, indent=4, sort_keys=True))
  parsed_json = get('config/ietf-l2vpn-svc:ietf-l2vpn-svc')
  print(json.dumps(parsed_json, indent=4, sort_keys=True))

if __name__ == "__main__":
  main()
