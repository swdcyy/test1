package com.yxcorp.gifshow.KwaiApp;
import com.yxcorp.gifshow.ApplicationLike;
import o56.e;
import com.yxcorp.gifshow.t;
import ok.x;
import com.google.common.base.Suppliers;
import android.app.Application;
import java.lang.Object;
import java.util.ArrayList;
import com.oplus.ocs.hyperboost.HyperBoostUnitClient;
import bl0.a;
import bl0.d;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import cc6.b;
import oe6.k;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.kwai.performance.stability.hack.ReflectionHacker;
import com.kwai.framework.exceptionhandler.a;
import uv8.i1;
import com.kwai.framework.exceptionhandler.a$b;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import o56.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import com.kwai.framework.exceptionhandler.safemode.e;
import pkd.a;
import com.yxcorp.utility.AbiUtil;
import com.kwai.kmalloc.KMalloc;
import com.yxcorp.gifshow.init.module.RobustInitModule2;
import com.kwai.android.longinus.Longinus;
import tkd.b;
import tkd.d;
import ayb.l;
import ayb.m;
import android.os.Build$VERSION;
import java.lang.Runnable;
import sjc.c;
import com.kwai.framework.model.user.QCurrentUser;
import al0.a;
import com.kwai.performance.stability.runtimehack.RuntimeHack;
import wkd.b;
import com.yxcorp.gifshow.w;
import j80.c;
import java.io.File;
import ekd.e0;
import l66.e;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.d;
import t45.c;
import com.yxcorp.gifshow.init.module.ChannelInitializer;
import com.yxcorp.gifshow.KwaiApp$b;
import je7.b$a;
import je7.b;
import com.yxcorp.gifshow.v;
import db6.e;
import db6.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.u;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import qg7.b;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.Boolean;
import yf7.h;
import qg7.b$a;
import bolts.Task;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.content.res.Resources;
import com.kwai.framework.plugin.PluginManager;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import z1.k;
import android.content.Intent;
import wg7.b;
import android.util.Log;
import android.os.Build;
import com.huawei.emui.hiexperience.hwperf.HwPerfFactory;
import com.huawei.emui.hiexperience.hwperf.HwPerfBase;
import com.huawei.emui.hiexperience.hwperf.prelaunch.HwPerfPrelaunch;
import p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import com.yxcorp.gifshow.KwaiApp$a;
import com.huawei.emui.hiexperience.hwperf.prelaunch.HwPerfPrelaunch$HwPerfPrelaunchCallback;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.OnlineSystraceManager;
import android.content.res.Configuration;
import android.content.ComponentCallbacks;
import vv8.a;
import fyd.a$b;
import fyd.a;
import brd.t;
import com.kwai.framework.init.e;
import a76.d;
import java.util.Collection;
import ig6.a;
import android.content.ComponentCallbacks2;
import uv8.k;
import java.lang.Integer;
import com.oplus.ocs.hyperboost.HyperBoostUnit;
import uv8.j1;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.oplus.ocs.base.common.api.OplusApi;
import android.os.Handler;

public class KwaiApp implements ApplicationLike, e	// class@001029
{
    public final ArrayList mComponentCallbacks;
    public d mHelper;
    public static final String PUSH_SERVICE_SUFFIX = ":pushservice";
    public static final x mTaskDispatcher;
    public static Application sApp;
    public static KwaiApp sAppLike;
    public static a sUncaughtExceptionHandler;

