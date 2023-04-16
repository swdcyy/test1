package com.yxcorp.gifshow.detail.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import brd.t;
import t45.d;
import brd.z;
import y4a.o;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class f extends PresenterV2	// class@0016d7
{
    public QPhoto p;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new o(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       return;
    }
}
