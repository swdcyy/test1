package com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwb.b;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$a;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.google.gson.Gson;
import android.content.SharedPreferences;
import kotlin.jvm.internal.a;
import yf7.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig$a;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$execute$1;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Float;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$execute$2;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$execute$3;
import o56.c;
import o56.a;
import xf6.l;
import java.lang.reflect.Method;
import yf7.f;
import yf7.k;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class BatteryMonitorInitModule extends PerformanceBaseInitModule	// class@000e58
{
    public final String q;
    public static final BatteryMonitorInitModule$a r;

    static {
       BatteryMonitorInitModule.r = new BatteryMonitorInitModule$a(null);
    }
    public void BatteryMonitorInitModule(){
       super();
       this.q = "BatteryMonitor";
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, BatteryMonitorInitModule.class, "3")) {
          return;
       }
       if (b.a()) {
          BatteryMonitor.getAppStatusNotifier().onBackground();
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, BatteryMonitorInitModule.class, "2")) {
          return;
       }
       if (b.a()) {
          BatteryMonitor.getAppStatusNotifier().onForeground();
       }
       return;
    }
    public void n(){
       BatteryMonitorConfig$a uoa;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BatteryMonitorInitModule.class, "1")) {
          return;
       }
       if (b.a()) {
          Gson gson = new Gson();
          String str = b.a.getString("BatteryMonitorConfig", "");
          a.o(str, "MonitorOnlinePreference.getBatteryMonitorConfig\(\)");
          h.d(this.q, "BatteryMonitorEnable: null");
          BatteryMonitorConfig uBatteryMoni = (!TextUtils.isEmpty(str))? gson.h(str, BatteryMonitorConfig.class): objArray;
          uoa = new BatteryMonitorConfig$a();
          BatteryMonitorInitModule$execute$1 iNSTANCE = BatteryMonitorInitModule$execute$1.INSTANCE;
          a.q(iNSTANCE, "customParamsInvoker");
          uoa.u = iNSTANCE;
          if (uBatteryMoni != null) {
             Boolean uBoolean = Boolean.valueOf(uBatteryMoni.enableCollectGpuInfo);
             if (uBoolean == null) {
                a.L();
             }
             uoa.a = uBoolean.booleanValue();
             uBoolean = Boolean.valueOf(uBatteryMoni.enableCollectSysCpu);
             if (uBoolean == null) {
                a.L();
             }
             uoa.b = uBoolean.booleanValue();
             uBoolean = Boolean.valueOf(uBatteryMoni.enableThreadCpuInfo);
             if (uBoolean == null) {
                a.L();
             }
             uoa.c = uBoolean.booleanValue();
             Long longx = Long.valueOf(uBatteryMoni.loopInterval);
             if (longx == null) {
                a.L();
             }
             uoa.d = longx.longValue();
             Integer integer = Integer.valueOf(uBatteryMoni.systemCpuLoop);
             if (integer == null) {
                a.L();
             }
             uoa.e = integer.intValue();
             integer = Integer.valueOf(uBatteryMoni.sampleListSize);
             if (integer == null) {
                a.L();
             }
             uoa.f = integer.intValue();
             uoa.g = uBatteryMoni.timeDiffThreshold;
             uBoolean = Boolean.valueOf(uBatteryMoni.enableBgSample);
             if (uBoolean == null) {
                a.L();
             }
             uoa.h = uBoolean.booleanValue();
             longx = Long.valueOf(uBatteryMoni.loopIntervalBg);
             if (longx == null) {
                a.L();
             }
             uoa.i = longx.longValue();
             uBoolean = Boolean.valueOf(uBatteryMoni.enableStackSampling);
             if (uBoolean == null) {
                a.L();
             }
             uoa.j = uBoolean.booleanValue();
             Float uFloat = Float.valueOf(uBatteryMoni.processCpuUsageThreshold);
             if (uFloat == null) {
                a.L();
             }
             uoa.k = uFloat.floatValue();
             integer = Integer.valueOf(uBatteryMoni.overThresholdTimes);
             if (integer == null) {
                a.L();
             }
             uoa.l = integer.intValue();
             integer = Integer.valueOf(uBatteryMoni.stackSampleInterval);
             if (integer == null) {
                a.L();
             }
             uoa.m = integer.intValue();
             integer = Integer.valueOf(uBatteryMoni.threadCpuTopN);
             if (integer == null) {
                a.L();
             }
             uoa.n = integer.intValue();
             integer = Integer.valueOf(uBatteryMoni.slideWindowSize);
             if (integer == null) {
                a.L();
             }
             uoa.o = integer.intValue();
             integer = Integer.valueOf(uBatteryMoni.baseMonitorFlag);
             if (integer == null) {
                a.L();
             }
             uoa.p = integer.intValue();
             integer = Integer.valueOf(uBatteryMoni.cpuExceptionFlag);
             if (integer == null) {
                a.L();
             }
             uoa.q = integer.intValue();
             uoa.r = uBatteryMoni.specifiedSections;
             uoa.s = uBatteryMoni.blackSections;
             uoa.t = uBatteryMoni.threadCpuInfoConfig;
             BatteryMonitorInitModule$execute$2 iNSTANCE1 = BatteryMonitorInitModule$execute$2.INSTANCE;
             String str1 = "provider";
             a.q(iNSTANCE1, str1);
             uoa.w = iNSTANCE1;
             BatteryMonitorInitModule$execute$3 iNSTANCE2 = BatteryMonitorInitModule$execute$3.INSTANCE;
             a.q(iNSTANCE2, str1);
             uoa.x = iNSTANCE2;
          }
       }else {
          uoa = objArray;
       }
       int i = 1;
       BatteryMonitorInitModule uBatteryMoni1 = (a.a().c() && l.c("key_enable_cpu_usage_monitor", false))? 1: null;
       if (uBatteryMoni1 && !PatchProxy.applyVoidOneRefs(uoa, this, BatteryMonitorInitModule.class, "4")) {
          Class[] uClassArray = new Class[i];
          uClassArray[0] = BatteryMonitorConfig$a.class;
          Object[] objArray1 = new Object[i];
          objArray1[0] = uoa;
          Class.forName("com.kuaishou.platform.testconfig.performance.cpu.PerformanceTestCpuMonitor").getMethod("startCpuUsageLine", uClassArray).invoke(objArray, objArray1);
       }
       if (uoa != null) {
          k.a(uoa.a());
       }
       e.g(new BatteryMonitorInitModule$b(this), "BatteryMonitor_Get_Kswitch");
       return;
    }
}
