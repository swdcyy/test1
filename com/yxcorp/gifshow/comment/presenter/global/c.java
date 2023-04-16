package com.yxcorp.gifshow.comment.presenter.global.c;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.f;
import java.lang.Object;
import ek9.t0$a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.comment.presenter.global.e;

public final class c implements g	// class@0010f2
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.d;
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tb, uof, "2")) {
          uof = tb.A;
          if (uof != null) {
             k1.m(uof);
          }
          e uoe = new e(tb, p0);
          tb.A = uoe;
          k1.r(uoe, 1000);
       }
       return;
    }
}
