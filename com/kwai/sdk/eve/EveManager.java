package com.kwai.sdk.eve.EveManager;
import com.kwai.sdk.eve.EveManager$d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.a;
import msd.p;
import msd.l;
import brd.t;
import com.kwai.sdk.eve.EveManager$activate$1;
import com.kwai.sdk.eve.EveManager$activate$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.EveManager$a;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import zn7.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import com.kwai.sdk.eve.internal.task.EveTaskManagerKt;
import zn7.d;
import java.lang.Runnable;
import io.reactivex.subjects.PublishSubject;
import en7.d;
import zn7.g;
import in7.f;
import com.kwai.sdk.eve.InitConfig;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers;
import com.kwai.sdk.eve.internal.common.EvePreference;
import vm7.a;
import sm7.a;
import sm7.j;
import com.kwai.sdk.eve.internal.statistics.EveLogger;
import sm7.e;
import sm7.c;
import nl5.a;
import sm7.r;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import h97.g;
import android.content.Context;
import java.lang.ref.WeakReference;
import en7.r;
import java.util.concurrent.ConcurrentHashMap;
import vsd.d;
import nsd.m0;
import java.util.Map;
import qrd.l1;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import java.util.concurrent.ExecutorService;
import qrd.p;
import sm7.o;
import kn7.b;
import com.kwai.sdk.eve.EveManager$b;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$c;
import java.util.concurrent.CopyOnWriteArrayList;
import fn7.a;
import wn7.c;
import wn7.f;
import wn7.a;
import wn7.d;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import com.kwai.sdk.eve.EveManager$c;
import java.util.List;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$a;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import un7.a;
import com.kwai.sdk.eve.internal.capsule.EveCapsule;
import com.kwai.sdk.eve.EveManager$init$5;
import com.kwai.sdk.eve.EveManager$init$6;
import com.kwai.sdk.eve.internal.api.EveApi;
import java.io.File;
import en7.f;
import en7.f$a;
import qn7.d;
import java.lang.Throwable;
import com.kwai.sdk.eve.internal.common.models.EvePackageManagerException$InitFailException;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.o1;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader;
import xn7.a;
import qn7.a;
import crd.a;
import java.lang.Long;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Boolean;
import android.content.SharedPreferences;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Number;
import java.lang.System;
import en7.q;
import qn7.b;
import com.kwai.sdk.eve.EveTaskPackageSource;
import java.util.concurrent.Future;
import gn7.c;
import gn7.a;
import com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter;
import gn7.i;
import gn7.j;
import hn7.g;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterSwitchConfig;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterConfig;
import um7.a;
import com.kwai.sdk.eve.internal.capsule.EveCapsule$setUp$1$1;
import wm7.a;
import ekd.e0;
import com.yxcorp.utility.SystemUtil;
import tb7.b;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;
import java.lang.IllegalArgumentException;
import com.google.protobuf.GeneratedMessageLite;
import com.google.gson.JsonArray;
import kotlin.jvm.internal.Ref$IntRef;
import gn7.e;
import gn7.f;
import gn7.g;
import erd.g;
import crd.b;
import ao7.a;
import tn7.b;
import sm7.p;
import sm7.m;

public final class EveManager	// class@00143c
{
    public static EveTaskManager a;
    public static EvePackageManager b;
    public static a c;
    public static c d;
    public static EveInferenceManager e;
    public static Schedulers f;
    public static EvePreference g;
    public static EveFeatureCenter h;
    public static a i;
    public static CoverageStats j;
    public static EveCapsule k;
    public static final EveManager$d l;
    public static AtomicBoolean m;
    public static boolean n;
    public static a o;
    public static final EveManager p;

