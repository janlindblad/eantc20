/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-dot1x-if-cfg.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-dot1x-if-cfg.yang */
public class CiscoIOSXRDot1xIfCfg extends ConfNamespace {
    public static final int hash = 346151471;
    public int hash() {
        return CiscoIOSXRDot1xIfCfg.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-dot1x-if-cfg";
    public String id() {
        return CiscoIOSXRDot1xIfCfg.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-dot1x-if-cfg";
    public String uri() {
        return CiscoIOSXRDot1xIfCfg.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRDot1xIfCfg.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-dot1x-if-cfg";
    public String prefix() {
        return CiscoIOSXRDot1xIfCfg.prefix;
    }

    public CiscoIOSXRDot1xIfCfg() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _dot1x_interface = 95655006;
    public static final String _dot1x_interface_ = "dot1x-interface";
    public static final int    _dot1x_profile = 1348628431;
    public static final String _dot1x_profile_ = "dot1x-profile";
    public static final int    _eapol_dest_addr = 1547379745;
    public static final String _eapol_dest_addr_ = "eapol-dest-addr";
}
