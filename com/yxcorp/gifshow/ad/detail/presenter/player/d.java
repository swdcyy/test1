package com.yxcorp.gifshow.ad.detail.presenter.player.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import d19.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;

public class d extends PresenterV2	// class@001678
{
    public QPhoto p;
    public a q;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new e(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, d.class, "3");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       return;
    }
}
