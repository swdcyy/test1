package com.kuaishou.commercial.splash.presenter.d0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.h0;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import gz.s;
import brd.t;
import gz.x2;
import erd.o;
import com.kuaishou.commercial.splash.presenter.g0;
import erd.r;
import t45.d;
import brd.z;
import gz.w2;
import com.kuaishou.commercial.splash.presenter.f0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class d0 implements g	// class@0015e3
{
    public final h0 b;

    public void d0(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h0.class, "6")) {
       }else {
          h0 s = tb.s;
          long l = TimeUnit.MILLISECONDS.toSeconds((s.g - s.d));
          tb.X7(t.interval(0, 1, TimeUnit.SECONDS).take((1 + l)).map(new x2(l)).filter(g0.b).observeOn(d.a).subscribe(new w2(tb), f0.b));
       }
       return;
    }
}
