package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import androidx.fragment.app.Fragment;
import ro5.a;

public final class SplashNasaSlidePlayPagePresenter$b implements ValueAnimator$AnimatorUpdateListener	// class@001583
{
    public final SplashNasaSlidePlayPagePresenter a;

    public void SplashNasaSlidePlayPagePresenter$b(SplashNasaSlidePlayPagePresenter p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$b.class, "1")) {
          return;
       }
       BaseFragment uBaseFragmen = this.a.R8();
       a.m(uBaseFragmen);
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       a.b(uBaseFragmen, p0.floatValue());
       return;
    }
}
