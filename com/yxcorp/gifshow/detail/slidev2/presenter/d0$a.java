package com.yxcorp.gifshow.detail.slidev2.presenter.d0$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d0$a extends a	// class@0018f5
{
    public final d0 b;

    public void d0$a(d0 p0){
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
       if (PatchProxy.applyVoid(null, this, d0$a.class, "1")) {
          return;
       }
       this.b.R8(true);
       return;
    }
}
