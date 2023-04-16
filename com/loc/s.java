package com.loc.s;
import java.lang.String;
import com.loc.x;
import java.security.MessageDigest;
import java.lang.Throwable;
import com.loc.ak;

public final class s	// class@001464
{

    public static String a(String p0){
       if (p0 == null) {
          return null;
       }
       return x.e(s.c(p0));
    }
    public static String a(byte[] p0){
       return x.e(s.a(p0, x.c("ETUQ1")));
    }
    public static byte[] a(byte[] p0,String p1){
       MessageDigest instance = MessageDigest.getInstance(p1);
       instance.update(p0);
       p0 = instance.digest();
       return p0;
    }
    public static String b(String p0){
       return x.f(s.d(p0));
    }
    public static byte[] c(String p0){
       return s.e(p0);
    }
    public static byte[] d(String p0){
       return s.e(p0);
    }
    public static byte[] e(String p0){
       if (p0 == null) {
          return null;
       }
       MessageDigest instance = MessageDigest.getInstance(x.c("ETUQ1"));
       instance.update(x.a(p0));
       return instance.digest();
    }
}
