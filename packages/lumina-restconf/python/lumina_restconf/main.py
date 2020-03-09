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
      if op == ncs.MOP_VALUE_SET:
        self.log.info(f'Subscriber set: {keypath} {op} {newval}')
      elif op == ncs.MOP_CREATE:
        self.log.info(f'Subscriber create: {keypath} {op} {newval}')
      return ncs.ITER_RECURSE
    except Exception as ex:
      self.log.info(f'Subscriber exception: {ex}')
      return ncs.ITER_RECURSE

  # This will run in a separate thread to avoid a transaction deadlock
  def post_iterate(self, state):
    self.log.info('LuminaController: post_iterate, state=', state)

    # DO YOUR STUFF HERE...
    pass

  # determine if post_iterate() should run
  def should_post_iterate(self, state):
      return state != []


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