    static {
       KwaiApp.mTaskDispatcher = Suppliers.a(t.b);
    }
    public void KwaiApp(Application p0){
       super();
       this.mComponentCallbacks = new ArrayList();
       KwaiApp.sApp = p0;
    }
    public static boolean a(KwaiApp p0){
       return p0.lambda$attachBaseContext$2();
    }
    public static KwaiApp getAppLike(){
       return KwaiApp.sAppLike;
    }
    private boolean lambda$attachBaseContext$2(){
       return (this.isHomePageCreating() ^ 0x01);
    }
    public static void lambda$oppoHyperboost$1(HyperBoostUnitClient p0){
       if (p0.registerClient()) {
          p0.appActionLoading(5000, 3);
       }
       return;
    }
    public static a lambda$static$0(){
       return new d(KwaiApp.sApp);
    }
    public void attachBaseContext(Context p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "4")) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       b.a();
       new k().a();
       PerformanceMonitorInitModule.l0(KwaiApp.sApp);
       ReflectionHacker.unseal(p0);
       a uoa = new a(new i1(this));
       KwaiApp.sUncaughtExceptionHandler = uoa;
       Thread.setDefaultUncaughtExceptionHandler(uoa);
       CrashMonitor.fastInit(a.b());
       long l1 = SystemClock.elapsedRealtime();
       e.p().i(p0, a.e, a.d);
       if (AbiUtil.b()) {
          KMalloc.doReplace();
       }
       if (!e.p().u()) {
          RobustInitModule2.o0(p0);
       }else {
          RobustInitModule2.l0();
       }
       long l2 = SystemClock.elapsedRealtime();
       if (Longinus.isLonginusProcess(p0)) {
          PatchProxy.onMethodExit(KwaiApp.class, "4");
          return;
       }else if(d.a(0x38955e85).iQ()){
          d.a(-1199738315).WP(p0);
       }
       if (Build$VERSION.SDK_INT >= 24) {
          new Thread(c.a()).start();
       }
       QCurrentUser.me();
       PerformanceMonitorInitModule.p0();
       a.g();
       a.e();
       k.b();
       RuntimeHack.a(p0);
       w ow = b.a(-1343064608);
       ow.e0(p0, l);
       ow.s(l1, l2);
       e0.d(b.a(-1504323719).n());
       b.a(-238885097).install();
       this.enableOfflineAnrTraceOnPerf(p0);
       b.t(KwaiApp.sApp);
       d.d = TextUtils.x(a.s());
       d.e = a.a();
       KwaiApp.sAppLike = this;
       c.j = b.a(-1343064608).v("async_elastic_fixed_thread");
       new ChannelInitializer().a();
       b.a(new KwaiApp$b(this));
       a.a(3, v.b);
       a.f();
       if (e.f()) {
          b.a(0x31e909fc).a(a.B);
       }
       PerformanceMonitorInitModule.r0();
       this.onBaseContextAttachedExtension(p0);
       PerformanceMonitorInitModule.n0();
       PatchProxy.onMethodExit(KwaiApp.class, "4");
       return;
    }
    public final Object[] collectComponentCallbacks(){
       Object[] objArray = null;
       KwaiApp obj = PatchProxy.applyWithListener(objArray, this, KwaiApp.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mComponentCallbacks;
       _monitor_enter(obj);
       if (this.mComponentCallbacks.size() > 0) {
          objArray = this.mComponentCallbacks.toArray();
       }
       _monitor_exit(obj);
       PatchProxy.onMethodExit(KwaiApp.class, "12");
       return objArray;
    }
    public void enableOfflineAnrTraceOnPerf(Context p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "3")) {
          return;
       }
       if (SystemUtil.L(p0) && SystemUtil.P()) {
          String str = null;
          if (new File(new File(p0.getExternalFilesDir(str), "flags"), "anrtrace.flag").exists()) {
             File uFile = new File(p0.getExternalFilesDir(str), "offline_trace");
             Application sApp = KwaiApp.sApp;
             u a = u.a;
             String[] stringArray = new String[]{"c++_shared","plt-base","plt-unwind","exception-handler"};
             Iterator iterator = Arrays.asList(stringArray).iterator();
             while (iterator.hasNext()) {
                a.loadLibrary(iterator.next());
             }
             AnrMonitorConfig uAnrMonitorC = new AnrMonitorConfig();
             uAnrMonitorC.disable = false;
             uAnrMonitorC.checkTimeInterval = 0;
             uAnrMonitorC.tempDisableSyncBarrierCheck = false;
             int[] ointArray = new int[]{1};
             uAnrMonitorC.dispatchSamplingStep = ointArray;
             int i = 2;
             uAnrMonitorC.dispatchSamplingExploreMinWall = uAnrMonitorC.queuePackWall / i;
             uAnrMonitorC.dispatchSamplingStepTimesInterval = 0;
             ointArray = new int[]{1};
             uAnrMonitorC.idleSamplingStep = ointArray;
             uAnrMonitorC.idleSamplingStepTimesInterval = 0;
             AnrMonitorConfig mAdvConfig = uAnrMonitorC.mAdvConfig;
             mAdvConfig.enableFastStack = b.b;
             mAdvConfig.enableGetNativeFrames = b.c;
             mAdvConfig.cpuSamplingFlag = 0;
             mAdvConfig.runtimeStatFlag = 0;
             mAdvConfig.multiThreadSamplingFlag = 0;
             mAdvConfig.unwindStackFlag = i;
             uAnrMonitorC.withExtraCost = true;
             b.c().i(sApp, uAnrMonitorC, Boolean.TRUE);
             if (!uFile.exists()) {
                uFile.mkdir();
             }
             i = b.d;
             if (!b.c().o()) {
                h.g("OfflineTrace", "call AnrTimeLineHelper.init\(\) first");
             }else {
                b$a uoa = new b$a(uFile, "offline_trace", i, Thread.currentThread().getId());
                b.a = Thread.currentThread();
                Thread.currentThread().start();
             }
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "3");
       return;
    }
    public final void fixNoClassTaskDefFoundError(){
       if (PatchProxy.applyVoid(null, this, KwaiApp.class, "14")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 23) {
          ExecutorService bACKGROUND_E = Task.BACKGROUND_EXECUTOR;
       }
       return;
    }
    public Resources getResources(Resources p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, KwaiApp.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PluginManager.H.J(p0, true);
       PatchProxy.onMethodExit(KwaiApp.class, "15");
       return p0;
    }
    public final Intent hookRegisterReceiver(BroadcastReceiver p0,IntentFilter p1,k p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, KwaiApp.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Intent intent = (b.b())? b.a(p0, p1, KwaiApp.sApp): p2.get();
       PatchProxy.onMethodExit(KwaiApp.class, "20");
       return intent;
    }
    public final void huaweiSuperAPP(Context p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "2")) {
          return;
       }
       Log.getStackTraceString(new Throwable());
       if (!((Build.BRAND).toLowerCase()).contains("huawei")) {
          PatchProxy.onMethodExit(KwaiApp.class, "2");
          return;
       }else {
          HwPerfFactory instance = HwPerfFactory.getInstance(KwaiApp.sApp);
          if (instance == null) {
             PatchProxy.onMethodExit(KwaiApp.class, "2");
             return;
          }else {
             b.a = instance.createFeature(6);
             if (b.a() == null) {
                PatchProxy.onMethodExit(KwaiApp.class, "2");
                return;
             }else if(b.a().isPrelaunching()){
                HuaweiSuperAppPrelaunchStage huaweiSuperA = 1;
                b uob = b.class;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, null, uob, "1")) {
                   b.b = huaweiSuperA;
                }
                b.d(HuaweiSuperAppPrelaunchStage.PRELAUNCHING);
                b.a().setPrelaunchListener(new KwaiApp$a(this));
             }
             PatchProxy.onMethodExit(KwaiApp.class, "2");
             return;
          }
       }
    }
    public final boolean isHomePageCreating(){
       Object obj = PatchProxy.apply(null, this, KwaiApp.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (SystemUtil.L(a.B) && (d.f || d.g))? true: false;
       return b;
    }
    public final void onBaseContextAttachedExtension(Context p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "5")) {
          return;
       }
       PluginManager h = PluginManager.H;
       Application sApp = KwaiApp.sApp;
       _monitor_enter(h);
       if (PatchProxy.applyVoidOneRefs(sApp, h, PluginManager.class, "21")) {
          _monitor_exit(h);
       }else {
          a.p(sApp, "context");
          h.D(sApp);
          _monitor_exit(h);
       }
       b.a(-1343064608).L(p0);
       if (d.i) {
          b.a(-2022051331).e(KwaiApp.sApp, 1);
       }
       PatchProxy.onMethodExit(KwaiApp.class, "5");
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "7")) {
          return;
       }
       Object[] objArray = this.collectComponentCallbacks();
       if (objArray != null) {
          for (int i = 0; i < objArray.length; i = i + 1) {
             objArray[i].onConfigurationChanged(p0);
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "7");
       return;
    }
    public void onCreate(){
       a$c[] a;
       if (PatchProxy.applyVoidWithListener(null, this, KwaiApp.class, "6")) {
          return;
       }
       int i = -1343064608;
       b.a(i).l0(KwaiApp.sApp);
       if (Longinus.isLonginusProcess(KwaiApp.sApp)) {
          PatchProxy.onMethodExit(KwaiApp.class, "6");
          return;
       }else {
          a.b();
          PerformanceMonitorInitModule.q0();
          if (Build$VERSION.SDK_INT >= 23) {
             String bRAND = Build.BRAND;
             if ((bRAND.toLowerCase()).contains("oppo") || (bRAND.toLowerCase()).contains("realme")) {
                this.oppoHyperboost(KwaiApp.sApp);
             }
          }
          if (a.a) {
             a$b uob = new a$b();
             a = a.a;
          }
          Class.forName("android.os.AsyncTask");
          c.h(KwaiApp.sApp);
          c.b().i(e.b());
          PluginManager.H.e();
          b.a(i).j0();
          x mTaskDispatc = KwaiApp.mTaskDispatcher;
          mTaskDispatc.get().n(b.a(-2118755940).a());
          mTaskDispatc.get().d(d.i);
          b.a(i).F();
          mTaskDispatc.get().start();
          mTaskDispatc.get().c();
          b.a(i).c0();
          b.a(i).t0(KwaiApp.sApp);
          PerformanceMonitorInitModule.o0();
          this.fixNoClassTaskDefFoundError();
          if (a.a) {
             a.b.a(KwaiApp.sApp);
          }
          PatchProxy.onMethodExit(KwaiApp.class, "6");
          return;
       }
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoidWithListener(null, this, KwaiApp.class, "9")) {
          return;
       }
       Object[] objArray = this.collectComponentCallbacks();
       if (objArray != null) {
          int i = 0;
          while (i < objArray.length) {
             object oobject = objArray[i];
             if (oobject instanceof ComponentCallbacks2) {
                oobject.onLowMemory();
             }
             i = i + 1;
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "9");
       return;
    }
    public void onTerminate(){
       k.a(this);
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport2(KwaiApp.class, "8") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, KwaiApp.class, "8")) {
          return;
       }
       Object[] objArray = this.collectComponentCallbacks();
       if (objArray != null) {
          int i = 0;
          while (i < objArray.length) {
             object oobject = objArray[i];
             if (oobject instanceof ComponentCallbacks2) {
                oobject.onTrimMemory(p0);
             }
             i = i + 1;
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "8");
       return;
    }
    public final void oppoHyperboost(Context p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "1")) {
          return;
       }
       if (SystemUtil.L(KwaiApp.sApp)) {
          HyperBoostUnitClient hyperBoostCl = HyperBoostUnit.getHyperBoostClient(p0);
          if (hyperBoostCl == null) {
             PatchProxy.onMethodExit(KwaiApp.class, "1");
             return;
          }else {
             hyperBoostCl.addOnConnectionSucceedListener(new j1(hyperBoostCl));
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "1");
       return;
    }
    public void registerComponentCallbacks(ComponentCallbacks p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "10")) {
          return;
       }
       KwaiApp tmComponentC = this.mComponentCallbacks;
       _monitor_enter(tmComponentC);
       this.mComponentCallbacks.add(p0);
       _monitor_exit(tmComponentC);
       PatchProxy.onMethodExit(KwaiApp.class, "10");
       return;
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,int p2,k p3){
       if (PatchProxy.isSupport2(KwaiApp.class, "17")) {
          Object obj = PatchProxy.applyFourRefsWithListener(p0, p1, Integer.valueOf(p2), p3, this, KwaiApp.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "17");
       return this.hookRegisterReceiver(p0, p1, p3);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,int p4,k p5){
       if (PatchProxy.isSupport2(KwaiApp.class, "19")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5};
          p2 = PatchProxy.apply(objArray, this, KwaiApp.class, "19");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "19");
       return this.hookRegisterReceiver(p0, p1, p5);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,k p4){
       if (PatchProxy.isSupport2(KwaiApp.class, "18")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p2 = PatchProxy.apply(objArray, this, KwaiApp.class, "18");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       PatchProxy.onMethodExit(KwaiApp.class, "18");
       return this.hookRegisterReceiver(p0, p1, p4);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,k p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, KwaiApp.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(KwaiApp.class, "16");
       return this.hookRegisterReceiver(p0, p1, p2);
    }
    public void unregisterComponentCallbacks(ComponentCallbacks p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiApp.class, "11")) {
          return;
       }
       KwaiApp tmComponentC = this.mComponentCallbacks;
       _monitor_enter(tmComponentC);
       this.mComponentCallbacks.remove(p0);
       _monitor_exit(tmComponentC);
       PatchProxy.onMethodExit(KwaiApp.class, "11");
       return;
    }
}
