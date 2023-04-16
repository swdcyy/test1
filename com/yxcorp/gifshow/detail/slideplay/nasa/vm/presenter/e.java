package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.e;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Boolean;
import bf5.d;
import y6a.q;
import java.util.Objects;
import c7a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class e implements g	// class@001815
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       p0 = tb.p;
       if (p0 != null) {
          p0.k(false);
       }
       p0 = tb.c1;
       q oq = new q(tb);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefsWithListener(oq, p0, c.class, "3")) {
          a.p(oq, "block");
          if (p0.a != null) {
             oq.invoke();
             p0.a = false;
             p0.b = false;
             p0.c = false;
          }
          PatchProxy.onMethodExit(c.class, "3");
       }
       return;
    }
}
