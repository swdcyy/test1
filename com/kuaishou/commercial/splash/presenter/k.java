package com.kuaishou.commercial.splash.presenter.k;
import erd.g;
import com.kuaishou.commercial.splash.presenter.n;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import yx.j0;
import gz.a2;
import java.lang.Runnable;
import ekd.k1;

public final class k implements g	// class@0015f6
{
    public final n b;

    public void k(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          p0 = new Object[0];
          j0.f("SplashExitAnimatorPrese", "popPlayVideo finish", p0);
          k1.r(new a2(tb), 2000);
       }
       return;
    }
}
