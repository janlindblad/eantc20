/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/fit.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.f5500.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module fit.yang */
public class fit extends ConfNamespace {
    public static final int hash = 1348942991;
    public int hash() {
        return fit.hash;
    }

    public static final String id = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/panini/calvados/fit";
    public String id() {
        return fit.id;
    }

    public static final String uri = "_f5500-nc-1.0:f5500-nc-1.0#http://cisco.com/panini/calvados/fit";
    public String uri() {
        return fit.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(fit.uri);
    }

    public static final String prefix = "fit";
    public String prefix() {
        return fit.prefix;
    }

    public fit() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}