package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$a;
import nsd.u;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorLogger;
import qwb.c;
import com.kwai.performance.monitor.base.d$a;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$1;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$2;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$3;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$4;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$5;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$6;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$7;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$8;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$9;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$10;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$11;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$12;
import mwb.c;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$13;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$14;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$15;
import mwb.e;
import com.kwai.performance.monitor.base.d;
import com.kwai.performance.monitor.base.CommonConfig$Builder$build$1;
import com.kwai.performance.monitor.base.CommonConfig$Builder$build$2;
import com.kwai.performance.monitor.base.CommonConfig$Builder$build$3;
import com.kwai.performance.monitor.base.a;
import com.kwai.performance.monitor.base.b;
import com.kwai.performance.monitor.base.c;
import com.kwai.performance.monitor.base.CommonConfig$Builder$build$7;
import com.kwai.performance.monitor.base.CommonConfig$Builder$build$8;
import msd.l;
import msd.a;
import yf7.y;
import yf7.d;
import yf7.c;
import yf7.k;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.performance.monitor.base.Monitor;
import java.lang.Thread;
import com.yxcorp.gifshow.performance.monitor.a;
import java.lang.Runnable;
import yf7.p;
import yf7.o;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.kwai.performance.monitor.base.Monitor_ApplicationKt$registerApplicationExtension$2;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.performance.monitor.base.MonitorManager$registerMonitorEventObserver$1;
import java.util.ArrayList;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import o56.a;
import android.app.Activity;
import b76.a;
import android.content.Context;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$b;
import ekd.s1;

public final class PerformanceMonitorInitModule extends a	// class@001292
{
    public static ArrayList q;
    public static ArrayList r;
    public static boolean s;
    public static final PerformanceMonitorInitModule$a t;

