package com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o56.a;
import xf6.l;
import com.yxcorp.utility.SystemUtil;
import java.lang.Math;
import java.lang.StringBuilder;
import yf7.h;
import nh7.a$a;
import java.lang.Runtime;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import android.os.Build$VERSION;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.AbiUtil$Abi;
import com.yxcorp.utility.AbiUtil;
import ch7.d$a;
import com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$b;
import ch7.i$a;
import com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$c;
import ch7.i$c;
import com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$d;
import ch7.i$b;
import ch7.d;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig$Builder;
import twb.a;
import com.kwai.performance.stability.oom.monitor.OOMHprofUploader;
import twb.b;
import kh7.d;
import com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$e;
import kh7.f;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import yf7.f;
import yf7.k;
import com.kwai.performance.stability.oom.monitor.OOMMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.Float;
import java.lang.Number;
import java.lang.reflect.Type;
import java.lang.Integer;

public final class OOMMonitorInitModule extends PerformanceBaseInitModule	// class@000e9d
{
    public static final OOMMonitorInitModule$a q;

    static {
       OOMMonitorInitModule.q = new OOMMonitorInitModule$a(null);
    }
    public void OOMMonitorInitModule(){
       super();
    }
    public void n(){
    }
    public void n0(a p0){
       float f7;
       int i15;
       a h;
       d obj = this;
       OOMMonitorConfig$Builder obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, OOMMonitorInitModule.class, "1")) {
          return;
       }
       a.p(obj1, "event");
       super.n0(p0);
       float f = 0x3a83126f;
       float f1 = 0x3f800000;
       int b = false;
       if (a.c()) {
          f = obj.p0("koom_enable_hprof_dump_ratio_monkey", f1);
       }else if(a.d() && (l.c("memory_leak_check", b) || SystemUtil.I())){
          f = 0x3f800000;
       }else if(SystemUtil.J()){
          f = obj.p0("koom_enable_hprof_dump_ratio_huidu", 0.20f);
       }else if(SystemUtil.R()){
          f = obj.p0("koom_enable_hprof_dump_ratio_release", f);
       }
       boolean b1 = (Math.random() - (double)f <= 0)? true: false;
       String str = "OOMMonitorInitModule";
       h.d(str, "enableHprofAnalysis:"+b1+" enableRatio:"+f);
       f = a$a.a.f(Runtime.getRuntime().maxMemory());
       float f2 = 0x3f666666;
       if (f - (float)502 >= 0) {
          f = obj.p0("koom_heap_hprof_dump_threshold", 0x3f4ccccd);
       }else {
          String str1 = "koom_heap_128m_hprof_dump_threshold";
          f = (f - (float)246 >= 0)? obj.p0(str1, 0x3f59999a): obj.p0(str1, f2);
       }
       int i = (a.g(MonitorBuildConfig.e(), "EMUI") && Build$VERSION.SDK_INT <= 26)? obj.q0("koom_hprof_dump_thread_old_huawei_threshold", 460): obj.q0("koom_hprof_dump_thread_threshold", 750);
       boolean i1 = obj.q0("koom_heap_huge_delta_hprof_dump_threshold", 0x55730);
       float f3 = obj.p0("koom_heap_huge_max_hprof_dump_threshold", f2);
       int i2 = obj.q0("koom_fd_hprof_dump_threshold", 1100);
       int i3 = obj.q0("koom_hprof_dump_vss_threshold", 0x37b1d0);
       float f4 = obj.p0("koom_device_low_mem_threshold", 0.05f);
       boolean b2 = obj.o0("koom_upload_analysis_hprof", b);
       boolean b3 = obj.o0("koom_upload_crash_dump_hprof", b);
       obj.o0("koom_fork_dump_when_oom_crash", b);
       obj.o0("koom_strip_dump_when_oom_crash", b);
       int b4 = (!SystemUtil.L(a.b()) || (Build$VERSION.SDK_INT < 23 || (AbiUtil.a() != AbiUtil$Abi.ARMEABI_V7A || obj.o0("koom_disable_jemalloc_hack", b))))? false: true;
       float f5 = f4;
       int i4 = obj.q0("koom_jemalloc_purge_vss_threshold", 0x325aa0);
       int i5 = obj.q0("koom_jemalloc_purge_max_times", 8);
       int i6 = obj.q0("koom_jemalloc_purge_min_interval", 5);
       int i7 = obj.q0("koom_jemalloc_purge_vss_retained_threshold", 0x249f0);
       int i8 = obj.q0("koom_jemalloc_purge_rss_retained_threshold", 0x186a0);
       h.d(str, "heapThreshold:"+f+" uploadAnalysisHprof:"+b2+" uploadCrashDumpHprof:"+b3+" enableJeMallocHack:"+b4);
       int i9 = obj.q0("leakFixer_config_lowMemoryToFixMinInterval", 0x2bf20);
       int i10 = obj.q0("leakFixer_config_trimMemoryToFixMinInterval", 0x2bf20);
       b2 = obj.o0("leakFixer_config_enableMonitorToFix", true);
       int i11 = obj.q0("koom_jemalloc_chunk_hooks_vss_threshold", 0x2dc6c0);
       boolean b5 = obj.o0("leakFixer_config_enableTrimMemoryToFix", true);
       boolean b6 = b4;
       b4 = obj.q0("leakFixer_config_forceGcTrimMemoryLevel", 15);
       boolean b7 = b1;
       float f6 = obj.p0("leakFixer_config_forceGcHeapRatio", 0x3f666666);
       int i12 = obj.q0("koom_loop_interval", 0x2710);
       b = obj.q0("leakFixer_config_reportEventFlag", 7);
       d$a uoa = new d$a();
       uoa.h(i9);
       uoa.k(i10);
       uoa.b(b2);
       uoa.c(b5);
       uoa.e(b4);
       uoa.f(f6);
       uoa.j(b);
       int i13 = i3;
       uoa.d(OOMMonitorInitModule$b.a);
       uoa.i(OOMMonitorInitModule$c.a);
       uoa.g(OOMMonitorInitModule$d.a);
       int i14 = i1;
       i1 = 0;
       i3 = obj.q0("leakfix_experiment_v2", i1);
       if ((i3 & 0x01) > 0) {
          i1 = true;
       }
       boolean b8 = ((i3 & 0x02) > 0)? true: false;
       if (i3) {
          uoa.b(i1);
          uoa.c(i1);
          if (b8) {
             f7 = f3;
             i15 = b4;
          }else {
             f7 = f3;
             i15 = 100;
          }
          uoa.e(i15);
          f3 = (b8)? f6: 0x3f800000;
          uoa.f(f3);
       }else {
          f7 = f3;
       }
       h.d(str, "enableMonitorToFix = "+b2+", "+"enableTrimMemoryToFix = "+b5+", "+"forceGcTrimMemoryLevel = "+b4+", "+"forceGcHeapRatio = "+f6+", "+"reportEventFlag = "+b+", "+"lowMemoryToFixMinInterval = "+i9+", "+"trimMemoryToFixMinInterval = "+i10+", "+"experimentValue = "+i3+", "+i1+", "+b8);
       obj = uoa.a();
       obj1 = new OOMMonitorConfig$Builder();
       obj1.x(i);
       obj1.h(i2);
       obj1.k(f);
       obj1.j(f7);
       obj1.i(i14);
       obj1.y(i13);
       obj1.u(3);
       obj1.b(5);
       obj1.c(0x4d3f6400);
       obj1.t((long)i12);
       obj1.e(b7);
       obj1.f(b6);
       obj1.m(i11);
       obj1.p(i4);
       obj1.n(i6);
       obj1.o(i5);
       obj1.r(i7);
       obj1.q(i8);
       obj1.g(true);
       obj1.d(f5);
       h = a.h;
       obj1.l(h);
       a.o(obj, "leakFixerConfig");
       obj1.s(obj);
       obj1.v(b.a);
       if (a.d()) {
          h.d(str, "set OOM trigger");
          obj1.w(new OOMMonitorInitModule$e());
       }
       k.a(obj1.a());
       LoopMonitor.startLoop$default(OOMMonitor.INSTANCE, false, false, 0x2710, 3, null);
       h.b();
       return;
    }
    public final boolean o0(String p0,boolean p1){
       if (PatchProxy.isSupport(OOMMonitorInitModule.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, OOMMonitorInitModule.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.t().d(p0, p1);
    }
    public final float p0(String p0,float p1){
       if (PatchProxy.isSupport(OOMMonitorInitModule.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, OOMMonitorInitModule.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       p0 = a.t().getValue(p0, Float.TYPE, Float.valueOf(p1));
       a.o(p0, "SwitchConfigManager.getI¡­oat::class.java, default\)");
       return p0.floatValue();
    }
    public final int q0(String p0,int p1){
       if (PatchProxy.isSupport(OOMMonitorInitModule.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, OOMMonitorInitModule.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return a.t().a(p0, p1);
    }
}
