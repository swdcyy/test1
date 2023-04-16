package com.kuaishou.commercial.splash.presenter.SplashShakePresenter$d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$d$a;
import java.lang.Runnable;
import ekd.k1;

public final class SplashShakePresenter$d extends AnimatorListenerAdapter	// class@0015d5
{
    public final SplashShakePresenter a;
    public final View b;

    public void SplashShakePresenter$d(SplashShakePresenter p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SplashShakePresenter$d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       k1.s(new SplashShakePresenter$d$a(this), this.a, 300);
       PatchProxy.onMethodExit(SplashShakePresenter$d.class, "1");
       return;
    }
}
