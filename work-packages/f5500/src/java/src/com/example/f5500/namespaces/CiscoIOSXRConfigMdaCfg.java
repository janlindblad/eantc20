/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-config-mda-cfg.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-config-mda-cfg.yang */
public class CiscoIOSXRConfigMdaCfg extends ConfNamespace {
    public static final int hash = 629998235;
    public int hash() {
        return CiscoIOSXRConfigMdaCfg.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-config-mda-cfg";
    public String id() {
        return CiscoIOSXRConfigMdaCfg.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-config-mda-cfg";
    public String uri() {
        return CiscoIOSXRConfigMdaCfg.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRConfigMdaCfg.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-config-mda-cfg";
    public String prefix() {
        return CiscoIOSXRConfigMdaCfg.prefix;
    }

    public CiscoIOSXRConfigMdaCfg() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _preconfigured_node = 1634445668;
    public static final String _preconfigured_node_ = "preconfigured-node";
    public static final int    _active_node = 1866616408;
    public static final String _active_node_ = "active-node";
    public static final int    _node_name = 122353445;
    public static final String _node_name_ = "node-name";
    public static final int    _active_nodes = 244580728;
    public static final String _active_nodes_ = "active-nodes";
    public static final int    _preconfigured_nodes = 422512595;
    public static final String _preconfigured_nodes_ = "preconfigured-nodes";
}
