package com.kuaishou.android.security.base.perf.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.HashMap;
import android.os.Process;
import java.lang.Thread;
import android.content.Context;
import com.kuaishou.android.security.base.util.a;
import java.util.Locale;
import java.lang.Throwable;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.perf.d;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.lang.System;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.util.Map;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class l	// class@000f0f
{
    public static Context a;
    public static String b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static Class g;
    public static Class h;
    public static Class i;
    public static Constructor j;
    public static Method k;
    public static Method l;
    public static Method m;
    public static Method n;
    public static final char[] o;

    static {
       l.o = ("0123456789abcdef").toCharArray();
    }
    public void l(){
       super();
    }
    public static int a(String p0,int p1,int p2,String p3,long p4,String p5,String p6,String p7,String p8,String p9){
       String obj1;
       l ol = l.class;
       Object obj = null;
       int i = 6;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = Long.valueOf(p4);
          objArray[5] = p5;
          objArray[i] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          obj1 = PatchProxy.apply(objArray, obj, ol, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       if (p0 != null && p0.length()) {
          obj1 = "Page_SecurityGuardSDK";
          int i1 = 0x4e1f;
          object oobject = (p3 != null)? p3: "";
          String str = String.valueOf((p1 % 100));
          HashMap hashMap = new HashMap();
          hashMap.put("plugin", String.valueOf(p2));
          hashMap.put("pid", String.valueOf(Process.myPid()));
          hashMap.put("tid", String.valueOf(Thread.currentThread().getId()));
          hashMap.put("time", String.valueOf(p4));
          if (!l.d) {
             l.c = a.a(l.a);
             l.d = 1;
          }
          hashMap.put("ui", String.valueOf(l.c));
          hashMap.put("sid", l.a());
          hashMap.put("uuid", l.b());
          hashMap.put("msg", l.a(p5));
          hashMap.put("rsv1", l.a(p6));
          hashMap.put("rsv2", l.a(p7));
          hashMap.put("rsv3", l.a(p8));
          hashMap.put("rsv4", l.a(p9));
          hashMap.put("stacktrace", l.c());
          Object[] objArray1 = new Object[i];
          objArray1[0] = obj1;
          objArray1[1] = Integer.valueOf(i1);
          objArray1[2] = p0;
          objArray1[3] = oobject;
          objArray1[4] = str;
          objArray1[5] = hashMap.toString();
          obj1 = String.format(Locale.getDefault(), "report exception %s %d %s %s %s %s", objArray1);
          KSecurityTrack.eLog(obj1, obj);
          d.a(d$b.f, obj1, b.j);
       }
    label_0144 :
       return 0;
    }
    public static synchronized String a(){
       _monitor_enter(l.class);
       String obj = PatchProxy.apply(null, null, l.class, "6");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(l.class);
          return obj;
       }else {
          obj = l.b;
          if (obj == null || !obj.length()) {
             l.b = l.b();
          }
          obj = l.b;
          _monitor_exit(l.class);
          return obj.substring(0, (obj.length() / 8));
       }
    }
    public static String a(int p0,int p1){
       StackTraceElement[] obj;
       String str1;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, ol, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Throwable().getStackTrace();
       if (obj != null && (obj.length > 0 && (p0 > 0 && p1 > 0))) {
          StringBuilder str = "";
          int i = 0;
          int i1 = 0;
          while (i < obj.length && (i1 < p1 && str.length() < p0)) {
             int i2 = 1;
             if (i > i2) {
                i1 = i1 + 1;
                object oobject = obj[i];
                str = str+oobject.getClassName()+"."+oobject.getMethodName();
                int i3 = obj.length - i2;
                if (i < i3) {
                   str = str+"#";
                }
             }
             i = i + 1;
          }
          str1 = str;
       }else {
          str1 = "";
       }
       return str1;
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length()) {
          try{
             p0 = URLEncoder.encode(p0, "UTF-8");
          label_0025 :
             return p0;
          }catch(java.io.UnsupportedEncodingException e3){
             e3.printStackTrace();
          }
       label_0023 :
          p0 = "";
          goto label_0025 ;
       }else {
          goto label_0023 ;
       }
    }
    public static String a(byte[] p0){
       char[] obj = PatchProxy.applyOneRefs(p0, null, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new char[(p0.length * 2)];
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          int i2 = i * 2;
          char[] o = l.o;
          int i3 = i1 >> 4;
          obj[i2] = o[i3];
          i2 = i2 + 1;
          i1 = i1 & 0x0f;
          obj[i2] = o[i1];
       }
       return new String(obj);
    }
    public static void a(Context p0){
       if (p0 != null) {
          l.a = p0;
       }
       return;
    }
    public static String b(){
       String obj = PatchProxy.apply(null, null, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = l.a(MessageDigest.getInstance("SHA-1").digest((UUID.randomUUID().toString()+String.valueOf(System.nanoTime())).getBytes(Charset.forName("UTF-8"))));
       }catch(java.lang.Exception e0){
          obj = "";
       }
       return obj;
    }
    public static String c(){
       String str1;
       StackTraceElement[] obj = PatchProxy.apply(null, null, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Throwable().getStackTrace();
       if (obj != null && obj.length > 0) {
          StringBuilder str = "";
          int i = 0;
          while (i < obj.length) {
             int i1 = 1;
             if (i > i1) {
                object oobject = obj[i];
                str = str+oobject.getClassName()+"."+oobject.getMethodName();
                int i2 = obj.length - i1;
                if (i < i2) {
                   str = str+"#";
                }
             }
             i = i + 1;
          }
          str1 = str;
       }else {
          str1 = "";
       }
       return str1;
    }
    public static int d(){
       l ol = l.class;
       String str = String.class;
       Object obj = PatchProxy.apply(null, null, ol, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!l.f) {
          _monitor_enter(ol);
          if (!l.f) {
             int i = 1;
             try{
                l.g = Class.forName("com.ut.mini.internal.UTOriginalCustomHitBuilder");
                l.h = Class.forName("com.ut.mini.UTAnalytics");
                l.i = Class.forName("com.ut.mini.UTTracker");
             }catch(java.lang.ClassNotFoundException e0){
                l.f = i;
             }
             if (l.f == i) {
                try{
                   Class[] uClassArray = new Class[]{str,Integer.TYPE,str,str,str,Map.class};
                   l.j = l.g.getConstructor(uClassArray);
                   uClassArray = new Class[0];
                   l.k = l.g.getMethod("build", uClassArray);
                   uClassArray = new Class[0];
                   l.l = l.h.getMethod("GetInstance", uClassArray);
                   Class h = l.h;
                   try{
                      String str1 = "getDefaultTracker";
                      uClassArray = new Class[0];
                      l.m = h.getMethod(str1, uClassArray);
                      uClassArray = new Class[i];
                      uClassArray[0] = Map.class;
                      l.n = l.i.getMethod("Send", uClassArray);
                   }catch(java.lang.NoSuchMethodException e0){
                      l.f = i;
                   }
                   if (l.f != i) {
                      l.e = i;
                   }
                }catch(java.lang.NoSuchMethodException e0){
                }
             }
          }
          _monitor_exit(e0);
       }
       return l.e;
    }
}
