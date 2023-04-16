package com.yxcorp.gifshow.featured.detail.featured.presenter.k$c;
import d6a.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public class k$c extends a	// class@000f7c
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, k$c.class, "2")) {
          return;
       }
       k v = this.b.v;
       if (v != null) {
          v.n();
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, k$c.class, "1")) {
          return;
       }
       this.b.X8();
       return;
    }
}
