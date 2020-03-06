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
            vars.add('EVI',           get_hash(svcid))
            vars.add('RT',            get_hash(svcid, 1, 99))

            # PREPARE A-SIDE
            vars.add('DEVICE',        root.evpn__evpn.sites.site[service.a].device)
            vars.add('CE_INTERFACE',  root.evpn__evpn.sites.site[service.a].interface)

            # INSTANTIATE A-SIDE
            self.log.info('AAAA apply a-side: ', vars)
            template.apply('evpn-template', vars)

            # PREPARE Z-SIDE
            vars.add('DEVICE',        root.evpn__evpn.sites.site[service.z].device)
            vars.add('CE_INTERFACE',  root.evpn__evpn.sites.site[service.z].interface)

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
        # The application class sets up logging for us. It is accessible
        # through 'self.log' and is a ncs.log.Log instance.
        self.log.info('Main RUNNING')

        # Service callbacks require a registration for a 'service point',
        # as specified in the corresponding data model.
        #
        self.register_service('evpn-servicepoint', ServiceCallbacks)

        # If we registered any callback(s) above, the Application class
        # took care of creating a daemon (related to the service/action point).

        # When this setup method is finished, all registrations are
        # considered done and the application is 'started'.

    def teardown(self):
        # When the application is finished (which would happen if NCS went
        # down, packages were reloaded or some error occurred) this teardown
        # method will be called.

        self.log.info('Main FINISHED')
