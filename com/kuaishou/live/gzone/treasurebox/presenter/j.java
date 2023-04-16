package com.kuaishou.live.gzone.treasurebox.presenter.j;
import io.reactivex.g;
import com.kuaishou.live.gzone.treasurebox.presenter.l;
import java.lang.Object;
import brd.v;
import java.lang.Boolean;
import brd.g;
import p53.k0;
import h47.b;
import j47.d;

public final class j implements g	// class@001c8a
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       j tb = this.b;
       l u = tb.u;
       if (u == null) {
          p0.onNext(Boolean.FALSE);
          p0.onComplete();
       }else {
          k0 ok0 = new k0(p0);
          tb.C = ok0;
          u.Q1(ok0);
       }
       return;
    }
}
