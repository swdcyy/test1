package com.cmic.sso.sdk.e.r;
import java.lang.String;
import java.util.UUID;
import com.cmic.sso.sdk.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.a.a;
import com.cmic.sso.sdk.e.k;
import java.lang.System;

public class r	// class@000f6f
{
    public static final char[] a;

    static {
       r.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public static String a(){
       return (UUID.randomUUID().toString()).replaceAll("-", "");
    }
    public static String a(byte[] p0){
       if (p0 == null) {
          return "";
       }
       char[] uocharArray = new char[(p0.length * 2)];
       int len = p0.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int b = p0[i];
          int i2 = i1 + 1;
          char[] a = r.a;
          int i3 = b >> 4;
          i3 = i3 & 0x0f;
          uocharArray[i1] = a[i3];
          i1 = i2 + 1;
          b = b & 0x0f;
          uocharArray[i2] = a[b];
       }
       return new String(uocharArray);
    }
    public static void a(a p0,String p1){
       if (TextUtils.isEmpty(p0.b("interfaceType", ""))) {
          p0.a("interfaceType", p1);
       }else {
          p0.a("interfaceType", p0.b("interfaceType")+";"+p1);
       }
       return;
    }
    public static boolean a(a p0){
       boolean b = ((k.a("logCloseTime", 0) + (long)(((p0.l() * 60) * 60) * 1000)) - System.currentTimeMillis() >= 0)? true: false;
       return b;
    }
    public static String b(){
       return (r.c()).replace("-", "");
    }
    public static void b(a p0,String p1){
       if (TextUtils.isEmpty(p0.b("interfaceCode", ""))) {
          p0.a("interfaceCode", p1);
       }else {
          p0.a("interfaceCode", p0.b("interfaceCode")+";"+p1);
       }
       return;
    }
    public static String c(){
       return UUID.randomUUID().toString();
    }
    public static void c(a p0,String p1){
       if (TextUtils.isEmpty(p0.b("interfaceElasped", ""))) {
          p0.a("interfaceElasped", p1);
       }else {
          p0.a("interfaceElasped", p0.b("interfaceElasped")+";"+p1);
       }
       return;
    }
}
