package com.alipay.apmobilesecuritysdk.e.h;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import z6.a;
import x6.a;
import java.lang.Long;
import java.lang.StringBuilder;
import z6.e;
import java.util.UUID;
import w6.b;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class h	// class@000e73
{
    public static String a = "";

    public void h(){
       super();
    }
    public static long a(Context p0){
       try{
          String str = a.a(p0, "vkeyid_settings", "update_time_interval");
          long l = 0x5265c00;
          if (a.e(str)) {
             l = Long.parseLong(str);
          }
          return l;
       }catch(java.lang.Exception e0){
       }
    }
    public static void a(Context p0,String p1){
       h.a(p0, "update_time_interval", p1);
    }
    public static void a(Context p0,String p1,long p2){
       a.b(p0, "vkeyid_settings", "vkey_valid"+p1, String.valueOf(p2));
    }
    public static void a(Context p0,String p1,String p2){
       a.b(p0, "vkeyid_settings", p1, p2);
    }
    public static void a(Context p0,boolean p1){
       String str = (p1)? "1": "0";
       h.a(p0, "log_switch", str);
       return;
    }
    public static String b(Context p0){
       return a.a(p0, "vkeyid_settings", "last_apdid_env");
    }
    public static void b(Context p0,String p1){
       h.a(p0, "last_machine_boot_time", p1);
    }
    public static void c(Context p0,String p1){
       h.a(p0, "last_apdid_env", p1);
    }
    public static boolean c(Context p0){
       String str = a.a(p0, "vkeyid_settings", "log_switch");
       if (str != null && ("1").equals(str)) {
          return true;
       }
       return false;
    }
    public static String d(Context p0){
       return a.a(p0, "vkeyid_settings", "dynamic_key");
    }
    public static void d(Context p0,String p1){
       h.a(p0, "agent_switch", p1);
    }
    public static String e(Context p0){
       return a.a(p0, "vkeyid_settings", "apse_degrade");
    }
    public static void e(Context p0,String p1){
       h.a(p0, "dynamic_key", p1);
    }
    public static String f(Context p0){
       _monitor_enter(h.class);
       if (a.c(h.a)) {
          String str = e.a(p0, "alipay_vkey_random", "random", "");
          h.a = str;
          if (a.c(str)) {
             str = b.a(UUID.randomUUID().toString());
             h.a = str;
             if (str != null) {
                SharedPreferences$Editor uEditor = o.c(p0, "alipay_vkey_random", 0).edit();
                if (uEditor != null) {
                   uEditor.putString("random", str);
                   g.b(uEditor);
                }
             }
          }
       }
       _monitor_exit(h.class);
       return h.a;
    }
    public static void f(Context p0,String p1){
       h.a(p0, "webrtc_url", p1);
    }
    public static void g(Context p0,String p1){
       h.a(p0, "apse_degrade", p1);
    }
    public static long h(Context p0,String p1){
       String str = a.a(p0, "vkeyid_settings", "vkey_valid"+p1);
       if (a.c(str)) {
          return 0;
       }
       return Long.parseLong(str);
    }
}
