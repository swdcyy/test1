package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$a;
import nsd.u;
import kotlin.text.Regex;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b76.a;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import s66.a;
import o56.d;
import pwb.h;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.log.h$a;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$onLaunchFinish$1;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.google.gson.Gson;
import og7.a;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import com.kwai.performance.monitor.base.Monitor;
import android.app.Application;
import pwb.a;
import java.util.Objects;
import pwb.a$a;
import kuaishou.perf.util.reflect.app.ActivityThread;
import kuaishou.perf.util.reflect.RefStaticMethod;
import kuaishou.perf.util.reflect.RefObject;
import android.os.Handler;
import kuaishou.perf.util.reflect.os.Handler;
import android.os.Handler$Callback;
import o56.a;
import kotlin.Result;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import com.yxcorp.utility.SystemUtil;
import java.util.Random;
import zsd.u;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import lg7.g;
import lg7.c$a;
import pwb.c;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$execute$1$config$1;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$execute$1$config$2;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$execute$1$config$3;
import pwb.b;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$f;
import lg7.c;
import yf7.f;
import yf7.k;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$g;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import com.kwai.performance.stability.crash.monitor.anr.async.b$g;
import com.kwai.performance.stability.crash.monitor.anr.b;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$b;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$c;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$d;
import t45.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$e;
import erd.g;
import crd.b;
import com.kwai.kmalloc.KMalloc;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.framework.exceptionhandler.safemode.e;
import com.kwai.framework.exceptionhandler.safemode.SafeModeDebugLog;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.google.gson.JsonObject;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuffer;
import com.google.gson.JsonElement;
import java.lang.StringBuilder;
import k2b.u1;
import java.io.File;
import y56.a;
import qkd.b;
import android.util.Log;
import java.util.Map;
import trd.t0;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$getRss$1;
import java.nio.charset.Charset;
import msd.l;
import kotlin.io.FilesKt__FileReadWriteKt;
import o56.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import d86.c;
import d86.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mwb.a;
import q87.c;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$h;
import o66.d;
import java.util.Set;
import java.util.Iterator;
import java.lang.System;
import o66.c;

public final class CrashMonitorInitModule extends PerformanceBaseInitModule	// class@0012ad
{
    public h q;
    public SharedPreferences r;
    public boolean s;
    public boolean t;
    public final Regex u;
    public static boolean v;
    public static final CrashMonitorInitModule$a w;

