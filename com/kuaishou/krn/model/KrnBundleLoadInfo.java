package com.kuaishou.krn.model.KrnBundleLoadInfo;
import rj0.b;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import java.lang.String;
import com.kuaishou.krn.model.PluginTrackInfo;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.HashMap;
import com.facebook.base.tracing.TracingManager;
import hg.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import fk0.j;
import java.lang.Enum;
import com.kuaishou.krn.apm.MemoryMonitor;
import fk0.d;
import com.kuaishou.krn.apm.MemoryEventTiming;
import sj0.b;
import java.lang.Integer;
import msd.l;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.apm.KdsMemoryInfo;
import li0.a;
import java.lang.System;
import bk0.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.krn.model.KrnBundleLoadInfo$a;
import lj0.c;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Boolean;
import java.lang.Math;
import com.kuaishou.krn.experiment.ExpConfigKt;
import qrd.p;
import com.kuaishou.krn.model.b;
import bk0.j;
import com.kuaishou.krn.model.KrnBundleLoadInfo$ReportType;
import com.facebook.react.bridge.ReactBridge;
import gk0.b;
import java.util.List;
import java.util.Iterator;
import gk0.a;
import java.lang.Long;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import java.util.Set;
import java.lang.StringBuilder;
import ek0.d;
import fk0.k;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.MemoryEvent;
import com.google.gson.Gson;
import android.os.SystemClock;
import fk0.h;
import fk0.g;

public class KrnBundleLoadInfo implements b	// class@000900
{
    public long A;
    public double A0;
    public long B;
    public long B0;
    public long C;
    public long C0;
    public long D;
    public double D0;
    public long E;
    public long E0;
    public long F;
    public final Map F0;
    public long G;
    public final Map G0;
    public long H;
    public long H0;
    public long I;
    public long I0;
    public long J;
    public long J0;
    public long K;
    public long K0;
    public long L;
    public long L0;
    public long M;
    public long M0;
    public long N;
    public long N0;
    public long O;
    public long O0;
    public long P;
    public long P0;
    public long Q;
    public long Q0;
    public long R;
    public long R0;
    public long S;
    public long S0;
    public long T;
    public long T0;
    public long U;
    public int U0;
    public long V;
    public int V0;
    public long W;
    public int W0;
    public long X;
    public int X0;
    public long Y;
    public int Y0;
    public long Z;
    public int Z0;
    public boolean a;
    public long a0;
    public int a1;
    public LoadingStateTrack$LoadType b;
    public long b0;
    public long b1;
    public boolean c;
    public int c0;
    public long c1;
    public String d;
    public j d0;
    public long d1;
    public WeakReference e;
    public a e0;
    public String e1;
    public long f;
    public final AtomicBoolean f0;
    public String f1;
    public long g;
    public long g0;
    public KdsMemoryInfo g1;
    public long h;
    public boolean h0;
    public double h1;
    public long i;
    public long i0;
    public double i1;
    public long j;
    public boolean j0;
    public long k;
    public boolean k0;
    public long l;
    public long l0;
    public long m;
    public long m0;
    public String n;
    public long n0;
    public long o;
    public int o0;
    public long p;
    public boolean p0;
    public long q;
    public boolean q0;
    public long r;
    public long r0;
    public long s;
    public double s0;
    public long t;
    public long t0;
    public long u;
    public long u0;
    public long v;
    public double v0;
    public long w;
    public long w0;
    public long x;
    public double x0;
    public long y;
    public long y0;
    public long z;
    public long z0;

