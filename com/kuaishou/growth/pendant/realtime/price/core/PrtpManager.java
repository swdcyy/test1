package com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ye0.a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig$a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig$a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$d;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$b;
import java.lang.reflect.Type;
import el.a;
import ue0.a;
import android.content.SharedPreferences;
import km8.b;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig;
import we0.m;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$c;
import kotlin.Pair;
import java.lang.Long;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.Integer;
import xe0.b;
import bf0.f;
import android.os.Handler;
import android.os.Message;
import qrd.l1;
import bf0.a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$a;
import com.google.gson.JsonElement;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$f;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$e;
import yb6.d;
import ej5.c;
import ye0.d;
import org.json.JSONObject;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule$a;
import tb7.b;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$reportAfk$1;
import we0.l;
import msd.a;
import java.lang.Runnable;
import we0.g;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import we0.f;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpEveWrapper$activate$2;
import msd.l;

public final class PrtpManager	// class@0006a8
{
    public static PrtpSwitchConfig a;
    public static final PrtpReportSwitchConfig b;
    public static final PrtpAfkReportSwitchConfig c;
    public static ConcurrentHashMap d;
    public static int e;
    public static Integer f;
    public static int g;
    public static Integer h;
    public static Integer i;
    public static float j;
    public static int k;
    public static boolean l;
    public static final CopyOnWriteArrayList m;
    public static boolean n;
    public static final a o;
    public static PrtpActivityConfig p;
    public static final ConcurrentHashMap q;
    public static final ConcurrentHashMap r;
    public static int s;
    public static boolean t;
    public static long u;
    public static long v;
    public static long w;
    public static Pair x;
    public static Pair y;
    public static final PrtpManager z;

