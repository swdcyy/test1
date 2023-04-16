package com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$a;
import nsd.u;
import com.yxcorp.gifshow.performance.monitor.gc.RuntimeStat;
import com.google.gson.Gson;
import java.lang.Object;
import com.google.common.collect.ImmutableSet;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.UUID;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.AbiUtil;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$GcSuppressModel;
import java.lang.reflect.Type;
import usd.q;
import java.util.ArrayList;
import java.util.Set;
import java.lang.Iterable;
import trd.e1;
import nh7.a$c;
import java.util.Objects;
import java.lang.Runtime;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$b;
import java.lang.Runnable;
import ekd.s1;
import java.lang.System;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$c;
import android.app.Application$ActivityLifecycleCallbacks;
import b76.a;
import java.lang.Integer;
import jf7.a;
import ekd.e0;
import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import java.lang.ClassLoader;
import java.lang.Long;
import java.io.File;
import java.lang.reflect.Method;
import com.kwai.performance.fluency.runtime.RuntimeManager;
import java.io.PrintStream;
import jf7.b;
import kotlin.TypeCastException;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$beginTheSelectedGcSuppressionTask$1;
import zsd.u;
import msd.l;
import com.yxcorp.utility.Log;
import jf7.c;
import android.os.Build$VERSION;
import nsd.s0;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$Result;
import k2b.u1;

public final class GcManageInitModule extends PerformanceBaseInitModule	// class@000e7a
{
    public long A;
    public boolean B;
    public long C;
    public boolean D;
    public final String E;
    public boolean F;
    public final RuntimeStat q;
    public final Gson r;
    public int s;
    public Map t;
    public Map u;
    public int v;
    public boolean w;
    public double x;
    public Boolean y;
    public ImmutableSet z;
    public static long G;
    public static long H;
    public static final GcManageInitModule$a I;

