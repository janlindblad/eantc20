/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/Cisco-IOS-XR-ipv6-io-oper.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module Cisco-IOS-XR-ipv6-io-oper.yang */
public class CiscoIOSXRIpv6IoOper extends ConfNamespace {
    public static final int hash = 453269180;
    public int hash() {
        return CiscoIOSXRIpv6IoOper.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-ipv6-io-oper";
    public String id() {
        return CiscoIOSXRIpv6IoOper.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/ns/yang/Cisco-IOS-XR-ipv6-io-oper";
    public String uri() {
        return CiscoIOSXRIpv6IoOper.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(CiscoIOSXRIpv6IoOper.uri);
    }

    public static final String prefix = "Cisco-IOS-XR-ipv6-io-oper";
    public String prefix() {
        return CiscoIOSXRIpv6IoOper.prefix;
    }

    public CiscoIOSXRIpv6IoOper() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _total_packets = 1588756876;
    public static final String _total_packets_ = "total-packets";
    public static final int    _lisp_decap_errors = 716158046;
    public static final String _lisp_decap_errors_ = "lisp-decap-errors";
    public static final int    _sent_unreachable_address_messages = 1324642655;
    public static final String _sent_unreachable_address_messages_ = "sent-unreachable-address-messages";
    public static final int    _sent_reassembly_timeouts = 243227130;
    public static final String _sent_reassembly_timeouts_ = "sent-reassembly-timeouts";
    public static final int    _bad_header_packets = 1418174853;
    public static final String _bad_header_packets_ = "bad-header-packets";
    public static final int    _sent_neighbor_advertisement_messages = 2084681121;
    public static final String _sent_neighbor_advertisement_messages_ = "sent-neighbor-advertisement-messages";
    public static final int    _sent_hop_count_expired_messages = 1051409641;
    public static final String _sent_hop_count_expired_messages_ = "sent-hop-count-expired-messages";
    public static final int    _received_echo_request_messages = 633562896;
    public static final String _received_echo_request_messages_ = "received-echo-request-messages";
    public static final int    _received_unreachable_port_messages = 1955238160;
    public static final String _received_unreachable_port_messages_ = "received-unreachable-port-messages";
    public static final int    _sent_unknown_timeout_messages = 957108492;
    public static final String _sent_unknown_timeout_messages_ = "sent-unknown-timeout-messages";
    public static final int    _output_messages = 1680715115;
    public static final String _output_messages_ = "output-messages";
    public static final int    _sent_parameter_unknown_type_messages = 444317393;
    public static final String _sent_parameter_unknown_type_messages_ = "sent-parameter-unknown-type-messages";
    public static final int    _fragments = 2033312045;
    public static final String _fragments_ = "fragments";
    public static final int    _lisp_encap_errors = 777663304;
    public static final String _lisp_encap_errors_ = "lisp-encap-errors";
    public static final int    _received_unreachable_routing_messages = 1133779554;
    public static final String _received_unreachable_routing_messages_ = "received-unreachable-routing-messages";
    public static final int    _received_parameter_error_messages = 1445242025;
    public static final String _received_parameter_error_messages_ = "received-parameter-error-messages";
    public static final int    _received_neighbor_advertisement_messages = 2047276406;
    public static final String _received_neighbor_advertisement_messages_ = "received-neighbor-advertisement-messages";
    public static final int    _traffic = 1801092594;
    public static final String _traffic_ = "traffic";
    public static final int    _local_destination_packets = 578538068;
    public static final String _local_destination_packets_ = "local-destination-packets";
    public static final int    _io_puntback = 2119610330;
    public static final String _io_puntback_ = "io-puntback";
    public static final int    _unknown_protocol_packets = 1285890216;
    public static final String _unknown_protocol_packets_ = "unknown-protocol-packets";
    public static final int    _received_router_advertisement_messages = 1436665441;
    public static final String _received_router_advertisement_messages_ = "received-router-advertisement-messages";
    public static final int    _sent_unreachable_port_messages = 429509849;
    public static final String _sent_unreachable_port_messages_ = "sent-unreachable-port-messages";
    public static final int    _sent_parameter_option_messages = 1882753042;
    public static final String _sent_parameter_option_messages_ = "sent-parameter-option-messages";
    public static final int    _sent_echo_reply_messages = 1267270054;
    public static final String _sent_echo_reply_messages_ = "sent-echo-reply-messages";
    public static final int    _bad_source_address_packets = 1717524703;
    public static final String _bad_source_address_packets_ = "bad-source-address-packets";
    public static final int    _received_unknown_timeout_messages = 1813143614;
    public static final String _received_unknown_timeout_messages_ = "received-unknown-timeout-messages";
    public static final int    _sent_multicast_packets = 302401149;
    public static final String _sent_multicast_packets_ = "sent-multicast-packets";
    public static final int    _sent_unreachable_neighbor_messages = 1167998866;
    public static final String _sent_unreachable_neighbor_messages_ = "sent-unreachable-neighbor-messages";
    public static final int    _source_routed_packets = 951184272;
    public static final String _source_routed_packets_ = "source-routed-packets";
    public static final int    _sent_too_big_messages = 1238166895;
    public static final String _sent_too_big_messages_ = "sent-too-big-messages";
    public static final int    _sent_redirect_messages = 2071013720;
    public static final String _sent_redirect_messages_ = "sent-redirect-messages";
    public static final int    _format_errors = 504718921;
    public static final String _format_errors_ = "format-errors";
    public static final int    _sent_router_solicitation_messages = 320397516;
    public static final String _sent_router_solicitation_messages_ = "sent-router-solicitation-messages";
    public static final int    _reassembly_failures = 98933891;
    public static final String _reassembly_failures_ = "reassembly-failures";
    public static final int    _too_short_error_messages = 1908213460;
    public static final String _too_short_error_messages_ = "too-short-error-messages";
    public static final int    _fragmented_packets = 1127545066;
    public static final String _fragmented_packets_ = "fragmented-packets";
    public static final int    _reassembly_maximum_drops = 1977983460;
    public static final String _reassembly_maximum_drops_ = "reassembly-maximum-drops";
    public static final int    _fragment_count = 7727029;
    public static final String _fragment_count_ = "fragment-count";
    public static final int    _checksum_error_messages = 1127642986;
    public static final String _checksum_error_messages_ = "checksum-error-messages";
    public static final int    _miscellaneous_drops = 1940448362;
    public static final String _miscellaneous_drops_ = "miscellaneous-drops";
    public static final int    _received_too_big_messages = 1952196508;
    public static final String _received_too_big_messages_ = "received-too-big-messages";
    public static final int    _unknown_option_type_packets = 118049490;
    public static final String _unknown_option_type_packets_ = "unknown-option-type-packets";
    public static final int    _reassembly_timeouts = 1917670307;
    public static final String _reassembly_timeouts_ = "reassembly-timeouts";
    public static final int    _received_unreachable_neighbor_messages = 398601041;
    public static final String _received_unreachable_neighbor_messages_ = "received-unreachable-neighbor-messages";
    public static final int    _statistics = 1049034618;
    public static final String _statistics_ = "statistics";
    public static final int    _sent_unreachable_routing_messages = 2025183657;
    public static final String _sent_unreachable_routing_messages_ = "sent-unreachable-routing-messages";
    public static final int    _truncated_packets = 1404650215;
    public static final String _truncated_packets_ = "truncated-packets";
    public static final int    _hop_count_exceeded_packets = 719306111;
    public static final String _hop_count_exceeded_packets_ = "hop-count-exceeded-packets";
    public static final int    _received_router_solicitation_messages = 1197436498;
    public static final String _received_router_solicitation_messages_ = "received-router-solicitation-messages";
    public static final int    _received_neighbor_solicitation_messages = 90298152;
    public static final String _received_neighbor_solicitation_messages_ = "received-neighbor-solicitation-messages";
    public static final int    _sent_rate_limited_packets = 1014812192;
    public static final String _sent_rate_limited_packets_ = "sent-rate-limited-packets";
    public static final int    _received_unreachable_admin_messages = 668929932;
    public static final String _received_unreachable_admin_messages_ = "received-unreachable-admin-messages";
    public static final int    _forwarded_packets = 1868200045;
    public static final String _forwarded_packets_ = "forwarded-packets";
    public static final int    _ipv6 = 1228132394;
    public static final String _ipv6_ = "ipv6";
    public static final int    _received_unreachable_unknown_type_messages = 880333625;
    public static final String _received_unreachable_unknown_type_messages_ = "received-unreachable-unknown-type-messages";
    public static final int    _nodes = 650955465;
    public static final String _nodes_ = "nodes";
    public static final int    _reassembled_packets = 1642130111;
    public static final String _reassembled_packets_ = "reassembled-packets";
    public static final int    _lisp_v4_encap_packets = 662764452;
    public static final String _lisp_v4_encap_packets_ = "lisp-v4-encap-packets";
    public static final int    _sent_unreachable_admin_messages = 824174708;
    public static final String _sent_unreachable_admin_messages_ = "sent-unreachable-admin-messages";
    public static final int    _lisp_v6_decap_packets = 567537575;
    public static final String _lisp_v6_decap_packets_ = "lisp-v6-decap-packets";
    public static final int    _received_hop_count_expired_messages = 2047042019;
    public static final String _received_hop_count_expired_messages_ = "received-hop-count-expired-messages";
    public static final int    _node_name = 122353445;
    public static final String _node_name_ = "node-name";
    public static final int    _sent_unreachable_unknown_type_messages = 552575146;
    public static final String _sent_unreachable_unknown_type_messages_ = "sent-unreachable-unknown-type-messages";
    public static final int    _received_reassembly_timeouts = 1252671540;
    public static final String _received_reassembly_timeouts_ = "received-reassembly-timeouts";
    public static final int    _received_echo_reply_messages = 1437744599;
    public static final String _received_echo_reply_messages_ = "received-echo-reply-messages";
    public static final int    _lisp_v4_decap_packets = 512247017;
    public static final String _lisp_v4_decap_packets_ = "lisp-v4-decap-packets";
    public static final int    _sent_router_advertisement_messages = 1999841314;
    public static final String _sent_router_advertisement_messages_ = "sent-router-advertisement-messages";
    public static final int    _received_redirect_messages = 345524732;
    public static final String _received_redirect_messages_ = "received-redirect-messages";
    public static final int    _received_parameter_option_messages = 2054596561;
    public static final String _received_parameter_option_messages_ = "received-parameter-option-messages";
    public static final int    _sent_neighbor_solicitation_messages = 1917612633;
    public static final String _sent_neighbor_solicitation_messages_ = "sent-neighbor-solicitation-messages";
    public static final int    _total_messages = 379099181;
    public static final String _total_messages_ = "total-messages";
    public static final int    _sent_echo_request_messages = 836475474;
    public static final String _sent_echo_request_messages_ = "sent-echo-request-messages";
    public static final int    _fragment_failures = 458719078;
    public static final String _fragment_failures_ = "fragment-failures";
    public static final int    _received_parameter_unknown_type_messages = 974003765;
    public static final String _received_parameter_unknown_type_messages_ = "received-parameter-unknown-type-messages";
    public static final int    _received_unreachable_address_messages = 1718354972;
    public static final String _received_unreachable_address_messages_ = "received-unreachable-address-messages";
    public static final int    _no_route_packets = 776233909;
    public static final String _no_route_packets_ = "no-route-packets";
    public static final int    _sent_parameter_error_messages = 332603213;
    public static final String _sent_parameter_error_messages_ = "sent-parameter-error-messages";
    public static final int    _node = 2084421367;
    public static final String _node_ = "node";
    public static final int    _generated_packets = 1995717330;
    public static final String _generated_packets_ = "generated-packets";
    public static final int    _lisp_v6_encap_packets = 880869330;
    public static final String _lisp_v6_encap_packets_ = "lisp-v6-encap-packets";
    public static final int    _too_big_packets = 1186520062;
    public static final String _too_big_packets_ = "too-big-packets";
    public static final int    _received_multicast_packets = 722126039;
    public static final String _received_multicast_packets_ = "received-multicast-packets";
    public static final int    _ipv6_node_discovery = 275926920;
    public static final String _ipv6_node_discovery_ = "ipv6-node-discovery";
    public static final int    _unknown_error_type_messages = 1903151761;
    public static final String _unknown_error_type_messages_ = "unknown-error-type-messages";
    public static final int    _sent_parameter_header_messages = 411009172;
    public static final String _sent_parameter_header_messages_ = "sent-parameter-header-messages";
    public static final int    _ipv6_io = 933691571;
    public static final String _ipv6_io_ = "ipv6-io";
    public static final int    _received_parameter_header_messages = 1203061768;
    public static final String _received_parameter_header_messages_ = "received-parameter-header-messages";
    public static final int    _icmp = 1656649427;
    public static final String _icmp_ = "icmp";
}
