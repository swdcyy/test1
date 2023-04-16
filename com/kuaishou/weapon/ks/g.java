package com.kuaishou.weapon.ks.g;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.AssertionError;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.kuaishou.weapon.ks.g$b;
import com.kuaishou.weapon.ks.g$a;
import java.lang.System;
import java.lang.IllegalArgumentException;
import com.kuaishou.weapon.ks.g$c;

public class g	// class@00120f
{
    public static final boolean g = true;
    public static final Pattern h;

    static {
       g.h = Pattern.compile("^\([A-Za-z0-9+/]{4}\)*\([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==\)$");
    }
    public void g(){
       super();
    }
    public static String a(byte[] p0,String p1){
       try{
          return new String(g.c(p0, 0), p1);
       }catch(java.io.UnsupportedEncodingException e2){
          throw new AssertionError(e2);
       }
    }
    public static boolean a(String p0){
       if (p0 == null || p0.equals("")) {
          return false;
       }
       return g.h.matcher(p0).matches();
    }
    public static byte[] a(String p0,int p1){
       return g.a(p0.getBytes(), p1);
    }
    public static byte[] a(byte[] p0){
       return g.a(p0, 0, p0.length, 0);
    }
    public static byte[] a(byte[] p0,int p1){
       return g.a(p0, 0, p0.length, p1);
    }
    public static byte[] a(byte[] p0,int p1,int p2,int p3){
       byte[] uobyteArray = new byte[((p2 * 3) / 4)];
       g$b uob = new g$b(p3, uobyteArray);
       if (!uob.a(p0, p1, p2, true)) {
          throw new IllegalArgumentException("bad base-64");
       }
       g$a b = uob.b;
       g$a a = uob.a;
       if (b == a.length) {
          return a;
       }
       byte[] uobyteArray1 = new byte[b];
       System.arraycopy(a, 0, uobyteArray1, 0, b);
       return uobyteArray1;
    }
    public static String b(String p0,int p1){
       return new String(g.a(p0.getBytes(), p1));
    }
    public static String b(byte[] p0,int p1){
       try{
          return new String(g.c(p0, p1), "US-ASCII");
       }catch(java.io.UnsupportedEncodingException e1){
          throw new AssertionError(e1);
       }
    }
    public static String b(byte[] p0,int p1,int p2,int p3){
       return new String(g.c(p0, p1, p2, p3), "US-ASCII");
    }
    public static byte[] c(byte[] p0,int p1){
       return g.c(p0, 0, p0.length, p1);
    }
    public static byte[] c(byte[] p0,int p1,int p2,int p3){
       int i1;
       g$c uoc = new g$c(p3, null);
       p3 = (p2 / 3) * 4;
       int i = 2;
       if (uoc.e != null) {
          if ((p2 % 3) > 0) {
             p3 = p3 + 4;
          }
       }else {
          i1 = p2 % 3;
          if (i1 != 1) {
             if (i1 == i) {
                p3 = p3 + 3;
             }
          }else {
             p3 = p3 + 2;
          }
       }
       if (uoc.f != null && p2 > 0) {
          i1 = ((p2 - 1) / 57) + 1;
          if (uoc.g == null) {
             i = 1;
          }
          p3 = p3 + (i1 * i);
       }
       byte[] uobyteArray = new byte[p3];
       uoc.a = uobyteArray;
       uoc.a(p0, p1, p2, 1);
       if (g.g || uoc.b == p3) {
          return uoc.a;
       }else {
          throw new AssertionError();
       }
    }
}
