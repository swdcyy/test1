package com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import java.lang.Enum;
import com.kuaishou.live.common.core.basic.degrade.b;
import java.lang.String;
import ok.x;
import com.kuaishou.live.common.core.basic.degrade.c;
import com.kuaishou.live.common.core.basic.degrade.d;
import com.kuaishou.live.common.core.basic.degrade.e;
import com.kuaishou.live.common.core.basic.degrade.f;
import com.kuaishou.live.common.core.basic.degrade.g;
import com.kuaishou.live.common.core.basic.degrade.h;
import com.kuaishou.live.common.core.basic.degrade.i;
import com.kuaishou.live.common.core.basic.degrade.a;
import com.google.common.base.Suppliers;
import r91.b;
import r91.a;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.framework.abtest.f;
import r91.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kuaishou.live.common.core.basic.degrade.j;

public final class LiveDegradeBiz extends Enum	// class@000e96
{
    public final x mABTestEnableSupplier;
    public final String mExperimentKey;
    public x mPerfSdkEnableSupplier;
    public static final LiveDegradeBiz[] $VALUES;
    public static final LiveDegradeBiz AlphaAnimation;
    public static final LiveDegradeBiz AlphaOverlappingRendering;
    public static final LiveDegradeBiz AnimatorFps;
    public static final LiveDegradeBiz BottomComment;
    public static final LiveDegradeBiz GiftSlot;
    public static final LiveDegradeBiz OverDraw;
    public static final LiveDegradeBiz RootViewMeasureLayout;
    public static final LiveDegradeBiz ShimmerAnimation;
    public static final x sIsUsePerfSdkSupplier;

    static {
       LiveDegradeBiz liveDegradeB = new LiveDegradeBiz("GiftSlot", 0, "isGiftSlotAnimationDegrade", b.b);
       LiveDegradeBiz.GiftSlot = liveDegradeB;
       LiveDegradeBiz liveDegradeB1 = new LiveDegradeBiz("AlphaAnimation", 1, "isAlphaAnimationDegrade", c.b);
       LiveDegradeBiz.AlphaAnimation = liveDegradeB1;
       LiveDegradeBiz liveDegradeB2 = new LiveDegradeBiz("ShimmerAnimation", 2, "isShimmerAnimationDegrade", d.b);
       LiveDegradeBiz.ShimmerAnimation = liveDegradeB2;
       LiveDegradeBiz liveDegradeB3 = new LiveDegradeBiz("BottomComment", 3, "isBottomCommentAnimationDegrade", e.b);
       LiveDegradeBiz.BottomComment = liveDegradeB3;
       LiveDegradeBiz liveDegradeB4 = new LiveDegradeBiz("AlphaOverlappingRendering", 4, "isForceOverlappingRenderingClose", f.b);
       LiveDegradeBiz.AlphaOverlappingRendering = liveDegradeB4;
       LiveDegradeBiz liveDegradeB5 = new LiveDegradeBiz("OverDraw", 5, "isOverDrawClose", g.b);
       LiveDegradeBiz.OverDraw = liveDegradeB5;
       LiveDegradeBiz liveDegradeB6 = new LiveDegradeBiz("RootViewMeasureLayout", 6, "isRootViewMeasureLayoutOpt", h.b);
       LiveDegradeBiz.RootViewMeasureLayout = liveDegradeB6;
       LiveDegradeBiz liveDegradeB7 = new LiveDegradeBiz("AnimatorFps", 7, "isDegradeAnimatorFps", i.b);
       LiveDegradeBiz.AnimatorFps = liveDegradeB7;
       LiveDegradeBiz[] liveDegradeB8 = new LiveDegradeBiz[]{liveDegradeB,liveDegradeB1,liveDegradeB2,liveDegradeB3,liveDegradeB4,liveDegradeB5,liveDegradeB6,liveDegradeB7};
       LiveDegradeBiz.$VALUES = liveDegradeB8;
       LiveDegradeBiz.sIsUsePerfSdkSupplier = Suppliers.a(a.b);
    }
    public void LiveDegradeBiz(String p0,int p1,String p2,x p3){
       super(p0, p1);
       this.mExperimentKey = p2;
       this.mABTestEnableSupplier = Suppliers.a(new b(p2));
       this.mPerfSdkEnableSupplier = Suppliers.a(new a(p3));
    }
    public static Boolean lambda$new$10(x p0){
       return p0.get();
    }
    public static Boolean lambda$new$9(String p0){
       return Boolean.valueOf(f.a(p0));
    }
    public static Boolean lambda$static$0(){
       return Boolean.valueOf(e.d());
    }
    public static Boolean lambda$static$1(){
       return Boolean.valueOf(e.c());
    }
    public static Boolean lambda$static$2(){
       Object obj = PatchProxy.apply(null, null, e.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): e.a("live_pk_shimmer_animation_degrade");
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$static$3(){
       return Boolean.valueOf(e.d());
    }
    public static Boolean lambda$static$4(){
       return Boolean.valueOf(e.c());
    }
    public static Boolean lambda$static$5(){
       return Boolean.valueOf(e.c());
    }
    public static Boolean lambda$static$6(){
       Object obj = PatchProxy.apply(null, null, e.class, "5");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): e.a("android_root_view_measure_degrade");
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$static$7(){
       Object obj = PatchProxy.apply(null, null, e.class, "4");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): e.a("live_android_animator_fps_degrade");
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$static$8(){
       return Boolean.valueOf(f.a("isUsePerformanceDegradeSdk"));
    }
    public static LiveDegradeBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveDegradeBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveDegradeBiz.class, p0);
    }
    public static LiveDegradeBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveDegradeBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveDegradeBiz.$VALUES.clone();
    }
    public JsonObject getBizJson(){
       JsonObject obj = PatchProxy.apply(null, this, LiveDegradeBiz.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.H("abTestEnable", this.mABTestEnableSupplier.get());
       obj.H("perfSdkEnable", this.mPerfSdkEnableSupplier.get());
       obj.H("degradeEnable", Boolean.valueOf(this.shouldDegrade()));
       return obj;
    }
    public boolean shouldDegrade(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, LiveDegradeBiz.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mABTestEnableSupplier.get().booleanValue()) {
          if (LiveDegradeBiz.sIsUsePerfSdkSupplier.get().booleanValue()) {
             if (!this.mPerfSdkEnableSupplier.get().booleanValue()) {
             label_0047 :
                b = false;
             label_0048 :
                return b;
             }
          }else if(j.e()){
          }
          b = true;
          goto label_0048 ;
       }else {
          goto label_0047 ;
       }
    }
}
