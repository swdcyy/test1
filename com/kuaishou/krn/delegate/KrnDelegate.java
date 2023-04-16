package com.kuaishou.krn.delegate.KrnDelegate;
import mk0.f;
import ik0.i;
import nj0.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactMarker$MarkerListener;
import com.facebook.react.bridge.ReactMarker;
import ik0.m;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.delegate.c$b;
import com.kuaishou.krn.delegate.c;
import lj0.c;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.ref.WeakReference;
import android.app.Activity;
import ik0.g;
import zd.b;
import lj0.d;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.apm.MemoryMonitor;
import sj0.b;
import kotlin.jvm.internal.a;
import ji0.a;
import android.os.Handler;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.krn.apm.MemoryEventProducer;
import msd.l;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Runnable;
import java.lang.StringBuilder;
import ek0.d;
import zj0.x;
import java.lang.System;
import bk0.p;
import com.kuaishou.krn.log.model.a;
import zj0.u;
import com.facebook.react.a;
import com.kuaishou.krn.apm.fps.FpsMonitor;
import android.view.WindowManager;
import android.view.Display;
import com.kuaishou.krn.apm.fps.FpsMonitor$FpsType;
import com.facebook.react.bridge.ReactContext;
import android.os.SystemClock;
import android.os.Bundle;
import xj0.c;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.kuaishou.krn.delegate.KrnDelegate$a;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Throwable;
import com.kuaishou.krn.lifecycle.JSLifecycleManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import yj0.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.krn.delegate.KrnDelegate$KrnDefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import com.kuaishou.krn.event.a;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import oj0.b;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.facebook.react.uimanager.a;
import com.kuaishou.krn.log.model.KrnPageRenderParams;
import com.kuaishou.krn.log.model.KrnDurationModel;
import yd.e;
import gf.e;
import gf.b;
import ck0.e;
import com.kuaishou.krn.log.model.KrnPageRenderFmpParams$FmpParams;
import com.kuaishou.krn.log.model.KrnPageRenderFmpParams;
import com.kuaishou.krn.log.model.KrnPageRenderFmpParams$LcpParams;
import bk0.j;
import bk0.q;
import bk0.b;
import rj0.c;
import rj0.a;
import com.kuaishou.krn.model.KrnBundleLoadInfo$ReportType;
import com.facebook.react.bridge.ReactMarker$DirectionalMarkerListener;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.Enum;
import vd.d;
import com.kuaishou.krn.instance.JsFramework;
import tj0.a;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import fk0.j;
import fk0.i;
import com.kuaishou.krn.apm.MemoryEventTiming;
import com.facebook.react.uimanager.UIManagerModule;
import li0.a;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.e;
import gf.f;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import qrd.r0;
import android.graphics.Rect;
import trd.t0;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector;
import com.kwai.robust.PatchProxyResult;
import pi0.a;
import java.util.WeakHashMap;
import android.content.Context;
import java.lang.Number;
import com.kuaishou.krn.apm.wsd.model.KdsFrameworkConfig;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import ni0.c;
import ekd.s1;
import com.kuaishou.krn.delegate.BundleLoadMode;
import com.facebook.react.bridge.Callback;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt;
import com.kuaishou.krn.delegate.b;
import java.util.concurrent.Callable;
import brd.a0;
import brd.z;
import lrd.b;
import nj0.c;
import com.kuaishou.krn.delegate.a;
import erd.g;
import crd.b;
import kj0.f;
import kj0.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$State;
import bk0.m;
import qrd.p;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.krn.utils.KrnUnSupportAppVersionException;
import fk0.b;
import lk0.d;
import ik0.e;
import com.kuaishou.krn.c;
import kj0.l;
import lk0.e;

public abstract class KrnDelegate implements f, i	// class@000858
{
    public final m b;
    public final Activity c;
    public final LaunchModel d;
    public c e;
    public KrnReactRootView f;
    public e g;
    public Callback h;
    public final b i;
    public b j;
    public boolean k;
    public boolean l;
    public c m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public static final int r;

