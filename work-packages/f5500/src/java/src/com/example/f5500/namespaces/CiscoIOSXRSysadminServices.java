/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-sysadmin-services.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-sysadmin-services.yang */
public class CiscoIOSXRSysadminServices extends ConfNamespace {
    public static final int hash = 391103483;
    public int hash() {
        return CiscoIOSXRSysadminServices.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-services";
    public String id() {
        return CiscoIOSXRSysadminServices.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-services";
    public String uri() {
        return CiscoIOSXRSysadminServices.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRSysadminServices.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-sysadmin-services";
    public String prefix() {
        return CiscoIOSXRSysadminServices.prefix;
    }

    public CiscoIOSXRSysadminServices() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _enabled = 197426095;
    public static final String _enabled_ = "enabled";
    public static final int    _interactive = 1306379701;
    public static final String _interactive_ = "interactive";
    public static final int    _service = 855380710;
    public static final String _service_ = "service";
    public static final int    _cli = 1771971819;
    public static final String _cli_ = "cli";
}
