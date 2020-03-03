/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-crypto-macsec-secy-oper.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-crypto-macsec-secy-oper.yang */
public class CiscoIOSXRCryptoMacsecSecyOper extends ConfNamespace {
    public static final int hash = 1900734537;
    public int hash() {
        return CiscoIOSXRCryptoMacsecSecyOper.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-crypto-macsec-secy-oper";
    public String id() {
        return CiscoIOSXRCryptoMacsecSecyOper.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-crypto-macsec-secy-oper";
    public String uri() {
        return CiscoIOSXRCryptoMacsecSecyOper.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRCryptoMacsecSecyOper.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-crypto-macsec-secy-oper";
    public String prefix() {
        return CiscoIOSXRCryptoMacsecSecyOper.prefix;
    }

    public CiscoIOSXRCryptoMacsecSecyOper() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _out_octets_encrypted = 621431379;
    public static final String _out_octets_encrypted_ = "out-octets-encrypted";
    public static final int    _in_pkts_unused_sa = 395938033;
    public static final String _in_pkts_unused_sa_ = "in-pkts-unused-sa";
    public static final int    _in_octets_decrypted = 1267321972;
    public static final String _in_octets_decrypted_ = "in-octets-decrypted";
    public static final int    _out_pkts_too_long = 1307772991;
    public static final String _out_pkts_too_long_ = "out-pkts-too-long";
    public static final int    _in_pkts_untagged_hit = 1752061422;
    public static final String _in_pkts_untagged_hit_ = "in-pkts-untagged-hit";
    public static final int    _rx_sc_stats = 1458113222;
    public static final String _rx_sc_stats_ = "rx-sc-stats";
    public static final int    _name = 1998270519;
    public static final String _name_ = "name";
    public static final int    _in_pkts_not_using_sa = 782296332;
    public static final String _in_pkts_not_using_sa_ = "in-pkts-not-using-sa";
    public static final int    _interface = 221572658;
    public static final String _interface_ = "interface";
    public static final int    _tx_sc_stats = 1598953056;
    public static final String _tx_sc_stats_ = "tx-sc-stats";
    public static final int    _txsa_stat = 1273827787;
    public static final String _txsa_stat_ = "txsa-stat";
    public static final int    _rxsa_stat = 1444745183;
    public static final String _rxsa_stat_ = "rxsa-stat";
    public static final int    _in_pkts_overrun = 478589421;
    public static final String _in_pkts_overrun_ = "in-pkts-overrun";
    public static final int    _intf_stats = 1095043412;
    public static final String _intf_stats_ = "intf-stats";
    public static final int    _in_pkts_late = 278540241;
    public static final String _in_pkts_late_ = "in-pkts-late";
    public static final int    _out_octets_protected = 928721386;
    public static final String _out_octets_protected_ = "out-octets-protected";
    public static final int    _in_pkts_invalid = 372564238;
    public static final String _in_pkts_invalid_ = "in-pkts-invalid";
    public static final int    _tx_sci = 741173702;
    public static final String _tx_sci_ = "tx-sci";
    public static final int    _in_pkts_delayed = 528934810;
    public static final String _in_pkts_delayed_ = "in-pkts-delayed";
    public static final int    _in_octets_validated = 249108134;
    public static final String _in_octets_validated_ = "in-octets-validated";
    public static final int    _in_pkts_no_tag = 1158439387;
    public static final String _in_pkts_no_tag_ = "in-pkts-no-tag";
    public static final int    _out_pkts_protected = 1972854462;
    public static final String _out_pkts_protected_ = "out-pkts-protected";
    public static final int    _rx_sci = 681761575;
    public static final String _rx_sci_ = "rx-sci";
    public static final int    _secy = 2020908714;
    public static final String _secy_ = "secy";
    public static final int    _out_pkts_untagged = 476425954;
    public static final String _out_pkts_untagged_ = "out-pkts-untagged";
    public static final int    _in_pkts_bad_tag = 246641480;
    public static final String _in_pkts_bad_tag_ = "in-pkts-bad-tag";
    public static final int    _in_pkts_unchecked = 583185584;
    public static final String _in_pkts_unchecked_ = "in-pkts-unchecked";
    public static final int    _in_pkts_ok = 1581791762;
    public static final String _in_pkts_ok_ = "in-pkts-ok";
    public static final int    _interfaces = 321503962;
    public static final String _interfaces_ = "interfaces";
    public static final int    _in_pkts_no_sci = 1179659075;
    public static final String _in_pkts_no_sci_ = "in-pkts-no-sci";
    public static final int    _in_pkts_unknown_sci = 383665026;
    public static final String _in_pkts_unknown_sci_ = "in-pkts-unknown-sci";
    public static final int    _macsec = 1063323203;
    public static final String _macsec_ = "macsec";
    public static final int    _stats = 1979611730;
    public static final String _stats_ = "stats";
    public static final int    _in_pkts_not_valid = 1624475017;
    public static final String _in_pkts_not_valid_ = "in-pkts-not-valid";
    public static final int    _in_pkts_untagged = 1418284707;
    public static final String _in_pkts_untagged_ = "in-pkts-untagged";
    public static final int    _out_pkts_encrypted = 1542243945;
    public static final String _out_pkts_encrypted_ = "out-pkts-encrypted";
    public static final int    _next_pn = 1325429338;
    public static final String _next_pn_ = "next-pn";
}
