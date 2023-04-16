package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.f;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Boolean;
import y6a.r;
import java.util.Objects;
import c7a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bf5.d;

public final class f implements g	// class@001816
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       p0 = tb.c1;
       j p = tb.p;
       r or = new r(tb);
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidTwoRefsWithListener(p, or, p0, c.class, "1")) {
       }else {
          a.p(or, "block");
          if (p != null && (p0.b != null && p0.a == null)) {
             p.k(true);
             or.invoke();
             p0.a = true;
          }
       label_0033 :
          PatchProxy.onMethodExit(c.class, "1");
       }
       return;
    }
}
