package com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewGroup;

public final class SplashTopNasaSizePresenter$a implements ValueAnimator$AnimatorUpdateListener	// class@001591
{
    public final SplashTopNasaSizePresenter a;
    public final int b;
    public final int c;

    public void SplashTopNasaSizePresenter$a(SplashTopNasaSizePresenter p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashTopNasaSizePresenter$a.class, "1")) {
          return;
       }
       a.o(p0, "animation");
       int i = (int)(((float)(this.a.z - this.b) * p0.getAnimatedFraction()) + (float)this.b);
       SplashTopNasaSizePresenter b = this.a.B;
       if (b != null) {
          ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = i;
          }
       }
       SplashTopNasaSizePresenter$a ta = this.a;
       SplashTopNasaSizePresenter c = ta.C;
       if (c != null) {
          c.setPadding(0, 0, 0, (int)(((float)(ta.A - this.c) * p0.getAnimatedFraction()) + (float)this.c));
       }
       ViewGroup$LayoutParams layoutParams1 = this.a.S8().getLayoutParams();
       if (!layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
          layoutParams1 = null;
       }
       if (layoutParams1 != null) {
          layoutParams1.topMargin = - i;
       }
       VerticalViewPager verticalView = this.a.V8();
       if (verticalView != null) {
          verticalView.requestLayout();
       }
       return;
    }
}
