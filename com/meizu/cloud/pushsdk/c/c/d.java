package com.meizu.cloud.pushsdk.c.c.d;
import java.lang.String;
import java.lang.Object;

public class d	// class@0014cc
{

    public static boolean a(String p0){
       boolean b = (!("POST").equals(p0) && (!("PUT").equals(p0) && (!("PATCH").equals(p0) && (("PROPPATCH").equals(p0) || ("REPORT").equals(p0)))))? true: false;
       return b;
    }
    public static boolean b(String p0){
       boolean b = (!d.a(p0) && (!("OPTIONS").equals(p0) && (!("DELETE").equals(p0) && (!("PROPFIND").equals(p0) && (("MKCOL").equals(p0) || ("LOCK").equals(p0))))))? true: false;
       return b;
    }
}
