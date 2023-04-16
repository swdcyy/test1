package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;

public final class SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1$a implements ValueAnimator$AnimatorUpdateListener	// class@001589
{
    public final View a;

    public void SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1$a(View p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       this.a.setAlpha(p0.floatValue());
       return;
    }
}
