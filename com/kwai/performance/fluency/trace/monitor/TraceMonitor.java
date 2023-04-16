package com.kwai.performance.fluency.trace.monitor.TraceMonitor;
import com.kwai.performance.fluency.trace.monitor.TraceCallback;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import yf7.r;
import java.lang.StringBuilder;
import yf7.h;
import kotlin.Result;
import java.io.File;
import com.kwai.performance.fluency.trace.monitor.TraceFileManager;
import java.lang.System;
import wf7.c;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Integer;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.RuntimeException;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.Boolean;
import com.kwai.performance.monitor.base.d;
import wf7.b;
import yf7.t;
import msd.l;
import wf7.a;
import java.util.Objects;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor$stopSectionInternal$$inlined$runCatching$lambda$1;
import msd.a;
import qrd.l1;
import java.util.UUID;
import qrd.p;
import yf7.q;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Map;
import yf7.m;
import brd.t;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor$b;
import erd.a;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor$c;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor$d;
import erd.g;
import crd.b;

public final class TraceMonitor extends Monitor implements TraceCallback	// class@0010fa
{
    public static final TraceMonitor INSTANCE;
    public static long TIMEOUT_DELAY;
    public static boolean isTracing;
    public static String mCurrentSectionName;
    public static Boolean mHasInstalledSystemTraceHook;
    public static boolean mIsUploadWhenTimeout;
    public static final Runnable mTimeoutRunnable;
    public static long mTraceBeginTime;

