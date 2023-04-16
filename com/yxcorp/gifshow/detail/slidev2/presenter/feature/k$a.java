package com.yxcorp.gifshow.detail.slidev2.presenter.feature.k$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.k;
import e8a.x0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy6.h;
import uy6.b;
import ekd.k1;
import java.lang.Runnable;

public class k$a extends a	// class@0019a7
{
    public final Runnable b;
    public final k c;

    public void k$a(k p0){
       this.c = p0;
       super();
       this.b = new x0(this);
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       this.c.u = false;
       if (h.a.p != null) {
          k1.n(this);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       this.c.u = true;
       if (h.a.p != null) {
          k1.p(this.b, this);
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "3")) {
          return;
       }
       if (h.a.p == null) {
          this.b.run();
       }
       return;
    }
}
