package com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import com.kuaishou.growth.pendant.realtime.price.init.PrtpInitModule$a;
import nsd.u;
import android.os.SystemClock;
import yb6.d;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import com.kuaishou.eve.kit.api.init.EveInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import we0.g;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import android.app.Activity;
import b76.a;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import ye0.d;
import ye0.a;
import java.lang.StringBuilder;
import we0.m;
import we0.h;
import java.lang.reflect.Type;
import el.a;
import ue0.a;
import android.content.SharedPreferences;
import km8.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult;
import java.lang.Throwable;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import we0.i;
import sm7.h;
import we0.j;
import brd.t;
import t45.d;
import brd.z;
import we0.k;
import erd.g;
import crd.b;
import com.kwai.sdk.switchconfig.a;
import io7.a;
import ye0.a$a;
import ye0.b;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import java.lang.Float;
import ej5.c;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$init$1;
import ze0.k;
import msd.l;
import ze0.f;
import ze0.g;
import ze0.h;
import com.kwai.sdk.eve.internal.featurecenter.Column;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedEveWrapper$registerFeatureAccessory$1;
import ze0.j;
import com.kuaishou.growth.pendant.realtime.price.feature.a;
import xe0.c;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import qrd.l1;
import xe0.d;
import com.kuaishou.growth.pendant.realtime.price.feature.PrtpFeatureManager$init$$inlined$forEach$lambda$1;
import trd.y;
import java.util.concurrent.ConcurrentMap;
import java.lang.Long;
import we0.q;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import mvb.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$1;
import we0.p;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$2;
import z8a.c;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$3;
import eda.r;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$4;
import qt5.c;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$5;
import eda.l;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$6;
import eda.n;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$7;
import jsa.e;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$8;
import bf0.f;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig;
import android.os.Handler;
import tb7.b;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$startReportAfk$1;
import we0.l;
import msd.a;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import ze0.a;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$startReport$1;
import ze0.l;
import android.os.Bundle;

public final class PrtpInitModule extends HomeCreateInitModule	// class@0006c0
{
    public static long q;
    public static long r;
    public static long s;
    public static long t;
    public static long u;
    public static long v;
    public static boolean w;
    public static boolean x;
    public static final PrtpInitModule$a y;

