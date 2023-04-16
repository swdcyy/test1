package com.alipay.apmobilesecuritysdk.e.i;
import java.util.HashMap;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.util.Map;
import x6.a;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.c;
import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import java.lang.System;
import java.lang.Math;
import java.lang.Throwable;
import com.alipay.apmobilesecuritysdk.c.a;

public final class i	// class@000e74
{
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static Map f;

    static {
       i.f = new HashMap();
    }
    public static synchronized String a(String p0){
       _monitor_enter(i.class);
       p0 = "apdidTokenCache"+p0;
       if (i.f.containsKey(p0)) {
          p0 = i.f.get(p0);
          if (a.e(p0)) {
             _monitor_exit(i.class);
             return p0;
          }
       }
       _monitor_exit(i.class);
       return "";
    }
    public static synchronized void a(){
       _monitor_enter(i.class);
       _monitor_exit(i.class);
    }
    public static synchronized void a(b p0){
       _monitor_enter(i.class);
       if (p0 != null) {
          i.a = p0.a;
          i.b = p0.b;
          i.c = p0.c;
       }
       _monitor_exit(i.class);
       return;
    }
    public static synchronized void a(c p0){
       _monitor_enter(i.class);
       if (p0 != null) {
          i.a = p0.a;
          i.b = p0.b;
          i.d = p0.d;
          i.e = p0.e;
          i.c = p0.c;
       }
       _monitor_exit(i.class);
       return;
    }
    public static synchronized void a(String p0,String p1){
       _monitor_enter(i.class);
       p0 = "apdidTokenCache"+p0;
       if (i.f.containsKey(p0)) {
          i.f.remove(p0);
       }
       i.f.put(p0, p1);
       _monitor_exit(i.class);
       return;
    }
    public static synchronized boolean a(Context p0,String p1){
       _monitor_enter(i.class);
       long l = h.a(p0);
       if (l < 0) {
          l = 0x5265c00;
       }
       boolean b = (Math.abs((System.currentTimeMillis() - h.h(p0, p1))) - l < 0)? true: false;
       _monitor_exit(i.class);
       return b;
    }
    public static synchronized String b(){
       _monitor_enter(i.class);
       _monitor_exit(i.class);
       return i.a;
    }
    public static void b(String p0){
       i.a = p0;
    }
    public static synchronized String c(){
       _monitor_enter(i.class);
       _monitor_exit(i.class);
       return i.b;
    }
    public static void c(String p0){
       i.b = p0;
    }
    public static synchronized String d(){
       _monitor_enter(i.class);
       _monitor_exit(i.class);
       return i.d;
    }
    public static void d(String p0){
       i.c = p0;
    }
    public static synchronized String e(){
       _monitor_enter(i.class);
       _monitor_exit(i.class);
       return i.e;
    }
    public static void e(String p0){
       i.d = p0;
    }
    public static synchronized String f(){
       _monitor_enter(i.class);
       _monitor_exit(i.class);
       return i.c;
    }
    public static void f(String p0){
       i.e = p0;
    }
    public static synchronized c g(){
       _monitor_enter(i.class);
       c uoc = new c(i.a, i.b, i.c, i.d, i.e);
       _monitor_exit(i.class);
       return v7;
    }
    public static void h(){
       i.f.clear();
       i.a = "";
       i.b = "";
       i.d = "";
       i.e = "";
       i.c = "";
    }
}
