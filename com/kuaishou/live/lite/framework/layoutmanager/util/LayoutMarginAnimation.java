package com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation;
import android.view.animation.Animation;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation$b;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation$_onAnimationStart$1;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation$_onAnimationEnd$1;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation$_onAnimationRepeat$1;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation$a;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Transformation;
import java.lang.Float;
import java.lang.Integer;
import qrd.l1;

public final class LayoutMarginAnimation extends Animation	// class@00091d
{
    public final int b;
    public final int c;
    public a d;
    public a e;
    public a f;
    public final View g;
    public final int h;
    public static final LayoutMarginAnimation$b i;

    static {
       LayoutMarginAnimation.i = new LayoutMarginAnimation$b(null);
    }
    public void LayoutMarginAnimation(View p0,int p1,int p2,long p3){
       int i;
       a.p(p0, "target");
       super();
       this.g = p0;
       this.h = p1;
       Object obj = PatchProxy.apply(null, this, LayoutMarginAnimation.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          if (p1) {
             if (p1 != 1) {
                i = (p1 != 2)? layoutParams.bottomMargin: layoutParams.rightMargin;
             }else {
                i = layoutParams.topMargin;
             }
          }else {
             i = layoutParams.leftMargin;
          }
       }
       this.b = i;
       this.c = p2 - i;
       this.d = LayoutMarginAnimation$_onAnimationStart$1.INSTANCE;
       this.e = LayoutMarginAnimation$_onAnimationEnd$1.INSTANCE;
       this.f = LayoutMarginAnimation$_onAnimationRepeat$1.INSTANCE;
       this.setDuration(p3);
       this.setAnimationListener(new LayoutMarginAnimation$a(this));
       return;
    }
    public void applyTransformation(float p0,Transformation p1){
       if (PatchProxy.isSupport(LayoutMarginAnimation.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, LayoutMarginAnimation.class, "6")) {
          return;
       }
       a.p(p1, "t");
       int i = this.b + (int)((float)this.c * p0);
       if (!PatchProxy.isSupport(LayoutMarginAnimation.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, LayoutMarginAnimation.class, "2")) {
          LayoutMarginAnimation tg = this.g;
          ViewGroup$LayoutParams layoutParams = tg.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          LayoutMarginAnimation th = this.h;
          if (th != null) {
             if (th != 1) {
                layoutParams.bottomMargin = (th != 2)? i: i;
             }else {
                layoutParams.topMargin = i;
             }
          }else {
             layoutParams.leftMargin = i;
          }
          tg.setLayoutParams(layoutParams);
       }
       return;
    }
}
