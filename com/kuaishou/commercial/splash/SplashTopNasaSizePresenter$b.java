package com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;

public final class SplashTopNasaSizePresenter$b extends AnimatorListenerAdapter	// class@001592
{
    public final SplashTopNasaSizePresenter a;

    public void SplashTopNasaSizePresenter$b(SplashTopNasaSizePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.isSupport(SplashTopNasaSizePresenter$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SplashTopNasaSizePresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       SplashTopNasaSizePresenter b = this.a.B;
       if (b != null) {
          layoutParams = b.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.a.z;
          }
       }
       layoutParams = this.a.S8().getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          layoutParams.topMargin = - this.a.z;
       }
       SplashTopNasaSizePresenter$b ta = this.a;
       SplashTopNasaSizePresenter c = ta.C;
       if (c != null) {
          c.setPadding(0, 0, 0, ta.A);
       }
       return;
    }
}
