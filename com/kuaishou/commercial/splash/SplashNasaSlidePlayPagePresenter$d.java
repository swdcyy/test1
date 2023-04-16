package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import androidx.fragment.app.Fragment;
import oo5.a;

public final class SplashNasaSlidePlayPagePresenter$d implements ValueAnimator$AnimatorUpdateListener	// class@001585
{
    public final BaseFragment a;

    public void SplashNasaSlidePlayPagePresenter$d(BaseFragment p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$d.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       a.a(this.a, p0.floatValue());
       return;
    }
}
