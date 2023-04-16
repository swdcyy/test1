package com.yxcorp.gifshow.detail.slidev2.presenter.k$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fm5.a;
import d0a.n;
import brd.y;

public class k$a extends a	// class@0019c0
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       k z = this.b.z;
       if (z != null) {
          objArray = z.getCurrentPhoto();
       }
       if (!a.x(objArray, this.b.r)) {
          this.b.t.onNext(new n(2, 0x3f800000));
       }
       this.b.F = false;
       return;
    }
    public void i2(){
       this.b.F = true;
    }
}
