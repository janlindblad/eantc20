/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-sysadmin-entity-state-mib.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-sysadmin-entity-state-mib.yang */
public class CiscoIOSXRSysadminEntityStateMib extends ConfNamespace {
    public static final int hash = 543235706;
    public int hash() {
        return CiscoIOSXRSysadminEntityStateMib.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-entity-state-mib";
    public String id() {
        return CiscoIOSXRSysadminEntityStateMib.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://www.cisco.com/ns/yang/Cisco-IOS-XR-sysadmin-entity-state-mib";
    public String uri() {
        return CiscoIOSXRSysadminEntityStateMib.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRSysadminEntityStateMib.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-sysadmin-entity-state-mib";
    public String prefix() {
        return CiscoIOSXRSysadminEntityStateMib.prefix;
    }

    public CiscoIOSXRSysadminEntityStateMib() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _ENTITY_STATE_MIB = 1883389275;
    public static final String _ENTITY_STATE_MIB_ = "ENTITY-STATE-MIB";
    public static final int    _entStateAlarm = 15990920;
    public static final String _entStateAlarm_ = "entStateAlarm";
    public static final int    _entStateLastChanged = 1826236701;
    public static final String _entStateLastChanged_ = "entStateLastChanged";
    public static final int    _entPhysicalIndex = 1204442522;
    public static final String _entPhysicalIndex_ = "entPhysicalIndex";
    public static final int    _entStateTable = 1351381978;
    public static final String _entStateTable_ = "entStateTable";
    public static final int    _entStateAdmin = 2088530183;
    public static final String _entStateAdmin_ = "entStateAdmin";
    public static final int    _entStateOper = 2121032549;
    public static final String _entStateOper_ = "entStateOper";
    public static final int    _entStateStandby = 1205962651;
    public static final String _entStateStandby_ = "entStateStandby";
    public static final int    _entStateUsage = 691298903;
    public static final String _entStateUsage_ = "entStateUsage";
    public static final int    _entStateEntry = 915106454;
    public static final String _entStateEntry_ = "entStateEntry";
}