    static {
       PerformanceMonitorInitModule.t = new PerformanceMonitorInitModule$a(null);
    }
    public void PerformanceMonitorInitModule(){
       super();
    }
    public static final void l0(Application p0){
       c a;
       d$a c;
       PerformanceMonitorInitModule$Companion$init$commonConfig$14 obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, null, PerformanceMonitorInitModule.class, "6")) {
          return;
       }
       PerformanceMonitorInitModule$a t = PerformanceMonitorInitModule.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoidOneRefs(obj, t, PerformanceMonitorInitModule$a.class, "3")) {
          a.p(obj, "application");
          PerformanceMonitorLogger performanceM = new PerformanceMonitorLogger();
          c.b = performanceM;
          d$a uoa = new d$a();
          a.q(obj, "application");
          uoa.a = obj;
          uoa.b = SystemUtil.I();
          a.q(performanceM, "logger");
          uoa.o = performanceM;
          PerformanceMonitorInitModule$Companion$init$commonConfig$1 iNSTANCE = PerformanceMonitorInitModule$Companion$init$commonConfig$1.INSTANCE;
          a.q(iNSTANCE, "productNameInvoker");
          uoa.c = iNSTANCE;
          PerformanceMonitorInitModule$Companion$init$commonConfig$2 iNSTANCE1 = PerformanceMonitorInitModule$Companion$init$commonConfig$2.INSTANCE;
          a.q(iNSTANCE1, "versionNameInvoker");
          uoa.d = iNSTANCE1;
          PerformanceMonitorInitModule$Companion$init$commonConfig$3 iNSTANCE2 = PerformanceMonitorInitModule$Companion$init$commonConfig$3.INSTANCE;
          a.q(iNSTANCE2, "channelInvoker");
          uoa.f = iNSTANCE2;
          PerformanceMonitorInitModule$Companion$init$commonConfig$4 iNSTANCE3 = PerformanceMonitorInitModule$Companion$init$commonConfig$4.INSTANCE;
          a.q(iNSTANCE3, "serviceIdInvoker");
          uoa.e = iNSTANCE3;
          PerformanceMonitorInitModule$Companion$init$commonConfig$5 iNSTANCE4 = PerformanceMonitorInitModule$Companion$init$commonConfig$5.INSTANCE;
          a.q(iNSTANCE4, "deviceIdInvoker");
          uoa.g = iNSTANCE4;
          PerformanceMonitorInitModule$Companion$init$commonConfig$6 iNSTANCE5 = PerformanceMonitorInitModule$Companion$init$commonConfig$6.INSTANCE;
          a.q(iNSTANCE5, "romInvoker");
          uoa.h = iNSTANCE5;
          PerformanceMonitorInitModule$Companion$init$commonConfig$7 iNSTANCE6 = PerformanceMonitorInitModule$Companion$init$commonConfig$7.INSTANCE;
          a.q(iNSTANCE6, "romVersionInvoker");
          uoa.i = iNSTANCE6;
          PerformanceMonitorInitModule$Companion$init$commonConfig$8 iNSTANCE7 = PerformanceMonitorInitModule$Companion$init$commonConfig$8.INSTANCE;
          a.q(iNSTANCE7, "fingerPrintInvoker");
          uoa.j = iNSTANCE7;
          PerformanceMonitorInitModule$Companion$init$commonConfig$9 iNSTANCE8 = PerformanceMonitorInitModule$Companion$init$commonConfig$9.INSTANCE;
          a.q(iNSTANCE8, "cpuPlatformInvoker");
          uoa.k = iNSTANCE8;
          PerformanceMonitorInitModule$Companion$init$commonConfig$10 iNSTANCE9 = PerformanceMonitorInitModule$Companion$init$commonConfig$10.INSTANCE;
          a.q(iNSTANCE9, "LoadSoInvoker");
          uoa.r = iNSTANCE9;
          PerformanceMonitorInitModule$Companion$init$commonConfig$11 iNSTANCE10 = PerformanceMonitorInitModule$Companion$init$commonConfig$11.INSTANCE;
          a.q(iNSTANCE10, "executorServiceInvoker");
          uoa.s = iNSTANCE10;
          PerformanceMonitorInitModule$Companion$init$commonConfig$12 iNSTANCE11 = PerformanceMonitorInitModule$Companion$init$commonConfig$12.INSTANCE;
          a.q(iNSTANCE11, "loopHandlerInvoker");
          uoa.t = iNSTANCE11;
          a = c.a;
          a.q(a, "log");
          uoa.q = a;
          PerformanceMonitorInitModule$Companion$init$commonConfig$13 uCompanion$i = new PerformanceMonitorInitModule$Companion$init$commonConfig$13(obj);
          a.q(uCompanion$i, "rootFileInvoker");
          uoa.l = uCompanion$i;
          obj = PerformanceMonitorInitModule$Companion$init$commonConfig$14.INSTANCE;
          a.q(obj, "sharedPreferencesInvoker");
          uoa.m = obj;
          PerformanceMonitorInitModule$Companion$init$commonConfig$15 iNSTANCE12 = PerformanceMonitorInitModule$Companion$init$commonConfig$15.INSTANCE;
          a.q(iNSTANCE12, "sharedPreferencesKeysInvoker");
          uoa.n = iNSTANCE12;
          e uoe = new e();
          a.q(uoe, "tracer");
          uoa.p = uoe;
          d$a a1 = uoa.a;
          if (a1 == null) {
             a.S("mApplication");
          }
          d$a b = uoa.b;
          c = uoa.c;
          if (c == null) {
             a.S("mProductNameInvoker");
          }
          d$a d = uoa.d;
          if (d == null) {
             a.S("mVersionNameInvoker");
          }
          d$a e = uoa.e;
          if (e == null) {
             a.S("mServiceIdInvoker");
          }
          d$a f = uoa.f;
          if (f == null) {
             a.S("mChannelInvoker");
          }
          d$a g = uoa.g;
          if (g == null) {
             a.S("mDeviceIdInvoker");
          }
          d$a h = uoa.h;
          if (h == null) {
             a.S("mRomInvoker");
          }
          d$a i = uoa.i;
          if (i == null) {
             a.S("mRomVersionInvoker");
          }
          d$a k = uoa.k;
          if (k == null) {
             a.S("mCpuPlatformInvoker");
          }
          d$a j = uoa.j;
          if (j == null) {
             a.S("mFingerPrintInvoker");
          }
          d$a l = uoa.l;
          if (l == null) {
             l = new CommonConfig$Builder$build$1(uoa);
          }
          d$a uoa1 = l;
          l = uoa.m;
          if (l == null) {
             CommonConfig$Builder$build$2 uBuilder$bui = new CommonConfig$Builder$build$2(uoa);
          }
          d$a uoa2 = l;
          l = uoa.n;
          if (l == null) {
             CommonConfig$Builder$build$3 iNSTANCE15 = CommonConfig$Builder$build$3.INSTANCE;
          }
          d$a uoa3 = l;
          l = uoa.o;
          if (l == null) {
             a uoa8 = new a();
          }
          d$a uoa4 = l;
          l = uoa.q;
          if (l == null) {
             b uob = new b();
          }
          d$a uoa5 = l;
          l = uoa.p;
          if (l == null) {
             c uoc = new c();
          }
          d$a uoa6 = l;
          l = uoa.r;
          if (l == null) {
             CommonConfig$Builder$build$7 iNSTANCE14 = CommonConfig$Builder$build$7.INSTANCE;
          }
          d$a uoa7 = l;
          l = uoa.s;
          uoa = uoa.t;
          if (uoa == null) {
             CommonConfig$Builder$build$8 iNSTANCE13 = CommonConfig$Builder$build$8.INSTANCE;
          }
          d uod = new d(a1, uoa1, uoa2, uoa3, b, c, d, e, f, g, h, i, j, k, uoa6, uoa4, uoa5, uoa7, l, uoa, null);
          a.q(uoe, "commonConfig");
          k.b = uoe;
       }
       return;
    }
    public static final void n0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PerformanceMonitorInitModule.class, "9")) {
          return;
       }
       PerformanceMonitorInitModule$a t = PerformanceMonitorInitModule.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, PerformanceMonitorInitModule$a.class, "6")) {
          Iterator iterator = k.a.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().onApplicationPostAttachContext();
          }
       }
       return;
    }
    public static final void o0(){
       Object[] objArray = null;
       String str = "11";
       if (PatchProxy.applyVoid(objArray, objArray, PerformanceMonitorInitModule.class, str)) {
          return;
       }
       PerformanceMonitorInitModule$a t = PerformanceMonitorInitModule.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, PerformanceMonitorInitModule$a.class, "8")) {
          Iterator iterator = k.a.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().onApplicationPostCreate();
          }
          if (!PatchProxy.applyVoid(objArray, t, PerformanceMonitorInitModule$a.class, str)) {
             new Thread(a.b).start();
          }
          t.d();
       }
       return;
    }
    public static final void p0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PerformanceMonitorInitModule.class, "8")) {
          return;
       }
       PerformanceMonitorInitModule$a t = PerformanceMonitorInitModule.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, PerformanceMonitorInitModule$a.class, "5")) {
          Iterator iterator = k.a.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().onApplicationPreAttachContext();
          }
       }
       return;
    }
    public static final void q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PerformanceMonitorInitModule.class, "10")) {
          return;
       }
       PerformanceMonitorInitModule$a t = PerformanceMonitorInitModule.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, PerformanceMonitorInitModule$a.class, "7")) {
          Iterator iterator = k.a.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().onApplicationPreCreate();
          }
          k.b().registerActivityLifecycleCallbacks(new o());
          LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
          a.h(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
          lifecycleOwn.getLifecycle().addObserver(new Monitor_ApplicationKt$registerApplicationExtension$2());
          Objects.requireNonNull(k.c);
          lifecycleOwn = ProcessLifecycleOwner.get();
          a.h(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
          lifecycleOwn.getLifecycle().addObserver(new MonitorManager$registerMonitorEventObserver$1());
       }
       return;
    }
    public static final void r0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PerformanceMonitorInitModule.class, "7")) {
          return;
       }
       PerformanceMonitorInitModule$a t = PerformanceMonitorInitModule.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, PerformanceMonitorInitModule$a.class, "4")) {
          ArrayList uArrayList = t.b();
          a.m(uArrayList);
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             iterator.next().l0(uApplication);
          }
       }
       return;
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 19;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, PerformanceMonitorInitModule.class, "3")) {
          return;
       }
       ArrayList uArrayList = PerformanceMonitorInitModule.t.b();
       a.m(uArrayList);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().h0();
       }
       uArrayList = PerformanceMonitorInitModule.t.a();
       a.m(uArrayList);
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().h0();
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, PerformanceMonitorInitModule.class, "4")) {
          return;
       }
       ArrayList uArrayList = PerformanceMonitorInitModule.t.b();
       a.m(uArrayList);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().i0();
       }
       if (PerformanceMonitorInitModule.s) {
          uArrayList = PerformanceMonitorInitModule.t.a();
          a.m(uArrayList);
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             iterator.next().i0();
          }
       }
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PerformanceMonitorInitModule.class, "2")) {
          return;
       }
       ArrayList uArrayList = PerformanceMonitorInitModule.t.b();
       a.m(uArrayList);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       if (PerformanceMonitorInitModule.s) {
          uArrayList = PerformanceMonitorInitModule.t.a();
          a.m(uArrayList);
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Objects.requireNonNull(iterator.next());
          }
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PerformanceMonitorInitModule.class, "5")) {
          return;
       }
       a.p(p0, "event");
       ArrayList uArrayList = PerformanceMonitorInitModule.t.a();
       a.m(uArrayList);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          iterator.next().l0(uApplication);
       }
       uArrayList = PerformanceMonitorInitModule.t.a();
       a.m(uArrayList);
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().n();
       }
       uArrayList = PerformanceMonitorInitModule.t.a();
       a.m(uArrayList);
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().k0(p0);
       }
       uArrayList = PerformanceMonitorInitModule.t.a();
       a.m(uArrayList);
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().n0(p0);
       }
       PerformanceMonitorInitModule.s = true;
       uArrayList = PerformanceMonitorInitModule.t.b();
       a.m(uArrayList);
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().k0(p0);
       }
       uArrayList = PerformanceMonitorInitModule.t.b();
       a.m(uArrayList);
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().n0(p0);
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, PerformanceMonitorInitModule.class, "1")) {
          return;
       }
       ArrayList uArrayList = PerformanceMonitorInitModule.t.b();
       a.m(uArrayList);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().n();
       }
       String str = SystemUtil.r(a.b());
       if (str != null && (StringsKt__StringsKt.i3(str, ":mini", 0, false, 6, null) >= 0 && a.t().d("mini_enable_koom_upload_hprof", false))) {
          s1.e(new PerformanceMonitorInitModule$b(this), (long)0x3a98);
       }
    label_0057 :
       return;
    }
}
