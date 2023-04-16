package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;
import j8a.t0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class k$a extends a	// class@001995
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       k$a tb = this.b;
       tb.T = false;
       tb.V8();
       this.b.e9();
       this.b.P = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       k$a tb = this.b;
       tb.T = true;
       if (!tb.H) {
          if (tb.b9()) {
             Objects.requireNonNull(this.b);
             k1.r(this.b.I, 4000);
          }
       }else {
          tb.X7(tb.E.subscribe(new t0(this)));
       }
       return;
    }
}
