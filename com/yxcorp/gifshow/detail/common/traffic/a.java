package com.yxcorp.gifshow.detail.common.traffic.a;
import erd.g;
import com.yxcorp.gifshow.detail.common.traffic.b;
import java.lang.Object;
import java.lang.String;
import ekd.k1;
import qp7.b;
import qp7.x0;
import at7.g;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pp7.b;
import zz9.b;
import java.lang.Runnable;

public final class a implements g	// class@0014f6
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       if (tb.t == null) {
       }else {
          k1.n(tb);
          tb.c0();
          tb.E().g(true);
          g og = tb.E();
          Objects.requireNonNull(og);
          if (!PatchProxy.applyVoidOneRefs(p0, og, g.class, "1")) {
             a.p(p0, "toast");
             og.d.f(p0);
          }
          k1.s(new b(tb), tb, 3000);
       }
       return;
    }
}
