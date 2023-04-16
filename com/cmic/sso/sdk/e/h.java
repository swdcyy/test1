package com.cmic.sso.sdk.e.h;
import com.cmic.sso.sdk.e.m;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.k;
import java.lang.Object;
import android.content.Context;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.b;
import java.lang.StringBuilder;
import java.lang.System;
import com.cmic.sso.sdk.e.h$1;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.e.o;
import com.cmic.sso.sdk.e.k$a;
import com.cmic.sso.sdk.a;
import java.lang.Math;

public class h	// class@000f61
{
    public static final boolean a;
    public static String b;
    public static String c;
    public static long d;

    static {
       h.a = m.a();
       h.d = 0;
    }
    public static int a(String p0){
       String c;
       if (!TextUtils.isEmpty(h.c)) {
          c = h.c;
       }else {
          c = k.b("pre_sim_key", "");
          h.c = c;
       }
       if (TextUtils.isEmpty(c)) {
          return 0;
       }else if(c.equals(p0)){
          return 1;
       }else {
          return 2;
       }
    }
    public static String a(Context p0){
       if (!TextUtils.isEmpty(h.b)) {
          return h.b;
       }
       String str = "";
       String str1 = k.b("phonescripcache", str);
       if (TextUtils.isEmpty(str1)) {
          c.a("PhoneScripUtils", "null");
          return null;
       }else {
          h.d = k.a("phonescripstarttime", 0);
          h.c = k.b("pre_sim_key", str);
          String str2 = b.b(p0, str1);
          h.b = str2;
          return str2;
       }
    }
    public static void a(Context p0,String p1,long p2,String p3){
       h.b(p0, p1, p2, p3);
    }
    public static void a(Context p0,String p1,long p2,String p3,String p4){
       if (!TextUtils.isEmpty(p1) && (!TextUtils.isEmpty(p3) && p2 - null > 0)) {
          c.b("PhoneScripUtils", "save phone scrip simKey = "+p3);
          h.b = p1;
          p2 = p2 * 1000;
          h.d = System.currentTimeMillis() + p2;
          c.b("sLifeTime", h.d+"");
          h.c = p3;
          if (!h.a && !("operator").equals(p4)) {
             o.a(new h$1(p0, p1, p3));
          }else {
             long l = 0x36ee80;
             h.d = (p2 - l > 0)? System.currentTimeMillis() + l: System.currentTimeMillis() + p2;
          }
       }
    label_007a :
       return;
    }
    public static void a(boolean p0,boolean p1){
       k$a uoa = k.a();
       uoa.a("phonescripstarttime");
       uoa.a("phonescripcache");
       uoa.a("pre_sim_key");
       if (p1) {
          uoa.a();
       }else {
          uoa.b();
       }
       if (p0) {
          h.b = null;
          h.c = null;
          h.d = 0;
       }
       return;
    }
    public static boolean a(){
       return h.a;
    }
    public static boolean a(long p0){
       long l = System.currentTimeMillis();
       c.b("PhoneScripUtils", p0+"");
       c.b("PhoneScripUtils", l+"");
       p0 = p0 - l;
       boolean b = (p0 - 0x2710 > 0)? true: false;
       return b;
    }
    public static boolean a(a p0){
       if (k.a("phonescripversion", 0) != 1) {
          h.a(true, 0);
          b.a();
          c.b("PhoneScripUtils", "phonescriptvirsion change = ");
          return 0;
       }else {
          int i = h.a(p0.b("scripKey"));
          p0.a("imsiState", i+"");
          c.b("PhoneScripUtils", "simState = "+i);
          if (i != 1) {
             if (i == 2) {
                h.a(true, 0);
             }
             return 0;
          }else if(h.a){
             c.b("PhoneScripUtils", "phone is root");
             h.a(0, 0);
          }
          return h.d();
       }
    }
    public static long b(){
       long d;
       long l = System.currentTimeMillis();
       if (!TextUtils.isEmpty(h.b)) {
          c.b("PhoneScripUtils", h.c+" "+h.d);
          d = h.d;
       }else {
          d = k.a("phonescripstarttime", 0);
          if (TextUtils.isEmpty(k.b("phonescripcache", ""))) {
             d = 0;
          label_0048 :
             return Math.max((d / 1000), 0);
          }
       }
       d = (d - l) - 0x2710;
       goto label_0048 ;
    }
    public static void b(Context p0,String p1,long p2,String p3){
       String str = b.a(p0, p1);
       if (!TextUtils.isEmpty(str)) {
          k$a uoa = k.a();
          uoa.a("phonescripcache", str);
          uoa.a("phonescripstarttime", p2);
          uoa.a("phonescripversion", 1);
          uoa.a("pre_sim_key", p3);
          uoa.b();
       }
       return;
    }
    public static long c(){
       return h.d;
    }
    public static boolean d(){
       if (!TextUtils.isEmpty(h.b)) {
          c.b("PhoneScripUtils", h.c+" "+h.d);
          return h.a(h.d);
       }else {
          long l = k.a("phonescripstarttime", 0);
          boolean b = (!TextUtils.isEmpty(k.b("phonescripcache", "")) && h.a(l))? true: false;
          return b;
       }
    }
}
