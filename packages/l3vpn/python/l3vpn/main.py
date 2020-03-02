# -*- mode: python; python-indent: 4 -*-
import ncs
from ncs.application import Service

ip_size_to_mask = [
    "0.0.0.0", 
    "128.0.0.0",       "192.0.0.0",       "224.0.0.0",       "240.0.0.0", 
    "248.0.0.0",       "252.0.0.0",       "254.0.0.0",       "255.0.0.0",
    "255.128.0.0",     "255.192.0.0",     "255.224.0.0",     "255.240.0.0",
    "255.248.0.0",     "255.252.0.0",     "255.254.0.0",     "255.255.0.0",
    "255.255.128.0",   "255.255.192.0",   "255.255.224.0",   "255.255.240.0",
    "255.255.248.0",   "255.255.252.0",   "255.255.254.0",   "255.255.255.0",
    "255.255.255.128", "255.255.255.192", "255.255.255.224", "255.255.255.240",
    "255.255.255.248", "255.255.255.252", "255.255.255.254", "255.255.255.255" ]

ECI_ns       = "urn:eci:params:xml:ns:yang:eci-interfaces-aug"
ERICSSON_ns  = "urn:rdns:com:ericsson:oammodel:ericsson-interfaces-ext-ipos"
UTSTARCOM_ns = "urn.utstar:uar:SRv6VpnCmmCfg"

class Unsupported(Exception):
    pass

# ----------------
# SERVICE CALLBACK
# ----------------
class ServiceCallbacks(Service):

    def allocate_vlanid(self, vlan_name):
        return "2224" #return str(hash(vlan_name)%1000+1000)

    def get_device_rd(self, device_name):
        if device_name=="e6471": return "100.0.0.53:300"
        return "300:2224"

    def get_others(self, root, our_site, our_vpn_id):
        others = []
        for site in root.l3vpn_svc__l3vpn_svc.sites.site:
            if site == our_site:
                continue
            for pol in site.vpn_policies.vpn_policy:
                for ent in pol.entries:
                    for vpn in ent.vpn: 
                        if vpn.vpn_id == our_vpn_id:
                            self.log.info('otherside site: ', site.site_id)
                            others += [site]
        return others

    def ip_add(self, s, incr):
        return s[:s.rfind('.')]+'.'+str(int(s[s.rfind('.')+1:])+incr)        # Not perfect, copy at your own risk

    @Service.create
    def cb_create(self, tctx, root, service, proplist):
      self.log.info('Service create(service=', service._path, ')')
      self.log.info('Copy that (service=', service._path, ')')
      try:

        self.log.info('site ', service.site_id)
        for site_network_access in service.site_network_accesses.site_network_access:
            self.log.info('site-acc: ', site_network_access.site_network_access_id)
            pol_id = site_network_access.vpn_attachment.vpn_policy_id
            device_name = site_network_access.device_reference
            device_capas = root.devices.device[device_name].capability
            self.log.info('device: ', device_name)
            for pol_entry in service.vpn_policies.vpn_policy[pol_id].entries:
                self.log.info('policy: ', pol_entry.id)
                for vpn in pol_entry.vpn:
                    self.log.info('role: ', vpn.site_role)
                    if vpn.site_role != 'l3vpn-svc:any-to-any-role':
                        raise Unsupported("Only any-to-any-role supported")
                    vpn_name = vpn.vpn_id
                    self.log.info('vpn: ', vpn_name)
                    vlan_id = self.allocate_vlanid(vpn_name)
                    self.log.info('vlan_id: ', vlan_id)

                    interface_name         = root.topo__topo[vpn_name,device_name].interface
                    phys_interface_name    = root.topo__topo[vpn_name,device_name].phys_interface
                    router_address         = root.topo__topo[vpn_name,device_name].address
                    self.log.info('vpn_name: ', vpn_name)
                    self.log.info('device_name: ', device_name)
                    self.log.info('interface: ', interface_name)
                    net_addresses  = site_network_access.ip_connection.ipv4.addresses
                    provider_prefix_length = site_network_access.ip_connection.ipv4.addresses.prefix_length
                    self.log.info('interface: ', interface_name, 
                        ' net: ', net_addresses, '/', provider_prefix_length)

                    for other in self.get_others(root, service, vpn_name):
                        self.log.info('otherside sites2: ', other.site_id)
                        for other_site_network_access in other.site_network_accesses.site_network_access:
                            self.log.info('other-site-acc: ', other_site_network_access.site_network_access_id)
                            other_pol_id = other_site_network_access.vpn_attachment.vpn_policy_id
                            other_device_name = other_site_network_access.device_reference
                            other_device = root.topo__topo[vpn_name,other_device_name]

                            vars = ncs.template.Variables()
                            vars.add('DEVICE',               device_name)
                            vars.add('INTERFACE',            interface_name)
                            vars.add('PHYS_INTERFACE',       phys_interface_name)
                            vars.add('VLANID',               vlan_id)
                            vars.add('VRF_ID',               str(int(vlan_id) % 90 + 10)) # 10..99
                            vars.add('VPN_NAME',             vpn_name)
                            vars.add('RD1',                  self.get_device_rd(device_name))
                            vars.add('ROUTER_ADDRESS',       router_address)
                            vars.add('NET',                  net_addresses.provider_address)
                            vars.add('PREFIXLEN',            net_addresses.prefix_length)
                            vars.add('MASK',                 ip_size_to_mask[net_addresses.prefix_length])
                            vars.add('NEXT_HOP',             other_device.address)

                            template = ncs.template.Template(service)
                            template.apply('ce-interface', vars)
                            self.log.info('applied ce-interface template')
                            template.apply('vrf', vars)
                            self.log.info('applied vrf template')

        self.log.info('Service create done.')
      except Exception as e:
        self.log.info('Service exception: %s'%e)

# ---------------------------------------------
# COMPONENT THREAD THAT WILL BE STARTED BY NCS.
# ---------------------------------------------
class Main(ncs.application.Application):
    def setup(self):
        self.log.info('Main RUNNING')
        self.register_service('l3vpn-servicepoint', ServiceCallbacks)
    def teardown(self):
        self.log.info('Main FINISHED')
