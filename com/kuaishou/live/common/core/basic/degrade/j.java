package com.kuaishou.live.common.core.basic.degrade.j;
import java.lang.Object;
import android.view.View;
import android.animation.ObjectAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import android.os.Build$VERSION;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import ok.x;
import com.google.gson.JsonElement;
import com.kwai.sdk.switchconfig.a;
import w51.a;
import o56.c;
import o56.a;
import xf6.l;
import android.view.animation.Animation;
import r91.d;
import java.lang.Runnable;
import android.animation.Animator;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import java.lang.Integer;
import java.util.Objects;
import crd.b;
import lnc.b9;
import brd.t;
import qq3.e;
import erd.g;

public class j	// class@000ea0
{

    public void j(){
       super();
    }
    public static ObjectAnimator a(View p0,float[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       if (LiveDegradeBiz.AlphaOverlappingRendering.shouldDegrade() && Build$VERSION.SDK_INT >= 24) {
          p0.forceHasOverlappingRendering(b);
       }
       if (LiveDegradeBiz.AlphaAnimation.shouldDegrade()) {
          if (p1 == null || !p1.length) {
             return ObjectAnimator.ofFloat(p0, View.ALPHA, p1);
          }else {
             float f = j.d(p1);
             float[] uofloatArray = new float[]{f,f};
             return ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray);
          }
       }else {
          return ObjectAnimator.ofFloat(p0, View.ALPHA, p1);
       }
    }
    public static PropertyValuesHolder b(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!LiveDegradeBiz.AlphaAnimation.shouldDegrade()) {
          return PropertyValuesHolder.ofFloat(View.ALPHA, p0);
       }
       if (!p0.length) {
          return PropertyValuesHolder.ofFloat(View.ALPHA, p0);
       }
       float f = j.d(p0);
       float[] uofloatArray = new float[]{f,f};
       return PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray);
    }
    public static String c(){
       JsonObject obj = PatchProxy.apply(null, null, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.H("isLowPhone", Boolean.valueOf(j.e()));
       obj.H("isUsePerSdk", LiveDegradeBiz.sIsUsePerfSdkSupplier.get());
       LiveDegradeBiz[] liveDegradeB = LiveDegradeBiz.values();
       int len = liveDegradeB.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = liveDegradeB[i];
          obj.G(oobject.mExperimentKey, oobject.getBizJson());
       }
       return obj.toString();
    }
    public static float d(float[] p0){
       return p0[(p0.length - 1)];
    }
    public static boolean e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, j.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!a.t().d("Live_Android_LowDdeviceList_0501", b)) {
          obj = PatchProxy.apply(null, null, a.class, "14");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(a.a().c() && l.c("live_degrade_force_mark_low_phone", b)){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1) {
          label_004d :
             return b;
          }
       }
       b = true;
       goto label_004d ;
    }
    public static void f(View p0,Animation p1,LiveDegradeBiz p2){
       p0.startAnimation(p1);
       if (p2.shouldDegrade()) {
          p0.post(new d(p1));
       }
       return;
    }
    public static void g(Animator p0,LiveDegradeBiz p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "2")) {
          return;
       }
       p0.start();
       if (p1.shouldDegrade()) {
          p0.end();
       }
       return;
    }
    public static void h(LivePkShimmerLayout p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, oj, "3")) {
          return;
       }
       if (LiveDegradeBiz.ShimmerAnimation.shouldDegrade()) {
          return;
       }
       p0.m(p1);
       return;
    }
    public static void i(LivePkShimmerLayout p0,int p1,TimeUnit p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, j.class, "4")) {
          return;
       }
       if (LiveDegradeBiz.ShimmerAnimation.shouldDegrade()) {
          return;
       }
       long l = (long)p1;
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(LivePkShimmerLayout.class) || (PatchProxy.applyVoidTwoRefs(Long.valueOf(l), p2, p0, LivePkShimmerLayout.class, "7") || (p0.l == null && p0.q == null))) {
          b9.a(p0.o);
          p0.o = t.interval(0, l, p2).subscribe(new e(p0));
       }
    label_005d :
       return;
    }
}
