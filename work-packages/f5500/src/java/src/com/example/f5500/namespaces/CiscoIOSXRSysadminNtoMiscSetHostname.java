/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-sysadmin-nto-misc-set-hostname.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-sysadmin-nto-misc-set-hostname.yang */
public class CiscoIOSXRSysadminNtoMiscSetHostname extends ConfNamespace {
    public static final int hash = 1600541815;
    public int hash() {
        return CiscoIOSXRSysadminNtoMiscSetHostname.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-nto-misc-set-hostname";
    public String id() {
        return CiscoIOSXRSysadminNtoMiscSetHostname.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-nto-misc-set-hostname";
    public String uri() {
        return CiscoIOSXRSysadminNtoMiscSetHostname.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRSysadminNtoMiscSetHostname.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-sysadmin-nto-misc-set-hostname";
    public String prefix() {
        return CiscoIOSXRSysadminNtoMiscSetHostname.prefix;
    }

    public CiscoIOSXRSysadminNtoMiscSetHostname() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _name = 1998270519;
    public static final String _name_ = "name";
    public static final int    _hostname = 840214230;
    public static final String _hostname_ = "hostname";
}
