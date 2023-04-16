package com.kwai.performance.stability.crash.monitor.CrashMonitor;
import com.kwai.performance.monitor.base.Monitor;
import lg7.j;
import java.util.concurrent.CopyOnWriteArrayList;
import lg7.d;
import java.lang.Object;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.RuntimeException;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import android.content.Context;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.b;
import android.app.Application;
import yf7.k;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$fastInit$1;
import msd.l;
import yf7.m;
import com.kwai.performance.stability.crash.monitor.internal.NativeCrashHandler;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.internal.AnrHandler;
import java.util.Map;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$getSafeModeExceptionMessages$2$1;
import java.util.HashMap;
import java.lang.Integer;
import lg7.m;
import tg7.b;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.util.List;
import tg7.i;
import com.kwai.performance.stability.crash.monitor.internal.g;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$handleCaughtException$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler;
import com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler$a;
import java.lang.Enum;
import java.util.Objects;
import java.util.Random;
import java.lang.IllegalArgumentException;
import lg7.c;
import com.kwai.performance.stability.crash.monitor.message.RecoverMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager;
import android.content.SharedPreferences;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.performance.stability.crash.monitor.util.AbiUtil;
import com.kwai.performance.stability.crash.monitor.util.e;
import org.json.JSONObject;
import qrd.l1;
import lg7.f;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.stability.crash.monitor.message.DeviceInfo;
import android.os.Build;
import yf7.u;
import java.lang.StringBuilder;
import vg7.d;
import com.google.gson.Gson;
import yf7.h;
import lg7.l;
import lg7.h;
import com.kwai.performance.monitor.base.d;
import java.lang.System;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$init$1$1;
import tg7.c;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$init$1$2;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import com.kwai.performance.stability.crash.monitor.anr.b;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Boolean;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler;
import com.kwai.performance.stability.crash.monitor.CrashMonitor$onApplicationPostCreate$1$1$1;

public final class CrashMonitor extends Monitor	// class@000de4
{
    public static final CrashMonitor INSTANCE;
    public static boolean mHasReported;

