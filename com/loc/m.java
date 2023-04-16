package com.loc.m;
import java.util.Vector;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import android.content.Context;
import com.loc.w;
import java.lang.String;
import com.loc.m$b;
import com.loc.m$e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import com.loc.av;
import java.lang.System;
import com.loc.x;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import java.util.Map;
import com.loc.br;
import com.loc.bs;
import com.loc.m$a;
import com.loc.m$d;
import java.lang.Long;
import java.lang.Throwable;
import com.loc.ak;
import com.loc.m$b$a;
import com.loc.m$b$b;
import android.content.SharedPreferences$Editor;
import com.loc.bj;
import com.loc.m$f;
import com.loc.bi;
import com.loc.ag;
import com.loc.l;
import com.loc.bj$c;
import com.loc.bl$b;
import android.os.SystemClock;
import com.loc.cj;
import com.loc.m$1;
import com.loc.ck;
import com.loc.cl;
import com.loc.o;
import com.loc.bj$a;
import java.util.Iterator;
import java.util.Objects;
import java.lang.Boolean;
import java.net.URLDecoder;
import java.net.InetAddress;
import com.loc.bg;
import java.lang.StringBuilder;
import com.loc.m$c;
import com.loc.bl;
import com.loc.bm;
import java.util.List;
import com.loc.an;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import com.loc.k;
import com.loc.q;
import com.loc.s;
import java.lang.Integer;
import java.util.Queue;
import java.util.Collections;
import java.util.Enumeration;
import java.net.NetworkInterface;
import com.kwai.framework.deviceid.a;
import java.net.InterfaceAddress;
import java.net.Inet6Address;
import java.net.Inet4Address;

public final class m	// class@001454
{
    public static ConcurrentHashMap A;
    public static ArrayList B;
    public static boolean C;
    public static Queue D;
    public static int a;
    public static String b;
    public static Context c;
    public static boolean d;
    public static int e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static String k;
    public static String l;
    public static String m;
    public static String n;
    public static boolean o;
    public static Vector p;
    public static Map q;
    public static String r;
    public static long s;
    public static ConcurrentHashMap t;
    public static ConcurrentHashMap u;
    public static ConcurrentHashMap v;
    public static boolean w;
    public static int x;
    public static int y;
    public static ConcurrentHashMap z;