    static {
       GcManageInitModule.I = new GcManageInitModule$a(null);
    }
    public void GcManageInitModule(){
       super();
       this.q = new RuntimeStat();
       this.r = new Gson();
       this.s = 1;
       this.x = 0x3fd3333333333333;
       ImmutableSet immutableSet = ImmutableSet.of("PhotoDetailActivity");
       a.o(immutableSet, "ImmutableSet.of\(\"PhotoDetailActivity\"\)");
       this.z = immutableSet;
       this.A = 0x1400000;
       this.C = 2000;
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.E = str;
    }
    public void n(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GcManageInitModule.class, "2")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       if (!AbiUtil.b()) {
          return;
       }
       GcManageInitModule$GcSuppressModel obj = PatchProxy.apply(objArray, this, GcManageInitModule.class, "9");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = a.t().getValue("gcManageJson", GcManageInitModule$GcSuppressModel.class, objArray);
          if (obj == null || !obj.isEnabled()) {
             b = false;
          }else {
             this.x = q.s(q.l(obj.getGrowFactor(), 0x3fb999999999999a), 2.00f);
             this.C = q.v(q.o(obj.getGcBlockMs(), 1), 4000);
             e1.C(this.z, obj.getTarArr());
             this.s = obj.getGcManagePlan();
             Objects.requireNonNull(a$c.a);
             this.A = q.o((long)(((float)obj.getFreeHeapThresholdMB() * 1024.00f) * 1024.00f), 0x100000);
             obj.toString();
             b = true;
          }
       }
       if (!b) {
          return;
       }else if(a.g(this.q0(), Boolean.FALSE)){
          return;
       }else {
          obj = PatchProxy.apply(objArray, this, GcManageInitModule.class, "8");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             long l = Runtime.getRuntime().freeMemory();
             if (l - this.A < 0) {
                if (!l) {
                   long l1 = Runtime.getRuntime().maxMemory();
                   if ((double)Runtime.getRuntime().totalMemory() - ((double)l1 * 0x3fe999999999999a) < 0 && l1 - (long)0x15e00000 > 0) {
                      b1 = true;
                   }
                }
                this.B = true;
             }else {
                i = 1;
             }
             b1 = i;
          }
          if (!b1) {
             return;
          }else if(this.w == null){
             this.x = 0x3ff0000000000000;
             this.w = true;
             this.o0(this.s);
             this.v = this.v + true;
             if (this.s == true) {
                s1.e(new GcManageInitModule$b(this), 6000);
             }
          }
          if (this.q.isUpdated == null) {
             this.F = true;
             GcManageInitModule.G = System.currentTimeMillis();
             RuntimeStat runtimeStat = this.q.updateRuntimeStat();
             a.o(runtimeStat, "lastStat");
             Map stats = runtimeStat.getStats();
             a.o(stats, "lastStat.stats");
             this.t = t0.n0(t0.z(), stats);
             this.q.clearStat();
          }
          if (this.D != null) {
             a.b().registerActivityLifecycleCallbacks(new GcManageInitModule$c(this));
          }
          return;
       }
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule.class, "4")) {
          return;
       }
       a.p(p0, "event");
       if (this.w != null) {
          this.v = this.v - 1;
          if (this.v <= null) {
             this.p0(this.s);
             this.w = false;
          }
       }
       if (this.F != null) {
          GcManageInitModule.H = System.currentTimeMillis();
          RuntimeStat runtimeStat = this.q.updateRuntimeStat();
          a.o(runtimeStat, "lastStat");
          Map stats = runtimeStat.getStats();
          a.o(stats, "lastStat.stats");
          this.u = t0.n0(t0.z(), stats);
          this.r0("MockLaunchAct", this.q);
       }
       return;
    }
    public final void o0(int p0){
       if (PatchProxy.isSupport(GcManageInitModule.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GcManageInitModule.class, "5")) {
          return;
       }
       ClassLoader uClassLoader = null;
       int i = 0;
       int i1 = 1;
       if (p0 != i1) {
          if (p0 == 2) {
             GcManageInitModule tC = this.C;
             a e = a.e;
             if (!e.a(2)) {
                e.h(2);
                Context b = e0.b;
                a.h(b, "GlobalConfig.CONTEXT");
                ApplicationInfo applicationI = b.getApplicationInfo();
                Class[] uClassArray = new Class[]{String.class,Long.TYPE,File.class};
                Method declaredMeth = Class.forName("com.kwai.performance.fluency.runtime.LoadLib", i1, new PathClassLoader(applicationI.sourceDir, applicationI.nativeLibraryDir, uClassLoader)).getDeclaredMethod("loadLib", uClassArray);
                a.h(declaredMeth, "enableMethod");
                declaredMeth.setAccessible(i1);
                Object[] objArray = new Object[]{"blocker",Long.valueOf(tC),RuntimeManager.e.d()};
                Object obj = declaredMeth.invoke(uClassLoader, objArray);
                if (obj != null) {
                   if (obj.booleanValue()) {
                      System.out.println(" enable block successful ");
                   }else {
                      e.g(2, "blocker load fail");
                      e.b(2);
                   }
                   s1.e(b.b, 2000);
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                }
             }
          }
       }else {
          GcManageInitModule$beginTheSelectedGcSuppressionTask$1 uobeginTheSe = new GcManageInitModule$beginTheSelectedGcSuppressionTask$1(this);
          _monitor_enter(RuntimeManager.class);
          a.q(uobeginTheSe, "func");
          RuntimeManager.a(this.x);
          a e1 = a.e;
          if (u.q2(e1.c(2), "ERROR:", i, 2, uClassLoader)) {
             uobeginTheSe.invoke(e1.c(2));
          }
          _monitor_exit(RuntimeManager.class);
       }
       return;
    }
    public final void p0(int p0){
       if (PatchProxy.isSupport(GcManageInitModule.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GcManageInitModule.class, "6")) {
          return;
       }
       int i = 2;
       if (p0 != 1) {
          if (p0 == i) {
             File b = RuntimeManager.b;
             if (b != null && b.exists()) {
                b = RuntimeManager.b;
                if (b == null) {
                   a.L();
                }
                b.delete();
             }
          }
       }else {
          _monitor_enter(RuntimeManager.class);
          int i1 = RuntimeManager.d - 1;
          RuntimeManager.d = i1;
          if (i1 > 0) {
             _monitor_exit(RuntimeManager.class);
          }else {
             RuntimeManager.c = false;
             Log.g("RTMgr", "ready to fin gc suppress");
             RuntimeManager.e.c(i);
             a e = a.e;
             if (e.a(i)) {
                _monitor_exit(RuntimeManager.class);
             }else {
                e.h(i);
                if (!RuntimeManager.nativeStopGcSuppress()) {
                   e.g(i, "Error: failed stop gc suppress");
                   e.b(i);
                }
                s1.e(c.b, 2000);
                _monitor_exit(RuntimeManager.class);
             }
          }
       }
       return;
    }
    public final Boolean q0(){
       Object obj = PatchProxy.apply(null, this, GcManageInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.y == null) {
          boolean sDK_INT = Build$VERSION.SDK_INT;
          sDK_INT = (sDK_INT >= 24 && sDK_INT <= 30)? true: false;
          this.y = Boolean.valueOf(sDK_INT);
       }
       return this.y;
    }
    public final void r0(String p0,RuntimeStat p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GcManageInitModule.class, "3")) {
          return;
       }
       Map stats = p1.getStats();
       Objects.requireNonNull(stats, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String!, kotlin.Long!>");
       Map map = s0.k(stats);
       Long longx = map.get("gcCount");
       long l = (longx != null)? longx.longValue(): -1;
       float f = (float)l / (((float)(GcManageInitModule.H - GcManageInitModule.G) / 1000.00f) / 60.00f);
       GcManageInitModule tt = this.t;
       if (tt == null) {
          tt = t0.z();
       }
       GcManageInitModule gcManageInit = tt;
       tt = this.u;
       if (tt == null) {
          stats = t0.z();
       }
       GcManageInitModule gcManageInit1 = tt;
       int i = (int)(this.A >> 20);
       GcManageInitModule$Result result = new GcManageInitModule$Result(p0, f, this.E, i, this.B, map, gcManageInit, gcManageInit1);
       p0 = this.r.q((int)(this.A >> 20));
       u1.R("gc_json_str", p0, 19);
       return;
    }
}
