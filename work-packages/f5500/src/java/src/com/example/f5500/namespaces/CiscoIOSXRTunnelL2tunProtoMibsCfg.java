/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-tunnel-l2tun-proto-mibs-cfg.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-tunnel-l2tun-proto-mibs-cfg.yang */
public class CiscoIOSXRTunnelL2tunProtoMibsCfg extends ConfNamespace {
    public static final int hash = 1574773308;
    public int hash() {
        return CiscoIOSXRTunnelL2tunProtoMibsCfg.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-tunnel-l2tun-proto-mibs-cfg";
    public String id() {
        return CiscoIOSXRTunnelL2tunProtoMibsCfg.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-tunnel-l2tun-proto-mibs-cfg";
    public String uri() {
        return CiscoIOSXRTunnelL2tunProtoMibsCfg.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRTunnelL2tunProtoMibsCfg.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-tunnel-l2tun-proto-mibs-cfg";
    public String prefix() {
        return CiscoIOSXRTunnelL2tunProtoMibsCfg.prefix;
    }

    public CiscoIOSXRTunnelL2tunProtoMibsCfg() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _tunnel_down = 1033807038;
    public static final String _tunnel_down_ = "tunnel-down";
    public static final int    _sessions = 972148830;
    public static final String _sessions_ = "sessions";
    public static final int    _tunnel_up = 428209888;
    public static final String _tunnel_up_ = "tunnel-up";
    public static final int    _pseudowire_status = 872304757;
    public static final String _pseudowire_status_ = "pseudowire-status";
    public static final int    _l2tun = 2128363689;
    public static final String _l2tun_ = "l2tun";
}