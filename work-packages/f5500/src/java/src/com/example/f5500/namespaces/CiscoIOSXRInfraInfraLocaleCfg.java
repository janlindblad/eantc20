/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-infra-infra-locale-cfg.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-infra-infra-locale-cfg.yang */
public class CiscoIOSXRInfraInfraLocaleCfg extends ConfNamespace {
    public static final int hash = 1134851050;
    public int hash() {
        return CiscoIOSXRInfraInfraLocaleCfg.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-infra-infra-locale-cfg";
    public String id() {
        return CiscoIOSXRInfraInfraLocaleCfg.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-infra-infra-locale-cfg";
    public String uri() {
        return CiscoIOSXRInfraInfraLocaleCfg.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRInfraInfraLocaleCfg.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-infra-infra-locale-cfg";
    public String prefix() {
        return CiscoIOSXRInfraInfraLocaleCfg.prefix;
    }

    public CiscoIOSXRInfraInfraLocaleCfg() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _country = 503698059;
    public static final String _country_ = "country";
    public static final int    _locale = 1609156917;
    public static final String _locale_ = "locale";
    public static final int    _language = 2034330531;
    public static final String _language_ = "language";
}