    static {
       a b = a.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoid(null, b, a.class, "1")) {
       }else {
          ReactMarker.addListener(a.a);
       }
    }
    public void KrnDelegate(m p0,LaunchModel p1,LoadingStateTrack p2,long p3,long p4){
       KrnDelegate krnDelegate = this;
       LaunchModel launchModel = p1;
       Object obj = p2;
       super();
       krnDelegate.j = null;
       krnDelegate.l = true;
       krnDelegate.m = c.a().a();
       krnDelegate.n = 0;
       krnDelegate.o = 0;
       krnDelegate.d = launchModel;
       c uoc = new c(p0, p1, p2, p3, p4);
       krnDelegate.e = v13;
       Objects.requireNonNull(p2);
       if (!PatchProxy.applyVoidOneRefs(v13, obj, LoadingStateTrack.class, "44")) {
          LoadingStateTrack k = obj.k;
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoidOneRefs(v13, k, KrnBundleLoadInfo.class, "59")) {
             k.e = new WeakReference(v13);
          }
          obj.h = new WeakReference(v13);
       }
       m om = p0;
       krnDelegate.b = om;
       krnDelegate.c = p0.getActivity();
       this.l();
       krnDelegate.i = new b();
       d.b.e(krnDelegate.e);
       if (c.a().N()) {
          MemoryMonitor m = MemoryMonitor.m;
          b uob = this.e().i();
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoidTwoRefs(uob, null, m, MemoryMonitor.class, "10")) {
             a.p(uob, "krnReactInstance");
             if (m.c()) {
                if (!m.d()) {
                   m.b();
                }
                if (!m.i().containsKey(Integer.valueOf(uob.hashCode()))) {
                   m.i().put(Integer.valueOf(uob.hashCode()), new MemoryEventProducer(uob, null));
                   if (m.e != null) {
                      long l = 0;
                      if (PatchProxy.isSupport(a.class)) {
                         Boolean tRUE = Boolean.TRUE;
                         Boolean uBoolean = tRUE;
                         Boolean uBoolean1 = tRUE;
                         if (!PatchProxy.applyVoidThreeRefs(uBoolean, uBoolean1, Long.valueOf(l), m, a.class, "3")) {
                         }
                      }else {
                      }
                   }
                }
             }
          }
       }
    label_010d :
       d.e("RN启动参数为："+launchModel);
       return;
    }
    public void Ja(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate.class, "12")) {
          return;
       }
       this.k("destroy");
       return;
    }
    public void a(c p0,long p1){
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.isSupport(krnDelegate) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, krnDelegate, "38")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.k().d(System.currentTimeMillis());
       p0.h().h();
       p0.k().b(p0.h().d());
       if (p0.y()) {
          p0.o().k();
       }
       LoadingStateTrack loadingState = p0.o();
       KrnDelegate tc = this.c;
       Objects.requireNonNull(loadingState);
       if (PatchProxy.applyVoidTwoRefs(tc, p0, loadingState, LoadingStateTrack.class, "49") || (loadingState.o() && (p0.r() != null && p0.r().t()))) {
          FpsMonitor c = FpsMonitor.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(tc, c, FpsMonitor.class, "1") && tc != null) {
             WindowManager windowManage = tc.getWindowManager();
             if (windowManage != null) {
                Display defaultDispl = windowManage.getDefaultDisplay();
                if (defaultDispl != null) {
                   FpsMonitor.b = (int)defaultDispl.getRefreshRate();
                }
             }
          }
          FpsMonitor uFpsMonitor = c;
          uFpsMonitor.b(p0.b(), p0.f(), String.valueOf(loadingState.hashCode()), FpsMonitor$FpsType.PAGE_ACTIVITY, p0.r().n());
          uFpsMonitor.b(p0.b(), p0.f(), String.valueOf(loadingState.hashCode()), FpsMonitor$FpsType.SCROLL, p0.r().n());
       }
    label_00d6 :
       d.e("##### onReactRootViewDisplay ##### "+p0+" JS渲染耗时："+p1);
       if (p0.u() != null) {
          d.e("##### onReactRootViewDisplay 耗时时间："+(SystemClock.elapsedRealtime() - p0.u().longValue()));
       }
       return;
    }
    public final void b(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDelegate.class, "27")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.putInt("BundleVersionCode", this.e.e());
       p0.putString("JsExecutor", c.a(this.e));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate.class, "13")) {
          return;
       }
       KrnDelegate tf = this.f;
       if (tf == null) {
          return;
       }
       ViewParent parent = tf.getParent();
       if (parent != null) {
          parent.removeView(tf);
       }
       tf.q();
       tf.m();
       UiThreadUtil.runOnUiThread(new KrnDelegate$a(tf.getRootViewTag()), 3000);
       return;
    }
    public int d(){
       return this.n;
    }
    public void df(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate.class, "9")) {
          return;
       }
       this.k("pause");
       this.j("hide");
       return;
    }
    public c e(){
       return this.e;
    }
    public m f(){
       return this.b;
    }
    public final KrnReactRootView g(){
       return this.f;
    }
    public abstract Object h(String p0);
    public void i(boolean p0){
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.isSupport(krnDelegate) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, krnDelegate, "24")) {
          return;
       }
       String str = this.e.f();
       if (!PatchProxy.isSupport(krnDelegate) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(p0), this, krnDelegate, "25")) {
          d.e("loadApp with appKey "+str+", "+this.e());
          krnDelegate = this.f;
          if (krnDelegate == null) {
             d.e("ReactRootView is null");
          }else {
             krnDelegate.setKrnDelegate(this);
             this.f.setBundleId(this.e.b());
             this.f.setReactRootViewDisplayCallback(this);
             Bundle uBundle = new Bundle(this.d.g());
             if (p0) {
                uBundle.putBoolean("REACT_NATIVE_DELAY_RUN_APPLICATION", true);
             }
             this.b(uBundle);
             this.f.l(this.e.r(), str, uBundle);
          }
       }
       return;
    }
    public void j(String p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDelegate.class, "39")) {
          return;
       }
       if (this.l == null) {
          return;
       }
       KrnReactRootView krnReactRoot = this.g();
       c uoc = this.e();
       if (!PatchProxy.applyVoidThreeRefs(krnReactRoot, uoc, p0, null, JSLifecycleManager.class, "4")) {
          a.p(p0, "state");
          if (krnReactRoot != null && (krnReactRoot.getRootViewTag() > 0 && uoc != null)) {
             WritableMap writableMap = Arguments.createMap();
             writableMap.putInt("rootTag", krnReactRoot.getRootViewTag());
             writableMap.putString("appState", p0);
             writableMap.putString("bundleId", uoc.b());
             writableMap.putString("componentName", uoc.f());
             NativeToJsKt.c(krnReactRoot, "krnAppStateDidChange", writableMap);
             int i = p0.hashCode();
             if (i != 0x30dd42) {
                if (i != 0x35dafd || (p0.equals("show") && !PatchProxy.applyVoidTwoRefs(krnReactRoot, uoc, null, JSLifecycleManager.class, "6"))) {
                   a.p(krnReactRoot, "rootView");
                   a.p(uoc, "context");
                   iterator = JSLifecycleManager.b.a().iterator();
                   while (iterator.hasNext()) {
                      iterator.next().d(krnReactRoot, uoc);
                   }
                }
             }else if(!p0.equals("hide") || PatchProxy.applyVoidTwoRefs(krnReactRoot, uoc, null, JSLifecycleManager.class, "7")){
                a.p(krnReactRoot, "rootView");
                a.p(uoc, "context");
                iterator = JSLifecycleManager.b.a().iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(krnReactRoot, uoc);
                }
             }
          }
       }
       return;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDelegate.class, "14")) {
          return;
       }
       if (this.l == null) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("app_state", p0);
       NativeToJsKt.c(this.g(), "appStateDidChange", writableMap);
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate.class, "1")) {
          return;
       }
       KrnDelegate tc = this.c;
       KrnDelegate$KrnDefaultLifecycleObserver krnDefaultLi = new KrnDelegate$KrnDefaultLifecycleObserver(tc, this.e.r(), this.e.m());
       tc.getLifecycle().addObserver(krnDefaultLi);
       return;
    }
    public void lg(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate.class, "7")) {
          return;
       }
       this.k("resume");
       this.j("show");
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, KrnDelegate.class, "2")) {
          return;
       }
       d.e("onCreate: "+this.e());
       KrnInternalManager.c.b().b(this.e.i());
       a uoa = a.b();
       KrnDelegate td = this.d;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(td, uoa, a.class, "4")) {
          uoa = uoa.b;
          if (uoa != null) {
             uoa.b(new KrnLifeCycleEvent(KrnLifeCycleEvent$EventType.Create, td));
          }
       }
       return;
    }
    public void n(){
       a uoa;
       a uoa2;
       KrnDelegate d;
       KrnPageRenderParams krnPageRende1;
       int i1;
       KrnPageRenderFmpParams$FmpParams uFmpParams2;
       KrnDelegate krnDelegate = this;
       KrnDelegate krnDelegate1 = KrnDelegate.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, krnDelegate, krnDelegate1, "11")) {
          return;
       }
       d.e("onDestroy: "+this.e());
       this.Ja();
       LoadingStateTrack loadingState = 1;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, krnDelegate, krnDelegate1, "5") && ExpConfigKt.c()) {
          krnDelegate1 = krnDelegate.f;
          if (krnDelegate1 != null && krnDelegate1.getLcpDetector() != null) {
             boolean b2 = false;
             long longx = (krnDelegate.d.g() != null)? krnDelegate.d.g().getLong("onCreateTimestamp"): b2;
             uoa2 = krnDelegate.f.getLcpDetector().d;
             a e = krnDelegate.f.getLcpDetector().e;
             long firstOnAttac = krnDelegate.f.getFirstOnAttachTime();
             a uoa3 = krnDelegate.e.h();
             KrnDelegate e1 = krnDelegate.e;
             Objects.requireNonNull(uoa3);
             a uoa4 = a.class;
             if (PatchProxy.isSupport(uoa4)) {
                Object[] objArray1 = new Object[]{e1,uoa2,e,Long.valueOf(firstOnAttac),Long.valueOf(longx)};
                if (!PatchProxy.applyVoid(objArray1, uoa3, uoa4, "8")) {
                label_00ab :
                   if (uoa3.c() - b2 || uoa3.d() - b2) {
                      uoa = uoa3.i;
                      if (uoa == null) {
                         KrnDurationModel krnDurationM = objArray1;
                         KrnDurationModel krnDurationM1 = new KrnDurationModel(Long.valueOf(uoa3.h));
                         KrnDurationModel krnDurationM2 = objArray;
                         KrnDurationModel krnDurationM3 = new KrnDurationModel(Long.valueOf(uoa3.b()));
                         KrnDurationModel krnDurationM4 = krnDurationM3;
                         krnDurationM3 = new KrnDurationModel(Long.valueOf(b2));
                         KrnDurationModel krnDurationM5 = krnDurationM3;
                         krnDurationM3 = new KrnDurationModel(Long.valueOf(uoa3.d()));
                         KrnDurationModel krnDurationM6 = krnDurationM3;
                         krnDurationM3 = new KrnDurationModel(Long.valueOf(b2));
                         KrnDurationModel krnDurationM7 = krnDurationM3;
                         krnDurationM3 = new KrnDurationModel(Long.valueOf(b2));
                         KrnPageRenderParams krnPageRende = new KrnPageRenderParams(e1, null, krnDurationM, krnDurationM2, krnDurationM4, krnDurationM5, krnDurationM6, krnDurationM7, null, e.O, uoa3.k, uoa3.l, uoa3.m, uoa3.n, uoa3.o, uoa3.p, uoa3.q, uoa3.r, uoa3.s, uoa3.t, uoa3.u);
                         krnPageRende1 = uoa;
                         i1 = 1;
                      }else {
                         krnPageRende1 = uoa;
                         i1 = 0;
                      }
                      if (!uoa2.hasValue()) {
                         i1 = i1 | 0x02;
                      }
                      if (!e.hasValue()) {
                         i1 = i1 | 0x04;
                      }
                      int i2 = i1;
                      uoa = uoa3.j;
                      if (uoa != null) {
                         e b3 = uoa.b;
                         KrnPageRenderFmpParams$FmpParams uFmpParams = (b3 - b2 && uoa.c - b2)? 1: null;
                         if (uFmpParams) {
                            KrnPageRenderFmpParams$FmpParams uFmpParams1 = new KrnPageRenderFmpParams$FmpParams((b3 - longx), 0, (uoa.c - longx), 0);
                            uFmpParams2 = uFmpParams;
                         label_0196 :
                            KrnPageRenderFmpParams krnPageRende2 = uoa;
                            KrnPageRenderFmpParams$LcpParams lcpParams = new KrnPageRenderFmpParams$LcpParams((uoa2.f - longx), uoa2.g, (uoa2.h - longx), uoa2.i, (uoa2.j - longx), (uoa2.k - longx), uoa2.l);
                            KrnPageRenderFmpParams$FmpParams uFmpParams3 = new KrnPageRenderFmpParams$FmpParams((e.f - longx), e.g, (e.i - longx), e.j);
                            KrnPageRenderFmpParams krnPageRende3 = new KrnPageRenderFmpParams(krnPageRende1, v48, uFmpParams2, v50, (firstOnAttac - longx), i2);
                            j.b.b("krn_page_load_time_fmp", krnPageRende2);
                            krnDelegate = this;
                         }
                      }
                      KrnPageRenderFmpParams$FmpParams uFmpParams4 = new KrnPageRenderFmpParams$FmpParams(0, 0, 0, 0);
                      uFmpParams2 = uoa;
                      goto label_0196 ;
                   }
                }
             }else {
                goto label_00ab ;
             }
             krnDelegate.e.k().a(new q(uoa2), new b(e), firstOnAttac);
          }
       }
       this.c();
       LoadingStateTrack loadingState1 = krnDelegate.e.o();
       Objects.requireNonNull(loadingState1);
       if (!PatchProxy.applyVoid(null, loadingState1, LoadingStateTrack.class, "48")) {
          if (loadingState1.f()) {
             loadingState1.p();
             loadingState1.k.n(KrnBundleLoadInfo$ReportType.REPORT_ON_PAGE_EXIT);
          }
          if (loadingState1.o()) {
             FpsMonitor c = FpsMonitor.c;
             FpsMonitor$FpsType pAGE_ACTIVIT = FpsMonitor$FpsType.PAGE_ACTIVITY;
             c.f(String.valueOf(loadingState1.hashCode()), pAGE_ACTIVIT);
             c.c(String.valueOf(loadingState1.hashCode()), pAGE_ACTIVIT);
             c.c(String.valueOf(loadingState1.hashCode()), FpsMonitor$FpsType.SCROLL);
          }
          ReactMarker.removeDirectionalMarkerListener(loadingState1);
          c uoc = loadingState1.h.get();
          j b1 = j.b;
          String str = (uoc == null)? "null": uoc.b();
          b1.b("kds_code_cache_size", d.f("bundleId", str, "maxCodeCacheSize", Integer.valueOf(MetaDiskCache.m), "loadType", Integer.valueOf(loadingState1.i.ordinal())));
       }
       uoa = KrnInternalManager.c.b();
       b uob = krnDelegate.e.i();
       boolean b = krnDelegate.e.B();
       a uoa1 = a.class;
       _monitor_enter(uoa);
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(uob, Boolean.valueOf(b), uoa, uoa1, "9")) {
          _monitor_exit(uoa);
       }else {
          a.p(uob, "reactInstance");
          b f = uob.f;
          if (f > null) {
             uob.f = f - 1;
          }
          if (uob.f() <= 0) {
             uoa.i(uob.e());
          }
          uoa.f(uob.g(), "exit krn page: "+uob);
          b = (!b || uoa.e(uob))? true: false;
          uoa2 = uoa.a.get(uob.g());
          if (uoa2 != null) {
             uoa2.b(b);
          }
          uoa.k("exitKrnPage");
          _monitor_exit(uoa);
       }
       uoa2 = a.b();
       d = krnDelegate.d;
       Objects.requireNonNull(uoa2);
       if (!PatchProxy.applyVoidOneRefs(d, uoa2, a.class, "9")) {
          uoa2 = uoa2.b;
          if (uoa2 != null) {
             uoa2.a(new KrnLifeCycleEvent(KrnLifeCycleEvent$EventType.Destroy, d));
          }
       }
       krnDelegate.e.k().H();
       return;
    }
    public void o(){
       KrnDelegate d;
       Boolean uBoolean;
       int id;
       c uoc;
       String str2;
       a b3;
       String str3;
       Context context;
       a obj;
       c uoc1;
       String obj1;
       String str4;
       KdsFrameworkConfig obj2;
       boolean b4;
       long l;
       a uoa2;
       long l1;
       long l2;
       KdsFrameworkConfig kdsFramework;
       long l3;
       KdsFrameworkConfig kdsFramework1;
       KdsFrameworkConfig kdsFramework2;
       String str5;
       ArrayList uArrayList;
       KdsFrameworkConfig kdsFramework3;
       Resources resources;
       CatalystInstance uCatalystIns;
       boolean b = this;
       Object[] objArray = null;
       String str = "8";
       if (PatchProxy.applyVoid(objArray, b, KrnDelegate.class, str)) {
          return;
       }
       boolean b1 = false;
       b.k = b1;
       d.e("onPause: "+this.e());
       this.df();
       b.e.k().m();
       LoadingStateTrack loadingState = b.e.o();
       KrnLogCommonParams krnLogCommon = new KrnLogCommonParams(b.e, objArray);
       Objects.requireNonNull(loadingState);
       int i = 2;
       String str1 = "1";
       boolean b2 = true;
       if (!PatchProxy.applyVoidOneRefs(krnLogCommon, loadingState, LoadingStateTrack.class, "47")) {
          if (loadingState.f()) {
             loadingState.p();
          }
          LoadingStateTrack obj3 = loadingState.k;
          Objects.requireNonNull(obj3);
          if (!PatchProxy.applyVoidOneRefs(krnLogCommon, obj3, KrnBundleLoadInfo.class, "60")) {
             if (obj3.t()) {
                MemoryMonitor.m.k(obj3.e.get().i(), null, obj3.d0.bundleId, false, new i(obj3, krnLogCommon), MemoryEventTiming.PAUSE);
             }
             if (obj3.l()) {
                obj3.n(KrnBundleLoadInfo$ReportType.REPORT_ON_BACKEND);
             }
             if (obj3.u()) {
                KrnBundleLoadInfo e0 = obj3.e0;
                c uoc2 = obj3.e.get();
                Objects.requireNonNull(e0);
                UIManagerModule uIManagerMod = UIManagerModule.class;
                if (!PatchProxy.applyVoidOneRefs(uoc2, e0, a.class, str1)) {
                   if (uoc2 != null) {
                      b uob = uoc2.i();
                      if (uob != null) {
                         uCatalystIns = uob.b();
                      label_00cf :
                         if (uCatalystIns != null && uCatalystIns.hasNativeModule(uIManagerMod)) {
                            uIManagerMod = uCatalystIns.getNativeModule(uIManagerMod);
                            if (uIManagerMod != null) {
                               f uIImplementa = uIManagerMod.getUIImplementation();
                               if (uIImplementa != null) {
                                  e uoe = uIImplementa.j();
                                  if (uoe != null) {
                                     uoe = uoe.b;
                                     if (uoe != null) {
                                        f uof = (uoe.b != null)? 1: null;
                                        if (uof && (uoe.a > 40 && !e0.a.get())) {
                                           Pair[] pairArray = new Pair[]{r0.a("BundleId", uoc2.b()),r0.a("ComponentName", uoc2.f()),r0.a("BundleVersion", uoc2.d()),r0.a("MaxLayoutCount", Integer.valueOf(uoe.a)),r0.a("MaxLayoutTag", Integer.valueOf(uoe.b)),r0.a("MaxLayoutArea", uoe.d.toShortString()),r0.a("MaxClassName", uoe.c)};
                                           j.b.b("kds_layout_jank", t0.W(pairArray));
                                           e0.a.set(b2);
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                   uCatalystIns = objArray;
                   goto label_00cf ;
                }
             }
          }
       label_0175 :
          if (loadingState.o()) {
             FpsMonitor c = FpsMonitor.c;
             c.f(String.valueOf(loadingState.hashCode()), FpsMonitor$FpsType.PAGE_ACTIVITY);
             c.f(String.valueOf(loadingState.hashCode()), FpsMonitor$FpsType.SCROLL);
          }
       }
       b.e.i().p(60);
       a uoa = a.b();
       d = b.d;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(d, uoa, a.class, str)) {
          a b5 = uoa.b;
          if (b5 != null) {
             b5.f(new KrnLifeCycleEvent(KrnLifeCycleEvent$EventType.Leave, d));
          }
       }
       if (ExpConfigKt.h()) {
          WhiteScreenDetector i1 = WhiteScreenDetector.i;
          KrnDelegate f = b.f;
          Objects.requireNonNull(i1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa1 = a.class;
          WhiteScreenDetector whiteScreenD = WhiteScreenDetector.class;
          if (PatchProxy.isSupport(whiteScreenD)) {
             Boolean fALSE = Boolean.FALSE;
             if (!PatchProxy.applyVoidThreeRefs(f, fALSE, fALSE, i1, WhiteScreenDetector.class, "4")) {
             }
          }else {
          }
       }
    label_0408 :
       return;
    }
    public void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnDelegate.class, "6")) {
          return;
       }
       boolean b = true;
       this.k = b;
       if (this.q != null && this.p == null) {
          this.p = b;
          d.e("startLoadBundle in onResume");
          this.w(objArray);
       }
       d.e("onResume: "+this.e());
       this.e.k().J();
       KrnDelegate th = this.h;
       if (th != null) {
          Object[] objArray1 = new Object[0];
          th.invoke(objArray1);
          this.h = objArray;
       }
       this.lg();
       d.b.e(this.e);
       this.e.i().q();
       LoadingStateTrack loadingState = this.e.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "45") && loadingState.o()) {
          FpsMonitor.c.e(String.valueOf(loadingState.hashCode()), FpsMonitor$FpsType.PAGE_ACTIVITY);
       }
       a uoa = a.b();
       KrnDelegate td = this.d;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(td, uoa, a.class, "5")) {
          uoa = uoa.b;
          if (uoa != null) {
             uoa.c(new KrnLifeCycleEvent(KrnLifeCycleEvent$EventType.Enter, td));
          }
       }
       return;
    }
    public void q(KrnReactRootView p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, krnDelegate, "3")) {
          return;
       }
       d.e("onViewCreated: "+this.e());
       this.f = p0;
       p0.setUniqueId(this.e.r().r());
       boolean b = false;
       if (!KrnReactInstanceExtKt.c(this.e.i())) {
          b uob = this.e.i();
          Object obj = PatchProxy.applyOneRefs(uob, null, KrnReactInstanceExtKt.class, "5");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             a.p(uob, "$this$isPreloadInactive");
             if (uob.k()) {
                ReactContext reactContext = uob.i().n();
                if (reactContext == null || reactContext.hasActiveCatalystInstance() != true) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (!b1) {
          label_0087 :
             if (!PatchProxy.applyVoid(null, this, krnDelegate, "4")) {
                a0.y(b.b).T(b.c()).R(new c(this), a.b);
             }
             b1 = PatchProxy.apply(null, null, ExpConfigKt.class, "61");
             if (b1 != patchProxyRe) {
                b1 = b1.booleanValue();
             }else {
                d uod = KrnInternalManager.c.a().c();
                if (uod != null) {
                   b = uod.getBoolean("KdsFixReCreateLoadBundleCrash", b);
                }
                b1 = b;
             }
             this.q = b1;
             if (b1) {
                d.e("fixReCreateLoadBundleCrash in onViewCreated");
                KrnDelegate tc = this.c;
                if (tc instanceof LifecycleOwner && tc.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED) {
                   this.p = true;
                   d.e("startLoadBundle in onViewCreated");
                   this.w(null);
                }
             }else {
                this.w(null);
             }
             return;
          }
       }
       this.e.h().g(SystemClock.elapsedRealtime());
       goto label_0087 ;
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnDelegate.class, "42")) {
          return;
       }
       d.e("resetReactInstance");
       KrnDelegate te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, c.class, "11")) {
          te.a();
          te.j().b(te.i());
          te.i().q();
       }
       this.l();
       return;
    }
    public void s(BundleLoadMode p0,boolean p1){
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.isSupport(krnDelegate) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, krnDelegate, "36")) {
          return;
       }
       d.e("retry: "+this.e());
       if (this.e.k() instanceof p) {
          boolean b = false;
          this.e.k().e = b;
          if (p1) {
             p1.c = b;
             this.o = this.o + 1;
          }
       }
       if (!PatchProxy.applyVoid(null, this, krnDelegate, "37")) {
          Boolean uBoolean = PatchProxy.apply(null, null, ExpConfigKt.class, "42");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = ExpConfigKt.O.getValue();
          }
          if (uBoolean.booleanValue()) {
             FrameLayout parent = this.f.getParent();
             this.c();
             KrnReactRootView krnReactRoot = new KrnReactRootView(parent.getContext());
             krnReactRoot.setLayoutParams(this.f.getLayoutParams());
             krnReactRoot.setId(R.id.krn_content_view);
             krnReactRoot.setVisibility(8);
             parent.addView(krnReactRoot, parent.indexOfChild(this.f));
             this.f = krnReactRoot;
             krnReactRoot.setUniqueId(this.e.r().r());
          }
       }
       a uoa = this.e.h();
       uoa.b = -1;
       uoa.d = -1;
       uoa.e = -1;
       uoa.i = null;
       uoa.k = -1;
       uoa.l = -1;
       uoa.m = -1;
       uoa.n = -1;
       uoa.o = -1;
       uoa.p = -1;
       uoa.q = -1;
       uoa.r = -1;
       uoa.s = -1;
       uoa.t = -1;
       uoa.u = -1;
       this.w(p0);
       return;
    }
    public void t(c p0){
       this.m = p0;
    }
    public void u(boolean p0){
       this.l = p0;
    }
    public void v(Throwable p0){
       c uoc;
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, krnDelegate, "17")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, krnDelegate, "16")) {
          this.b.x();
       }
       if (p0 != null && !p0 instanceof KrnUnSupportAppVersionException) {
          this.e.k().e(System.currentTimeMillis(), p0);
       }
       int i = 0;
       if (this.c != null && this.d != null) {
          krnDelegate = this.e;
          KrnDelegate tj = this.j;
          if (tj != null) {
             objArray = tj.a();
          }
          m obj = PatchProxy.applyThreeRefs(krnDelegate, objArray, p0, null, d.class, "1");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else {
             a.p(p0, "error");
             if (krnDelegate != null) {
                obj = krnDelegate.l();
                KrnLogCommonParams krnLogCommon = 1;
                if (obj != null) {
                   e degradeHandl = obj.getDegradeHandler();
                   if (degradeHandl != null) {
                      m om = krnDelegate.l();
                      a.m(om);
                      if (degradeHandl.a(om, krnDelegate.m(), objArray) == krnLogCommon) {
                         uoc = 1;
                      label_0086 :
                         if (!uoc) {
                            uoc = c.b();
                            a.o(uoc, "KrnManager.get\(\)");
                            uoc = uoc.g().R(krnDelegate.l(), krnDelegate.m(), objArray);
                         }
                         if (uoc) {
                            if (objArray == null || !objArray.length()) {
                               i = 1;
                            }
                            if (!i) {
                               String str = (p0 instanceof KrnUnSupportAppVersionException)? "KRN_PAGE_INVALID_CLIENT_DEGRADE": "KRN_PAGE_EXCEPTION_DEGRADE";
                               krnLogCommon = new KrnLogCommonParams(krnDelegate, e.b(p0));
                               if (!PatchProxy.applyVoidOneRefs(objArray, krnLogCommon, KrnLogCommonParams.class, "3")) {
                                  a.p(objArray, "url");
                                  krnLogCommon.mDegradeUrl = objArray;
                               }
                               j.b.b(str, krnLogCommon);
                            }
                         }
                         i = uoc;
                      }
                   }
                }
                uoc = null;
                goto label_0086 ;
             }
          }
       }
    label_00d8 :
       if (i == null) {
          if (this.d.q()) {
             return;
          }else {
             this.b.Gd(p0);
          }
       }
       return;
    }
    public abstract void w(BundleLoadMode p0);
    public void x(Bundle p0){
       boolean b;
       KrnDelegate krnDelegate = KrnDelegate.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, krnDelegate, "18")) {
          return;
       }
       this.d.t(p0);
       KrnReactRootView krnReactRoot = this.g();
       if (krnReactRoot != null) {
          CatalystInstance obj = PatchProxy.apply(null, this, krnDelegate, "19");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.e.i().b();
             b = (obj != null && !obj.isDestroyed())? true: false;
          }
          if (b) {
             krnReactRoot.setAppProperties(this.d.g());
          }
       }
       return;
    }
}
