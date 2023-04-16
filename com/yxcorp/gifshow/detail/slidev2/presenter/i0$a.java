package com.yxcorp.gifshow.detail.slidev2.presenter.i0$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class i0$a extends a	// class@0019bc
{
    public final i0 b;

    public void i0$a(i0 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "2")) {
          return;
       }
       k1.m(this.b.w);
       this.b.P8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "1")) {
          return;
       }
       i0$a tb = this.b;
       boolean b = false;
       tb.s = b;
       tb.u = tb.t.a0();
       tb = this.b;
       if (tb.t.Z() == this.b.t.j()) {
          b = true;
       }
       tb.v = b;
       k1.m(this.b.w);
       k1.r(this.b.w, 50);
       return;
    }
}