    public void KrnBundleLoadInfo(long p0,LoadingStateTrack$LoadType p1,String p2,PluginTrackInfo p3){
       KrnBundleLoadInfo krnBundleLoa = this;
       LoadingStateTrack$LoadType loadType = p1;
       super();
       boolean b = false;
       krnBundleLoa.a = b;
       krnBundleLoa.e = new WeakReference(null);
       krnBundleLoa.c0 = b;
       krnBundleLoa.f0 = new AtomicBoolean(b);
       krnBundleLoa.g0 = 0;
       krnBundleLoa.i0 = 0;
       krnBundleLoa.o0 = b;
       krnBundleLoa.p0 = b;
       krnBundleLoa.q0 = b;
       krnBundleLoa.r0 = -1;
       krnBundleLoa.t0 = -1;
       krnBundleLoa.F0 = new HashMap();
       krnBundleLoa.G0 = new HashMap();
       krnBundleLoa.S0 = -1;
       krnBundleLoa.W0 = b;
       krnBundleLoa.X0 = b;
       krnBundleLoa.Y0 = b;
       krnBundleLoa.Z0 = b;
       krnBundleLoa.a1 = b;
       krnBundleLoa.b = loadType;
       int i = 1;
       if (loadType == LoadingStateTrack$LoadType.NORMAL_BUSINESS_BUNDLE) {
          b = true;
       }
       krnBundleLoa.c = b;
       if (b) {
          TracingManager.h("1:t1t2t3Thread:", i);
          int i1 = 2;
          TracingManager.h("2:nativeT1Thread:", i1);
          int i2 = 3;
          TracingManager.h("3:fmplcpThread:", i2);
          int i3 = 4;
          TracingManager.h("4:sdkLaunchTimeThread:", i3);
          int i4 = 5;
          TracingManager.h("5:kdsMainThread:", i4);
          int i5 = 6;
          TracingManager.h("6:assertManagerThread:", i5);
          int i6 = 7;
          TracingManager.h("7:jsThread:", i6);
          TracingManager.i("-992", i);
          TracingManager.i("-993", i1);
          TracingManager.i("-994", i2);
          TracingManager.i("-995", i3);
          TracingManager.i("-996", i4);
          TracingManager.i("-997", i5);
          TracingManager.i("-998", i6);
          a.b(0, "SdkToBridgeInitTime", a.e(), 4);
       }
       if (this.t()) {
          String str = (TextUtils.isEmpty(p2))? "": p2;
          j oj = new j(str, p1.name());
          krnBundleLoa.d0 = oj;
          MemoryMonitor m = MemoryMonitor.m;
          m.k(null, null, oj.bundleId, true, new d(krnBundleLoa), MemoryEventTiming.ON_CREATE);
          if (c.a().N()) {
             krnBundleLoa.g1 = m.j();
          }
       }
       if (this.u()) {
          krnBundleLoa.e0 = new a();
       }
       if (p3 != null) {
          krnBundleLoa.l0 = p3.f();
          krnBundleLoa.m0 = p3.e();
          krnBundleLoa.n0 = p3.a();
          krnBundleLoa.j0 = p3.g();
          krnBundleLoa.k0 = p3.h();
       }
       krnBundleLoa.f = p0;
       krnBundleLoa.g = System.currentTimeMillis();
       krnBundleLoa.d = p2;
       krnBundleLoa.G = 0;
       krnBundleLoa.I = 0;
       krnBundleLoa.d1 = i.k;
       krnBundleLoa.e1 = i.i;
       krnBundleLoa.f1 = i.j;
       return;
    }
    public long a(){
       return this.X;
    }
    public long b(){
       return this.K;
    }
    public long c(){
       return this.L;
    }
    public long d(){
       return this.V;
    }
    public long e(){
       return this.b0;
    }
    public long f(){
       return this.i;
    }
    public long g(){
       return this.g;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, KrnBundleLoadInfo.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = KrnBundleLoadInfo$a.a[this.b.ordinal()];
       if (i == 1) {
          return 0;
       }
       if (i != 2) {
          return 2;
       }
       return 1;
    }
    public final int i(){
       KrnBundleLoadInfo obj = PatchProxy.apply(null, this, KrnBundleLoadInfo.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj != null && (obj.get() != null && (this.e.get().i() != null && this.e.get().i().b() != null))) {
          return this.e.get().i().b().getUniqueId();
       }
       return -1;
    }
    public final double j(long p0){
       return (((double)(p0 - this.C0) / 0x408f400000000000) + this.D0);
    }
    public final boolean k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Number obj = PatchProxy.apply(objArray, this, KrnBundleLoadInfo.class, "68");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       double d = Math.random();
       obj = PatchProxy.apply(objArray, objArray, ExpConfigKt.class, "15");
       if (obj == patchProxyRe) {
          obj = ExpConfigKt.o.getValue();
       }
       boolean b = (d - obj.doubleValue() <= 0)? true: false;
       return b;
    }
    public final boolean l(){
       KrnBundleLoadInfo obj = PatchProxy.apply(null, this, KrnBundleLoadInfo.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = (obj != null && (obj.get() != null && this.e.get().y()))? true: false;
       return b;
    }
    public final void m(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, KrnBundleLoadInfo.class, "65")) {
          return;
       }
       if (obj.U && (obj.b != LoadingStateTrack$LoadType.PRE_BASIC_BUNDLE || this.k())) {
          KrnBundleLoadInfo e = obj.e;
          if (e != null) {
             b uob = v14;
             b uob1 = v14;
             b uob2 = uob1;
             uob = new b(e.get(), obj.d, obj.b, obj.f, obj.h, obj.j, obj.l, obj.C, obj.E, obj.Q, obj.S, obj.U, obj.W, obj.a0, obj.g0, obj.h0, obj.i0, obj.G, obj.I, obj.l0, obj.m0, obj.n0, obj.o0, obj.M, obj.N, obj.Y, obj.Z, obj.p0, obj.q0, obj.d1, obj.e1, obj.f1);
             j.b.c("krn_sdk_launch_time", uob2);
          }
       }
       return;
    }
    public void n(KrnBundleLoadInfo$ReportType p0){
       KrnBundleLoadInfo p0;
       HashMap hashMap8;
       long l1;
       boolean b = this;
       if (PatchProxy.applyVoidOneRefs(p0, b, KrnBundleLoadInfo.class, "66")) {
          return;
       }
       if (b.a == null) {
          KrnBundleLoadInfo e = b.e;
          if (e != null) {
             b.a = true;
             b uob = new b(e.get(), b.d, b.b, b.f, b.h, b.j, b.l, b.C, b.E, b.Q, b.S, b.U, b.W, b.a0, b.g0, b.h0, b.i0, b.G, b.I, b.l0, b.m0, b.n0, b.o0, b.M, b.N, b.Y, b.Z, b.p0, b.q0, b.d1, b.e1, b.f1);
             b uob1 = v2;
             uob1.report_type = p0.name();
             uob1.plugin_load_start = b.l0;
             uob1.plugin_load_end = b.m0;
             uob1.krn_sdk_entry_time = b.g;
             uob1.container_init_start = b.C0;
             uob1.container_init_end = b.B0;
             uob1.v8_so_load_start = b.H;
             uob1.v8_so_load_end = b.J;
             uob1.load_react_native_so_file_start = ReactBridge.getLoadStartTime();
             uob1.load_react_native_so_file_end = ReactBridge.getLoadEndTime();
             uob1.asset_init_start = b.k;
             uob1.asset_init_end = b.m;
             uob1.asset_bundle_load_mode = b.n;
             uob1.asset_load_from_memory_start = b.o;
             uob1.asset_load_from_memory_end = b.p;
             uob1.asset_load_from_local_start = b.q;
             uob1.asset_load_from_local_end = b.r;
             uob1.asset_load_from_not_local_start = b.s;
             uob1.asset_load_from_not_local_end = b.t;
             uob1.asset_get_info_start = b.u;
             uob1.asset_get_info_end = b.v;
             uob1.asset_get_start = b.w;
             uob1.asset_get_end = b.x;
             uob1.asset_check_start = b.y;
             uob1.asset_check_end = b.z;
             uob1.asset_resolve_start = b.A;
             uob1.asset_resolve_end = b.B;
             uob1.krn_bridge_init_time = b.i;
             uob1.engine_prepare_start = b.D;
             uob1.engine_init_start = b.E0;
             uob1.engine_init_end = b.F;
             uob1.native_module_start = b.S0;
             uob1.native_module_end = b.T0;
             uob1.module_register_count = b.U0;
             uob1.module_register_start = b.N0;
             uob1.module_register_end = b.O0;
             uob1.module_init_by_main_thread_count = b.V0;
             p0 = b.P0;
             uob1.module_init_by_main_thread_start = p0;
             uob1.module_init_by_main_thread_end = b.Q0;
             uob1.module_wait_main_thread_time = (int)(p0 - b.R0);
             uob1.get_constant_time = b.F0;
             uob1.create_js_context_start = b.H0;
             uob1.create_js_context_end = b.I0;
             uob1.asset_get_base_js_start = b.J0;
             uob1.asset_get_base_js_end = b.K0;
             uob1.load_base_js_bundle_start = b.L0;
             uob1.load_base_js_bundle_end = b.M0;
             uob1.run_base_js_bundle_start = b.K;
             uob1.run_base_js_bundle_end = b.L;
             uob1.base_js_bundle_size = b.O;
             uob1.load_business_js_bundle_start = b.R;
             uob1.load_business_js_bundle_end = b.T;
             uob1.run_business_js_bundle_start = b.V;
             uob1.run_business_js_bundle_end = b.X;
             uob1.business_js_bundle_size = b.P;
             uob1.run_application_start = b.b1;
             uob1.run_application_end = b.c1;
             uob1.t1 = b.r0;
             uob1.native_t1 = b.t0;
             uob1.content_appeared = b.b0;
             uob1.t2 = b.u0;
             uob1.t3 = b.w0;
             uob1.lcp = b.y0;
             uob1.fmp = b.z0;
             HashMap hashMap = new HashMap();
             HashMap hashMap1 = new HashMap();
             HashMap hashMap2 = new HashMap();
             HashMap hashMap3 = new HashMap();
             HashMap hashMap4 = new HashMap();
             Iterator iterator = b.a().d().iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa.c == this.i()) {
                   hashMap.put(uoa.d, Long.valueOf(uoa.e));
                   hashMap1.put(uoa.d, Long.valueOf(uoa.f));
                   hashMap2.put(uoa.d, Long.valueOf(uoa.g));
                   hashMap3.put(uoa.d, Long.valueOf(uoa.h));
                   hashMap4.put(uoa.d, Long.valueOf(uoa.i));
                   b.a().d().remove(uoa);
                }
             }
             uob1.native_data_start = hashMap;
             uob1.native_data_end = hashMap1;
             uob1.native_data_resolve_start = hashMap2;
             uob1.native_data_resolve_end = hashMap3;
             uob1.native_data_size = hashMap4;
             Iterator iterator1 = b.a().b().iterator();
             while (iterator1.hasNext()) {
                a uoa1 = iterator1.next();
                if ((uob1.a()).equals(uoa1.a) && (uoa1.b).equals(b.e.get().f())) {
                   uob1.native_do_pre_start = uoa1.e;
                   b.a().b().remove(uoa1);
                }
             }
             hashMap4 = new HashMap();
             HashMap hashMap5 = new HashMap();
             Iterator iterator2 = b.a().c().iterator();
             while (iterator2.hasNext()) {
                a uoa2 = iterator2.next();
                if (uoa2.c == this.i()) {
                   hashMap4.put(uoa2.d, Long.valueOf(uoa2.e));
                   hashMap5.put(uoa2.d, Long.valueOf(uoa2.f));
                   b.a().c().remove(uoa2);
                }
             }
             uob1.js_data_start = hashMap4;
             uob1.js_data_end = hashMap5;
             HashMap hashMap6 = new HashMap();
             HashMap hashMap7 = new HashMap();
             Iterator iterator3 = b.a().e().iterator();
             while (iterator3.hasNext()) {
                a uoa3 = iterator3.next();
                if ((uoa3.a).equals(uob1.a()) && (uoa3.b).equals(b.e.get().f())) {
                   hashMap6.put(uoa3.d, Long.valueOf(uoa3.e));
                   hashMap7.put(uoa3.d, Long.valueOf(uoa3.f));
                   b.a().e().remove(uoa3);
                }
             }
             uob1.native_pre_data_start = hashMap6;
             uob1.native_pre_data_end = hashMap7;
             if (b.c != null) {
                int i = 10;
                Iterator iterator4 = hashMap.keySet().iterator();
                while (iterator4.hasNext()) {
                   String str = iterator4.next();
                   TracingManager.h(str, i);
                   if (hashMap.containsKey(str)) {
                      long l = (long)i;
                      hashMap8 = hashMap;
                      a.b(0, "native_data_"+str, b.j(hashMap.get(str).longValue()), l);
                      a.d(0, "native_data_"+str, b.j(hashMap1.get(str).longValue()), l);
                   }else {
                      hashMap8 = hashMap;
                   }
                   if (hashMap2.containsKey(str) && hashMap3.containsKey(str)) {
                      l1 = (long)i;
                      a.b(0, "native_data_resolve_"+str, b.j(hashMap2.get(str).longValue()), l1);
                      a.d(0, "native_data_resolve_"+str, b.j(hashMap3.get(str).longValue()), l1);
                   }
                   if (hashMap4.containsKey(str) && hashMap5.containsKey(str)) {
                      l1 = (long)i;
                      a.b(0, "js_data_"+str, b.j(hashMap4.get(str).longValue()), l1);
                      a.d(0, "js_data_"+str, b.j(hashMap5.get(str).longValue()), l1);
                   }
                   if (hashMap6.containsKey(str) && hashMap7.containsKey(str)) {
                      l1 = (long)i;
                      a.b(0, "native_pre_data_"+str, b.j(hashMap6.get(str).longValue()), l1);
                      a.d(0, "native_pre_data_"+str, b.j(hashMap7.get(str).longValue()), l1);
                   }
                   i = i + 1;
                   hashMap = hashMap8;
                }
             }
             uob1.uimanager_createview_count = b.W0;
             uob1.uimanager_updateview_count = b.X0;
             uob1.uimanager_setchildren_count = b.Y0;
             uob1.uimanager_managechildren_count = b.Z0;
             uob1.uimanager_batchdidcomplete_count = b.a1;
             j.b.c("krn_sdk_launch_time", uob1);
             return;
          }
       }
       d.i("timeline has reported, $mKrnContext");
       return;
    }
    public final void o(KrnLogCommonParams p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBundleLoadInfo.class, "64")) {
          return;
       }
       if (this.f0.get()) {
          return;
       }
       boolean b = true;
       this.f0.set(b);
       double d = Math.random();
       Number number = PatchProxy.apply(null, null, ExpConfigKt.class, "27");
       if (number == patchProxyRe) {
          number = ExpConfigKt.z.getValue();
       }
       if (d - number.doubleValue() >= 0) {
          return;
       }else {
          KrnBundleLoadInfo td0 = this.d0;
          if (td0.startRunMemory != null && td0.endRunMemory != null) {
             Object obj = PatchProxy.applyOneRefs(td0, null, k.class, "2");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                a.p(td0, "$this$isValid");
                j entryMemory = td0.entryMemory;
                b1 = (entryMemory != null)? entryMemory.c(): false;
                if (b1) {
                   entryMemory = td0.initMemory;
                   b1 = (entryMemory != null)? entryMemory.c(): false;
                   if (b1) {
                      entryMemory = td0.startRunMemory;
                      b1 = (entryMemory != null)? entryMemory.c(): false;
                      if (b1) {
                         entryMemory = td0.endRunMemory;
                         b1 = (entryMemory != null)? entryMemory.c(): false;
                         if (b1) {
                            entryMemory = td0.contentAppearedMemory;
                            b1 = (entryMemory != null)? entryMemory.c(): true;
                            if (b1) {
                               entryMemory = td0.onPauseMemory;
                               b1 = (entryMemory != null)? entryMemory.c(): true;
                               if (b1) {
                               label_00ac :
                                  b1 = b;
                               }
                            }
                         }
                      }
                   }
                }
             label_00ab :
                b = 0;
                goto label_00ac ;
             }
             if (!b1) {
                return;
             }else if(p0 != null){
                this.d0.krnLogCommonParams = p0;
             }
             if (MemoryMonitor.m.e()) {
                d.e("MemoryEventSession: "+new Gson().q(this.d0));
             }
             j.b.c("krn_memory_stats", this.d0);
          }
          return;
       }
    }
    public void p(boolean p0){
       this.p0 = p0;
    }
    public void q(boolean p0){
       this.q0 = p0;
    }
    public void r(int p0){
       long l = this;
       KrnBundleLoadInfo krnBundleLoa = KrnBundleLoadInfo.class;
       if (PatchProxy.isSupport(krnBundleLoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), l, krnBundleLoa, "51")) {
          return;
       }
       l.W = SystemClock.elapsedRealtime();
       l.X = System.currentTimeMillis();
       if (l.c != null) {
          a.d(0, "JsBundleStartToEndTime", a.e(), 4);
          a.b(0, "JsBundleEndToAppearedTime", a.e(), 4);
          a.d(0, "run_business_js", a.e(), 7);
       }
       if (this.t()) {
          MemoryMonitor.m.k(null, Integer.valueOf(p0), l.d0.bundleId, true, new h(l), MemoryEventTiming.RUN_JS_BUNDLE_END);
       }
       krnBundleLoa = l.b;
       if (krnBundleLoa == LoadingStateTrack$LoadType.PRE_BASIC_BUNDLE || (krnBundleLoa == LoadingStateTrack$LoadType.PRE_BUSINESS_BUNDLE && !this.l())) {
          this.m();
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, KrnBundleLoadInfo.class, "50")) {
          return;
       }
       this.U = SystemClock.elapsedRealtime();
       this.V = System.currentTimeMillis();
       if (this.c != null) {
          a.d(0, "BridgeInitToRunJsBundleTime", a.e(), 4);
          a.b(0, "JsBundleStartToEndTime", a.e(), 4);
          a.b(0, "run_business_js", a.e(), 7);
       }
       if (this.t()) {
          MemoryMonitor.m.k(null, null, this.d0.bundleId, true, new g(this), MemoryEventTiming.RUN_JS_BUNDLE_START);
       }
       return;
    }
    public final boolean t(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.apply(null, this, KrnBundleLoadInfo.class, "63");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, ExpConfigKt.class, "8");
       if (obj == patchProxyRe) {
          obj = ExpConfigKt.h.getValue();
       }
       boolean b = (obj.booleanValue() && !this.f0.get())? true: false;
       return b;
    }
    public final boolean u(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.apply(null, this, KrnBundleLoadInfo.class, "61");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, ExpConfigKt.class, "10");
       if (obj == patchProxyRe) {
          obj = ExpConfigKt.j.getValue();
       }
       return obj.booleanValue();
    }
}
