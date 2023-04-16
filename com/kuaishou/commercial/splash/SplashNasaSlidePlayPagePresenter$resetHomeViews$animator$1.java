package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.animation.ValueAnimator;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1 extends Lambda implements l	// class@00158a
{
    public final ValueAnimator $resetHomeAnimator;

    public void SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1(ValueAnimator p0){
       this.$resetHomeAnimator = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0.getVisibility()) {
          p0.setAlpha(0);
          p0.setVisibility(0);
          this.$resetHomeAnimator.addUpdateListener(new SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1$a(p0));
       }
       return;
    }
}
