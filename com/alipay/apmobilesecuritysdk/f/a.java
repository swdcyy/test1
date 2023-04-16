package com.alipay.apmobilesecuritysdk.f.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import x6.a;
import z6.e;
import w6.c;
import z6.b;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import java.lang.System;
import z6.c;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;

public class a	// class@000e75
{

    public void a(){
       super();
    }
    public static String a(Context p0,String p1,String p2){
       String str = null;
       if (p0 == null || (!a.c(p1) && !a.c(p2))) {
          String str1 = e.a(p0, p1, p2, "");
          if (a.c(str1)) {
             return str;
          }else {
             str = c.d(c.a(), str1);
          }
       }
       return str;
    }
    public static String a(String p0,String p1){
       _monitor_enter(a.class);
       if (a.c(p0) || a.c(p1)) {
          _monitor_exit(a.class);
          return null;
       }else {
          p0 = b.a(p0);
          if (a.c(p0)) {
             _monitor_exit(a.class);
             return null;
          }else {
             p0 = new JSONObject(p0).getString(p1);
             if (a.c(p0)) {
                _monitor_exit(a.class);
                return null;
             }else {
                _monitor_exit(a.class);
                return c.d(c.a(), p0);
             }
          }
       }
    }
    public static void a(Context p0,String p1,String p2,String p3){
       if (a.c(p1) || (!a.c(p2) && p0 != null)) {
          HashMap hashMap = new HashMap();
          hashMap.put(p2, c.b(c.a(), p3));
          e.b(p0, p1, hashMap);
       }
    label_0022 :
       return;
    }
    public static void a(String p0,String p1,String p2){
       File uFile;
       _monitor_enter(a.class);
       if (a.c(p0) || a.c(p1)) {
          _monitor_exit(a.class);
          return;
       }else {
          String str = b.a(p0);
          JSONObject jSONObject = new JSONObject();
          if (a.e(str)) {
             try{
                jSONObject = new JSONObject(str);
             }catch(java.lang.Exception e0){
                jSONObject = new JSONObject();
             }
          }
       }
    }
}
