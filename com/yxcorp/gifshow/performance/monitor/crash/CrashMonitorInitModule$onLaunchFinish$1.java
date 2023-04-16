package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$onLaunchFinish$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.performance.stability.crash.monitor.message.RecoverMessage;
import android.content.SharedPreferences;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$a;
import o56.d;
import o56.a;
import com.yxcorp.utility.AbiUtil;
import android.app.Application;
import android.content.Context;
import com.kwai.performance.stability.crash.monitor.util.e;
import pwb.g;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import wu8.p;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import pwb.e;
import k2b.s1;
import pwb.f;
import com.kwai.framework.init.c;
import com.yxcorp.gifshow.log.n;
import k2b.o0;
import com.kwai.performance.stability.crash.monitor.message.DeviceInfo;
import android.os.Build;
import ekd.w;
import com.yxcorp.utility.RomUtils;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import oe6.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$onLaunchFinish$1$1;
import msd.a;
import yf7.h;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import zsd.u;
import com.kwai.sdk.switchconfig.a;
import com.performance.stability.hack.swapbuffer.SwapBufferHack;
import java.lang.System;

public final class CrashMonitorInitModule$onLaunchFinish$1 implements Runnable	// class@000e6c
{
    public final CrashMonitorInitModule b;

    public void CrashMonitorInitModule$onLaunchFinish$1(CrashMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, CrashMonitorInitModule$onLaunchFinish$1.class, "1")) {
          return;
       }
       CrashMonitorInitModule$onLaunchFinish$1 b = obj.b;
       Objects.requireNonNull(b);
       long l = -1;
       if (!PatchProxy.applyVoid(objArray, b, CrashMonitorInitModule.class, "11")) {
          RecoverMessage recoverMessa = new RecoverMessage();
          CrashMonitorInitModule r = b.r;
          if (r != null) {
             String str2 = "Unknown";
             recoverMessa.mVersionCode = r.getString("version", str2);
             recoverMessa.mAbi = r.getString("abi", str2);
             recoverMessa.mTaskId = r.getString("task_id", str2);
             recoverMessa.mDeviceInfo = r.getString("device_info", "");
             recoverMessa.mRobustInfo = r.getString("robust_info", "");
             recoverMessa.mLaunched = String.valueOf(CrashMonitorInitModule.v);
             recoverMessa.mDeviceInfo = r.getString("device_info", "");
             str = "launch_time";
             recoverMessa.mLaunchTimeStamp = r.getLong(str, l);
             String str3 = "first_launch";
             if (CrashMonitorInitModule.v) {
                recoverMessa.mCurrentActivity = r.getString("current_activity", str2);
                recoverMessa.mPage = r.getString("page", str2);
                recoverMessa.mFirstLaunch = r.getString(str3, str2);
                if (a.g(str2, recoverMessa.mIsAppOnForeground) && (a.g(str2, recoverMessa.mCurrentActivity) ^ 1)) {
                   recoverMessa.mIsAppOnForeground = "Foreground";
                }
             }
             ExceptionReporter.d.b(recoverMessa);
             b.u0(str, d.h);
             str = a.m;
             a.o(str, "AppEnv.VERSION");
             b.v0("version", str);
             b.v0("launched", String.valueOf(true));
             str = (AbiUtil.b())? "arm64": "arm";
             b.v0("abi", str);
             b.v0("task_id", e.q(a.b()));
             ActivityContext.i(new g(r));
             boolean b1 = p.d().c("page_enter_use_rss", false);
             b.a(0x4b316083).T0(new e(b1, b, recoverMessa));
             f uof = new f(b1, b, recoverMessa);
             c.a(uof, 5000);
             o0 l2 = n.L;
             a.o(l2, "LogManager.mConfiguration");
             str = l2.o1();
             a.o(str, "LogManager.mConfiguration.robustInfo");
             b.v0("robust_info", str);
             DeviceInfo uDeviceInfo = new DeviceInfo();
             uDeviceInfo.mModel = Build.MODEL;
             uDeviceInfo.mCpuCores = w.a();
             int b2 = (AbiUtil.c())? true: false;
             uDeviceInfo.mIsSupportArm64 = String.valueOf(b2);
             uDeviceInfo.mFingerprint = RomUtils.d();
             uDeviceInfo.mCpuPlatform = RomUtils.c();
             uDeviceInfo.mRomVersion = RomUtils.e()+"#"+RomUtils.j();
             str = a.a.q(uDeviceInfo);
             a.o(str, "Gsons.KWAI_GSON.toJson\(deviceInfo\)");
             b.v0("device_info", str);
             str = (a.g("UNKNOWN", a.n))? a.s(): a.n;
             b2 = 1;
             str = (a.g(a.m, str) ^ b2)? String.valueOf(b2): String.valueOf(false);
             b.v0(str3, str);
          }
       }
       if (CrashMonitor.INSTANCE.isInitialized()) {
          CrashMonitor.reportException(new CrashMonitorInitModule$onLaunchFinish$1$1(obj));
       }else {
          obj.b.o0();
       }
       str = "CrashMonitorInitModule";
       h.d(str, "swapbuffer_hack "+AbiUtil.b()+' '+RomUtils.c());
       if (AbiUtil.b() && RomUtils.c() != null) {
          String str1 = RomUtils.c();
          a.o(str1, "RomUtils.getCpuPlatform\(\)");
          Objects.requireNonNull(str1, "null cannot be cast to non-null type java.lang.String");
          str1 = str1.toLowerCase();
          a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
          Objects.requireNonNull(str1, "null cannot be cast to non-null type kotlin.CharSequence");
          if (u.q2(StringsKt__StringsKt.o5(str1).toString(), "mt6771", false, 2, null)) {
             long l1 = a.t().b("mtk_hook_gl_error_max_cnt", -1);
             h.d(str, "mtk_hook_gl_error_max_cnt "+l1);
             int i = (int)l1;
             if (i > 0 && !SwapBufferHack.b) {
                SwapBufferHack.b = true;
                System.loadLibrary("hwui_hack");
                h.d("swapbuffer_hack", "board:"+Build.BOARD+" manufacture:"+Build.MANUFACTURER+" model:"+Build.MODEL+" brand:"+Build.BRAND+", res:"+SwapBufferHack.doHookMTKGLErrorHack(i));
             }
          }
       }
       return;
    }
}