    static {
       CrashMonitor.INSTANCE = new CrashMonitor();
    }
    public void CrashMonitor(){
       super();
    }
    public static final void addExceptionListener(j p0){
       if (CrashMonitor.INSTANCE.isInitialized()) {
          if (p0 != null) {
             d.a().add(p0);
          }
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static final void enableGetStackTraceHook(){
       if (CrashMonitor.INSTANCE.isInitialized()) {
          BacktraceUtil.HookLogMessage();
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static final void enableUnwindHook(){
       if (CrashMonitor.INSTANCE.isInitialized()) {
          BacktraceUtil.HookUnwind();
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static final void fastInit(Context p0){
       a.p(p0, "context");
       b.a.f(k.b(), new CrashMonitor$fastInit$1(p0), null);
       NativeCrashHandler.r.d(b.d());
       AnrHandler.r.h(b.a());
    }
    public static final Map getSafeModeExceptionMessages(Context p0){
       m a;
       a.p(p0, "context");
       Object obj = Result.constructor-impl(b.a.c());
       if (Result.exceptionOrNull-impl(obj) != null) {
          b.a.f(p0, new CrashMonitor$getSafeModeExceptionMessages$2$1(p0), null);
       }
       HashMap hashMap = new HashMap();
       a = m.a;
       hashMap.put(Integer.valueOf(3), a.a(new b()));
       hashMap.put(Integer.valueOf(1), a.a(new i()));
       hashMap.put(Integer.valueOf(4), a.a(new g()));
       return hashMap;
    }
    public static final void handleCaughtException(Throwable p0){
       a.p(p0, "throwable");
       Monitor_ThreadKt.b(0, new CrashMonitor$handleCaughtException$1(p0), 1, null);
    }
    public static final void handleException(Throwable p0,ExceptionMessage p1,ExceptionHandler$ExceptionType p2){
       JavaCrashHandler r;
       Application uApplication;
       a.p(p0, "ex");
       a.p(p1, "message");
       String str = "type";
       a.p(p2, str);
       a.p(p0, "ex");
       a.p(p1, "message");
       a.p(p2, str);
       int i = JavaCrashHandler$a.a[p2.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   r = JavaCrashHandler.r;
                   uApplication = k.b();
                   Objects.requireNonNull(r);
                   if (new Random().nextDouble() - 0x3f847ae147ae147b < 0) {
                      r.f(p0, p1, uApplication);
                   }
                }else {
                   throw new IllegalArgumentException(a.C(p2.name(), " not supported yet!"), p0);
                }
             }else {
                r = JavaCrashHandler.r;
                uApplication = k.b();
                Objects.requireNonNull(r);
                if (!MonitorBuildConfig.b() && (JavaCrashHandler.s || new Random().nextDouble() - 0x3f847ae147ae147b < 0)) {
                   r.f(p0, p1, uApplication);
                }
             }
          }else {
             JavaCrashHandler.r.f(p0, p1, k.b());
          }
       }else {
          JavaCrashHandler.r.e(p0, p1, k.b(), false);
       }
       return;
    }
    public static final void removeExceptionListener(j p0){
       if (CrashMonitor.INSTANCE.isInitialized()) {
          if (p0 != null) {
             d.a().remove(p0);
          }
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static final void reportException(a p0){
       CrashMonitorPreferenceManager a;
       String str2;
       String str3;
       CrashMonitor iNSTANCE = CrashMonitor.INSTANCE;
       if (iNSTANCE.isInitialized()) {
          if (iNSTANCE.getMonitorConfig().h != null) {
             c monitorConfi = iNSTANCE.getMonitorConfig();
             a.p(monitorConfi, "crashMonitorConfig");
             RecoverMessage recoverMessa = new RecoverMessage();
             a = CrashMonitorPreferenceManager.a;
             String str = "version";
             recoverMessa.mVersionCode = a.b().getString(str, "Unknown");
             recoverMessa.mAbi = a.b().getString("abi", "Unknown");
             recoverMessa.mTaskId = a.b().getString("task_id", "Unknown");
             recoverMessa.mDeviceInfo = a.b().getString("device_info", "");
             recoverMessa.mRobustInfo = a.b().getString("robust_info", "Unknown");
             recoverMessa.mLaunched = String.valueOf(a.a());
             recoverMessa.mLaunchTimeStamp = a.b().getLong("launch_time", 0);
             if (a.a()) {
                recoverMessa.mCurrentActivity = a.b().getString("current_activity", "Unknown");
                recoverMessa.mPage = a.b().getString("page", "Unknown");
                if (a.g("Unknown", recoverMessa.mIsAppOnForeground) && !a.g("Unknown", recoverMessa.mCurrentActivity)) {
                   recoverMessa.mIsAppOnForeground = "Foreground";
                }
             }
             ExceptionReporter.d.b(recoverMessa);
             String str1 = MonitorBuildConfig.h();
             a.p(str1, str);
             g.a(a.b().edit().putString(str, str1));
             str1 = (AbiUtil.a())? "arm64": "arm";
             a.p(str1, "abi");
             g.a(a.b().edit().putString("abi", str1));
             str1 = e.q(k.b());
             a.p(str1, "taskId");
             g.a(a.b().edit().putString("task_id", str1));
             JSONObject jSONObject = new JSONObject();
             c j = monitorConfi.j;
             if (j != null) {
                str3 = j.invoke();
                if (str3 != null) {
                   jSONObject.put("robust_id", str3);
                }
             }
             j = monitorConfi.k;
             if (j != null) {
                str3 = j.invoke();
                if (str3 != null) {
                   jSONObject.put("robust_patch_id", str3);
                }
             }
             monitorConfi = monitorConfi.l;
             if (monitorConfi != null) {
                str2 = monitorConfi.invoke();
                if (str2 != null) {
                   jSONObject.put("robust_patch_id2", str2);
                }
             }
             str2 = jSONObject.toString();
             a.o(str2, "JSONObject\(\).apply {\n        crashMonitorConfig.robustIdInvoker?.invoke\(\)?.let { put\(ROBUST_ID, it\) }\n        crashMonitorConfig.robustPatchIdInvoker?.invoke\(\)?.let { put\(ROBUST_PATCH_ID, it\) }\n        crashMonitorConfig.robustPatchId2Invoker?.invoke\(\)?.let { put\(ROBUST_PATCH_ID2, it\) }\n      }.toString\(\)");
             a.p(str2, "robustInfo");
             g.a(a.b().edit().putString("robust_info", str2));
             k.b().registerActivityLifecycleCallbacks(new f());
             DeviceInfo uDeviceInfo = new DeviceInfo();
             uDeviceInfo.mModel = Build.MODEL;
             uDeviceInfo.mCpuCores = u.a();
             str1 = (AbiUtil.b())? "true": "false";
             uDeviceInfo.mIsSupportArm64 = str1;
             uDeviceInfo.mFingerprint = MonitorBuildConfig.d();
             uDeviceInfo.mCpuPlatform = MonitorBuildConfig.a();
             uDeviceInfo.mRomVersion = MonitorBuildConfig.e()+'#'+MonitorBuildConfig.f();
             str2 = d.j.q(uDeviceInfo);
             a.o(str2, "RAW_GSON.toJson\(deviceInfo\)");
             a.p(str2, "deviceInfo");
             g.a(a.b().edit().putString("device_info", str2));
          }
          h.a("CrashMonitor", "reportException START");
          ExceptionReporter uExceptionRe = JavaCrashHandler.r.c();
          if (uExceptionRe != null) {
             uExceptionRe.l(b.b(), p0);
          }
          uExceptionRe = NativeCrashHandler.r.c();
          if (uExceptionRe != null) {
             uExceptionRe.l(b.d(), p0);
          }
          uExceptionRe = AnrHandler.r.g();
          if (uExceptionRe != null) {
             uExceptionRe.l(b.a(), p0);
          }
          if (p0 != null) {
             p0.invoke();
          }
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static void reportException$default(a p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       CrashMonitor.reportException(p0);
       return;
    }
    public static final void testMemoryCorruption(){
       NativeCrashHandler.doMemoryCorruption();
    }
    public static final void testNativeCrash(){
       NativeCrashHandler.doCrash();
    }
    public final boolean allowScreenShot$com_kwai_performance_stability_crash_monitor(){
       if (!this.isInitialized()) {
          return false;
       }
       return this.getMonitorConfig().i;
    }
    public final l getMessageFetcher(){
       c s = this.getMonitorConfig().s;
       if (s == null) {
          s = new h(this.getMonitorConfig());
       }
       return s;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void init(d p0,c p1){
       a.p(p0, "commonConfig");
       a.p(p1, "monitorConfig");
       super.init(p0, p1);
       long l = System.currentTimeMillis();
       CrashMonitor$init$1$1 oinit$1$1 = new CrashMonitor$init$1$1(p0);
       Objects.requireNonNull(CrashMonitorPreferenceManager.a);
       a.p(oinit$1$1, "sharedPreferencesInvoker");
       CrashMonitorPreferenceManager.c = oinit$1$1;
       b.a.f(k.b(), p0.e(), p1.q);
       CrashMonitor.addExceptionListener(p1.p);
       if (p1.t == null) {
          Thread.setDefaultUncaughtExceptionHandler(new c());
       }
       if (p1.f != null) {
          Monitor_ThreadKt.b(0, new CrashMonitor$init$1$2(p1), 1, null);
       }
       CrashMonitor iNSTANCE = CrashMonitor.INSTANCE;
       iNSTANCE.initJavaCrashHandler();
       iNSTANCE.initNativeCrashHandler();
       iNSTANCE.initAnrHandler();
       h.d("CrashMonitor", "fun init\(\) ["+(System.currentTimeMillis() - l)+"ms]");
       return;
    }
    public final void initAnrHandler(){
       if (this.getMonitorConfig().e != null) {
          AnrHandler r = AnrHandler.r;
          CrashMonitor iNSTANCE = CrashMonitor.INSTANCE;
          r.i = iNSTANCE.getMessageFetcher();
          r.j = iNSTANCE.getMonitorConfig().u;
          r.h(b.a());
          b uob = b.c();
          _monitor_enter(uob);
          uob.i(iNSTANCE.getCommonConfig().a(), iNSTANCE.getMonitorConfig().v, null);
          _monitor_exit(uob);
       }
       return;
    }
    public final void initJavaCrashHandler(){
       if (this.getMonitorConfig().c != null) {
          JavaCrashHandler r = JavaCrashHandler.r;
          CrashMonitor iNSTANCE = CrashMonitor.INSTANCE;
          r.i = iNSTANCE.getMessageFetcher();
          r.j = iNSTANCE.getMonitorConfig().u;
          JavaCrashHandler.s = iNSTANCE.getMonitorConfig().a;
          r.d(b.b());
       }
       return;
    }
    public final void initNativeCrashHandler(){
       if (this.getMonitorConfig().d != null) {
          NativeCrashHandler r = NativeCrashHandler.r;
          CrashMonitor iNSTANCE = CrashMonitor.INSTANCE;
          r.i = iNSTANCE.getMessageFetcher();
          r.j = iNSTANCE.getMonitorConfig().u;
          r.d(b.d());
       }
       return;
    }
    public void onApplicationPostCreate(){
       super.onApplicationPostCreate();
       long l = System.currentTimeMillis();
       LifecycleCallbacksHandler b = LifecycleCallbacksHandler.b;
       CrashMonitor$onApplicationPostCreate$1$1$1 oonApplicati = new CrashMonitor$onApplicationPostCreate$1$1$1(CrashMonitor.INSTANCE);
       Objects.requireNonNull(b);
       a.p(oonApplicati, "firstActivityObserver");
       LifecycleCallbacksHandler.f = oonApplicati;
       k.b().registerActivityLifecycleCallbacks(b);
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          h.b("CrashMonitor", a.C("CrashMonitor init fail ", obj));
       }
       h.d("CrashMonitor", "fun onApplicationPostCreate\(\) ["+(System.currentTimeMillis() - l)+"ms]");
       return;
    }
}
