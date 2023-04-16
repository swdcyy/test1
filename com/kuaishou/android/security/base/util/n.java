package com.kuaishou.android.security.base.util.n;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import org.json.JSONArray;
import android.util.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;
import java.lang.System;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.CharSequence;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import android.text.TextUtils;
import com.kuaishou.android.security.base.cloudconfig.c;
import com.kuaishou.android.security.base.logsender.a;
import x38.a;
import java.lang.StringBuilder;
import org.json.JSONTokener;
import java.lang.Boolean;
import android.util.Base64;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Long;
import android.app.AlarmManager;
import android.content.Intent;
import android.app.PendingIntent;
import com.kuaishou.android.security.internal.common.h;
import android.os.Bundle;
import com.kuaishou.android.security.base.logsender.info.a;
import android.os.Process;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.lang.Number;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.net.Network;
import android.net.NetworkCapabilities;

public class n	// class@000f2b
{
    public static final char[] h;
    public static final char[] i;

    static {
       n.h = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       n.i = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").toCharArray();
    }
    public void n(){
       super();
    }
    public static Pair a(Context p0,JSONArray p1,int p2){
       JSONObject obj;
       JSONObject jSONObject1;
       a uoa;
       Pair pair1;
       boolean b;
       int i = p2;
       String str = "KWE_N";
       if (PatchProxy.isSupport(n.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, n.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       JSONArray jSONArray = new JSONArray();
       int i1 = p1.length();
       if (i1 > 0) {
          int i2 = 0;
          JSONObject jSONObject = null;
          while (i2 < i1) {
             jSONObject1 = p1.getJSONObject(i2);
             int i3 = i1;
             JSONObject jSONObject2 = new JSONObject();
             int i4 = 1;
             int i5 = (i == 12)? 1: 0;
             JSONObject jSONObject3 = new JSONObject();
             int i6 = jSONObject;
             jSONObject = jSONObject1.getJSONObject("Header_section");
             JSONObject jSONObject4 = jSONObject;
             String str1 = jSONObject.optString("1");
             obj = jSONObject4;
             if (!("100102").equals(str1)) {
                i4 = i6;
             }
             JSONArray jSONArray1 = jSONArray;
             JSONObject jSONObject5 = jSONObject1;
             long l = obj.optLong("0", System.currentTimeMillis());
             String str2 = obj.optString("6", n.b(p0));
             int i7 = i2;
             String str3 = obj.optString("7", str);
             String str4 = obj.optString("8", "");
             String str5 = obj.optString("9", "");
             String str6 = obj.optString("10", "");
             String str7 = str;
             String str8 = p0.getApplicationInfo().loadLabel(p0.getPackageManager()).toString();
             jSONObject2.put("1", str8);
             jSONObject2.put("2", p0.getPackageName());
             jSONObject2.put("3", str2);
             jSONObject2.put("4", str1);
             jSONObject2.put("5", l);
             str8 = b.i().h().getProductName();
             if (TextUtils.isEmpty(str8)) {
                str8 = new c(p0).a();
             }else {
                int i8 = p0;
             }
             if (TextUtils.isEmpty(str8)) {
                str8 = str7;
             }
             jSONObject2.put("6", str8);
             jSONObject2.put("7", str3);
             if (TextUtils.isEmpty(str4) && !i5) {
                uoa = a.a(p0).a();
                if (uoa != null) {
                   str4 = uoa.b(0x110008);
                }
             }
             str8 = (TextUtils.isEmpty(str4))? str7: str4;
             jSONObject2.put("8", str8);
             if (TextUtils.isEmpty(str6)) {
                uoa = a.a(p0).a();
                if (uoa != null) {
                   Pair pair = uoa.b(0x110009);
                   pair1 = pair.second;
                   str8 = pair.first.toString();
                label_0178 :
                   jSONObject2.put("9", str8+":"+i);
                   jSONObject2.put("10", pair1);
                   jSONObject2.put("11", b.i().h().getDid());
                   JSONArray jSONArray2 = new JSONTokener(jSONObject5.getString("Data_section")).nextValue();
                   String str9 = "data_section";
                   if (jSONArray2 instanceof JSONObject) {
                      jSONArray2 = new JSONArray().put(jSONArray2);
                   }else if(jSONArray2 instanceof JSONArray){
                   }else {
                   label_01d0 :
                      d.b("Create array :"+jSONObject2.toString());
                      jSONArray = jSONArray1;
                      jSONArray.put(jSONObject2);
                      jSONObject = i4;
                      i2 = i7 + 1;
                      i1 = i3;
                      str = str7;
                   }
                   jSONObject2.put(str9, jSONArray2);
                   goto label_01d0 ;
                }
             }
             str8 = str5;
             pair1 = str6;
             goto label_0178 ;
          }
          jSONObject1 = jSONObject;
       }else {
          b = false;
       }
       return Pair.create(Boolean.valueOf(jSONObject1), jSONArray);
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       return Base64.encodeToString(n.a(Base64.decode("dDgjYm1AYiFrcWZJXnd+eQ==", 2), p0.getBytes()), 0);
    }
    public static String a(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       StringBuilder str = new StringBuilder((p0.length * 2));
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int b = p0[i];
          char[] h = n.h;
          int i1 = b >> 4;
          i1 = i1 & 0x0f;
          b = b & 0x0f;
          str = str+h[i1]+h[b];
       }
       return (str).substring(0, 16);
    }
    public static JSONObject a(Context p0,JSONObject p1,int p2){
       String str3;
       JSONObject obj;
       JSONObject jSONObject = p1;
       int i = p2;
       String str = "10";
       String str1 = "KWE_N";
       String str2 = "";
       if (PatchProxy.isSupport(n.class)) {
          str3 = str;
          str = str2;
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, n.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          str3 = str;
          str = str2;
       }
       JSONObject jSONObject1 = new JSONObject();
       int i1 = (i == 12)? 1: 0;
       obj = jSONObject.getJSONObject("Header_section");
       String str4 = obj.optString("1");
       long l = obj.optLong("0", System.currentTimeMillis());
       str2 = obj.optString("6", n.b(p0));
       String str5 = obj.optString("7", str1);
       String str6 = obj.optString("8", str);
       String str7 = obj.optString("9", str);
       String str8 = str1;
       str1 = str3;
       str3 = obj.optString(str1, str);
       String str9 = p0.getApplicationInfo().loadLabel(p0.getPackageManager()).toString();
       jSONObject1.put("1", str9);
       jSONObject1.put("2", p0.getPackageName());
       jSONObject1.put("3", str2);
       jSONObject1.put("4", str4);
       jSONObject1.put("5", l);
       str9 = b.i().h().getProductName();
       if (TextUtils.isEmpty(str9)) {
          str9 = new c(p0).a();
       }else {
          int i2 = p0;
       }
       if (TextUtils.isEmpty(str9)) {
          str9 = str8;
       }
       jSONObject1.put("6", str9);
       jSONObject1.put("7", str5);
       if (TextUtils.isEmpty(str6) && !i1) {
          a uoa = a.a(p0).a();
          if (uoa != null) {
             str9 = uoa.b(0x110008);
          label_0101 :
             jSONObject1.put("8", str9);
             if (TextUtils.isEmpty(str3)) {
                uoa = a.a(p0).a();
                if (uoa != null) {
                   Pair pair = uoa.b(0x110009);
                   str7 = pair.first.toString();
                   pair = pair.second;
                label_0130 :
                   jSONObject1.put("9", str7+":"+i);
                   jSONObject1.put(str1, pair);
                   jSONObject1.put("11", b.i().h().getDid());
                   JSONArray jSONArray = new JSONTokener(p1.getString("Data_section")).nextValue();
                   if (jSONArray instanceof JSONObject) {
                      jSONArray = new JSONArray().put(jSONArray);
                   }else if(jSONArray instanceof JSONArray){
                   }else {
                   label_018e :
                      return jSONObject1;
                   }
                   jSONObject1.put("data_section", jSONArray);
                   goto label_018e ;
                }
             }
             str9 = str3;
             goto label_0130 ;
          }
       }
       str9 = str6;
       goto label_0101 ;
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n.class, "4")) {
          return;
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       p0.getSystemService("activity").getMemoryInfo(memoryInfo);
       d.a("系统剩余内存:"+(memoryInfo.availMem >> 10)+"k");
       d.a("系统是否处于低内存运行："+memoryInfo.lowMemory);
       d.a("当系统剩余内存低于"+memoryInfo.threshold+"时就看成低内存运行");
       return;
    }
    public static void a(Context p0,String p1,int p2,long p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), null, n.class, "9")) {
          return;
       }
       if (("com.kw.r.p").equals(p1) && !new c(p0).o()) {
          d.b("ACTION_REPORT_POLL offline");
          return;
       }else {
          AlarmManager systemServic = p0.getSystemService("alarm");
          PendingIntent broadcast = PendingIntent.getBroadcast(p0, p2, new Intent(p1), 0x8000000);
          systemServic.cancel(broadcast);
          systemServic.set(0, (System.currentTimeMillis() + p3), broadcast);
          return;
       }
    }
    public static void a(String p0,String p1){
       Pair pair;
       String str = "";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n.class, "20")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          Context uContext = b.i().j().c();
          if (!new c(uContext).r()) {
             return;
          }else {
             JSONObject jSONObject = new JSONObject();
             JSONObject jSONObject1 = new JSONObject();
             jSONObject1.put("0", System.currentTimeMillis());
             jSONObject1.put("1", p0);
             jSONObject1.put("6", n.b(uContext));
             jSONObject1.put("7", "5.1.1.372.8d68fa37");
             jSONObject1.put("8", "KWE_N");
             a uoa = a.a(uContext).a();
             if (uoa != null) {
                pair = uoa.b(0x110009);
                String str1 = pair.first.toString();
                pair = pair.second;
                str = str1;
             }else {
                uoa = str;
             }
             jSONObject1.put("9", str);
             jSONObject1.put("10", pair);
             jSONObject1.put("15", b.i().h().getProductName());
             jSONObject.put("Header_section", jSONObject1);
             if (p1 != null && p1.length() > 0) {
                jSONObject.put("Data_section", p1);
                a.a(uContext).a(jSONObject.toString(), true, false, null);
             }
          }
       }
    label_00cd :
       return;
    }
    public static void a(String p0,String p1,boolean p2,String p3,boolean p4){
       String str1;
       Pair pair;
       String str2;
       object oobject = p0;
       object oobject1 = p1;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, on, "19")) {
             return;
          }
       }
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          Context uContext = b.i().j().c();
          if (uContext == null) {
             return;
          }else if(!new c(uContext).r()){
             d.d("sendEventUDCImpl closed");
             return;
          }else {
             long l = System.currentTimeMillis();
             JSONObject jSONObject = new JSONObject();
             JSONObject jSONObject1 = new JSONObject();
             jSONObject1.put("0", l);
             jSONObject1.put("1", oobject);
             String str = "KWE_N";
             if (TextUtils.isEmpty(p3)) {
                a uoa = a.a(uContext).a();
                if (uoa != null) {
                   str1 = uoa.b(0x110008);
                   str = uoa.b(0x11000a);
                label_00a9 :
                   jSONObject1.put("6", n.b(uContext));
                   jSONObject1.put("7", str);
                   jSONObject1.put("8", str1);
                   uoa = a.a(uContext).a();
                   if (uoa != null) {
                      pair = uoa.b(0x110009);
                      str = pair.first.toString();
                      pair = pair.second;
                   }else {
                      str2 = "";
                      str = str2;
                   }
                   jSONObject1.put("9", str);
                   jSONObject1.put("10", pair);
                   jSONObject.put("Header_section", jSONObject1);
                   str2 = "Data_section";
                   if (oobject1 == null || p1.length() <= 0) {
                      oobject1 = new JSONObject();
                   }
                   jSONObject.put(str2, oobject1);
                   if (p2) {
                      a.a(uContext).a(jSONObject.toString(), 0, p4, null);
                   }else {
                      uoa = new a();
                      uoa.d = jSONObject.toString();
                      uoa.b = oobject;
                      uoa.g = 0;
                      uoa.c = 3;
                      uoa.e = l;
                      uoa.f = 1;
                      uoa.h = 0;
                      uoa.i = 0;
                      uoa.j = "";
                      a.a(uContext).a(uoa);
                   }
                }
             }else {
                str = p3;
             }
             str1 = "";
             goto label_00a9 ;
          }
       }
       return;
    }
    public static void a(String p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, n.class, "18")) {
          return;
       }
       n.a(p0, p1, p2, "", p3);
       return;
    }
    public static boolean a(Context p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1 != null) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             if (!p0.checkPermission(p1[i], Process.myPid(), Process.myUid())) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean a(c p0,String p1,boolean p2){
       if (PatchProxy.isSupport(n.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, n.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = p0.a(p1);
       if (!TextUtils.isEmpty(str)) {
          boolean b = true;
          if (new JSONObject(str).optInt("1", p2) != b) {
             b = false;
          }
          return b;
       }else {
          return p2;
       }
    }
    public static byte[] a(byte[] p0,byte[] p1){
       SecretKeySpec obj = PatchProxy.applyTwoRefs(p0, p1, null, n.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SecretKeySpec(p0, "AES");
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       int i = 16;
       byte[] uobyteArray = new byte[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uobyteArray[i1] = 0;
       }
       instance.init(1, obj, new IvParameterSpec(uobyteArray));
       return instance.doFinal(p1);
    }
    public static String b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PackageInfo versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0x4000).versionName;
       return versionName;
    }
    public static String b(String p0){
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) || p0.startsWith("KWE")) {
          return p0;
       }
       obj = MessageDigest.getInstance("MD5");
       obj.reset();
       obj.update(p0.getBytes(Charset.forName("UTF-8")));
       return n.a(obj.digest());
    }
    public static boolean b(Context p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1 != null) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             if (p0.checkPermission(p1[i], Process.myPid(), Process.myUid()) == -1) {
                return false;
             }
             i = i + 1;
          }
       }
       return true;
    }
    public static int c(Context p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, n.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new String[]{"android.permission.ACCESS_NETWORK_STATE"};
       if (!n.b(p0, obj)) {
          return 2;
       }
       NetworkInfo activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo();
       if (activeNetwor == null) {
          return 0;
       }
       if (1 == activeNetwor.getType()) {
          return 2;
       }
       activeNetwor.getType();
       return 1;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new String(Base64.decode(p0, 0));
    }
    public static boolean d(Context p0){
       ActivityManager$MemoryInfo obj = PatchProxy.applyOneRefs(p0, null, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new ActivityManager$MemoryInfo();
       p0.getSystemService("activity").getMemoryInfo(obj);
       boolean b = ((obj.availMem / 0x100000) - 150 > 0)? true: false;
       return b;
    }
    public static boolean e(Context p0){
       ActivityManager$MemoryInfo obj = PatchProxy.applyOneRefs(p0, null, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new ActivityManager$MemoryInfo();
       p0.getSystemService("activity").getMemoryInfo(obj);
       return obj.lowMemory;
    }
    public static boolean f(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String[] stringArray = new String[]{"android.permission.ACCESS_NETWORK_STATE"};
       if (!n.b(p0, stringArray)) {
          return true;
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (Build$VERSION.SDK_INT >= 23) {
          return systemServic.getNetworkCapabilities(systemServic.getActiveNetwork()).hasCapability(16);
       }
       NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
       if (activeNetwor == null) {
          return false;
       }
       return activeNetwor.isConnected();
    }
}
