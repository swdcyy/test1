package com.yxcorp.gifshow.homepage.presenter.splash.b;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import java.lang.Object;
import ujc.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import dua.c;
import java.lang.Runnable;
import ekd.k1;

public final class b implements g	// class@0017dc
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefsWithListener(p0, tb, c.class, "12")) {
       }else {
          Object[] objArray = new Object[0];
          b.C().w("SplashPresenter", "Splash state:"+p0.a, objArray);
          if (p0.a == 4) {
             k1.q(new c(tb));
          }
          PatchProxy.onMethodExit(c.class, "12");
       }
       return;
    }
}
