package com.yxcorp.gifshow.ad.detail.presenter.log.e$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class e$a extends a	// class@001664
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       k1.m(this.b.x);
       this.b.P8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       boolean b = false;
       tb.t = b;
       tb.v = tb.u.a0();
       tb = this.b;
       if (tb.u.Z() == this.b.u.j()) {
          b = true;
       }
       tb.w = b;
       k1.m(this.b.x);
       k1.r(this.b.x, 50);
       return;
    }
}