    static {
       TraceMonitor.INSTANCE = new TraceMonitor();
       TraceMonitor.TIMEOUT_DELAY = 0x3a98;
       TraceMonitor.mTimeoutRunnable = TraceMonitor$a.b;
    }
    public void TraceMonitor(){
       super();
    }
    public static final String access$getMCurrentSectionName$p(TraceMonitor p0){
       return TraceMonitor.mCurrentSectionName;
    }
    public static final long access$getMTraceBeginTime$p(TraceMonitor p0){
       return TraceMonitor.mTraceBeginTime;
    }
    public static final void access$setMCurrentSectionName$p(TraceMonitor p0,String p1){
       TraceMonitor.mCurrentSectionName = p1;
    }
    public static final void access$setMTraceBeginTime$p(TraceMonitor p0,long p1){
       TraceMonitor.mTraceBeginTime = p1;
    }
    public static native final boolean beginSection(String p0,String p1);
    public static native final void benchmark();
    public static native final void endSection();
    public static native final boolean installSystraceHookNative();
    public static native final void registerCallbackNative(TraceCallback p0);
    public static native final void setConfigNative(String p0,String p1);
    public static synchronized final void startSection(String p0){
       int i;
       _monitor_enter(TraceMonitor.class);
       a.q(p0, "section");
       TraceMonitor iNSTANCE = TraceMonitor.INSTANCE;
       if (iNSTANCE.isInitialized()) {
          if (!r.b()) {
             _monitor_exit(TraceMonitor.class);
             return;
          }else {
             h.d("TraceMonitor", "begin watch scene "+p0);
             if (iNSTANCE.hasInstallSystemTraceHook(p0)) {
                if (TraceMonitor.isTracing) {
                   _monitor_exit(TraceMonitor.class);
                   return;
                }else {
                   TraceMonitor.mCurrentSectionName = p0;
                   new File(TraceFileManager.a(), p0).mkdirs();
                   TraceMonitor.mTraceBeginTime = System.currentTimeMillis();
                   c b = c.b;
                   b.a(true);
                   iNSTANCE.enableSystrace(p0);
                   b.b();
                   TraceMonitor.isTracing = true;
                   Runnable mTimeoutRunn = TraceMonitor.mTimeoutRunnable;
                   a.q(mTimeoutRunn, "runnable");
                   Monitor_ThreadKt.a.postDelayed(mTimeoutRunn, TraceMonitor.TIMEOUT_DELAY);
                   i = h.d("TraceMonitor", "enable trace now");
                }
             }else {
                i = h.b("TraceMonitor", "enable trace failed");
             }
             Result.constructor-impl(Integer.valueOf(i));
             _monitor_exit(TraceMonitor.class);
             return;
          }
       }else if(!MonitorBuildConfig.b()){
          _monitor_exit(TraceMonitor.class);
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static synchronized final void stopSection(String p0,boolean p1){
       _monitor_enter(TraceMonitor.class);
       a.q(p0, "section");
       TraceMonitor iNSTANCE = TraceMonitor.INSTANCE;
       if (iNSTANCE.isInitialized()) {
          String str = (p1)? "force": "will_not_upload";
          iNSTANCE.stopSectionInternal(p0, p1, str);
          _monitor_exit(TraceMonitor.class);
          return;
       }else if(!MonitorBuildConfig.b()){
          _monitor_exit(TraceMonitor.class);
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static void stopSection$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       TraceMonitor.stopSection(p0, p1);
       return;
    }
    public static native final boolean uninstallSystraceHookNative();
    public static native final void unregisterCallbackNative();
    public synchronized void dispatchEvent(int p0,String p1){
       a.q(p1, "eventString");
       if (p0 != 1024) {
       }else {
          h.d("TraceMonitor", "TerminateFromNative!");
          this.stopSectionInternal(p1, TraceMonitor.mIsUploadWhenTimeout, "terminate_from_native");
       }
       return;
    }
    public final void enableSystrace(String p0){
       File uFile = FilesKt__UtilsKt.i0(TraceFileManager.a(), p0);
       uFile.mkdirs();
       String canonicalPat = uFile.getCanonicalPath();
       a.h(canonicalPat, "logPath.canonicalPath");
       TraceMonitor.beginSection(p0, canonicalPat);
    }
    public synchronized final boolean hasInstallSystemTraceHook(String p0){
       boolean b;
       Boolean mHasInstalle = TraceMonitor.mHasInstalledSystemTraceHook;
       if (mHasInstalle != null) {
          b = mHasInstalle.booleanValue();
       }else {
          b = TraceMonitor.installSystraceHookNative();
          TraceMonitor.mHasInstalledSystemTraceHook = Boolean.valueOf(b);
       }
       return b;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void init(d p0,b p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       super.init(p0, p1);
       this.syncToInitialized(t.a("chronos"));
       l ol = p0.e();
       a.q(ol, "rootDirInvoker");
       TraceFileManager.a = ol;
       Objects.requireNonNull(a.b);
       a.a = p1.b;
       TraceMonitor.registerCallbackNative(this);
    }
    public final boolean isTracing(){
       return TraceMonitor.isTracing;
    }
    public final void restoreSystrace(){
       TraceMonitor.endSection();
    }
    public final void setConfigIsEnableIOTrace(boolean p0){
       if (p0) {
          TraceMonitor.setConfigNative("configIsEnableIOTrace", "true");
       }else {
          TraceMonitor.setConfigNative("configIsEnableIOTrace", "false");
       }
       return;
    }
    public final void setConfigIsHookIOFunction(boolean p0){
       if (p0) {
          TraceMonitor.setConfigNative("configIsHookIOFunction", "true");
       }else {
          TraceMonitor.setConfigNative("configIsHookIOFunction", "false");
       }
       return;
    }
    public final void setConfigLogSizeLimit(int p0){
       TraceMonitor.setConfigNative("configLogSizeLimit", String.valueOf(p0));
    }
    public final void setConfigTraceTimeLimit(long p0){
       TraceMonitor.TIMEOUT_DELAY = p0;
    }
    public final void setIsUploadWhenTimeout(boolean p0){
       TraceMonitor.mIsUploadWhenTimeout = p0;
    }
    public final void setTracing(boolean p0){
       TraceMonitor.isTracing = p0;
    }
    public synchronized final void stopSectionInternal(String p0,boolean p1,String p2){
       a.q(p0, "section");
       a.q(p2, "reason");
       h.d("TraceMonitor", "end watch scene "+p0+" current scene "+TraceMonitor.mCurrentSectionName);
       if (!TraceMonitor.isTracing) {
          h.d("TraceMonitor", "not in tracing mode, will do nothing");
          return;
       }else if(a.g(p0, TraceMonitor.mCurrentSectionName) ^ 1){
          h.d("TraceMonitor", "end scene not matched with begin scene, we will ignore this endWatch command!");
          return;
       }else {
          TraceMonitor.isTracing = false;
          Runnable mTimeoutRunn = TraceMonitor.mTimeoutRunnable;
          a.q(mTimeoutRunn, "runnable");
          Monitor_ThreadKt.a.removeCallbacks(mTimeoutRunn);
          c b = c.b;
          b.a(false);
          this.restoreSystrace();
          b.b();
          h.d("TraceMonitor", "restore trace now scene: "+p0+" reason is: "+p2);
          Monitor_ThreadKt.b(0, new TraceMonitor$stopSectionInternal$$inlined$runCatching$lambda$1(this, p0, p2, p1), 1, null);
          Result.constructor-impl(l1.a);
          return;
       }
    }
    public final void uploadTraceFile(String p0,String p1,long p2){
       File uFile = new File(TraceFileManager.a(), p0);
       File uFile1 = new File(TraceFileManager.c.getValue(), p0+'-'+UUID.randomUUID()+".zip");
       q.b(uFile, uFile1, -1);
       if (uFile1.exists()) {
          HashMap hashMap = new HashMap();
          hashMap.put("bizType", Integer.valueOf(5));
          hashMap.put("sid", MonitorBuildConfig.g());
          hashMap.put("did", MonitorBuildConfig.c());
          hashMap.put("fileExtend", "zip");
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("mLogUUID", uFile1.getName());
          hashMap.put("extraInfo", jSONObject.toString());
          b a = this.getMonitorConfig().a;
          if (a != null) {
             Object obj = a.a(hashMap, uFile1);
             if (obj != null) {
                TraceMonitor$b uob = new TraceMonitor$b(uFile, uFile1, p0, p1, p2);
                t ot = obj.doFinally(v10);
                if (ot != null) {
                   ot.subscribe(TraceMonitor$c.b, new TraceMonitor$d(uFile, uFile1));
                }
             }
          }
       }
       return;
    }
}
