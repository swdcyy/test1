package com.kuaishou.commercial.splash.presenter.c0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.h0;
import java.lang.Object;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.s;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.commercial.splash.presenter.d0;
import com.kuaishou.commercial.splash.presenter.e0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class c0 implements g	// class@0015e0
{
    public final h0 b;

    public void c0(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h0.class, "5")) {
       }else {
          p0 = tb.s;
          if (p0.e == null) {
             tb.X7(t.timer(p0.d, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d0(tb), e0.b));
          }
       }
       return;
    }
}
