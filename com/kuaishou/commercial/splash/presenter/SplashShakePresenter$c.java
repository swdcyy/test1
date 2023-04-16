package com.kuaishou.commercial.splash.presenter.SplashShakePresenter$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import java.lang.NullPointerException;

public final class SplashShakePresenter$c implements ValueAnimator$AnimatorUpdateListener	// class@0015d3
{
    public final SplashShakePresenter a;
    public final View b;

    public void SplashShakePresenter$c(SplashShakePresenter p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SplashShakePresenter$c.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          this.b.setRotation(p0.floatValue());
          float f = (float)n.c(this.a.getContext(), 56.00f);
          this.b.setPivotX(f);
          this.b.setPivotY(f);
          PatchProxy.onMethodExit(SplashShakePresenter$c.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(SplashShakePresenter$c.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