    static {
       EveManager.p = new EveManager();
       EveManager.l = new EveManager$d();
       EveManager.m = new AtomicBoolean(false);
    }
    public void EveManager(){
       super();
    }
    public static final EveTaskManager a(EveManager p0){
       EveTaskManager a = EveManager.a;
       if (a == null) {
          a.S("taskManager");
       }
       return a;
    }
    public static t c(EveManager p0,String p1,a p2,p p3,l p4,int p5,Object p6){
       EveManager$activate$2 iNSTANCE1;
       EveManager$activate$1 iNSTANCE = (p5 & 0x02)? EveManager$activate$1.INSTANCE: null;
       if (p5 & 0x04) {
          iNSTANCE1 = EveManager$activate$2.INSTANCE;
       }
       return p0.b(p1, iNSTANCE, iNSTANCE1, p4);
    }
    public static final EveManager getInstance(){
       return EveManager.p;
    }
    public final t b(String p0,a p1,p p2,l p3){
       EveTaskManager a;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       PublishSubject obj4 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, EveManager.class, "5");
       if (obj4 != PatchProxyResult.class) {
          return obj4;
       }
       a.p(obj, "task");
       a.p(obj1, "activateSuccess");
       a.p(obj2, "gather");
       a.p(obj3, "idGenerator");
       a = EveManager.a;
       if (a == null) {
          a.S("taskManager");
       }
       EveManager$a uoa = new EveManager$a(obj, obj1);
       Objects.requireNonNull(a);
       EveManager$a uoa1 = uoa;
       EveTaskManager uEveTaskMana = a;
       EveManager$a uoa2 = uoa;
       obj4 = PatchProxy.applyFourRefs(p0, uoa1, p2, p3, a, EveTaskManager.class, "3");
       if (obj4 != PatchProxyResult.class) {
       }else {
          a.p(obj, "name");
          a.p(uoa2, "activateSuccess");
          a.p(obj2, "gather");
          a.p(obj3, "idGenerator");
          EveLog.i$default("EveTaskManager#activate begin "+obj+' '+p3.getClass(), false, 2, null);
          EveTaskManager uEveTaskMana1 = uEveTaskMana;
          a uoa3 = uEveTaskMana1.e(obj);
          EveInferenceManagerKt.f(uoa3, obj3);
          EveInferenceManagerKt.e(uoa3, obj2);
          EveTaskManagerKt.b(uoa3, uoa2);
          uoa3.t(true);
          uEveTaskMana1.j(uoa3, new d(uEveTaskMana1, uoa3, obj));
          EveLog.i$default("EveTaskManager#activate finish", false, 2, null);
          obj4 = uoa3.m();
       }
       return obj4;
    }
    public final void d(String p0,String p1){
       d a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveManager.class, "18")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "inference");
       a = d.a;
       EveTaskManager a1 = EveManager.a;
       if (a1 == null) {
          a.S("taskManager");
       }
       EveInferenceManager e = EveManager.e;
       if (e == null) {
          a.S("inferenceManager");
       }
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidFourRefs(a1, e, p0, p1, a, d.class, "1")) {
          a.p(a1, "taskManager");
          a.p(e, "inferenceManager");
          a.p(p0, "task");
          a.p(p1, "inference");
          a uoa = a1.b(p0);
          if (uoa != null) {
             e.a(uoa, p1);
          }
       }
       return;
    }
    public final void e(InitConfig p0){
       EveTaskManager a;
       c uoc1;
       Context applicationC;
       String str3;
       String str4;
       float f4;
       File value1;
       Long longx1;
       int b5;
       EveCapsule uEveCapsule;
       EvePreference obj7;
       Object obj = this;
       Class obj1 = p0;
       String str = String.class;
       EveTaskManager uEveTaskMana = EveTaskManager.class;
       EveManager uEveManager = EveManager.class;
       EvePackageManager uEvePackageM = EvePackageManager.class;
       Schedulers schedulers = Schedulers.class;
       EvePreference uEvePreferen = EvePreference.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uEveManager, "2")) {
          return;
       }
       a.p(obj1, "config");
       if (EveManager.m.getAndSet(true)) {
          return;
       }
       EveLog iNSTANCE = EveLog.INSTANCE;
       iNSTANCE.init$eve_core_release(p0.a().a(), p0.a().b);
       EveLogger.INSTANCE.init(p0.a());
       iNSTANCE.initNativeLog$eve_core_release(obj1.c);
       int i = 2;
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uEveManager, "3")) {
          uoc1 = p0.d();
          EveLog.i$default("[KSwitch]: "+uoc1, b, i, null);
          Objects.requireNonNull(a.b);
          a.a = uoc1.syncFinalize;
          LuaNativeUtil.safelySyncKSwitch(uoc1.disableFinalizerLock, uoc1.autoLuaRecycle, uoc1.asynAutoRecycle, p0.a().b().status);
       }
       String str1 = "EveManager#init begin ";
       g og = p0.b();
       Class class = (og != null)? og.getClass(): null;
       EveLog.i$default(str1+class+' '+p0.a().a()+' '+p0.c().getClass(), b, i, null);
       a uoa1 = new a(obj1);
       EveManager.o = uoa1;
       WeakReference weakReferenc = new WeakReference(p0.c());
       Objects.requireNonNull(uoa1);
       if (!PatchProxy.applyVoidOneRefs(weakReferenc, uoa1, uoa, "2")) {
          a.p(weakReferenc, "<set-?>");
          uoa1.a = weakReferenc;
       }
       a o = EveManager.o;
       if (o == null) {
          a.S("context");
       }
       EveManager.f = new Schedulers(o);
       r b1 = r.b;
       ConcurrentHashMap uConcurrentH = b1.a();
       _monitor_enter(uConcurrentH);
       WeakReference weakReferenc1 = b1.a().get(m0.d(uEvePreferen));
       c obj2 = (weakReferenc1 != null)? weakReferenc1.get(): null;
       if (!obj2 instanceof EvePreference) {
          a o6 = EveManager.o;
          if (o6 == null) {
             a.S("context");
          }
          obj7 = new EvePreference(o6);
          b1.a().put(m0.d(uEvePreferen), new WeakReference(obj7));
          l1 a3 = l1.a;
       }
       _monitor_exit(uConcurrentH);
       EveManager.g = obj2;
       EvePreference g = EveManager.g;
       if (g == null) {
          a.S("preference");
       }
       Schedulers f = EveManager.f;
       if (f == null) {
          a.S("scheduler");
       }
       Objects.requireNonNull(f);
       obj2 = PatchProxy.apply(null, f, schedulers, "3");
       if (obj2 != patchProxyRe) {
       }else {
          obj7 = f.c.getValue();
       }
       EveManager.j = new CoverageStats(g, obj2, obj1.t);
       g = EveManager.g;
       if (g == null) {
          a.S("preference");
       }
       b uob = new b(g, obj1.p);
       a o1 = EveManager.o;
       if (o1 == null) {
          a.S("context");
       }
       EveManager.a = new EveTaskManager(o1);
       o1 = EveManager.o;
       if (o1 == null) {
          a.S("context");
       }
       EvePackageManager uEvePackageM1 = new EvePackageManager(o1, new EveManager$b(uob));
       EveManager.b = uEvePackageM1;
       CoverageStats j = EveManager.j;
       if (j == null) {
          a.S("coverageStats");
       }
       j = j.b;
       Objects.requireNonNull(uEvePackageM1);
       if (!PatchProxy.applyVoidOneRefs(j, uEvePackageM1, uEvePackageM, "12")) {
          a.p(j, "downloadListener");
          uEvePackageM1.v.add(j);
       }
       o1 = EveManager.o;
       if (o1 == null) {
          a.S("context");
       }
       EveManager.c = new a(o1);
       o1 = EveManager.o;
       if (o1 == null) {
          a.S("context");
       }
       EveManager.f = new Schedulers(o1);
       uConcurrentH = b1.a();
       _monitor_enter(uConcurrentH);
       WeakReference weakReferenc2 = b1.a().get(m0.d(uEvePreferen));
       InitConfig obj3 = (weakReferenc2 != null)? weakReferenc2.get(): null;
       if (!obj3 instanceof EvePreference) {
          a o5 = EveManager.o;
          if (o5 == null) {
             a.S("context");
          }
          obj3 = new EvePreference(o5);
          b1.a().put(m0.d(uEvePreferen), new WeakReference(obj3));
          l1 a2 = l1.a;
       }
       _monitor_exit(uConcurrentH);
       EveManager.g = obj3;
       c uoc = new c();
       EveManager.d = uoc;
       uoc.i(new f());
       uoc = EveManager.d;
       if (uoc == null) {
          a.S("monitor");
       }
       uoc.i(new d(p0.a()));
       uoc = EveManager.d;
       if (uoc == null) {
          a.S("monitor");
       }
       uoc.i(uob);
       uoc = EveManager.d;
       if (uoc == null) {
          a.S("monitor");
       }
       CoverageStats j1 = EveManager.j;
       if (j1 == null) {
          a.S("coverageStats");
       }
       uoc.i(j1.c);
       o = EveManager.o;
       if (o == null) {
          a.S("context");
       }
       obj3 = obj1.r;
       obj2 = EveManager.d;
       if (obj2 == null) {
          a.S("monitor");
       }
       EveManager.e = new EveInferenceManager(o, obj3, obj2, new EveManager$c(uob));
       a o2 = EveManager.o;
       if (o2 == null) {
          a.S("context");
       }
       EveManager.h = new EveFeatureCenter(o2);
       EveManager.i = new a(p0.a().c());
       EveManager.k = new EveCapsule(obj1.s);
       a o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       o2 = EveManager.c;
       if (o2 == null) {
          a.S("dataCenter");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(o2, o3, uoa, "6")) {
          a.p(o2, "<set-?>");
          o3.c = o2;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       EveInferenceManager e = EveManager.e;
       if (e == null) {
          a.S("inferenceManager");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(e, o3, uoa, "8")) {
          a.p(e, "<set-?>");
          o3.d = e;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       Schedulers f1 = EveManager.f;
       if (f1 == null) {
          a.S("scheduler");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(f1, o3, uoa, "4")) {
          a.p(f1, "<set-?>");
          o3.b = f1;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       a = EveManager.a;
       if (a == null) {
          a.S("taskManager");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(a, o3, uoa, "10")) {
          a.p(a, "<set-?>");
          o3.e = a;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       EvePreference g1 = EveManager.g;
       if (g1 == null) {
          a.S("preference");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(g1, o3, uoa, "12")) {
          a.p(g1, "<set-?>");
          o3.f = g1;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       EvePackageManager b2 = EveManager.b;
       if (b2 == null) {
          a.S("packageManager");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(b2, o3, uoa, "14")) {
          a.p(b2, "<set-?>");
          o3.g = b2;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       EveFeatureCenter h = EveManager.h;
       if (h == null) {
          a.S("featureCenter");
       }
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(h, o3, uoa, "16")) {
          a.p(h, "<set-?>");
          o3.h = h;
       }
       o3 = EveManager.o;
       if (o3 == null) {
          a.S("context");
       }
       InitConfig k = obj1.k;
       Objects.requireNonNull(o3);
       if (!PatchProxy.applyVoidOneRefs(k, o3, uoa, "18")) {
          a.p(k, "<set-?>");
          o3.i = k;
       }
       EvePackageManager b3 = EveManager.b;
       if (b3 == null) {
          a.S("packageManager");
       }
       EveManager$d l = EveManager.l;
       Objects.requireNonNull(b3);
       if (!PatchProxy.applyVoidOneRefs(l, b3, uEvePackageM, "47")) {
          a.p(l, "listener");
          b3.i.add(l);
       }
       EveTaskManager a1 = EveManager.a;
       if (a1 == null) {
          a.S("taskManager");
       }
       b2 = EveManager.b;
       if (b2 == null) {
          a.S("packageManager");
       }
       EveManager$init$5 oinit$5 = new EveManager$init$5(b2);
       Objects.requireNonNull(a1);
       if (!PatchProxy.applyVoidOneRefs(oinit$5, a1, uEveTaskMana, "1")) {
          a.p(oinit$5, "<set-?>");
          a1.a = oinit$5;
       }
       a1 = EveManager.a;
       if (a1 == null) {
          a.S("taskManager");
       }
       b2 = EveManager.b;
       if (b2 == null) {
          a.S("packageManager");
       }
       EveManager$init$6 oinit$6 = new EveManager$init$6(b2);
       Objects.requireNonNull(a1);
       if (!PatchProxy.applyVoidOneRefs(oinit$6, a1, uEveTaskMana, "2")) {
          a.p(oinit$6, "<set-?>");
          a1.b = oinit$6;
       }
       b3 = EveManager.b;
       if (b3 == null) {
          a.S("packageManager");
       }
       a o4 = EveManager.o;
       if (o4 == null) {
          a.S("context");
       }
       Schedulers f2 = EveManager.f;
       if (f2 == null) {
          a.S("scheduler");
       }
       Objects.requireNonNull(f2);
       String obj4 = PatchProxy.apply(null, f2, schedulers, "1");
       if (obj4 != patchProxyRe) {
       }else {
          obj4 = f2.a.getValue();
       }
       f2 = EveManager.f;
       if (f2 == null) {
          a.S("scheduler");
       }
       Objects.requireNonNull(f2);
       ExecutorService uExecutorSer = PatchProxy.apply(null, f2, schedulers, "2");
       if (uExecutorSer == patchProxyRe) {
          uExecutorSer = f2.b.getValue();
       }
       InitConfig f3 = obj1.f;
       InitConfig n = obj1.n;
       Objects.requireNonNull(b3);
       EveApi uEveApi = EveApi.class;
       boolean i1 = 4;
       if (PatchProxy.isSupport(uEvePackageM)) {
          Object[] objArray = new Object[]{o4,obj4,uExecutorSer,f3,n};
          if (!PatchProxy.applyVoid(objArray, b3, uEvePackageM, "2")) {
          label_04d5 :
             a.p(o4, "context");
             a.p(obj4, "asyncExecutorService");
             a.p(uExecutorSer, "ioExecutorService");
             a.p(f3, "packConfig");
             a.p(n, "taskPackageSource");
             int i3 = 2;
             i1 = false;
             EveLog.i$default("EPM#init : ===>", i1, i3, null);
             if (b3.a != null) {
                EveLog.w$default("EPM#init : has init ===>", i1, i3, null);
             }else {
                _monitor_enter(b3);
                if (b3.a != null) {
                   EveLog.w$default("EPM#init : has init ===>", i1, i3, null);
                   _monitor_exit(b3);
                }else {
                   b3.a = true;
                   _monitor_exit(b3);
                   EveLog.w$default("EPM#init : start ===>", false, 2, null);
                   value1 = new File(f.a.a(b3.c()), "eve_task_packages");
                   if (d.b(value1) && value1.isFile()) {
                      value1.delete();
                   }
                   b3.k = value1;
                   b3.l = o4;
                   b3.m = obj4;
                   b3.n = uExecutorSer;
                   b3.o = f3;
                   if (uExecutorSer == null) {
                      a.S("mIOExecutorService");
                   }
                   b3.p = o1.c(uExecutorSer);
                   b3.t = new EvePackageDownloader(o4.b().q);
                   b3.u = new a(f3.c);
                   uEvePackageM = b3.l;
                   if (uEvePackageM == null) {
                      a.S("mContext");
                   }
                   ConcurrentHashMap uConcurrentH1 = b1.a();
                   _monitor_enter(uConcurrentH1);
                   WeakReference weakReferenc3 = b1.a().get(m0.d(uEveApi));
                   d obj6 = (weakReferenc3 != null)? weakReferenc3.get(): null;
                   if (!obj6 instanceof EveApi) {
                      obj6 = new EveApi(uEvePackageM);
                      b1.a().put(m0.d(uEveApi), new WeakReference(obj6));
                   }
                   _monitor_exit(uConcurrentH1);
                   b3.q = obj6;
                   b3.r = new a();
                   b3.j = n;
                   EvePreference uEvePreferen1 = o4.g();
                   String str6 = "last_init_time";
                   Long longx = Long.valueOf(-1);
                   if (!u.S1(str6)) {
                      obj6 = m0.d(longx.getClass());
                      if (a.g(obj6, m0.d(Boolean.TYPE))) {
                         longx1 = (!longx instanceof Boolean)? null: longx;
                         b5 = (longx1 != null)? longx1.booleanValue(): false;
                         if (uEvePreferen1.a().getBoolean(str6, b5)) {
                            longx = Boolean.TRUE;
                         }
                      }else if(a.g(obj6, m0.d(str))){
                         longx1 = (!longx instanceof String)? null: longx;
                         if (longx1 == null) {
                            str4 = "";
                         }
                         str1 = uEvePreferen1.a().getString(str6, longx1);
                         str6 = (str1 == null || !str1.length())? 1: null;
                         if (!str6) {
                            Objects.requireNonNull(str1, "null cannot be cast to non-null type kotlin.Long");
                            longx = str1;
                         }
                      }else if(a.g(obj6, m0.d(Integer.TYPE))){
                         longx1 = (!longx instanceof Integer)? null: longx;
                         uEveCapsule = Integer.MIN_VALUE;
                         b5 = (longx1 != null)? longx1.intValue(): Integer.MIN_VALUE;
                         int intx = uEvePreferen1.a().getInt(str6, b5);
                         if (intx != uEveCapsule) {
                            longx = Integer.valueOf(intx);
                         }
                      }else if(a.g(obj6, m0.d(Long.TYPE))){
                         long longx2 = uEvePreferen1.a().getLong(str6, longx.longValue());
                         if (longx2 - Long.MIN_VALUE) {
                            longx = Long.valueOf(longx2);
                         }
                      }else if(a.g(obj6, m0.d(Float.TYPE))){
                         longx1 = (!longx instanceof Float)? null: longx;
                         uEveCapsule = 1;
                         float f5 = (longx1 != null)? longx1.floatValue(): Float.MIN_VALUE;
                         float floatx = uEvePreferen1.a().getFloat(str6, f5);
                         if (floatx - uEveCapsule) {
                            longx = Float.valueOf(floatx);
                         }
                      }
                      b3.e = longx.longValue();
                      o4.g().b("last_init_time", Long.valueOf(System.currentTimeMillis()));
                      EvePackageManager m = b3.m;
                      if (m == null) {
                         a.S("mAsyncExecutorService");
                      }
                      m.submit(new b(b3, n));
                   }else {
                      throw new IllegalArgumentException("pref key is empty");
                   }
                }
             }
          }
       }else {
          goto label_04d5 ;
       }
       o4 = EveManager.c;
       if (o4 == null) {
          a.S("dataCenter");
       }
       Objects.requireNonNull(o4);
       uoc1 = c.class;
       String str2 = "1";
       if (!PatchProxy.applyVoidOneRefs(obj1, o4, a.class, str2)) {
          a.p(obj1, "config");
          o4.a = new a(o4.e);
          o4.b = new DataStreamCenter(o4.e);
          o4.c = new i(o4.e);
          o4.d = new j(o4.e);
          a e1 = o4.e;
          o3 = o4.a;
          str4 = "bridge";
          if (o3 == null) {
             a.S(str4);
          }
          Objects.requireNonNull(e1);
          String str5 = "<set-?>";
          if (!PatchProxy.applyVoidOneRefs(o3, e1, uoc1, "4")) {
             a.p(o3, str5);
             e1.b = o3;
          }
          e1 = o4.e;
          o3 = o4.c;
          obj4 = "dataWarehouse";
          if (o3 == null) {
             a.S(obj4);
          }
          Objects.requireNonNull(e1);
          if (!PatchProxy.applyVoidOneRefs(o3, e1, uoc1, "2")) {
             a.p(o3, str5);
             e1.a = o3;
          }
          uoa1 = o4.a;
          if (uoa1 == null) {
             a.S(str4);
          }
          Objects.requireNonNull(uoa1);
          uoa1 = o4.b;
          if (uoa1 == null) {
             a.S("dataStreamCenter");
          }
          InitConfig j2 = obj1.j;
          o3 = p0.a();
          str4 = "datacenter_matcher";
          Objects.requireNonNull(o3);
          Object obj5 = PatchProxy.applyOneRefs(str4, o3, a.class, "2");
          if (obj5 != patchProxyRe) {
             f4 = obj5.floatValue();
          }else {
             a.p(str4, "module");
             Float uFloat = o3.e.get(str4);
             f4 = (uFloat != null)? uFloat.floatValue(): 0;
          }
          Objects.requireNonNull(uoa1);
          DataStreamCenter uDataStreamC = DataStreamCenter.class;
          if (!PatchProxy.isSupport(uDataStreamC) || !PatchProxy.applyVoidTwoRefs(j2, Float.valueOf(f4), uoa1, uDataStreamC, str2)) {
             a.p(j2, "fieldOrder");
             uoa1.b = new g(j2);
             uoa1.e = f4;
             value1 = a.t().getValue("enableEveMatcherSchedule", Boolean.TYPE, Boolean.FALSE);
             a.o(value1, "SwitchConfigManager.getI¡­olean::class.java, false\)");
             uoa1.f = value1.booleanValue();
          }
          uoa1 = o4.c;
          if (uoa1 == null) {
             a.S(obj4);
          }
          Objects.requireNonNull(uoa1);
          o4 = o4.d;
          if (o4 == null) {
             a.S("distributedDataStore");
          }
          Objects.requireNonNull(o4);
       }
       EveFeatureCenter h1 = EveManager.h;
       if (h1 == null) {
          a.S("featureCenter");
       }
       h1.init$eve_core_release(obj1.h, obj1.i, obj1.g);
       EveCapsule k1 = EveManager.k;
       if (k1 == null) {
          a.S("capsule");
       }
       Objects.requireNonNull(k1);
       if (!PatchProxy.applyVoid(null, k1, EveCapsule.class, "1")) {
          a[] uoaArray = new a[0];
          a[] value = a.t().getValue("eveCapsuleTaskConfig", a[].class, uoaArray);
          a.o(value, "capsuleConfigs");
          int len = value.length;
          for (int i2 = 0; i2 < len; i2 = i2 + 1) {
             object oobject = value[i2];
             uoa = oobject.taskId;
             k1.b.put(uoa, oobject);
             EveManager.c(EveManager.p, uoa, null, k1.c, new EveCapsule$setUp$1$1(uoa), 2, null);
          }
       }
       EveManager.n = true;
       uoa1 = a.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, null, uoa1, "1")) {
          a.p(obj1, "config");
          if (!e0.a && !SystemUtil.K()) {
             applicationC = p0.c().getApplicationContext();
             if (applicationC != null) {
                PackageManager packageManag = (!(b.c).length())? 1: null;
                if (packageManag) {
                   str3 = applicationC.getPackageManager().getPackageInfo(applicationC.getPackageName(), 0).applicationInfo.loadLabel(applicationC.getPackageManager()).toString();
                   b.c = str3;
                }
                str3 = b.c;
             }else {
                str3 = "";
             }
             if (!a.g(str3, "eve-android")) {
             label_095a :
                boolean b4 = false;
                EveLog.i$default("EveManager#init finish", b4, 2, null);
                return;
             }
          }
       label_08d8 :
          o4 = a.c;
          Objects.requireNonNull(o4);
          Class uClass = PatchProxy.apply(null, o4, uoa1, "2");
          if (uClass != patchProxyRe) {
          }else {
             uClass = Class.forName("com.kwai.sdk.eve_debug.EveDebugManager");
          }
          if (uClass != null) {
             a.b = uClass;
             applicationC = p0.c();
             if (PatchProxy.applyVoidTwoRefs("", applicationC, null, uoa1, "3")) {
                goto label_095a ;
             }else {
                a.p("", "ip");
                a.p(applicationC, "appContext");
                obj1 = a.b;
                if (obj1 != null) {
                   Class[] uClassArray = new Class[]{str,Context.class};
                   Object[] objArray1 = new Object[]{"",applicationC};
                   obj1.getMethod("startUp", uClassArray).invoke(obj1, objArray1);
                   goto label_095a ;
                }else {
                   goto label_095a ;
                }
             }
          }else {
             goto label_095a ;
          }
       }
    }
    public final void f(GeneratedMessageLite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveManager.class, "21")) {
          return;
       }
       String str = "data";
       a.p(p0, str);
       a c = EveManager.c;
       if (c == null) {
          a.S("dataCenter");
       }
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, a.class, "3")) {
          a.p(p0, str);
          c = c.b;
          if (c == null) {
             a.S("dataStreamCenter");
          }
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p0, c, DataStreamCenter.class, "2")) {
             a.p(p0, str);
             JsonArray jsonArray = new JsonArray();
             Ref$IntRef intRef = new Ref$IntRef();
             intRef.element = 0;
             c.e(null, new e(c, p0, intRef, jsonArray)).subscribe(new f(c, p0, intRef, jsonArray), g.b);
          }
       }
       return;
    }
    public final void g(GeneratedMessageLite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveManager.class, "22")) {
          return;
       }
       a.p(p0, "data");
       EveFeatureCenter h = EveManager.h;
       if (h == null) {
          a.S("featureCenter");
       }
       h.saveEvent(p0);
       return;
    }
    public final String getResourcePath(String p0,String p1){
       String str = "";
       EveTaskManager obj = PatchProxy.applyTwoRefs(p0, p1, this, EveManager.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "taskId");
       a.p(p1, "resourceId");
       obj = EveManager.a;
       if (obj == null) {
          a.S("taskManager");
       }
       a uoa = obj.b(p0);
       uoa = (uoa != null)? uoa.h(): null;
       try{
          a.m(uoa);
          File uFile = uoa.R3().a();
          a.m(uFile);
          uoa = uoa.S3().a().get(p1);
          a.m(uoa);
          uoa = uFile.getPath()+File.separator+uoa.a();
          if (new File(uoa).exists()) {
             str = uoa;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
