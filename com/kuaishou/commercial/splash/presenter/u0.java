package com.kuaishou.commercial.splash.presenter.u0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.w0;
import java.lang.Object;
import bz.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import mxb.o;
import gz.v4;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class u0 implements g	// class@00160b
{
    public final w0 b;

    public void u0(w0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, w0.class, "16")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("SplashAdVideoPlayPresen", "onSplashDisplayFinish", objArray);
          if (p0 != null && p0.b != null) {
             p0 = o.c;
             if (p0 != null) {
                tb.X7(p0.subscribe(new v4(tb)));
             }
          }else {
             tb.V8(null);
          }
       }
       return;
    }
}
