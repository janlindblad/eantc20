/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/SNMP-COMMUNITY-MIB.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module SNMP-COMMUNITY-MIB.yang */
public class SNMPCOMMUNITYMIB extends ConfNamespace {
    public static final int hash = 1327819113;
    public int hash() {
        return SNMPCOMMUNITYMIB.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://tail-f.com/ns/mibs/SNMP-COMMUNITY-MIB/200308060000Z";
    public String id() {
        return SNMPCOMMUNITYMIB.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://tail-f.com/ns/mibs/SNMP-COMMUNITY-MIB/200308060000Z";
    public String uri() {
        return SNMPCOMMUNITYMIB.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(SNMPCOMMUNITYMIB.uri);
    }

    public static final String prefix = "SNMP-COMMUNITY-MIB";
    public String prefix() {
        return SNMPCOMMUNITYMIB.prefix;
    }

    public SNMPCOMMUNITYMIB() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _snmpCommunityName = 1560753548;
    public static final String _snmpCommunityName_ = "snmpCommunityName";
    public static final int    _snmpCommunityTransportTag = 69835094;
    public static final String _snmpCommunityTransportTag_ = "snmpCommunityTransportTag";
    public static final int    _snmpCommunitySecurityName = 1374460352;
    public static final String _snmpCommunitySecurityName_ = "snmpCommunitySecurityName";
    public static final int    _snmpCommunityStorageType = 124038892;
    public static final String _snmpCommunityStorageType_ = "snmpCommunityStorageType";
    public static final int    _SNMP_COMMUNITY_MIB = 1653069652;
    public static final String _SNMP_COMMUNITY_MIB_ = "SNMP-COMMUNITY-MIB";
    public static final int    _snmpCommunityTable = 280139721;
    public static final String _snmpCommunityTable_ = "snmpCommunityTable";
    public static final int    _snmpCommunityIndex = 1505068825;
    public static final String _snmpCommunityIndex_ = "snmpCommunityIndex";
    public static final int    _snmpCommunityContextName = 961992310;
    public static final String _snmpCommunityContextName_ = "snmpCommunityContextName";
    public static final int    _snmpCommunityEntry = 209424543;
    public static final String _snmpCommunityEntry_ = "snmpCommunityEntry";
    public static final int    _snmpCommunityContextEngineID = 1275322069;
    public static final String _snmpCommunityContextEngineID_ = "snmpCommunityContextEngineID";
}