    static {
       String str = "";
       String str1 = "null";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PrtpManager prtpManager = PrtpManager.class;
       PrtpManager prtpManager1 = new PrtpManager();
       PrtpManager.z = prtpManager1;
       PrtpSwitchConfig prtpSwitchCo = PatchProxy.apply(null, prtpManager1, prtpManager, "3");
       if (prtpSwitchCo != patchProxyRe) {
       }else {
          prtpSwitchCo = prtpManager1.p(a.t().f("PendantRealtimePrice"));
       }
       PrtpManager.a = prtpSwitchCo;
       PrtpReportSwitchConfig prtpReportSw = prtpManager1.o(a.t().f("PendantRealtimePriceReport"));
       PrtpManager.b = prtpReportSw;
       PrtpAfkReportSwitchConfig prtpAfkRepor = prtpManager1.n(a.t().f("PrtpAfkReport"));
       PrtpManager.c = prtpAfkRepor;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       PrtpManager z = PrtpManager.z;
       Objects.requireNonNull(z);
       HashMap hashMap = PatchProxy.apply(null, z, prtpManager, "7");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = z.m(a.t().f("PrtpCoinMappingConfig"));
       }
       if (hashMap != null) {
          uConcurrentH.putAll(hashMap);
       }
       PrtpManager.d = uConcurrentH;
       PrtpManager.e = -1;
       PrtpManager.g = -1;
       PrtpManager.j = 0xbf800000;
       PrtpManager.l = true;
       PrtpManager.m = new CopyOnWriteArrayList();
       PrtpManager.n = true;
       PrtpManager.o = PrtpManager$d.b;
       Type type = new PrtpManager$b().getType();
       String str2 = a.a.getString("prtpActivityConfig", str1);
       Object[] objArray = (str2 == null || str2 == str)? null: b.a(str2, type);
       a.f("PrtpManager#activityConfig : init = "+m.c(objArray, null, 2, null), false, 2, null);
       PrtpManager.p = objArray;
       ConcurrentHashMap uConcurrentH1 = new ConcurrentHashMap();
       Type type1 = new PrtpManager$c().getType();
       str1 = a.a.getString("prtpStartCoinLevelMap", str1);
       Object[] objArray1 = (str1 == null || str1 == str)? null: b.a(str1, type1);
       if (objArray1 != null) {
          uConcurrentH1.putAll(objArray1);
       }
       a.f("PrtpManager#startCoinLevelMap : init = "+m.c(uConcurrentH1, null, 2, null), false, 2, null);
       PrtpManager.q = uConcurrentH1;
       PrtpManager.r = new ConcurrentHashMap();
       PrtpManager.s = -1;
       PrtpManager.x = new Pair(Long.valueOf(0), Long.valueOf(0));
       PrtpManager.y = new Pair(Long.valueOf(0), Long.valueOf(0));
    }
    public void PrtpManager(){
       super();
    }
    public static final ConcurrentHashMap a(PrtpManager p0){
       return PrtpManager.d;
    }
    public static final float e(String p0){
       float f;
       Float obj = PatchProxy.applyOneRefs(p0, null, PrtpManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "uid");
       obj = Float.valueOf(PrtpManager.j);
       int i = (obj.floatValue() - (float)0 > 0)? 1: 0;
       if (!i) {
          obj = null;
       }
       if (obj != null) {
          f = obj.floatValue();
          a.f("PrtpManager#getCurrentPid request : = "+f, 0, 2, null);
          return f;
       }else {
          Float uFloat = PrtpManager.r.get(p0);
          if (uFloat == null) {
             a.f("PrtpManager#getCurrentPid start : = fall to default value", 0, 2, null);
             f = 0x3f800000;
          }else {
             f = uFloat.floatValue();
          }
          a.f("PrtpManager#getCurrentPid start : = "+f, 0, 2, null);
          return f;
       }
    }
    public static final int f(String p0){
       Integer integer = null;
       Integer obj = PatchProxy.applyOneRefs(p0, integer, PrtpManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "uid");
       obj = Integer.valueOf(PrtpManager.g);
       int i = (obj.intValue() > 0)? 1: 0;
       if (i) {
          integer = obj;
       }
       int i1 = (integer != null)? integer.intValue(): PrtpManager.j(p0);
       return i1;
    }
    public static final int j(String p0){
       Integer integer = null;
       Object obj = PatchProxy.applyOneRefs(p0, integer, PrtpManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "uid");
       Integer integer1 = PrtpManager.q.get(p0);
       if (integer1 != null) {
          int i = 0;
          if (a.t(integer1.intValue(), i) > 0) {
             i = 1;
          }
          if (i) {
             integer = integer1;
          }
          if (integer != null) {
          label_003a :
             a.o(integer, "mStartCoinLevelMap[uid]?\x20\x02If { it > 0 }\n      ?: -1\x00");
             return integer.intValue();
          }
       }
       integer = Integer.valueOf(-1);
       goto label_003a ;
    }
    public static final void q(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PrtpManager.class, "14")) {
          return;
       }
       a.p(p0, "feature");
       Handler handler = f.d.b();
       if (handler != null) {
          Message message = Message.obtain();
          message.what = 1;
          message.obj = p0;
          handler.sendMessage(message);
       }
       return;
    }
    public static final void t(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PrtpManager.class, "13")) {
          return;
       }
       a.p(p0, "from");
       a uoa = f.d.a();
       if (uoa != null) {
          uoa.e(p0);
       }
       return;
    }
    public static final void u(){
       if (PatchProxy.applyVoid(null, null, PrtpManager.class, "35")) {
          return;
       }
       a.h("PrtpManager#resetEarnCoinResponse : ===> ", false, 2, null);
       PrtpManager.g = -1;
       PrtpManager.e = -1;
       PrtpManager.h = null;
       PrtpManager.f = null;
       PrtpManager.s = -1;
       PrtpManager.i = null;
       PrtpManager.j = 0xbf800000;
       return;
    }
    public final Pair b(Pair p0,Pair p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PrtpManager.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Long.valueOf((p0.getFirst().longValue() + p1.getFirst().longValue())), Long.valueOf((p0.getSecond().longValue() + p1.getSecond().longValue())));
    }
    public final PrtpActivityConfig c(){
       return PrtpManager.p;
    }
    public final Integer d(){
       Integer obj = PatchProxy.apply(null, this, PrtpManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PrtpManager.i;
       int i = (obj != null)? obj.intValue(): PrtpManager.s;
       return Integer.valueOf(i);
    }
    public final Integer g(){
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, PrtpManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d();
       if (obj != null) {
          int i = obj.intValue();
          if (i > 0) {
             objArray = Integer.valueOf((i + 1));
          }
       }
       return objArray;
    }
    public final PrtpAfkReportSwitchConfig h(){
       return PrtpManager.c;
    }
    public final PrtpReportSwitchConfig i(){
       return PrtpManager.b;
    }
    public final PrtpSwitchConfig k(){
       return PrtpManager.a;
    }
    public final void l(String p0,PrtpInferResult p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpManager.class, "23")) {
          return;
       }
       a.p(p0, "uid");
       a.p(p1, "inferResult");
       a.f("PrtpManager#notifyInferFinish : \n ===> inferResult = "+p1, false, 2, null);
       Iterator iterator = PrtpManager.m.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public final HashMap m(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrtpManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HashMap obj1 = null;
       JsonElement jsonElement = (p0 != null)? p0.c(): obj1;
       String str = String.valueOf(jsonElement);
       a.f("PrtpManager#obtainCoinMappingConfig : onlineMappingStr = "+str, false, 2, obj1);
       HashMap hashMap = m.a(str, new PrtpManager$f().getType(), obj1, 4, obj1);
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       a.f("PrtpManager#obtainCoinMappingConfig : onlineMapping = "+hashMap, false, 2, obj1);
       if (SystemUtil.K()) {
          String str1 = a.a.getString("prtpMappingTest", "");
          a.o(str1, "it");
          StringBuilder str2 = (str1.length() > 0)? 1: null;
          if (!str2) {
             str1 = obj1;
          }
          if (str1 != null) {
             a.c("PrtpManager#obtainCoinMappingConfig : mockMappingStr = "+str1, obj1, false, 6, obj1);
             HashMap hashMap1 = m.a(str1, new PrtpManager$e().getType(), obj1, 4, obj1);
             if (hashMap1 != null) {
                a.c("PrtpManager#obtainCoinMappingConfig : mockMapping = "+hashMap1, obj1, false, 6, obj1);
                hashMap = hashMap1;
             }
          }
       }
    label_00c0 :
       a.h("PrtpManager#obtainCoinMappingConfig : finalMapping = "+hashMap, false, 2, obj1);
       obj1 = hashMap;
       return obj1;
    }
    public final PrtpAfkReportSwitchConfig n(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrtpManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JsonElement jsonElement = (p0 != null)? p0.c(): null;
       String str = String.valueOf(jsonElement);
       a.f("Afk#PrtpManager#obtainPrtpAfkReportConfig : onlineConfigStr ="+str, false, 2, null);
       PrtpAfkReportSwitchConfig prtpAfkRepor = m.a(str, PrtpAfkReportSwitchConfig.class, null, 4, null);
       a.f("Afk#PrtpManager#obtainPrtpAfkReportConfig : onlineConfig = "+prtpAfkRepor, false, 2, null);
       if (SystemUtil.K() && a.a()) {
          Objects.requireNonNull(PrtpAfkReportSwitchConfig.Companion);
          prtpAfkRepor = PrtpAfkReportSwitchConfig.TEST;
       }else if(prtpAfkRepor != null){
          prtpAfkRepor = PrtpAfkReportSwitchConfig.Companion.a();
       }
       a.h("Afk#PrtpManager#obtainPrtpAfkReportConfig : finalConfig = "+prtpAfkRepor, false, 2, null);
       return prtpAfkRepor;
    }
    public final PrtpReportSwitchConfig o(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrtpManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JsonElement jsonElement = (p0 != null)? p0.c(): null;
       String str = String.valueOf(jsonElement);
       a.f("PrtpManager#obtainPrtpReportSwitchConfig : onlineConfigStr = "+str, false, 2, null);
       PrtpReportSwitchConfig prtpReportSw = m.a(str, PrtpReportSwitchConfig.class, null, 4, null);
       a.f("PrtpManager#obtainPrtpReportSwitchConfig : onlineConfig = "+prtpReportSw, false, 2, null);
       if (SystemUtil.K() && a.a()) {
          Objects.requireNonNull(PrtpReportSwitchConfig.Companion);
          prtpReportSw = PrtpReportSwitchConfig.TEST;
       }else if(prtpReportSw != null){
          prtpReportSw = PrtpReportSwitchConfig.Companion.a();
       }
       a.h("PrtpManager#obtainPrtpReportSwitchConfig : finalConfig = "+prtpReportSw, false, 2, null);
       return prtpReportSw;
    }
    public final PrtpSwitchConfig p(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrtpManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PrtpSwitchConfig obj1 = null;
       JsonElement jsonElement = (p0 != null)? p0.c(): obj1;
       String str = String.valueOf(jsonElement);
       a.f("PrtpManager#obtainPrtpSwitchConfig : onlineConfigStr = "+str, false, 2, obj1);
       int i = 4;
       PrtpSwitchConfig prtpSwitchCo = m.a(str, PrtpSwitchConfig.class, obj1, i, obj1);
       a.f("PrtpManager#obtainPrtpSwitchConfig : onlineConfig = "+prtpSwitchCo, false, 2, obj1);
       if (SystemUtil.K() && a.a()) {
          Objects.requireNonNull(PrtpSwitchConfig.Companion);
          prtpSwitchCo = PrtpSwitchConfig.TEST;
       }
       if (SystemUtil.K()) {
          String str1 = a.a.getString("prtpSwitchTest", "");
          a.o(str1, "it");
          StringBuilder str2 = (str1.length() > 0)? 1: null;
          if (!str2) {
             str1 = obj1;
          }
          if (str1 != null) {
             a.c("PrtpManager#obtainPrtpSwitchConfig : mockConfigStr = "+str1, obj1, false, 6, obj1);
             PrtpSwitchConfig prtpSwitchCo1 = m.a(str1, PrtpSwitchConfig.class, obj1, i, obj1);
             if (prtpSwitchCo1 != null) {
                a.c("PrtpManager#obtainPrtpSwitchConfig : mockConfig = "+prtpSwitchCo1, obj1, false, 6, obj1);
                prtpSwitchCo = prtpSwitchCo1;
             }
          }
       }
    label_00bd :
       a.h("PrtpManager#obtainPrtpSwitchConfig : finalConfig = "+prtpSwitchCo, false, 2, obj1);
       obj1 = prtpSwitchCo;
       return obj1;
    }
    public final void r(){
       Pair x;
       d d;
       JSONObject obj = this;
       PrtpManager prtpManager = PrtpManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, prtpManager, "32")) {
          return;
       }
       int i = 2;
       boolean b = false;
       if (!this.h().isEnable()) {
          a.f("Afk#PrtpManager#realReportAfk : NOT ENABLE !!! ", b, i, objArray);
          return;
       }else {
          a.f("Afk#PrtpManager#realReportAfk : >>> >>>", b, i, objArray);
          long l = d.a();
          long u = PrtpManager.u;
          if (PrtpManager.t) {
             PrtpManager.u = l;
             if (!PatchProxy.isSupport(prtpManager) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(u), Long.valueOf(l), obj, prtpManager, "33")) {
                x = new Pair(Long.valueOf((l - u)), Long.valueOf(c.d.F(u, l)));
                PrtpManager.x = obj.b(PrtpManager.x, x);
                PrtpManager.y = obj.b(PrtpManager.y, x);
                a.f("Afk#PrtpManager#calcAfk : "+"\n = timeFromLaunch = "+PrtpManager.x.getFirst().longValue()+", "+"\n = afkTimeFromLaunch = "+PrtpManager.x.getSecond().longValue()+", "+"\n = timeFromReport = "+PrtpManager.y.getFirst().longValue()+", "+"\n = afkTimeFromReport = "+PrtpManager.y.getSecond().longValue(), b, i, objArray);
             }
          }
          x = PrtpManager.x;
          l = x.component1().longValue();
          u = x.component2().longValue();
          x = PrtpManager.y;
          long l1 = x.component1().longValue();
          long l2 = x.component2().longValue();
          PrtpManager.y = new Pair(Long.valueOf(0), Long.valueOf(0));
          d = d.d;
          long v = PrtpManager.v;
          long w = PrtpManager.w;
          Objects.requireNonNull(d);
          if (PatchProxy.isSupport(d.class)) {
             Object[] objArray1 = new Object[]{Long.valueOf(l1),Long.valueOf(l2),Long.valueOf(l),Long.valueOf(u),Long.valueOf(v),Long.valueOf(w)};
             if (PatchProxy.applyVoid(objArray1, d, d.class, "18")) {
             label_01d5 :
                PrtpManager.v = PrtpManager.v + 1;
                PrtpManager.w = PrtpManager.w + 1;
                return;
             }
          }
          obj = new JSONObject();
          obj.put("index_from_launch", v);
          obj.put("index_from_open", w);
          obj.put("current_time", d.a());
          String str = "is_foreground";
          PrtpInitModule$a y = PrtpInitModule.y;
          int i1 = (y.g())? 1: 0;
          obj.put(str, i1);
          obj.put("cold_launch_time", y.a());
          obj.put("open_app_time", y.f());
          obj.put("on_foreground_time", y.e());
          obj.put("on_background_time", y.d());
          obj.put("total_time", l1);
          obj.put("afk_time", l2);
          obj.put("total_time_from_launch", l);
          obj.put("afk_time_from_launch", u);
          d.a("prtp_afk_report", obj, "Afk#");
          goto label_01d5 ;
       }
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, PrtpManager.class, "31")) {
          return;
       }
       if (!this.h().isEnable()) {
          return;
       }
       this.r();
       b.d().postDelayed(new l(new PrtpManager$reportAfk$1(this)), this.h().getReportInterval());
       return;
    }
    public final void v(){
       d d;
       JSONObject jSONObject;
       d uod = d.class;
       g og = g.class;
       String str = "11";
       if (PatchProxy.applyVoid(null, this, PrtpManager.class, str)) {
          return;
       }
       PrtpSwitchConfig prtpSwitchCo = this.k();
       if (prtpSwitchCo != null) {
          if (prtpSwitchCo.enable != null) {
             if (!PatchProxy.applyVoid(null, null, og, "10")) {
                a.h("PrtpEveWrapper#activate : ", false, 2, null);
                if (g.e) {
                   a.h("PrtpEveWrapper#activate : has activated nothing to do ===> ", false, 2, null);
                }else {
                   g.e = true;
                   EveManagerWrapper.e.b("GrowthRealtimeAward", new f(), PrtpEveWrapper$activate$2.INSTANCE);
                   d = d.d;
                   Objects.requireNonNull(d);
                   if (!PatchProxy.applyVoid(null, d, uod, "6")) {
                      jSONObject = new JSONObject();
                      d.f(jSONObject);
                      d.b("prtp_activate_eve", jSONObject, null, 4, null);
                   }
                }
             }
          }else if(PatchProxy.applyVoid(null, null, og, str)){
             a.h("PrtpEveWrapper#deactivate : ", false, 2, null);
             if (!g.e) {
                a.h("PrtpEveWrapper#deactivate : not activated nothing to do ===> ", false, 2, null);
             }else {
                g.e = false;
                EveManagerWrapper.e.f("GrowthRealtimeAward");
                d = d.d;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoid(null, d, uod, "7")) {
                   jSONObject = new JSONObject();
                   d.f(jSONObject);
                   d.b("prtp_deactivate_eve", jSONObject, null, 4, null);
                }
             }
          }
       }
       return;
    }
}
