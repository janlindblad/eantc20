/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-sysadmin-entity-state-tc-mib.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-sysadmin-entity-state-tc-mib.yang */
public class CiscoIOSXRSysadminEntityStateTcMib extends ConfNamespace {
    public static final int hash = 1949178303;
    public int hash() {
        return CiscoIOSXRSysadminEntityStateTcMib.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-entity-state-tc-mib";
    public String id() {
        return CiscoIOSXRSysadminEntityStateTcMib.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-entity-state-tc-mib";
    public String uri() {
        return CiscoIOSXRSysadminEntityStateTcMib.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRSysadminEntityStateTcMib.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-sysadmin-entity-state-tc-mib";
    public String prefix() {
        return CiscoIOSXRSysadminEntityStateTcMib.prefix;
    }

    public CiscoIOSXRSysadminEntityStateTcMib() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    __bm_EntityAlarmStatus_warning = 32;
    public static final String __bm_EntityAlarmStatus_warning_ = "warning";
    public static final int    __bm_EntityAlarmStatus_underRepair = 2;
    public static final String __bm_EntityAlarmStatus_underRepair_ = "underRepair";
    public static final int    __bm_EntityAlarmStatus_major = 8;
    public static final String __bm_EntityAlarmStatus_major_ = "major";
    public static final int    __bm_EntityAlarmStatus_minor = 16;
    public static final String __bm_EntityAlarmStatus_minor_ = "minor";
    public static final int    __bm_EntityAlarmStatus_critical = 4;
    public static final String __bm_EntityAlarmStatus_critical_ = "critical";
    public static final int    __bm_EntityAlarmStatus_unknown = 1;
    public static final String __bm_EntityAlarmStatus_unknown_ = "unknown";
    public static final int    __bm_EntityAlarmStatus_indeterminate = 64;
    public static final String __bm_EntityAlarmStatus_indeterminate_ = "indeterminate";
}