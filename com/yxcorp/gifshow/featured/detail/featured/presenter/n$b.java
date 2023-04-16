package com.yxcorp.gifshow.featured.detail.featured.presenter.n$b;
import d6a.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import zda.e1;
import java.lang.Runnable;
import ekd.k1;

public class n$b extends a	// class@000f84
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "2")) {
          return;
       }
       this.b.E = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "1")) {
          return;
       }
       n$b tb = this.b;
       tb.E = true;
       if (tb.D == null && tb.H.Y0() > 0) {
          this.b.c9();
          k1.r(new e1(this), 300);
       }
       return;
    }
}
