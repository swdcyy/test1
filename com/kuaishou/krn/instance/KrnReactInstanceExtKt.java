package com.kuaishou.krn.instance.KrnReactInstanceExtKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference0;
import vsd.k;
import nsd.m0;
import com.kuaishou.krn.instance.JsFramework;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.instance.JsExecutorConfig;
import sj0.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.utils.Weak;
import ak0.c;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$createDefaultReactInstance$jsBundleLoader$1;
import msd.l;
import com.kuaishou.krn.c;
import android.os.Bundle;
import com.kuaishou.krn.KrnInternalManager;
import android.os.SystemClock;
import android.content.Context;
import java.util.Objects;
import android.app.Application;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.instance.KrnReactInstanceBuilder;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import pj0.a;
import sj0.c;
import rd.z;
import com.facebook.react.common.LifecycleState;
import wj0.c;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.uimanager.g;
import ve.d0;
import qrd.p;
import ve.a;
import rd.c0;
import java.util.List;
import java.util.Collection;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import com.facebook.react.bridge.ReactMarker$DirectionalMarkerListener;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import com.kuaishou.krn.instance.KrnReactInstanceState;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import brd.z;
import lrd.b;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1;
import crd.b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import ze.v;
import com.facebook.react.ReactRootView;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.kuaishou.krn.delegate.KrnDelegate;

public final class KrnReactInstanceExtKt	// class@0008c9
{
    public static final n[] a;

