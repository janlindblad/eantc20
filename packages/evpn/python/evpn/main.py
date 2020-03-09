#!/usr/bin/env python3
# -*- mode: python; python-indent: 4 -*-
import ncs
from ncs.application import Service
from hashlib import md5
from functools import reduce

def get_hash(s, minval=1000, maxval = 10000):
    m = md5()
    m.update(s.encode())
    return reduce(lambda a,v: a*256+v, m.digest()[:4], 0) % (maxval-minval) + minval

# ----------------
# SERVICE CALLBACK
# ----------------
class ServiceCallbacks(Service):
    @Service.create
    def cb_create(self, tctx, root, service, proplist):
        self.log.info('<=== Service create(service=', service._path, ')')
        try:
            self.log.info(':::: name ', service.name, ': ', service.a, ' to ', service.z)
            svcid = service.name+service.a+service.z
            vni = get_hash(svcid, 1, 100)
            self.log.info(':::: vni ', vni)

            # COMMON
            template = ncs.template.Template(service)
            vars = ncs.template.Variables()
            vars.add('SERVICE_NAME',  service.name)
            vars.add('VNI',           vni)
            vars.add('EVI',           vni)
            vars.add('VLANID',        vni)
            vars.add('RT',            get_hash(svcid, 1, 99))

            # PREPARE A-SIDE
            vars.add('DEVICE',        root.evpn__evpn.sites.site[service.a].device)
            vars.add('CE_INTERFACE',  root.evpn__evpn.sites.site[service.a].interface)
            vars.add('RD_IPV4',       root.evpn__evpn.sites.site[service.a].ipv4_address)

            # INSTANTIATE A-SIDE
            self.log.info('AAAA apply a-side: ', vars)
            template.apply('evpn-template', vars)

            # PREPARE Z-SIDE
            vars.add('DEVICE',        root.evpn__evpn.sites.site[service.z].device)
            vars.add('CE_INTERFACE',  root.evpn__evpn.sites.site[service.z].interface)
            vars.add('RD_IPV4',       root.evpn__evpn.sites.site[service.z].ipv4_address)

            # INSTANTIATE Z-SIDE
            self.log.info('ZZZZ apply z-side: ', vars)
            template.apply('evpn-template', vars)

        except Exception as ex:
            self.log.error('XXXX Exception: ', ex)

        self.log.info('===> Service create done.')

# ---------------------------------------------
# COMPONENT THREAD THAT WILL BE STARTED BY NCS.
# ---------------------------------------------
class Main(ncs.application.Application):
    def setup(self):
        try:
            self.log.info('Main RUNNING')
            self.register_service('evpn-servicepoint', ServiceCallbacks)
        except Exception as ex:
            self.log.error('**** Exception: ', ex)

    def teardown(self):
        self.log.info('Main FINISHED')