    static {
       m.p = new Vector();
       m.q = new HashMap();
       m.r = null;
       m.s = 0;
       m.d = false;
       m.t = new ConcurrentHashMap(8);
       m.u = new ConcurrentHashMap(8);
       m.v = new ConcurrentHashMap(8);
       m.w = false;
       m.e = 5000;
       m.f = true;
       m.g = false;
       m.x = 3;
       m.h = true;
       m.i = false;
       m.y = 3;
       m.j = false;
       m.z = new ConcurrentHashMap();
       m.A = new ConcurrentHashMap();
       m.B = new ArrayList();
       m.D = new LinkedList();
    }
    public static m$b a(Context p0,w p1,String p2,String p3,String p4,String p5){
       return m.b(p0, p1, p2, p3, p4, p5);
    }
    public static synchronized m$e a(Context p0,String p1,String p2){
       m$e uoe;
       m$e uoe1;
       _monitor_enter(m.class);
       if (!TextUtils.isEmpty(p1)) {
          int i = 0;
          while (true) {
             if (i < m.p.size()) {
                uoe = m.p.get(i);
                if (uoe != null && p1.equals(m$e.c(uoe))) {
                label_002d :
                   if (uoe != null) {
                      _monitor_exit(m.class);
                      return uoe;
                   }else if(p0 == null){
                      _monitor_exit(m.class);
                      return null;
                   }else {
                      uoe1 = m$e.b(av.b(p0, p2, p1, ""));
                      p2 = x.a(System.currentTimeMillis(), "yyyyMMdd");
                      if (uoe1 == null) {
                         uoe1 = new m$e(p1, p2, 0);
                      }
                      if (!p2.equals(m$e.a(uoe1))) {
                         uoe1.a(p2);
                         m$e.b(uoe1).set(0);
                         break ;
                      }
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }
          }
          m.p.add(uoe1);
          _monitor_exit(m.class);
          return uoe1;
       }
       uoe = null;
       goto label_002d ;
    }
    public static void a(Context p0){
       if (p0 != null) {
          m.c = p0.getApplicationContext();
       }
       return;
    }
    public static void a(Context p0,w p1,String p2){
       HashMap hashMap = new HashMap();
       hashMap.put("amap_sdk_auth_fail", "1");
       hashMap.put("amap_sdk_auth_fail_type", p2);
       hashMap.put("amap_sdk_name", p1.a());
       hashMap.put("amap_sdk_version", p1.c());
       String str = new JSONObject(hashMap).toString();
       if (TextUtils.isEmpty(str)) {
          return;
       }
       try{
          br uobr = new br(p0, "core", "2.0", "O001");
          uobr.a(str);
          bs.a(uobr, p0);
          return;
       }catch(com.loc.k e0){
       }
    }
    public static synchronized void a(Context p0,w p1,String p2,m$a p3){
       _monitor_enter(m.class);
       if (p0 == null || p1 == null) {
          _monitor_exit(m.class);
          return;
       }else if(m.c == null){
          m.c = p0.getApplicationContext();
       }
       String str = p1.a();
       if (TextUtils.isEmpty(str)) {
          _monitor_exit(m.class);
          return;
       }else {
          m.a(p1);
          int i = 8;
          if (m.v == null) {
             m.v = new ConcurrentHashMap(i);
          }
          if (m.u == null) {
             m.u = new ConcurrentHashMap(i);
          }
          if (m.t == null) {
             m.t = new ConcurrentHashMap(i);
          }
          if (!m.v.containsKey(str)) {
             m$d uod = new m$d(0);
             uod.a = p1;
             uod.b = p2;
             uod.c = p3;
             m.v.put(str, uod);
             m.t.put(str, Long.valueOf(av.b(m.c, "open_common", str)));
             m.d(m.c);
          }
          _monitor_exit(m.class);
          return;
       }
    }
    public static void a(Context p0,w p1,String p2,m$b p3,JSONObject p4){
       int len;
       String[] stringArray1;
       JSONObject jSONObject1;
       boolean b1;
       String str6;
       String str7;
       String str8;
       Context uContext = p0;
       m$b uob = p3;
       JSONObject jSONObject = p4;
       String str = "ustv";
       String str1 = "ust";
       String str2 = "umv";
       String str3 = "off";
       m$b$a uob$a = new m$b$a();
       boolean b = false;
       uob$a.a = b;
       uob$a.b = b;
       uob.g = uob$a;
       String[] stringArray = (p2).split(";");
       if (stringArray != null && stringArray.length > 0) {
          len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             if (jSONObject.has(oobject)) {
                stringArray1 = stringArray;
                uob.f.putOpt(oobject, jSONObject.get(oobject));
             }else {
                stringArray1 = stringArray;
             }
             i = i + 1;
             stringArray = stringArray1;
             m$b uob1 = null;
          }
       }
       String str4 = "16H";
       String str5 = "able";
       if (x.a(jSONObject, str4)) {
          m$b.a(uob, m.a(jSONObject.getJSONObject(str4).optString(str5), false));
       }
       str4 = "11K";
       if (x.a(jSONObject, str4)) {
          jSONObject1 = jSONObject.getJSONObject(str4);
          uob$a.a = m.a(jSONObject1.getString(str5), false);
          if (jSONObject1.has(str3)) {
             uob$a.c = jSONObject1.getJSONObject(str3);
          }
       }
       str4 = "145";
       if (x.a(jSONObject, str4)) {
          uob.a = jSONObject.getJSONObject(str4);
       }
       str4 = "14D";
       if (x.a(jSONObject, str4)) {
          uob.b = jSONObject.getJSONObject(str4);
       }
       str4 = "151";
       if (x.a(jSONObject, str4)) {
          jSONObject1 = jSONObject.getJSONObject(str4);
          m$b$b uob$b = new m$b$b();
          if (jSONObject1 != null) {
             uob$b.a = m.a(jSONObject1.optString(str5), false);
          }
          uob.h = uob$b;
       }
       str4 = "17S";
       if (x.a(jSONObject, str4)) {
          jSONObject1 = jSONObject.getJSONObject(str4);
          if (jSONObject1 != null) {
             b1 = m.a(jSONObject1.optString(str5), false);
             if (b1 != m.o) {
                m.o = b1;
                if (uContext) {
                   SharedPreferences$Editor uEditor = av.a(uContext, "open_common");
                   av.a(uEditor, "a2", b1);
                   av.a(uEditor);
                }
             }
          }
          if (jSONObject1 != null) {
             b1 = m.a(jSONObject1.optString("static_enable"), true);
             b = m.a(jSONObject1.optString("static_ip_direct_enable"), false);
             len = jSONObject1.optInt("static_timeout", 5) * 1000;
             int i1 = jSONObject1.optInt("static_retry", 3);
             str6 = str;
             boolean b2 = m.a(jSONObject1.optString("bgp_enable"), true);
             str7 = str1;
             boolean b3 = m.a(jSONObject1.optString("bgp_ip_direct_enable"), false);
             str8 = str2;
             int i2 = jSONObject1.optInt("bgp_retry", 3);
             boolean b4 = m.a(jSONObject1.optString("perf_data_upload_enable"), false);
             if (b1 == m.f && (b == m.g && (len == m.e && (i1 == m.x && (b2 == m.h && (b3 == m.i && (i2 != m.y || b4 != m.j))))))) {
                m.f = b1;
                m.g = b;
                m.e = len;
                m.x = i1;
                m.h = b2;
                m.i = b3;
                m.y = i2;
                m.j = b4;
                if (uContext != null) {
                   SharedPreferences$Editor uEditor1 = av.a(uContext, "open_common");
                   av.a(uEditor1, "a13", b1);
                   av.a(uEditor1, "a6", b2);
                   av.a(uEditor1, "a7", b);
                   av.a(uEditor1, "a8", len);
                   av.a(uEditor1, "a9", i1);
                   av.a(uEditor1, "a10", b3);
                   av.a(uEditor1, "a11", i2);
                   av.a(uEditor1, "a12", b4);
                   av.a(uEditor1);
                }
             }
             bj.a();
             bj.a();
             bj.a();
             bj.a();
             bj.a();
          label_0200 :
             str4 = "15K";
             if (x.a(jSONObject, str4)) {
                jSONObject1 = jSONObject.getJSONObject(str4);
                if (jSONObject1 != null) {
                   boolean b5 = m.a(jSONObject1.optString("ucf"), m$f.a);
                   b1 = m.a(jSONObject1.optString("fsv2"), m$f.b);
                   b2 = m.a(jSONObject1.optString("usc"), m$f.c);
                   str2 = str8;
                   i2 = jSONObject1.optInt(str2, m$f.d);
                   String str9 = str7;
                   b = m.a(jSONObject1.optString(str9), m$f.e);
                   String str10 = str6;
                   b4 = jSONObject1.optInt(str10, m$f.f);
                   if (b5 == m$f.a && (b1 == m$f.b && b2 == m$f.c)) {
                      len = m$f.d;
                      if (i2 != len || (b == m$f.e && b4 == len)) {
                      label_029d :
                         uContext = p0;
                      label_029f :
                         str4 = "183";
                         JSONObject jSONObject2 = p4;
                         if (x.a(jSONObject2, str4)) {
                            bi.a(p1, jSONObject2.getJSONObject(str4));
                         }
                         str4 = "17I";
                         if (x.a(jSONObject2, str4)) {
                            jSONObject1 = jSONObject2.getJSONObject(str4);
                            b1 = m.a(jSONObject1.optString("na"), false);
                            b4 = m.a(jSONObject1.optString("aa"), false);
                            ag.d = b1;
                            ag.e = b4;
                            SharedPreferences$Editor uEditor3 = av.a(uContext, "open_common");
                            av.a(uEditor3, "a4", b1);
                            av.a(uEditor3, "a5", b4);
                            av.a(uEditor3);
                            return;
                         }else {
                            return;
                         }
                      }
                   }
                label_025e :
                   m$f.a = b5;
                   m$f.b = b1;
                   m$f.c = b2;
                   m$f.d = i2;
                   m$f.e = b;
                   m$f.f = b4;
                   uContext = p0;
                   SharedPreferences$Editor uEditor2 = av.a(uContext, "open_common");
                   av.a(uEditor2, "ucf", m$f.a);
                   av.a(uEditor2, "fsv2", m$f.b);
                   av.a(uEditor2, "usc", m$f.c);
                   av.a(uEditor2, str2, m$f.d);
                   av.a(uEditor2, str9, m$f.e);
                   av.a(uEditor2, str10, m$f.f);
                   av.a(uEditor2);
                   goto label_029f ;
                }else {
                   goto label_029d ;
                }
             }else {
                goto label_029d ;
             }
          }
       }
       str6 = str;
       str7 = str1;
       str8 = str2;
       goto label_0200 ;
    }
    public static void a(Context p0,w p1,Throwable p2){
       m.a(p0, p1, p2.getMessage());
    }
    public static void a(Context p0,String p1){
       l.a(p0, p1);
    }
    public static void a(Context p0,String p1,String p2,m$e p3){
       if (p3 != null && !TextUtils.isEmpty(m$e.c(p3))) {
          String str = p3.b();
          if (TextUtils.isEmpty(str)) {
             return;
          }else if(p0 == null){
             return;
          }else {
             SharedPreferences$Editor uEditor = av.a(p0, p2);
             uEditor.putString(p1, str);
             av.a(uEditor);
          }
       }
       return;
    }
    public static void a(bj$c p0){
       try{
          if (p0 != null && m.c != null) {
             HashMap hashMap = new HashMap();
             hashMap.put("serverip", p0.c);
             hashMap.put("hostname", p0.e);
             hashMap.put("path", p0.d);
             hashMap.put("csid", p0.a);
             hashMap.put("degrade", String.valueOf(p0.b.a()));
             hashMap.put("errorcode", String.valueOf(p0.m));
             hashMap.put("errorsubcode", String.valueOf(p0.n));
             hashMap.put("connecttime", String.valueOf(p0.h));
             hashMap.put("writetime", String.valueOf(p0.i));
             hashMap.put("readtime", String.valueOf(p0.j));
             hashMap.put("datasize", String.valueOf(p0.l));
             hashMap.put("totaltime", String.valueOf(p0.f));
             String str = new JSONObject(hashMap).toString();
             ("--Всµг--").concat(String.valueOf(str));
             bj.a();
             if (TextUtils.isEmpty(str)) {
                return;
             }else {
                br uobr = new br(m.c, "core", "2.0", "O008");
                uobr.a(str);
                bs.a(uobr, m.c);
             }
          }
          return;
       }catch(com.loc.k e0){
       }
    }
    public static void a(w p0){
       if (p0 != null) {
          if (TextUtils.isEmpty(p0.a())) {
             return;
          }else {
             String str = p0.c();
             if (TextUtils.isEmpty(str)) {
                str = p0.b();
             }
             if (TextUtils.isEmpty(str)) {
                return;
             }else {
                ag.a(p0.a(), str);
             }
          }
       }
       return;
    }
    public static void a(String p0,String p1){
       m$e uoe = m.a(m.c, p0, p1);
       String str = x.a(System.currentTimeMillis(), "yyyyMMdd");
       if (!str.equals(m$e.a(uoe))) {
          uoe.a(str);
          m$e.b(uoe).set(0);
       }
       m$e.b(uoe).incrementAndGet();
       m.a(m.c, p0, p1, uoe);
       return;
    }
    public static synchronized void a(String p0,boolean p1,String p2,String p3,String p4){
       _monitor_enter(m.class);
       if (TextUtils.isEmpty(p0)) {
          _monitor_exit(m.class);
          return;
       }else if(m.u == null){
          m.u = new ConcurrentHashMap(8);
       }
       m.u.put(p0, Long.valueOf(SystemClock.elapsedRealtime()));
       if (m.v == null) {
          _monitor_exit(m.class);
          return;
       }else if(!m.v.containsKey(p0)){
          _monitor_exit(m.class);
          return;
       }else if(TextUtils.isEmpty(p0)){
          _monitor_exit(m.class);
          return;
       }else if(p1){
          bi.a(true, p0);
       }
       cj.a().b(new m$1(p0, p2, p3, p4));
       _monitor_exit(m.class);
       return;
    }
    public static void a(String p0,boolean p1,boolean p2,boolean p3){
       String m;
       try{
          if (!TextUtils.isEmpty(p0) && m.c != null) {
             HashMap hashMap = new HashMap();
             hashMap.put("url", p0);
             hashMap.put("downLevel", String.valueOf(p1));
             String str = "0";
             p0 = (!o.o(m.c))? str: "1";
             hashMap.put("ant", p0);
             p0 = "type";
             if (p3) {
                m = (p1)? m.m: m.n;
             }else if(p1){
                m = m.k;
             }else {
                m = m.l;
             }
             hashMap.put(p0, m);
             if (!p2) {
                str = "1";
             }
             hashMap.put("status", str);
             p0 = new JSONObject(hashMap).toString();
             if (TextUtils.isEmpty(p0)) {
                return;
             }else {
                br uobr = new br(m.c, "core", "2.0", "O002");
                uobr.a(p0);
                bs.a(uobr, m.c);
             }
          }
       label_0077 :
          return;
       }catch(com.loc.k e0){
       }
    }
    public static void a(boolean p0,bj$a p1){
       Iterator iterator;
       if (!m.C || p1 == null) {
          return;
       }
       ArrayList b = m.B;
       _monitor_enter(b);
       if (p0) {
          iterator = m.B.iterator();
          while (iterator.hasNext()) {
             bj$a uoa = iterator.next();
             if ((uoa.b).equals(p1.b) && ((uoa.e).equals(p1.e) && uoa.f == p1.f)) {
                if (uoa.j == p1.j) {
                   iterator.remove();
                }else {
                   int i = uoa.j.get() - p1.j.get();
                   uoa.j.set(i);
                }
                bj.a();
             }
          }
       }
       m.C = false;
       iterator = m.B.iterator();
       bj.a();
       while (iterator.hasNext()) {
          p1 = iterator.next();
          Objects.toString(p1.j);
       }
       bj.a();
       _monitor_exit(b);
       return;
    }
    public static void a(boolean p0,String p1){
       ("--markHostNameFailed---hostname=").concat(String.valueOf(p1));
       bj.a();
       if (!m.f && !p0) {
          return;
       }
       if (!m.i && p0) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       if (!p0) {
          if (m.z.get(p1) != null) {
             return;
          }
          m.z.put(p1, Boolean.TRUE);
          m.a(m.b(p1, "a14"), "open_common");
          return;
       }else if(m.A.get(p1) != null){
          return;
       }else {
          m.A.put(p1, Boolean.TRUE);
          m.a(m.b(p1, "a15"), "open_common");
          return;
       }
    }
    public static boolean a(){
       if (m.c != null) {
          m.i();
          if (!m.c()) {
             return false;
          }else if(m.b()){
             return true;
          }
       }
       if (!m.o) {
          return false;
       }else {
          m$e uoe = m.a(m.c, "IPV6_CONFIG_NAME", "open_common");
          if (uoe == null) {
             return false;
          }else if(uoe.a() < 5){
             return true;
          }else {
             return false;
          }
       }
    }
    public static synchronized boolean a(String p0){
       _monitor_enter(m.class);
       if (TextUtils.isEmpty(p0)) {
          _monitor_exit(m.class);
          return false;
       }else if(m.v == null){
          _monitor_exit(m.class);
          return false;
       }else if(m.u == null){
          m.u = new ConcurrentHashMap(8);
       }
       if (m.v.containsKey(p0) && !m.u.containsKey(p0)) {
          m.u.put(p0, Long.valueOf(SystemClock.elapsedRealtime()));
          _monitor_exit(m.class);
          return true;
       }else {
          _monitor_exit(m.class);
          return false;
       }
    }
    public static synchronized boolean a(String p0,long p1){
       _monitor_enter(m.class);
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          _monitor_exit(m.class);
          return b;
       }else if(p1 - m.c(p0) > 0){
          ConcurrentHashMap uConcurrentH = null;
          if (m.u != null && m.u.containsKey(p0)) {
             uConcurrentH = m.u.get(p0).longValue();
          }
          if ((SystemClock.elapsedRealtime() - uConcurrentH) - 0x7530 > 0) {
             b = true;
          }
       }
       _monitor_exit(m.class);
       return b;
    }
    public static boolean a(String p0,boolean p1){
       if (TextUtils.isEmpty(p0)) {
          return p1;
       }
       String[] stringArray = (URLDecoder.decode(p0)).split("/");
       if (((stringArray[(stringArray.length - 1)]).charAt(4) % 2) == 1) {
          return 1;
       }
       return false;
    }
    public static boolean a(InetAddress p0){
       if (!p0.isLoopbackAddress() && (p0.isLinkLocalAddress() || p0.isAnyLocalAddress())) {
          return true;
       }
       return false;
    }
    public static m$b b(Context p0,w p1,String p2,String p3,String p4,String p5){
       int i1;
       int i2;
       int i3;
       int i4;
       m$b uob1;
       int i5;
       int i6;
       bm uobm;
       String str7;
       String str8;
       StringBuilder str9;
       bm uobm1;
       bm uobm2;
       Context uContext = p0;
       w ow = p1;
       String str = "infocode";
       String str1 = "result";
       String str2 = "ver";
       String str3 = "lct";
       String str4 = "lc";
       String str5 = "at";
       m$b uob = new m$b();
       uob.f = new JSONObject();
       if (uContext) {
          m.c = p0.getApplicationContext();
       }
       m.e();
       String str6 = null;
       try{
          int i = 0;
          m.a(p1);
          bg uobg = new bg();
          int b = TextUtils.isEmpty(p2);
          if (!b) {
             try{
                str9 = "";
                str7 = p2;
                try{
                   i6 = str9+str7+";15K;16H;17I;17S;183";
                }catch(com.loc.k e0){
                }
                i5 = str4;
                try{
                label_015f :
                   throw e0;
                }catch(com.loc.k e0){
                }catch(javax.crypto.IllegalBlockSizeException e0){
                }
                i6 = i1;
                uobm = str6;
                str7 = uobm;
             }catch(com.loc.k e0){
                i1 = p2;
                goto label_0066 ;
             }
          }else {
             i6 = p2;
          }
          try{
             m.d(p0);
             m$c uoc = v18;
             Context uContext1 = p0;
             w ow1 = p1;
             i3 = str1;
             String str10 = i6;
             uob1 = uob;
             String str11 = p3;
             i4 = str2;
             str5 = p4;
             i2 = str;
             try{
                int i7 = p5;
                uoc = new m$c(uContext1, ow1, str10, str11, str5, i7);
                uobm = bg.a(v18);
                if (b) {
                   return uob1;
                }else if(uobm != null){
                   try{
                      str7 = uobm.a;
                      bm b2 = uobm.b;
                      if (b2 != null && b2.containsKey(str3)) {
                         List list = b2.get(str3);
                         if (list != null && list.size() > 0) {
                            str8 = list.get(0);
                            if (!TextUtils.isEmpty(str8)) {
                               long l = Long.valueOf(str8).longValue();
                               uob1.e = l;
                               if (ow && l) {
                                  str8 = p1.a();
                                  if (!TextUtils.isEmpty(str8)) {
                                     m.b(str8, uob1.e);
                                  }
                               }
                            }
                         }
                      }
                   }catch(com.loc.k e0){
                      str7 = str6;
                   }catch(javax.crypto.IllegalBlockSizeException e0){
                      str7 = str6;
                   }
                label_018c :
                   m.a(uContext, ow, e0);
                label_01b3 :
                   str4 = i6;
                   if (str7 == null) {
                      return uob1;
                   }else if(TextUtils.isEmpty(str6)){
                      str6 = x.a(str7);
                   }
                   str8 = str6;
                   if (TextUtils.isEmpty(str8)) {
                      m.a(uContext, ow, "result is null");
                   }
                   JSONObject jSONObject = new JSONObject(str8);
                   if (jSONObject.has("status")) {
                      b = jSONObject.getInt("status");
                      i1 = 1;
                      if (b == i1) {
                         m.a = i1;
                      }else if(!b){
                         str8 = "authcsid";
                         str7 = "authgsid";
                         if (uobm != null) {
                            uobm1 = uobm.c;
                            uobm2 = uobm.d;
                         }else {
                            uobm1 = str8;
                            uobm2 = str7;
                         }
                         x.a(uContext, uobm1, uobm2, jSONObject);
                         m.a = 0;
                         if (jSONObject.has("info")) {
                            m.b = jSONObject.getString("info");
                         }
                         str8 = "";
                         str9 = i2;
                         if (jSONObject.has(str9)) {
                            str8 = jSONObject.getString(str9);
                         }
                         an.a(p1, "/v3/iasdkauth", m.b, uobm2, uobm1, str8);
                         if (!m.a) {
                            uob1.c = m.b;
                            return uob1;
                         }
                      }
                      str9 = i4;
                      if (jSONObject.has(str9)) {
                         uob1.d = jSONObject.getInt(str9);
                      }
                      str9 = i3;
                      if (x.a(jSONObject, str9)) {
                         JSONObject jSONObject1 = jSONObject.getJSONObject(str9);
                         m.a(uContext, ow, str4, uob1, jSONObject1);
                         jSONObject1 = jSONObject1.getJSONObject("15K");
                         boolean b1 = m.a(jSONObject1.optString("isTargetAble"), false);
                         if (!m.a(jSONObject1.optString("able"), false)) {
                            q.a();
                            q.b(p0);
                         }else {
                            q.a().a(uContext, b1);
                         }
                      }
                   }
                label_027a :
                   return uob1;
                }else {
                   str7 = str6;
                }
                byte[] uobyteArray = new byte[16];
                byte[] uobyteArray1 = new byte[(str7.length - 16)];
                System.arraycopy(str7, 0, uobyteArray, 0, 16);
                System.arraycopy(str7, 16, uobyteArray1, 0, (str7.length - 16));
                SecretKeySpec secretKeySpe = new SecretKeySpec(uobyteArray, x.c("EQUVT"));
                Cipher instance = Cipher.getInstance(x.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
                instance.init(2, secretKeySpe, new IvParameterSpec(x.c()));
                str6 = x.a(instance.doFinal(uobyteArray1));
                goto label_01b3 ;
             }catch(com.loc.k e0){
             }
             i1 = i6;
             goto label_015f ;
          }catch(com.loc.k e0){
             i5 = str4;
             goto label_015d ;
          }
       }catch(com.loc.k e0){
          i1 = p2;
          i2 = str;
          i3 = str1;
          i4 = str2;
          uob1 = uob;
          i5 = str4;
       }catch(javax.crypto.IllegalBlockSizeException e0){
          i1 = p2;
          i2 = str;
          i3 = str1;
          i4 = str2;
          uob1 = uob;
          i5 = str4;
          goto label_0187 ;
       }
    }
    public static String b(String p0,String p1){
       return p1+"_"+s.a(p0.getBytes());
    }
    public static void b(Context p0){
       if (p0 == null) {
          return;
       }
       m.o = av.a(p0, "open_common", "a2", true);
       return;
    }
    public static void b(bj$c p0){
       ArrayList b = m.B;
       _monitor_enter(b);
       int i = 0;
       bj$a uoa = null;
       while (i < m.B.size()) {
          bj$a uoa1 = m.B.get(i);
          if ((p0.c).equals(uoa1.b) && (p0.d).equals(uoa1.e)) {
             bj$a f = uoa1.f;
             if (p0.m == f) {
                if (f == 1) {
                   long l = (long)uoa1.j.get() * uoa1.i;
                   l = l + p0.f;
                   int i1 = uoa1.j.get() + 1;
                   l = l / (long)i1;
                   uoa1.i = l;
                }
                uoa1.j.getAndIncrement();
                uoa = 1;
             }
          }
          i = i + 1;
       }
       if (uoa == null) {
          m.B.add(new bj$a(p0));
       }
       bj.a();
       _monitor_exit(b);
       return;
    }
    public static synchronized void b(String p0){
       _monitor_enter(m.class);
       if (m.u == null) {
          _monitor_exit(m.class);
          return;
       }else if(m.u.containsKey(p0)){
          m.u.remove(p0);
       }
       _monitor_exit(m.class);
       return;
    }
    public static synchronized void b(String p0,long p1){
       _monitor_enter(m.class);
       if (m.v == null || !m.v.containsKey(p0)) {
          _monitor_exit(m.class);
          return;
       }else if(m.t == null){
          m.t = new ConcurrentHashMap(8);
       }
       m.t.put(p0, Long.valueOf(p1));
       Context c = m.c;
       if (c != null) {
          SharedPreferences$Editor uEditor = av.a(c, "open_common");
          av.a(uEditor, p0, p1);
          av.a(uEditor);
       }
       _monitor_exit(m.class);
       return;
    }
    public static synchronized void b(String p0,boolean p1){
       _monitor_enter(m.class);
       m.a(p0, p1, null, null, null);
       _monitor_exit(m.class);
    }
    public static boolean b(){
       Context c = m.c;
       if (c == null) {
          return false;
       }
       String str = o.t(c);
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       Integer integer = m.q.get(str.toUpperCase());
       if (integer == null) {
          return false;
       }
       if (integer.intValue() == 2) {
          return true;
       }
       return false;
    }
    public static synchronized long c(String p0){
       _monitor_enter(m.class);
       if (m.t == null) {
          m.t = new ConcurrentHashMap(8);
       }
       if (m.t.containsKey(p0)) {
          _monitor_exit(m.class);
          return m.t.get(p0).longValue();
       }else {
          _monitor_exit(m.class);
          return 0;
       }
    }
    public static void c(Context p0){
       if (p0 == null) {
          return;
       }
       m.f = av.a(p0, "open_common", "a13", true);
       m.h = av.a(p0, "open_common", "a6", true);
       m.g = av.a(p0, "open_common", "a7", false);
       m.e = av.a(p0, "open_common", "a8", 5000);
       m.x = av.a(p0, "open_common", "a9", 3);
       m.i = av.a(p0, "open_common", "a10", false);
       m.y = av.a(p0, "open_common", "a11", 3);
       m.j = av.a(p0, "open_common", "a12", false);
       return;
    }
    public static void c(bj$c p0){
       if (p0 == null) {
          return;
       }
       if (!m.j) {
          return;
       }
       Queue d = m.D;
       _monitor_enter(d);
       m.D.offer(p0);
       bj.a();
       _monitor_exit(d);
       return;
    }
    public static boolean c(){
       Context c = m.c;
       if (c == null) {
          return false;
       }
       String str = o.t(c);
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       Integer integer = m.q.get(str.toUpperCase());
       if (integer == null) {
          return false;
       }
       if (integer.intValue() >= 2) {
          return true;
       }
       return false;
    }
    public static void d(){
       m$e uoe = m.a(m.c, "IPV6_CONFIG_NAME", "open_common");
       String str = x.a(System.currentTimeMillis(), "yyyyMMdd");
       if (!str.equals(m$e.a(uoe))) {
          uoe.a(str);
          m$e.b(uoe).set(0);
       }
       m$e.b(uoe).incrementAndGet();
       m.a(m.c, "IPV6_CONFIG_NAME", "open_common", uoe);
       return;
    }
    public static void d(Context p0){
       if (m.w) {
          return;
       }
       ag.d = av.a(p0, "open_common", "a4", true);
       ag.e = av.a(p0, "open_common", "a5", true);
       m.w = true;
       return;
    }
    public static boolean d(String p0){
       if (TextUtils.isEmpty(p0)) {
          return true;
       }
       if (!m.f) {
          return false;
       }
       Context uContext = (m.z.get(p0) == null)? 1: null;
       if (!uContext) {
          return false;
       }else {
          uContext = m.c;
          if (uContext == null) {
             return true;
          }else {
             m$e uoe = m.a(uContext, m.b(p0, "a14"), "open_common");
             if (uoe == null) {
                return true;
             }else if(uoe.a() < m.x){
                return true;
             }else {
                return false;
             }
          }
       }
    }
    public static void e(){
       String str = "open_common";
       if (m.d) {
          return;
       }
       Context c = m.c;
       if (c == null) {
          return;
       }
       m.d = true;
       q.a().a(c);
       m.b(c);
       m.c(c);
       m$f.a = av.a(c, str, "ucf", m$f.a);
       m$f.b = av.a(c, str, "fsv2", m$f.b);
       m$f.c = av.a(c, str, "usc", m$f.c);
       m$f.d = av.a(c, str, "umv", m$f.d);
       m$f.e = av.a(c, str, "ust", m$f.e);
       m$f.f = av.a(c, str, "ustv", m$f.f);
       return;
    }
    public static boolean e(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       if (!m.i) {
          return false;
       }
       Context uContext = (m.A.get(p0) == null)? 1: null;
       if (!uContext) {
          return false;
       }else {
          uContext = m.c;
          if (uContext == null) {
             return true;
          }else {
             m$e uoe = m.a(uContext, m.b(p0, "a15"), "open_common");
             if (uoe == null) {
                return true;
             }else if(uoe.a() < m.y){
                return true;
             }else {
                return false;
             }
          }
       }
    }
    public static bj$a f(){
       bj$a uoa = null;
       if (m.C) {
          return uoa;
       }
       ArrayList b = m.B;
       _monitor_enter(b);
       if (m.C) {
          _monitor_exit(b);
          return uoa;
       }else {
          Collections.sort(m.B);
          if (m.B.size() > 0) {
             m.C = true;
             _monitor_exit(b);
             return m.B.get(0).a();
          }else {
             _monitor_exit(b);
             return uoa;
          }
       }
    }
    public static bj$c g(){
       Queue d = m.D;
       _monitor_enter(d);
       bj$c uoc = m.D.poll();
       if (uoc != null) {
          _monitor_exit(d);
          return uoc;
       }else {
          _monitor_exit(d);
          return null;
       }
    }
    public static ConcurrentHashMap h(){
       return m.v;
    }
    public static void i(){
       Map q;
       Integer integer;
       Context c = m.c;
       if (c != null) {
          String str = o.t(c);
          if (!TextUtils.isEmpty(m.r) && (!TextUtils.isEmpty(str) && ((m.r).equals(str) && (System.currentTimeMillis() - m.s) - 0xea60 < 0))) {
             return;
          }else if(!TextUtils.isEmpty(str)){
             m.r = str;
          }
       }else if((System.currentTimeMillis() - m.s) - 0x2710 < 0){
          return;
       }
       m.s = System.currentTimeMillis();
       m.q.clear();
       Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
       while (iterator.hasNext()) {
          NetworkInterface networkInter = iterator.next();
          if (!a.d(networkInter).isEmpty()) {
             String displayName = networkInter.getDisplayName();
             int i = 0;
             Iterator iterator1 = a.d(networkInter).iterator();
             while (iterator1.hasNext()) {
                InetAddress address = iterator1.next().getAddress();
                if (address instanceof Inet6Address) {
                   if (!m.a(address)) {
                      i = i | 0x02;
                   }else {
                      continue ;
                   }
                }else if(address instanceof Inet4Address && (!m.a(address) && !(address.getHostAddress()).startsWith(x.c("FMTkyLjE2OC40My4")))){
                   i = i | 0x01;
                   continue ;
                }else {
                   continue ;
                }
             }
             if (i) {
                if (displayName != null && displayName.startsWith("wlan")) {
                   q = m.q;
                   displayName = "WIFI";
                   integer = Integer.valueOf(i);
                }else if(displayName != null && displayName.startsWith("rmnet")){
                   q = m.q;
                   displayName = "MOBILE";
                   integer = Integer.valueOf(i);
                }
                q.put(displayName, integer);
             }
          }
       }
       return;
    }
}