    static {
       n[] onArray = new n[]{m0.i(new MutablePropertyReference0Impl(KrnReactInstanceExtKt.class, "reactInstanceWeakReference", "<v#0>", 1))};
       KrnReactInstanceExtKt.a = onArray;
    }
    public static final b a(JsFramework p0,String p1,LoadingStateTrack p2,boolean p3,JsExecutorConfig p4,int p5){
       b obj;
       boolean b;
       boolean b1;
       a uoa;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       int i = p3;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KrnReactInstanceExtKt krnReactInst = KrnReactInstanceExtKt.class;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 6;
       int i6 = 1;
       int i7 = 0;
       LoadingStateTrack$LoadType loadType = null;
       if (PatchProxy.isSupport(krnReactInst)) {
          Object[] objArray = new Object[i5];
          objArray[i7] = oobject;
          objArray[i6] = oobject1;
          objArray[i4] = oobject2;
          objArray[i3] = Boolean.valueOf(p3);
          objArray[i2] = oobject3;
          objArray[i1] = Integer.valueOf(p5);
          obj = PatchProxy.apply(objArray, loadType, krnReactInst, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(oobject, "jsFramework");
       a.p(oobject1, "id");
       a.p(oobject3, "executorConfig");
       obj = new b(oobject, oobject1);
       Weak weak = new Weak();
       object oobject4 = KrnReactInstanceExtKt.a[i7];
       weak.b(loadType, oobject4, obj);
       c uoc = new c(oobject, oobject2, new KrnReactInstanceExtKt$createDefaultReactInstance$jsBundleLoader$1(weak, oobject4));
       c uoc1 = c.b();
       a.o(uoc1, "KrnManager.get\(\)");
       if (uoc1.j()) {
          uoc1 = c.b();
          a.o(uoc1, "KrnManager.get\(\)");
          b = uoc1.k();
       }else {
          b = KrnInternalManager.c(oobject1, loadType);
       }
       long l = SystemClock.elapsedRealtime();
       c uoc2 = c.b();
       a.o(uoc2, "KrnManager.get\(\)");
       Context uContext = uoc2.d();
       Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.app.Application");
       if (PatchProxy.isSupport(krnReactInst)) {
          Object obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(p3), oobject1, loadType, krnReactInst, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!i || !(a.g(oobject1, "core") ^ i6)){
             c uoc3 = c.b();
             a.o(uoc3, "KrnManager.get\(\)");
             if (!uoc3.k() || !c.a().g0()) {
                b1 = false;
             }
          }
          b1 = true;
       }else {
          goto label_00b9 ;
       }
       _monitor_enter(KrnReactInstanceBuilder.class);
       if (PatchProxy.isSupport(KrnReactInstanceBuilder.class)) {
          Object[] objArray1 = new Object[]{uContext,uoc,Boolean.valueOf(b),Boolean.valueOf(b1),Integer.valueOf(p5),oobject3,Boolean.valueOf(p3),oobject2};
          uoa = PatchProxy.apply(objArray1, loadType, KrnReactInstanceBuilder.class, "2");
          if (uoa != patchProxyRe) {
             _monitor_exit(KrnReactInstanceBuilder.class);
          label_01d9 :
             if (oobject2 != null) {
                loadType = p2.d();
             }
             if (loadType == LoadingStateTrack$LoadType.PRE_BASIC_BUNDLE) {
                oobject2.n(uoa.r());
                ReactMarker.addDirectionalMarkerListener(p2);
             }
             if (oobject2 != null) {
                LoadingStateTrack loadingState = LoadingStateTrack.class;
                if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p3), oobject2, loadingState, "7")) {
                   oobject2.k.g0 = (long)i;
                }
             }
             if (oobject2 != null) {
                oobject2.h(l);
             }
             if (!PatchProxy.applyVoidOneRefs(uoa, obj, b.class, "2")) {
                a.p(uoa, "<set-?>");
                obj.a = uoa;
             }
             obj.o(KrnReactInstanceState.LOADING);
             if (ExpConfigKt.a()) {
                if (!uoa.u()) {
                   UiThreadUtil.runOnUiThread(new KrnReactInstanceExtKt$a(uoa));
                }
             }else {
                uoa.i();
             }
             return obj;
          }
       }
       a.p(uContext, "application");
       a.p(uoc, "jsBundleLoader");
       a.p(oobject3, "executorConfig");
       ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
       uoa = new a();
       z oz = a.f();
       oz.c(uContext);
       oz.i(b);
       oz.f("index");
       oz.d(LifecycleState.BEFORE_CREATE);
       oz.g(new c(oobject3, oobject2));
       oz.e(uoc);
       oz.h(new g());
       oz.o = b1;
       oz.r = new c();
       KrnReactInstanceBuilder b2 = KrnReactInstanceBuilder.b;
       Objects.requireNonNull(b2);
       a uoa1 = PatchProxy.apply(loadType, b2, KrnReactInstanceBuilder.class, "1");
       if (uoa1 == patchProxyRe) {
          uoa1 = KrnReactInstanceBuilder.a.getValue();
       }
       z oz1 = oz.a(new d0(uoa1));
       oz1.k = oobject2;
       oz1.w = p5;
       List list = b2.a();
       if (PatchProxy.applyOneRefs(list, oz1, z.class, "4") != patchProxyRe) {
       }else {
          oz1.a.addAll(list);
       }
       if (!b) {
          oz1.j = uoa;
       }
       a uoa2 = oz1.b();
       a uoa3 = a.class;
       if (!PatchProxy.applyVoidOneRefs(uoa2, uoa, uoa3, "3") && !PatchProxy.applyVoidOneRefs(uoa2, uoa, uoa3, "2")) {
          uoa.a.b(uoa, a.b[0], uoa2);
       }
       ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
       a.o(uoa2, "reactInstanceManager");
       _monitor_exit(KrnReactInstanceBuilder.class);
       uoa = uoa2;
       goto label_01d9 ;
    }
    public static final void b(b p0){
       KrnReactInstanceExtKt krnReactInst = KrnReactInstanceExtKt.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, krnReactInst, "7")) {
          return;
       }
       a.p(p0, "$this$destroy");
       if (!PatchProxy.applyVoidOneRefs(p0, null, krnReactInst, "8")) {
          a.p(p0, "$this$startWatchingInstanceAsync");
          if (ExpConfigKt.f()) {
             b.e().d(new KrnReactInstanceExtKt$startWatchingInstanceAsync$1(p0, new WeakReference(p0.i())));
          }
       }
       ReactContext reactContext = p0.i().n();
       CatalystInstance catalystInst = (reactContext != null)? reactContext.getCatalystInstance(): null;
       if (!catalystInst instanceof CatalystInstanceImpl) {
          catalystInst = null;
       }
       if (catalystInst != null && catalystInst.hasNativeError() == true) {
          p0.o(KrnReactInstanceState.ERROR);
          if (!ExpConfigKt.r()) {
             Set set = p0.i().m();
             a.o(set, "reactInstanceManager.attachedReactRoots");
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                v ov = iterator.next();
                v ov1 = (!ov instanceof ReactRootView)? null: ov;
                if (ov1 != null) {
                   ov1.m();
                }
                if (!ov instanceof KrnReactRootView) {
                   ov = null;
                }
                if (ov != null) {
                   KrnDelegate krnDelegate = ov.getKrnDelegate();
                   if (krnDelegate != null) {
                      krnDelegate.r();
                   }
                }
             }
          }
       }
       p0.i().k();
       return;
    }
    public static final boolean c(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnReactInstanceExtKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isUnused");
       int i = 1;
       if (!(a.g(p0.e(), "core") ^ i) || (p0.k() || p0.f())) {
          i = false;
       }
       return i;
    }
}