    static {
       CrashMonitorInitModule.w = new CrashMonitorInitModule$a(null);
    }
    public void CrashMonitorInitModule(){
       super();
       this.t = true;
       this.u = new Regex("VmRSS:\\s*\(\\d+\)\\s*kB");
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       return true;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, CrashMonitorInitModule.class, "6")) {
          return;
       }
       this.t = true;
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, CrashMonitorInitModule.class, "7")) {
          return;
       }
       this.t = false;
       return;
    }
    public void k0(a p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, CrashMonitorInitModule.class, "4")) {
          return;
       }
       if (this.s != null || (ExceptionHandler.n || (!a.c() && d.i))) {
          this.s = true;
          this.q = new h();
          b.a(0x4b316083).G(this.q);
          c.b(new CrashMonitorInitModule$onLaunchFinish$1(this));
          Gson gson = a.b();
          AnrMonitorConfig uAnrMonitorC = new AnrMonitorConfig();
          String str = "apm_anr_config";
          AnrMonitorConfig value = a.t().getValue(str, AnrMonitorConfig.class, uAnrMonitorC);
          if (value == uAnrMonitorC) {
             this.v0(str, "{}");
          }else if(value.disable != null){
             str1 = 0x3f800000;
             if (!value.enableAllThreshold - str1 && !value.enableHuiduThreshold - str1) {
                this.v0(str, "{\"disable\":true}");
             }
          }
          a.o(gson, "gson");
          this.v0(str, this.p0(str, gson));
          AnrMonitorConfigAdv uAnrMonitorC1 = new AnrMonitorConfigAdv();
          str1 = "apm_anr_config_adv_v2";
          AnrMonitorConfigAdv value1 = a.t().getValue(str1, AnrMonitorConfigAdv.class, uAnrMonitorC1);
          if (value1 == uAnrMonitorC1) {
             this.v0(str1, "{}");
          }else {
             a.o(value1, "anrConfigAdv");
             if (value1.isDefault()) {
                this.v0(str1, "{}");
             }else {
                a.o(gson, "gson");
                this.v0(str1, this.p0(str1, gson));
             }
          }
          this.u0("apm_anr_config_sync_barrier_new", a.t().b("apm_anr_config_sync_barrier_new", 0));
          AsyncScheduleConfig uAsyncSchedu = new AsyncScheduleConfig();
          AsyncScheduleConfig value2 = a.t().getValue("apm_async_sched_config", AsyncScheduleConfig.class, uAsyncSchedu);
          if (value2 == uAsyncSchedu) {
             this.v0("apm_async_sched_config", "{}");
          }else {
             a.o(value2, "asyncSchedConfig");
             if (value2.isDefault()) {
                this.v0("apm_async_sched_config", "{}");
             }else {
                a.o(gson, "gson");
                this.v0("apm_async_sched_config", this.p0("apm_async_sched_config", gson));
             }
          }
          if (a.t().d("enable_get_stack_trace_hook", false) && CrashMonitor.INSTANCE.isInitialized()) {
             CrashMonitor.enableGetStackTraceHook();
          }
          a.o(gson, "gson");
          this.v0("apm_debuglog_config", this.p0("apm_debuglog_config", gson));
       }
    label_0119 :
       return;
    }
    public void l0(Application p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CrashMonitorInitModule.class, str)) {
          return;
       }
       a.p(p0, "application");
       super.l0(p0);
       a c = a.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, a.class, str) && a.a == null) {
          a.a = new a$a();
          Object[] objArray = new Object[0];
          a$a obj = ActivityThread.currentActivityThread.call(objArray);
          a.o(obj, "activityThread");
          c.b(obj);
          a.b = ActivityThread.mH.get(obj);
          Handler$Callback uCallback = Handler.mCallback.get(a.b);
          if (uCallback != null) {
             obj = a.a;
             if (obj != null && !PatchProxy.applyVoidOneRefs(uCallback, obj, a$a.class, str)) {
                a.p(uCallback, "callback");
                obj.b = uCallback;
             }
          }
          Handler.mCallback.set(a.b, a.a);
       }
       return;
    }
    public void n(){
       boolean b;
       boolean b2;
       Object[] objArray1;
       String str = "launched";
       String str1 = "{}";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CrashMonitorInitModule.class, "2")) {
          return;
       }
       Application uApplication = a.b();
       if (a.c()) {
          return;
       }
       int i = 0;
       this.r = b.c(a.b(), "exception", i);
       b = true;
       if (SystemUtil.L(uApplication)) {
          CrashMonitorInitModule tr = this.r;
          if (tr != null) {
             CrashMonitorInitModule.v = a.g(String.valueOf(b), tr.getString(str, "Unknown"));
             this.v0(str, String.valueOf(i));
          }
       }
       Random random = new Random();
       AnrMonitorConfig uAnrMonitorC = a.a(this.r0("apm_anr_config", str1), AnrMonitorConfig.class);
       boolean b1 = SystemUtil.J();
       uAnrMonitorC.isHuidu = b1;
       if (b1) {
          if (uAnrMonitorC.enableHuiduThreshold - (float)b < 0 && uAnrMonitorC.disable != null) {
             b2 = (random.nextFloat() - uAnrMonitorC.enableHuiduThreshold > 0)? true: false;
             uAnrMonitorC.disable = b2;
          }
       }else if(uAnrMonitorC.enableAllThreshold - (float)b < 0 && uAnrMonitorC.disable != null){
          b2 = (random.nextFloat() - uAnrMonitorC.enableAllThreshold > 0)? true: false;
          uAnrMonitorC.disable = b2;
       }
       str = SystemUtil.r(uApplication);
       a.m(str);
       a.o(str, "SystemUtil.getProcessName\(base\)!!");
       if (u.H1(str, "messagesdk", i, 2, objArray) && a.t().d("enableKlinkProcPerfOpt", i)) {
          uAnrMonitorC.disable = b;
       }
       if (uAnrMonitorC.disable == null) {
          uAnrMonitorC.mAdvConfig = a.a(this.r0("apm_anr_config_adv_v2", str1), AnrMonitorConfigAdv.class);
       }
       str = "apm_anr_config_sync_barrier_new";
       long l = 0;
       if (PatchProxy.isSupport(CrashMonitorInitModule.class)) {
          objArray1 = PatchProxy.applyTwoRefs(str, Long.valueOf(l), this, CrashMonitorInitModule.class, "15");
          if (objArray1 != PatchProxyResult.class) {
          label_00ff :
             b2 = (objArray1 != null && !objArray1.longValue() - 1)? true: false;
             uAnrMonitorC.isRemoveInvalidSyncBarrier = b2;
             str = this.r0("apm_debuglog_config", str1);
             g og = (a.g(str, str1))? new g(): a.a(str, g.class);
             c$a uoa = new c$a();
             uoa.e = b;
             uoa.c = b;
             uoa.d = b;
             uoa.r = b;
             uoa.b = i;
             uoa.f = b;
             c uoc = new c();
             a.p(uoc, "fileUploader");
             uoa.o = uoc;
             uoa.a = SystemUtil.J();
             CrashMonitorInitModule$execute$1$config$1 iNSTANCE = CrashMonitorInitModule$execute$1$config$1.INSTANCE;
             a.p(iNSTANCE, "robustIdInvoker");
             uoa.h = iNSTANCE;
             CrashMonitorInitModule$execute$1$config$2 iNSTANCE1 = CrashMonitorInitModule$execute$1$config$2.INSTANCE;
             a.p(iNSTANCE1, "robustPatchIdInvoker");
             uoa.i = iNSTANCE1;
             CrashMonitorInitModule$execute$1$config$3 iNSTANCE2 = CrashMonitorInitModule$execute$1$config$3.INSTANCE;
             a.p(iNSTANCE2, "robustPatchId2Invoker");
             uoa.j = iNSTANCE2;
             b uob = new b(this.q);
             a.p(uob, "exceptionMessageFetcher");
             uoa.q = uob;
             uoa.v = og;
             uoa.u = uAnrMonitorC;
             CrashMonitorInitModule$f uof = new CrashMonitorInitModule$f();
             a.p(uof, "crashListener");
             uoa.n = uof;
             k.a(uoa.a());
             if (SystemUtil.L(uApplication) && !SystemUtil.N()) {
                AsyncScheduleConfig uAsyncSchedu = a.a(this.r0("apm_async_sched_config", str1), AsyncScheduleConfig.class);
                if (uAsyncSchedu.enableReceiverSchedule != null || uAsyncSchedu.enableServiceSchedule != null) {
                   b.a().b(uAsyncSchedu, new CrashMonitorInitModule$g(this));
                }
             }
             b uob1 = b.c();
             a.o(uob1, "AnrTimeLineHelper.get\(\)");
             if (uob1.d().disable == null) {
                b.c().w = CrashMonitorInitModule$b.a;
                b.c().v = new CrashMonitorInitModule$c(uAnrMonitorC);
             }
             this.t0();
             this.s0();
             c.a(new CrashMonitorInitModule$d(this));
             RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(CrashMonitorInitModule$e.b);
             KMalloc.recordLaunchSuccessAsync();
             Throwable obj = Result.constructor-impl(l1.a);
             obj = Result.exceptionOrNull-impl(obj);
             if (obj == null || !SystemUtil.I()) {
                return;
             }else {
                throw obj;
             }
          }
       }
       CrashMonitorInitModule tr1 = this.r;
       if (tr1 != null) {
          objArray = Long.valueOf(tr1.getLong(str, l));
       }
       objArray1 = objArray;
       goto label_00ff ;
    }
    public final void o0(){
       e g;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CrashMonitorInitModule.class, "3")) {
          return;
       }
       if (d.i) {
          e uoe = e.p();
          Objects.requireNonNull(uoe);
          e uoe1 = e.class;
          if (!PatchProxy.applyVoid(objArray, uoe, uoe1, "35")) {
             SafeModeDebugLog.f("SafeMode", "onLaunchFinish, reset safemode flags");
             if (!PatchProxy.applyVoid(objArray, uoe, uoe1, "34")) {
                int i1 = 0;
                g.b(e.d0.edit().putInt(e.U, i1).putInt(e.V, i1));
             }
             if (!PatchProxy.applyVoid(objArray, uoe, uoe1, "38") && uoe.d != null) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.a0("total", Long.valueOf((uoe.k - uoe.f)));
                g = uoe.g;
                e uoe2 = null;
                if (g - uoe2 > 0) {
                   jsonObject.a0("upload", Long.valueOf((g - uoe.f)));
                }
                g = uoe.h;
                if (g - uoe2 > 0) {
                   jsonObject.a0("uploadFile", Long.valueOf((g - uoe.f)));
                }
                g = uoe.j;
                if (g - uoe2 > 0) {
                   jsonObject.a0("patchLoaded", Long.valueOf((g - uoe.i)));
                }
                long i0 = e.i0;
                if (i0 - uoe2 > 0) {
                   jsonObject.a0("hotfix", Long.valueOf((i0 - uoe.j)));
                }
                i0 = e.j0;
                if (i0 - uoe2 > 0) {
                   jsonObject.a0("hotfix2", Long.valueOf((i0 - uoe.j)));
                }
                jsonObject.c0("patch2", e.k0);
                jsonObject.a0("userRequestExitCnt", Integer.valueOf(uoe.n));
                jsonObject.a0("happenedPackageInstallCnt", Integer.valueOf(uoe.p));
                jsonObject.H("isAllIgnoredExitEnterSafemode", Boolean.valueOf(uoe.l));
                jsonObject.a0("happenedPreLaunchExitCnt", Integer.valueOf(uoe.o));
                jsonObject.a0("reallyForegroundAbnormalExitCnt", Integer.valueOf(uoe.m));
                jsonObject.H("stageEnteredReallySafeMode", Boolean.valueOf(uoe.q));
                jsonObject.H("stageCleanConfigStart", Boolean.valueOf(uoe.t));
                jsonObject.H("stageCleanConfigEnded", Boolean.valueOf(uoe.u));
                jsonObject.H("stageExceptionEventUploadStart", Boolean.valueOf(uoe.r));
                jsonObject.H("stageExceptionEventUploaded", Boolean.valueOf(uoe.s));
                jsonObject.H("stageUploadFileStarted", Boolean.valueOf(uoe.v));
                jsonObject.H("stageUploadFileEnded", Boolean.valueOf(uoe.w));
                jsonObject.H("stageLoadPatchStarted", Boolean.valueOf(uoe.x));
                jsonObject.H("stageLoadPatchEnded", Boolean.valueOf(uoe.y));
                jsonObject.H("stageRequestPatchStarted", Boolean.valueOf(uoe.z));
                jsonObject.H("stageRequestPatchEnded", Boolean.valueOf(e.l0));
                jsonObject.H("stageSafeModeTimeout", Boolean.valueOf(uoe.A));
                jsonObject.H("stageUploadEventCountdown", Boolean.valueOf(uoe.B));
                jsonObject.H("stagePatchCountdown", Boolean.valueOf(e.m0));
                jsonObject.H("stageCleanCountdown", Boolean.valueOf(uoe.D));
                jsonObject.H("stageFileCountdown", Boolean.valueOf(uoe.C));
                jsonObject.c0("stageResponseExcetpion", uoe.E);
                jsonObject.toString();
                SafeModeDebugLog.f("SafeMode", "OnLaunchFinish "+jsonObject);
                u1.Q(e.Z, jsonObject.toString());
             }
             if (!PatchProxy.applyVoid(objArray, uoe, uoe1, "36")) {
                int i = a.t().a(e.Y, e.T);
                if (i < 1) {
                   i = e.T;
                }
                g.a(e.d0.edit().putInt(e.W, i));
             }
             long l = a.c(SafeModeDebugLog.d(a.b()));
             if (l - 0x300000 > 0) {
                SafeModeDebugLog.f("SafeMode", "clean file,size= "+l);
                Application uApplication = a.b();
                if (!PatchProxy.applyVoidOneRefs(uApplication, objArray, SafeModeDebugLog.class, "8")) {
                   a.p(uApplication, "context");
                   b.o(SafeModeDebugLog.d(uApplication), true);
                   Result.constructor-impl(l1.a);
                }
             }
          }
       }
    label_0276 :
       return;
    }
    public final String p0(String p0,Gson p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CrashMonitorInitModule.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = a.t().getValue(p0, Map.class, t0.z());
       a.o(p0, "SwitchConfigManager.getI¡­::class.java, emptyMap\(\)\)");
       p0 = p1.q(p0);
       a.o(p0, "gson.toJson\(mapConfig\)");
       return p0;
    }
    public final int q0(){
       Ref$IntRef obj = PatchProxy.apply(null, this, CrashMonitorInitModule.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Ref$IntRef();
       obj.element = 0;
       FilesKt__FileReadWriteKt.q(new File("/proc/self/status"), null, new CrashMonitorInitModule$getRss$1(this, obj), 1, null);
       return obj.element;
    }
    public final String r0(String p0,String p1){
       CrashMonitorInitModule obj = PatchProxy.applyTwoRefs(p0, p1, this, CrashMonitorInitModule.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       p0 = (obj != null)? obj.getString(p0, p1): null;
       return p0;
    }
    public final void s0(){
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, CrashMonitorInitModule.class, str)) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (uoc.c() && !SystemUtil.P()) {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          SharedPreferences obj = PatchProxy.apply(objArray, objArray, c.class, str);
          int i = 0;
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             obj = b.c(a.b(), "ks_monkey_test", i);
             String str1 = obj.getString("KSAutomatorTaskID", objArray);
             str = obj.getString("KSAutomatorTaskExtra", objArray);
             if (!TextUtils.x(str1) || !TextUtils.x(str)) {
                objArray = new d(str1, str);
             }
          }
          objectRef.element = objArray;
          if (objArray != null) {
             Object[] objArray1 = new Object[i];
             a.C().w("CrashMonitorInitModule", "read KSAutomatorTaskData from internal, KSAutomatorTaskID = "+objectRef.element.a+", KSAutomatorTaskExtra = "+objectRef.element.b, objArray1);
             a.d("KSAutomatorTaskID", objectRef.element.a);
             a.d("KSAutomatorTaskExtra", objectRef.element.b);
          }else {
             c.a(new CrashMonitorInitModule$h(objectRef));
          }
       }
       return;
    }
    public final void t0(){
       String str2;
       if (PatchProxy.applyVoid(null, this, CrashMonitorInitModule.class, "8")) {
          return;
       }
       if (SystemUtil.L(a.b())) {
          SharedPreferences sharedPrefer = b.c(a.b(), "webviewCrashCount", 0);
          if (!PatchProxy.applyVoidOneRefs(sharedPrefer, null, d.class, "3")) {
             d.a = sharedPrefer;
             if (!PatchProxy.applyVoid(null, null, d.class, "9")) {
                SharedPreferences$Editor uEditor = d.a.edit();
                Iterator iterator = b.a(d.a).iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   long l = System.currentTimeMillis() - 0x5265c00;
                   String str1 = d.a.getString(str, null);
                   if (str1 == null) {
                      uEditor.remove(str);
                   }
                   int i = 0;
                   while (true) {
                      int i1 = str1.indexOf(",", i);
                      if (i1 == -1) {
                         str2 = str1.substring(i);
                      label_007b :
                         if (l - Long.valueOf(Long.parseLong(str2)).longValue() >= 0) {
                            if (i1 == -1) {
                               i = str1.length();
                            }else {
                               i = i1 + 1;
                            }
                         }
                         String str3 = str1.substring(i);
                         if (!str3.length()) {
                            uEditor.remove(str);
                         }else {
                            uEditor.putString(str, str3);
                            continue ;
                         }
                      }else {
                         str2 = str1.substring(i, i1);
                         goto label_007b ;
                      }
                   }
                }
                g.a(uEditor);
             }
             if (!PatchProxy.applyVoid(null, null, d.class, "13")) {
                c.c(c.b);
             }
          }
       }
       return;
    }
    public final void u0(String p0,long p1){
       if (PatchProxy.isSupport(CrashMonitorInitModule.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, CrashMonitorInitModule.class, "14")) {
          return;
       }
       CrashMonitorInitModule tr = this.r;
       if (tr != null) {
          SharedPreferences$Editor uEditor = tr.edit();
          if (uEditor != null) {
             SharedPreferences$Editor uEditor1 = uEditor.putLong(p0, p1);
             if (uEditor1 != null) {
                g.a(uEditor1);
             }
          }
       }
       return;
    }
    public final void v0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CrashMonitorInitModule.class, "12")) {
          return;
       }
       CrashMonitorInitModule tr = this.r;
       if (tr != null) {
          SharedPreferences$Editor uEditor = tr.edit();
          if (uEditor != null) {
             SharedPreferences$Editor uEditor1 = uEditor.putString(p0, p1);
             if (uEditor1 != null) {
                g.a(uEditor1);
             }
          }
       }
       return;
    }
}
