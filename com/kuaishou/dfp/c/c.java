package com.kuaishou.dfp.c.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import okhttp3.OkHttpClient;
import l30.u;
import okhttp3.FormBody$Builder;
import l30.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONObject;
import okhttp3.FormBody;
import l30.k;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.lang.StringBuilder;
import l30.l;
import android.content.Context;
import i30.c0;
import java.lang.Integer;
import java.util.TreeMap;
import i30.a;
import java.lang.System;
import i30.t;
import com.kuaishou.dfp.c.d;
import java.util.Objects;
import java.lang.Number;
import android.content.SharedPreferences;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.dfp.c.a;
import v30.d;
import v30.a;
import s30.e;
import java.lang.Boolean;

public class c	// class@0016e7
{

    public void c(){
       super();
    }
    public static String a(String p0,String p1,String p2,String p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       OkHttpClient obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, c.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = u.a(15);
       FormBody$Builder uBuilder = new FormBody$Builder();
       String str = PatchProxy.applyOneRefs(p2, null, o.class, "9");
       if (str != patchProxyRe) {
       }else if(TextUtils.isEmpty(p2)){
          str = "";
       }else {
          str = Base64.encodeToString(o.c(("t8#bm@b!kqfI^w~y").getBytes(), p2.getBytes()), 0);
       }
       String str1 = URLEncoder.encode(str, "utf-8");
       p2 = new JSONArray(p2).optJSONObject(0).optString("6", "");
       if (TextUtils.isEmpty(p2)) {
          p2 = "unknow";
       }
       uBuilder.add("productName", p2).add(p1, str1);
       if (!TextUtils.isEmpty(p3)) {
          uBuilder.add("ft", p3);
       }
       FormBody uFormBody = uBuilder.build();
       p0 = k.q(p0);
       if (TextUtils.isEmpty(p0)) {
          return "";
       }else {
          Response response = obj.newCall(new Request$Builder().url(p0).post(uFormBody).build()).execute();
          if (!response.isSuccessful()) {
             return "";
          }else {
             response = response.body().string();
             l.a(p0+" "+response);
             return response;
          }
       }
    }
    public static FormBody$Builder b(Context p0,c0 p1,int p2){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, c.class, "4");
          if (p0 != patchProxyRe) {
             return p0;
          }
       }
       FormBody$Builder uBuilder = new FormBody$Builder();
       TreeMap treeMap = new TreeMap();
       if (!PatchProxy.applyVoidOneRefs(treeMap, null, uoc, "7")) {
          obj = a.a().l();
          if (TextUtils.isEmpty(obj)) {
             obj = "unknow";
          }
          String str2 = a.a().r();
          String str3 = a.a().o();
          treeMap.put("ts", String.valueOf(System.currentTimeMillis()));
          treeMap.put("productName", obj);
          treeMap.put("appVersion", d.B(t.c().d()));
          treeMap.put("sdkVersion", "6.2.1lite.442.256dfb8c");
          treeMap.put("platform", "1");
          obj = "didTag";
          if (!treeMap.containsKey(obj)) {
             treeMap.put(obj, str3);
          }
          treeMap.put("did", str2);
       }
       Objects.requireNonNull(p1);
       obj = PatchProxy.apply(null, p1, c0.class, "18");
       long l = (obj != patchProxyRe)? obj.longValue(): p1.a.getLong("al_dfr_dd_re_p_sttt_time_22_8", 0);
       treeMap.put("lastDidTs", Long.toString(l));
       treeMap.put("from", Integer.toString(p2));
       String str = "";
       Iterator iterator = treeMap.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          obj = uEntry.getValue();
          l.c(uEntry.getKey()+" "+obj);
          if (TextUtils.isEmpty(obj)) {
             l.d(uEntry.getKey()+" value is null!!!");
          }else {
             str = str+obj;
             uBuilder.add(uEntry.getKey(), obj);
          }
       }
       String str1 = MXSec.get().getWrapper().atlasSign("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, str);
       if (!TextUtils.isEmpty(str1)) {
          uBuilder.add("sign", str1);
       }else {
          Objects.requireNonNull(a.b("com.kuaishou.android.security.KSecurity").j("isInitialize"));
          str = MXSec.get().getWrapper().atlasSign("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, str);
          if (!TextUtils.isEmpty(str)) {
             uBuilder.add("sign", str);
          }else {
             uBuilder = null;
          }
       }
       return uBuilder;
    }
    public static FormBody$Builder c(Context p0,String p1,String p2,byte[] p3){
       MXSec mXSec;
       byte[] uobyteArray = p3;
       FormBody$Builder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FormBody$Builder();
       d.d(p0).c(a.B0, 0, null);
       String str = "ztdfp";
       String str1 = "7e46b28a-8c93-4940-8238-4c60e64e3c81";
       byte[] uobyteArray1 = MXSec.get().getWrapper().atlasEncrypt(str, str1, 0, uobyteArray);
       if (uobyteArray1 != null && uobyteArray1.length > 0) {
          d.d(p0).c(a.C0, 0, null);
       }else {
          Objects.requireNonNull(a.b("com.kuaishou.android.security.KSecurity").j("isInitialize"));
          uobyteArray1 = MXSec.get().getWrapper().atlasEncrypt(str, str1, 0, uobyteArray);
          if (uobyteArray1 == null || !uobyteArray1.length) {
             d.d(p0).c(a.D0, 0, null);
             uobyteArray1 = uobyteArray;
             mXSec = 1;
          label_0078 :
             String str2 = URLEncoder.encode(Base64.encodeToString(uobyteArray1, 0), "utf-8");
             d.d(p0).j(str2);
             TreeMap treeMap = new TreeMap();
             treeMap.put("odid", a.a().q());
             c.f(treeMap);
             treeMap.put("deviceInfo", str2);
             treeMap.put("decisionDid", p1);
             treeMap.put("decision", p2);
             treeMap.put("decisionInputs", e.c(p0).u);
             str2 = d.d(p0).e(0);
             if (!TextUtils.isEmpty(str2)) {
                treeMap.put("requestId", str2);
             }
             str2 = "sv";
             if (mXSec) {
                treeMap.put(str2, "3");
             }else {
                treeMap.put(str2, "2");
             }
             str2 = "";
             l.a("getPostRequestBuilderIdCorrect sign!");
             Iterator iterator = treeMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String value = uEntry.getValue();
                l.c(uEntry.getKey()+" "+value);
                if (TextUtils.isEmpty(value)) {
                   l.d(uEntry.getKey()+" value is null!!!");
                }else {
                   str2 = str2+value;
                   obj.add(uEntry.getKey(), value);
                }
             }
             d.d(p0).c(a.E0, 0, null);
             if (!mXSec) {
                str2 = MXSec.get().getWrapper().atlasSign(str, str1, 0, str2);
                if (!TextUtils.isEmpty(str2)) {
                   d.d(p0).c(a.F0, 0, null);
                   obj.add("sign", str2);
                }else {
                   d.d(p0).c(a.G0, 0, null);
                   str2 = URLEncoder.encode(Base64.encodeToString(uobyteArray, 0), "utf-8");
                   d.d(p0).j(str2);
                   treeMap.put("deviceInfo", str2);
                   obj.add("sign", "");
                }
             }else {
                obj.add("sign", "");
             }
             return obj;
          }
       }
       mXSec = null;
       goto label_0078 ;
    }
    public static FormBody$Builder d(String p0,byte[] p1){
       String str3;
       MXSec mXSec;
       FormBody$Builder obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FormBody$Builder();
       String str = "ztdfp";
       String str1 = "7e46b28a-8c93-4940-8238-4c60e64e3c81";
       byte[] uobyteArray = MXSec.get().getWrapper().atlasEncrypt(str, str1, 0, p1);
       String str2 = "3";
       if (uobyteArray == null || !uobyteArray.length) {
          l.d("atlasEncrypt failed !");
          if ("deviceInfo".equals(p0)) {
             uobyteArray = p1;
             str3 = str2;
             mXSec = 1;
          label_0043 :
             String str4 = URLEncoder.encode(Base64.encodeToString(uobyteArray, 0), "utf-8");
             String str5 = a.a().l();
             if (TextUtils.isEmpty(str5)) {
                str5 = "unknow";
             }
             String str6 = String.valueOf(System.currentTimeMillis());
             String str7 = str5+str6+str3+str4;
             String str8 = "";
             if (!mXSec) {
                str = MXSec.get().getWrapper().atlasSign(str, str1, 0, str7);
                if (TextUtils.isEmpty(str) && "deviceInfo".equals(p0)) {
                   l.d("atlasSign failed !");
                   str4 = URLEncoder.encode(Base64.encodeToString(p1, 0), "utf-8");
                label_00a6 :
                   obj.add("productName", str5).add("ts", str6).add(p0, str4).add("sign", str8).add("sv", str2);
                   p0 = a.a().m();
                   if (!TextUtils.isEmpty(p0)) {
                      obj.add("rdid", p0);
                      obj.add("didtag", "-1");
                   }
                   return obj;
                }else {
                   str8 = str;
                }
             }
             str2 = str3;
             goto label_00a6 ;
          }
       }
       str3 = "2";
       mXSec = null;
       goto label_0043 ;
    }
    public static FormBody$Builder e(byte[] p0){
       Object obj = null;
       FormBody$Builder obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new FormBody$Builder();
       byte[] uobyteArray = MXSec.get().getWrapper().atlasEncrypt("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, p0);
       if (uobyteArray == null || !uobyteArray.length) {
          Objects.requireNonNull(a.b("com.kuaishou.android.security.KSecurity").j("isInitialize"));
          uobyteArray = MXSec.get().getWrapper().atlasEncrypt("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, p0);
          if (uobyteArray == null || !uobyteArray.length) {
             return obj;
          }
       }
       String str = URLEncoder.encode(Base64.encodeToString(uobyteArray, 0), "utf-8");
       obj1.add("data", str);
       str = MXSec.get().getWrapper().atlasSign("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, str);
       if (TextUtils.isEmpty(str)) {
          return obj;
       }else {
          obj1.add("sign", str);
          return obj1;
       }
    }
    public static void f(TreeMap p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "6")) {
          return;
       }
       String str = a.a().l();
       if (TextUtils.isEmpty(str)) {
          str = "unknow";
       }
       String str1 = a.a().r();
       String str2 = a.a().o();
       p0.put("ts", String.valueOf(System.currentTimeMillis()));
       p0.put("productName", str);
       p0.put("appVersion", d.B(t.c().d()));
       p0.put("sdkVersion", "6.2.1lite.442.256dfb8c");
       p0.put("platform", "1");
       str = "didTag";
       if (!p0.containsKey(str)) {
          p0.put(str, str2);
       }
       str = a.a().m();
       if (!TextUtils.isEmpty(str)) {
          p0.put("rdid", str);
       }
       p0.put("aegon", Boolean.toString(t.m));
       p0.put("did", str1);
       a = d.d(t.c().d()).a;
       if (!TextUtils.isEmpty(a)) {
          p0.put("hgidReportId", a);
       }
       return;
    }
    public static FormBody$Builder g(String p0,byte[] p1){
       MXSec mXSec;
       Object obj = null;
       String str = "2";
       FormBody$Builder obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, c.class, str);
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new FormBody$Builder();
       d.d(t.c().d()).a(a.C, 0, obj);
       String str1 = "ztdfp";
       byte[] uobyteArray = MXSec.get().getWrapper().atlasEncrypt(str1, "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, p1);
       boolean b = true;
       if (uobyteArray != null && uobyteArray.length > 0) {
          d.d(t.c().d()).a(a.D, 0, obj);
       }else {
          Objects.requireNonNull(a.b("com.kuaishou.android.security.KSecurity").j("isInitialize"));
          uobyteArray = MXSec.get().getWrapper().atlasEncrypt(str1, "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, p1);
          if (uobyteArray == null || !uobyteArray.length) {
             d.d(t.c().d()).a(a.E, 0, obj);
             uobyteArray = p1;
             mXSec = 1;
          label_0085 :
             String str2 = URLEncoder.encode(Base64.encodeToString(uobyteArray, 0), "utf-8");
             d.d(t.c().d()).i(str2);
             TreeMap treeMap = new TreeMap();
             l.c("Fecth did requetst now host didtag is "+a.a().o());
             treeMap.put("didTag", "-1");
             c.f(treeMap);
             treeMap.put(p0, str2);
             str2 = d.d(t.c().d()).e(b);
             if (!TextUtils.isEmpty(str2)) {
                treeMap.put("requestId", str2);
             }
             str2 = "sv";
             if (mXSec) {
                treeMap.put(str2, "3");
             }else {
                treeMap.put(str2, str);
             }
             str = "";
             Iterator iterator = treeMap.entrySet().iterator();
             l.c("getPostRequestBuilderLite sign!");
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String value = uEntry.getValue();
                l.a(uEntry.getKey()+" "+value);
                if (TextUtils.isEmpty(value)) {
                   l.d(uEntry.getKey()+" value is null!!!");
                }else {
                   str = str+value;
                   obj1.add(uEntry.getKey(), value);
                }
             }
             l.c("sign ori: "+str);
             d.d(t.c().d()).a(a.F, 0, obj);
             if (!mXSec) {
                str = MXSec.get().getWrapper().atlasSign(str1, "7e46b28a-8c93-4940-8238-4c60e64e3c81", 0, str);
                if (!TextUtils.isEmpty(str)) {
                   d.d(t.c().d()).a(a.G, 0, obj);
                   obj1.add("sign", str);
                }else {
                   d.d(t.c().d()).a(a.H, 0, obj);
                   obj1.add("sign", "");
                   String str3 = URLEncoder.encode(Base64.encodeToString(p1, 0), "utf-8");
                   d.d(t.c().d()).i(str3);
                   treeMap.put(p0, str3);
                }
             }else {
                obj1.add("sign", "");
             }
             return obj1;
          }
       }
       mXSec = null;
       goto label_0085 ;
    }
}
