package h30.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import i30.a;
import s30.e;
import android.content.Context;
import java.lang.Boolean;
import i30.t;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.System;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.romid.inlet.OaidHelper;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.dfp.c.d;
import i30.b0;
import i30.n;
import java.lang.Long;
import android.util.Base64;
import l30.y;
import com.kuaishou.dfp.envdetect.Proxy.EngineProxy;
import java.util.zip.CRC32;
import java.net.URLEncoder;
import l30.l;
import com.kuaishou.dfp.hostproxy.DfpDidProxy;
import com.kuaishou.dfp.hostproxy.DfpDidTagProxy;
import com.kuaishou.dfp.hostproxy.DfpODidProxy;
import r30.d;
import i30.u;
import r30.a;
import java.util.concurrent.CountDownLatch;
import h30.b;
import com.kwai.framework.deviceid.h$b;
import i30.x;
import java.lang.Throwable;

public class a	// class@001723
{
    public static long a;

    public void a(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWE_"+a.a().h;
    }
    public static String b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != patchProxyRe) {
       }else if(("12").equals(p0)){
          obj = "repair";
       }else if("15".equals(p0)){
          obj = "acrepair";
       }else {
          obj = "fetch";
       }
       return obj;
    }
    public static String c(Context p0,boolean p1){
       t obj1;
       String obj2;
       String str16;
       boolean b1;
       String str17;
       a obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "9";
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p1), null, uoa, str);
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = t.c();
       Objects.requireNonNull(obj1);
       String str1 = "AND";
       t ot = t.class;
       String str2 = "8";
       if (PatchProxy.isSupport(ot)) {
          obj2 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p1), obj1, ot, str2);
          if (obj2 != patchProxyRe) {
          }else {
          label_003d :
             obj1.h = p1;
             uoa = a.a();
             int b = t.p.get();
             Objects.requireNonNull(uoa);
             a uoa1 = a.class;
             String str3 = str;
             String str4 = str2;
             str2 = "k36";
             String str5 = "k97";
             String str6 = "k105";
             String str7 = str1;
             str1 = "k102";
             String str8 = "k111";
             String str9 = "k113";
             String str10 = "KWE_OTHER";
             String str11 = "k66";
             String str12 = "k110";
             String str13 = "k109";
             str = "k64";
             String str14 = "6.2.1lite.442.256dfb8c";
             String str15 = "4";
             if (PatchProxy.isSupport(uoa1)) {
                str16 = str2;
                Object obj3 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(b), uoa, uoa1, str15);
                if (obj3 != patchProxyRe) {
                   obj2 = obj3;
                }
             }else {
                str16 = str2;
             }
             long l = System.currentTimeMillis();
             uoa.i.lock();
             if (!TextUtils.isEmpty(uoa.g)) {
                obj = uoa.g;
                uoa.i.unlock();
             }else {
                OaidHelper.getSingletonInstance().initOAIDImpl(obj);
                JSONObject jSONObject = new JSONObject();
                if (uoa.e.containsKey(str) && uoa.e.containsKey("k27")) {
                   jSONObject.put("k27", d.e(uoa.e.get("k27")));
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                   b1 = b;
                   str17 = str6;
                }else {
                   str2 = b0.w();
                   b1 = b;
                   jSONObject.put("k27", d.e(str2));
                   obj2 = b0.e(p0);
                   str17 = str6;
                   jSONObject.put(str, d.e(obj2));
                   uoa.e.putIfAbsent("k27", d.e(str2));
                   uoa.e.putIfAbsent(str, d.e(obj2));
                }
                uoa.h = "1";
                jSONObject.put("k5", d.e(Long.toString(n.D())));
                jSONObject.put("k46", d.e(d.e(Long.toString(n.z()))));
                b = 1;
                if (uoa.e.containsKey("k31")) {
                   jSONObject.put("k31", d.e(uoa.e.get("k31")));
                }else {
                   str = n.e(obj, b);
                   jSONObject.put("k31", d.e(str));
                   uoa.e.putIfAbsent("k31", d.e(str));
                }
                uoa.h = "2";
                if (uoa.e.containsKey(str11)) {
                   jSONObject.put(str11, d.e(uoa.e.get(str11)));
                }else {
                   str = n.A(p0);
                   jSONObject.put(str11, d.e(str));
                   uoa.e.putIfAbsent(str11, d.e(str));
                }
                uoa.h = "3";
                if (uoa.e.containsKey("k39")) {
                   jSONObject.put("k39", d.e(uoa.e.get("k39")));
                }else {
                   str = Long.toString(n.G());
                   jSONObject.put("k39", d.e(str));
                   uoa.e.putIfAbsent("k39", d.e(str));
                }
                if (uoa.e.containsKey("k101")) {
                   jSONObject.put("k101", d.e(uoa.e.get("k101")));
                }else {
                   str = b0.c(new String(Base64.decode("L3N5cy9kZXZpY2VzL3NvYzAvc2VyaWFsX251bWJlcg==", 0)));
                   jSONObject.put("k101", d.e(str));
                   uoa.e.putIfAbsent("k101", d.e(str));
                }
                if (uoa.e.containsKey(str1)) {
                   jSONObject.put(str1, d.e(uoa.e.get(str1)));
                }else {
                   str = b0.c(new String(Base64.decode("L3Byb2Mvc3lzL2tlcm5lbC9yYW5kb20vYm9vdF9pZA==", 0)));
                   jSONObject.put(str1, d.e(str));
                   uoa.e.putIfAbsent(str1, d.e(str));
                }
                if (uoa.e.containsKey("k57")) {
                   jSONObject.put("k57", d.e(uoa.e.get("k57")));
                }else {
                   jSONObject.put("k57", d.e(n.d(obj, new y(obj))));
                }
                uoa.h = str15;
                if (uoa.e.containsKey("k68")) {
                   jSONObject.put("k68", d.e(uoa.e.get("k68")));
                }else {
                   jSONObject.put("k68", d.e(n.c(p0)));
                }
                uoa.h = "5";
                str = str17;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   str1 = EngineProxy.getInstance(p0).gRdi();
                   jSONObject.put(str, d.e(str1));
                   uoa.e.putIfAbsent(str, d.e(str1));
                }
                uoa.h = "6";
                str = str16;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   jSONObject.put(str, d.e(str14));
                   uoa.e.putIfAbsent(str, d.e(str14));
                }
                str = str13;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   str1 = EngineProxy.getInstance(p0).lpss();
                   jSONObject.put(str, d.e(str1));
                   uoa.e.putIfAbsent(str, d.e(str1));
                }
                str = str12;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   str1 = EngineProxy.getInstance(p0).getKeeperSeed();
                   str2 = str10;
                   jSONObject.put(str, d.f(str1, str2));
                   uoa.e.putIfAbsent(str, d.f(str1, str2));
                }
                str = str9;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   str1 = EngineProxy.getInstance(p0).getManus(OaidHelper.ROME_INDEX);
                   jSONObject.put(str, d.e(str1));
                   uoa.e.putIfAbsent(str, d.e(str1));
                }
                str = str8;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   uoa.e.putIfAbsent(str, d.e(d.w(p0)));
                }
                jSONObject.put("k14", d.e(str7));
                uoa.h = "7";
                str = str5;
                if (uoa.e.containsKey(str)) {
                   jSONObject.put(str, d.e(uoa.e.get(str)));
                }else {
                   OaidHelper.getSingletonInstance().waitOaidCountDownLatch();
                   str1 = OaidHelper.getSingletonInstance().getOaidInner();
                   jSONObject.put(str, d.e(str1));
                   uoa.e.putIfAbsent(str, d.e(str1));
                }
                if (b1) {
                   uoa.e.put("k107", d.e(a.a().o()));
                }
                CRC32 uCRC32 = new CRC32();
                while (b <= 119) {
                   str = "k"+b;
                   if (jSONObject.has(str)) {
                      uCRC32.update((jSONObject.optString(str)).getBytes());
                   }
                   b = b + 1;
                }
                jSONObject.put(new String(Base64.decode("azE0", 0)), d.e(str7+":"+String.valueOf(uCRC32.getValue())));
                uoa.h = str4;
                uoa.g = URLEncoder.encode(Base64.encodeToString(EngineProxy.getInstance(p0).simpleEncrypt((jSONObject.toString()).getBytes(), ("MzAyMTIxMDJkaWN1ZGlhYg==").getBytes()), 0), "utf-8");
                uoa.h = str3;
                uoa.i.unlock();
                if (TextUtils.isEmpty(uoa.g)) {
                   uoa.g = "KWE_N";
                }
                l.c("mini cost : "+(System.currentTimeMillis() - l));
                uoa.h = "10";
                obj = uoa.g;
             }
             obj2 = obj;
          }
       }else {
          goto label_003d ;
       }
       return obj2;
    }
    public static String d(){
       Object obj = PatchProxy.apply(null, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OaidHelper.getSingletonInstance().getIdImpl(1);
    }
    public static void e(Context p0,String p1,DfpDidProxy p2,DfpDidTagProxy p3,DfpODidProxy p4,String p5,boolean p6){
       Object[] objArray;
       u ou;
       object oobject = p4;
       object oobject1 = p5;
       a uoa = a.class;
       Object obj = null;
       int i = 0;
       int i1 = 1;
       int i2 = 2;
       int i3 = 3;
       int i4 = 4;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{p0,p1,p2,p3,oobject,oobject1,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
             return;
          }
       }
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{p0,p1,p2,p3,oobject,oobject1,Boolean.valueOf(p6),Boolean.FALSE};
          if (!PatchProxy.applyVoid(objArray, obj, uoa, "4")) {
          label_005b :
             a.a().l = oobject;
             a.a().d = oobject1;
             t ot = t.c();
             Objects.requireNonNull(ot);
             t ot1 = t.class;
             if (PatchProxy.isSupport(ot1)) {
                Object[] objArray1 = new Object[]{p0,p1,p2,p3,"",Boolean.valueOf(p6),Boolean.FALSE};
                if (!PatchProxy.applyVoid(objArray1, ot, ot1, "2")) {
                }
             }else {
             }
          }
       }else {
          goto label_005b ;
       }
       return;
    }
    public static boolean f(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          b = d.D(p0);
       }
       return b;
    }
    public static void g(byte[] p0,b p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "17")) {
          return;
       }
       t ot = t.c();
       Objects.requireNonNull(ot);
       if (!PatchProxy.isSupport(t.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), ot, t.class, "10")) {
          if (!t.p.get()) {
             p1.onFailed(-9, "Please call init first!");
          }else if(p0 == null || !p0.length){
             p1.onFailed(-1, "mappingInfo value is empyt!");
          }else if(p2){
             a.a().g(p1, p0);
          }else {
             d.a().b(new x(ot, p1, p0));
          }
       }
       return;
    }
    public static void h(){
       t.l = true;
    }
}
