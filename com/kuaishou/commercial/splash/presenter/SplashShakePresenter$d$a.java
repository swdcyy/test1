package com.kuaishou.commercial.splash.presenter.SplashShakePresenter$d$a;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter;

public final class SplashShakePresenter$d$a implements Runnable	// class@0015d4
{
    public final SplashShakePresenter$d b;

    public void SplashShakePresenter$d$a(SplashShakePresenter$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, SplashShakePresenter$d$a.class, "1")) {
          return;
       }
       SplashShakePresenter$d$a tb = this.b;
       tb.a.ga(tb.b);
       PatchProxy.onMethodExit(SplashShakePresenter$d$a.class, "1");
       return;
    }
}