    static {
       PrtpInitModule.y = new PrtpInitModule$a(null);
       PrtpInitModule.q = SystemClock.elapsedRealtime();
       PrtpInitModule.r = d.a();
       PrtpInitModule.s = d.a();
       PrtpInitModule.u = d.a();
       PrtpInitModule.w = true;
    }
    public void PrtpInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PrtpInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class,EveInitModule.class};
       ArrayList uArrayList = Lists.e(obj);
       a.o(uArrayList, "Lists.newArrayList\(CoreI¡­veInitModule::class.java\)");
       return uArrayList;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, PrtpInitModule.class, "5")) {
          return;
       }
       boolean b = false;
       PrtpInitModule.w = b;
       if (!PatchProxy.applyVoid(null, null, PrtpManager.class, "12")) {
          PrtpManager.l = b;
          g g = g.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(null, g, g.class, "1")) {
             g.c.clear();
          }
       }
       PrtpInitModule.v = d.a();
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, PrtpInitModule.class, "4")) {
          return;
       }
       PrtpInitModule.w = true;
       PrtpManager.l = true;
       PrtpInitModule.u = d.a();
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpInitModule.class, "3")) {
          return;
       }
       PrtpInitModule.t = d.a();
       return;
    }
    public void k0(a p0){
       Object[] objArray2;
       f d;
       Object[] this;
       RxBus f;
       String str6;
       Type type;
       Iterator iterator;
       String key;
       l1 a;
       Map$Entry uEntry1;
       Iterator iterator1;
       Map$Entry uEntry2;
       String key1;
       String key2;
       long l;
       String str7;
       EveManagerWrapper obj;
       ConcurrentHashMap b2;
       Column obj1;
       long l1;
       Map$Entry b2;
       String str8;
       Long longx;
       Iterator b22;
       PrtpSpeedManager prtpSpeedMan = PrtpSpeedManager.class;
       PrtpManager prtpManager = PrtpManager.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpInitModule.class, str)) {
          return;
       }
       Object[] objArray = null;
       String str1 = "";
       String str2 = "null";
       String str3 = "prepareAndCallSo";
       String str4 = "prepareAndInfer";
       ConcurrentHashMap uConcurrentH = 1;
       ConcurrentHashMap uConcurrentH1 = 2;
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, objArray, prtpManager, "10")) {
          long l2 = SystemClock.elapsedRealtime();
          d d2 = d.d;
          d2.j("start", -1, l2);
          a.f("PrtpManager#init : ", b, uConcurrentH1, objArray);
          a.f("PrtpManager#init : activityConfig = "+m.c(PrtpManager.p, objArray, uConcurrentH1, objArray), b, uConcurrentH1, objArray);
          g og = g.class;
          if (!PatchProxy.applyVoid(objArray, objArray, og, "6")) {
             a.h("PrtpEveWrapper#init : ", b, uConcurrentH1, objArray);
             str7 = "init";
             if (!PatchProxy.applyVoidOneRefs(str7, objArray, og, "7")) {
                a.p(str7, "from");
                a.h("PrtpEveWrapper#preInitLocalData : from = "+str7+", mHasInitLocal = "+g.b, b, uConcurrentH1, objArray);
                if (!g.b) {
                   g.b = uConcurrentH;
                   long l4 = SystemClock.elapsedRealtime();
                   d2.k(str7, "start", -1, l4);
                   type = new h().getType();
                   key = a.a.getString("prtpInferResult", str2);
                   Object[] objArray5 = (key == null || key == str1)? objArray: b.a(key, type);
                   if (objArray5 != null) {
                      iterator = objArray5.iterator();
                      while (iterator.hasNext()) {
                         PrtpInferResult prtpInferRes = iterator.next();
                         if (prtpInferRes != null) {
                            g.g.b(prtpInferRes.uid, prtpInferRes, uConcurrentH);
                            str6 = null;
                         }
                      }
                   }
                   Object[] objArray6 = objArray;
                   a.h("PrtpEveWrapper#preInitLocalData : local size of InferResult = "+g.a.size(), b, 2, objArray6);
                   long l5 = SystemClock.elapsedRealtime();
                   d.d.k(str7, "end", (l5 - l4), l5);
                }
             }
             objArray = null;
             if (!PatchProxy.applyVoid(objArray, objArray, og, "8")) {
                a.f("PrtpEveWrapper#register : ", b, 2, objArray);
                obj = EveManagerWrapper.e;
                key = "GrowthRealtimeAward";
                obj.r(key, str4, new i());
                obj.r(key, str3, new j());
                obj.i().subscribeOn(d.a).subscribe(k.b);
             }
          }
          PrtpManager.z.v();
          a.t().p("PendantRealtimePrice", PrtpManager.o);
          long l3 = SystemClock.elapsedRealtime();
          d.d.j("end", (l3 - l2), l3);
       }
       String str5 = "2";
       objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, prtpSpeedMan, str5)) {
          a$a.f(b.a(), "PrtpSpeedManager#init : ", b, 2, objArray);
          if (SystemUtil.K() && a.d()) {
             PrtpSpeedManager.i = Float.valueOf(a.a.getFloat("prtpSpeedRatioTest", 0));
          }
          PrtpSpeedManager s = PrtpSpeedManager.s;
          c.d.H0().subscribe(new k(new PrtpSpeedManager$init$1(s)));
          f uof = f.class;
          Object[] objArray4 = null;
          if (!PatchProxy.applyVoid(objArray4, objArray4, uof, str) && !PatchProxy.applyVoid(objArray4, objArray4, uof, str5)) {
             a$a.f(b.a(), "PrtpSpeedEveWrapper#register : ", b, 2, objArray4);
             obj = EveManagerWrapper.e;
             key1 = "GrowthPendantSpeed";
             obj.r(key1, str4, new g());
             obj.r(key1, str3, new h());
             f d1 = f.d;
             Objects.requireNonNull(d1);
             if (!PatchProxy.applyVoid(null, d1, uof, "3")) {
                Column[] uColumnArray = new Column[]{d1,d1,d1,uConcurrentH,d1,uConcurrentH,d1};
                obj1 = new Column("session_id", "LuaValueTypeString", false, false, 12, null);
                Column uColumn = new Column("server_duration_ms", "LuaValueTypeNumber", false, false, 12, null);
                obj1 = new Column("duration_realtime_ms", "LuaValueTypeNumber", false, false, 12, null);
                obj1 = new Column("start_timestamp", "LuaValueTypeNumber", 0, 0, 12, 0);
                obj1 = new Column("end_timestamp", "LuaValueTypeNumber", 0, 0, 12, 0);
                obj1 = new Column("end_date", "LuaValueTypeString", 0, 0, 12, 0);
                obj1 = new Column("end_hour", "LuaValueTypeNumber", 0, null, 12, 0);
                obj.q(key1, CollectionsKt__CollectionsKt.L(uColumnArray), CollectionsKt__CollectionsKt.E(), PrtpSpeedEveWrapper$registerFeatureAccessory$1.INSTANCE);
             }
             obj.i().subscribeOn(d.a).subscribe(j.b);
          }
          s.k();
          a.t().p("GrowthPendantSpeedConfig", PrtpSpeedManager.j);
       }
       a e = a.e;
       Objects.requireNonNull(e);
       Object[] objArray1 = null;
       if (PatchProxy.applyVoid(objArray1, e, a.class, str)) {
          objArray2 = objArray1;
       }else {
          str6 = "PrtpFeatureManager#init : ";
          a.h(str6, b, 2, objArray1);
          type = new c().getType();
          str3 = a.a.getString("prtpUserFeatureMap", str2);
          HashMap hashMap = (str3 == null || str3 == str1)? null: b.a(str3, type);
          str3 = "uid";
          if (hashMap != null) {
             iterator = hashMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                key = uEntry.getKey();
                a.o(key, str3);
                uConcurrentH1 = new ConcurrentHashMap();
                uConcurrentH1.putAll(uEntry.getValue());
                a.a.put(key, uConcurrentH1);
             }
             a = l1.a;
          }
          type = new d().getType();
          str2 = a.a.getString("prtpUserFeatureValueMap", str2);
          hashMap = (str2 == null || str2 == str1)? null: b.a(str2, type);
          if (hashMap != null) {
             iterator = hashMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry1 = iterator.next();
                str2 = uEntry1.getKey();
                a.o(str2, str3);
                ConcurrentHashMap uConcurrentH2 = new ConcurrentHashMap();
                uConcurrentH2.putAll(uEntry1.getValue());
                a.b.put(str2, uConcurrentH2);
             }
             a = l1.a;
          }
          a.h("PrtpFeatureManager#init : ======== local ========", b, 2, null);
          iterator = a.a.entrySet().iterator();
          str2 = "PrtpFeatureManager#init : time uid = ";
          while (iterator.hasNext()) {
             uEntry1 = iterator.next();
             key = uEntry1.getKey();
             iterator1 = uEntry1.getValue().entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry2 = iterator1.next();
                key1 = uEntry2.getKey();
                a.h(str2+key+", action = "+key1+", size = "+uEntry2.getValue().size(), b, 2, null);
             }
          }
          iterator = a.b.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry1 = iterator.next();
             key2 = uEntry1.getKey();
             iterator1 = uEntry1.getValue().entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry3 = iterator1.next();
                String key3 = uEntry3.getKey();
                a.h("PrtpFeatureManager#init : value uid = "+key2+", action = "+key3+", size = "+uEntry3.getValue().size(), b, 2, null);
             }
          }
          l = d.a() - 0x240c8400;
          Set set = a.a.keySet();
          a.o(set, "mUserFeatureMap.keys");
          iterator = set.iterator();
          while (iterator.hasNext()) {
             str1 = iterator.next();
             ConcurrentHashMap uConcurrentH3 = a.a.get(str1);
             if (uConcurrentH3 != null) {
                a.o(uConcurrentH3, "mUserFeatureMap[uid] ?: return@forEach");
                Set set1 = uConcurrentH3.keySet();
                a.o(set1, "featureMap.keys");
                Iterator iterator2 = set1.iterator();
                while (iterator2.hasNext()) {
                   str7 = iterator2.next();
                   Iterator iterator3 = iterator;
                   obj = uConcurrentH3.get(str7);
                   if (obj != null) {
                      a.o(obj, "featureMap[action] ?: return@forEach");
                      y.K0(obj, new PrtpFeatureManager$init$$inlined$forEach$lambda$1(uConcurrentH3, str1, l));
                      int i = obj.size();
                      b2 = a.b;
                      obj1 = b2.get(str1);
                      if (obj1 != null) {
                         l1 = l;
                      }else {
                         l1 = l;
                         uConcurrentH = new ConcurrentHashMap();
                         obj1 = b2.putIfAbsent(str1, uConcurrentH);
                         if (obj1 == null) {
                            obj1 = uConcurrentH;
                         }
                      }
                      b2 = obj1;
                      ArrayList uArrayList = b2.get(str7);
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                         b2 = b2.putIfAbsent(str7, uArrayList);
                         if (b2 != null) {
                            uArrayList = b2;
                         }
                      }
                      if (uArrayList.isEmpty()) {
                         for (int b21 = 0; b21 < i; b21++) {
                            uArrayList.add(Long.valueOf(1));
                         }
                         str8 = str1;
                         a.c(str6+"fill "+i+" value of 1 into uid "+str1+" : action "+str7, null, false, 6, null);
                      }else {
                         str8 = str1;
                         longx = 6;
                      }
                      while (uArrayList.size() > i) {
                         y.M0(uArrayList);
                      }
                      a = l1.a;
                   }else {
                      str8 = str1;
                      l1 = l;
                      longx = 6;
                   }
                   str1 = str8;
                   iterator = iterator3;
                   l = l1;
                }
             }
             iterator = iterator;
             l = l;
             String str9 = null;
          }
          a.h("PrtpFeatureManager#init : ======== trim ========", false, 2, null);
          iterator = a.a.entrySet().iterator();
          while (iterator.hasNext()) {
             b2 = iterator.next();
             str1 = b2.getKey();
             b22 = b2.getValue().entrySet().iterator();
             while (b22.hasNext()) {
                uEntry2 = b22.next();
                key1 = uEntry2.getKey();
                a.h(str2+str1+", action = "+key1+", size = "+uEntry2.getValue().size(), false, 2, null);
             }
          }
          iterator = a.b.entrySet().iterator();
          while (iterator.hasNext()) {
             b2 = iterator.next();
             str1 = b2.getKey();
             b22 = b2.getValue().entrySet().iterator();
             while (b22.hasNext()) {
                Map$Entry uEntry4 = b22.next();
                key2 = uEntry4.getKey();
                a.h("PrtpFeatureManager#init : value uid = "+str1+", action = "+key2+", size = "+uEntry4.getValue().size(), false, 2, null);
             }
          }
          objArray2 = null;
       }
       if (!PatchProxy.applyVoid(objArray2, objArray2, q.class, str)) {
          q b1 = q.b;
          u1.a(b1);
          f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(c.class, mAIN).subscribe(new p(new PrtpWatcher$init$1(b1)));
          f.g(CommentsEvent.class, mAIN).subscribe(new p(new PrtpWatcher$init$2(b1)));
          f.g(c.class, mAIN).subscribe(new p(new PrtpWatcher$init$3(b1)));
          f.g(r.class, mAIN).subscribe(new p(new PrtpWatcher$init$4(b1)));
          f.g(c.class, mAIN).subscribe(new p(new PrtpWatcher$init$5(b1)));
          f.g(l.class, mAIN).subscribe(new p(new PrtpWatcher$init$6(b1)));
          f.g(n.class, mAIN).subscribe(new p(new PrtpWatcher$init$7(b1)));
          PrtpWatcher$init$8 oinit$8 = new PrtpWatcher$init$8(b1);
          f.g(e.class, mAIN).subscribe(new p(oinit$8));
       }
       d = f.d;
       d.d();
       this = null;
       if (!PatchProxy.applyVoid(this, this, prtpManager, "30")) {
          prtpManager = PrtpManager.z;
          if (!prtpManager.h().isEnable()) {
             a.f("Afk#PrtpManager#startReportAfk : NOT ENABLE !!! ", false, 2, this);
          }else {
             a.f("Afk#PrtpManager#startReportAfk : >>> >>>", false, 2, this);
             prtpManager.r();
             b.d().postDelayed(new l(super(prtpManager)), prtpManager.h().getReportInterval());
          }
       }
       Object[] objArray3 = null;
       if (!PatchProxy.applyVoid(objArray3, objArray3, prtpSpeedMan, "18")) {
          prtpSpeedMan = PrtpSpeedManager.s;
          if (!a.e(prtpSpeedMan.c())) {
             a$a.f(b.a(), "PrtpSpeedManager#startReport : NOT ENABLE !!! ", false, 2, objArray3);
          }else {
             a$a.f(b.a(), "PrtpSpeedManager#startReport : >>> >>>", false, 2, objArray3);
             prtpSpeedMan.h();
             Handler handler = d.c();
             if (handler != null) {
                handler.postDelayed(new l(new PrtpSpeedManager$startReport$1(prtpSpeedMan)), a.a(prtpSpeedMan.c()));
             }
          }
       }
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpInitModule.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       if (!PrtpInitModule.x) {
          PrtpInitModule.x = true;
          PrtpInitModule.q = SystemClock.elapsedRealtime();
          PrtpInitModule.r = d.a();
       }
       PrtpInitModule.s = d.a();
       PrtpManager.w = 0;
       return;
    }
    public void n(){
    }
}
