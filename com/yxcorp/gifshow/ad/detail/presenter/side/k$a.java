package com.yxcorp.gifshow.ad.detail.presenter.side.k$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k$a extends a	// class@0016b0
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.x = false;
    }
    public void i2(){
       this.b.x = true;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       this.b.R8(true);
       return;
    }
}
