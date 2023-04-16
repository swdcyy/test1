package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import vda.b;
import erd.g;
import crd.b;
import hf5.b;
import hf5.g;

public class b extends PresenterV2	// class@000f33
{
    public b p;
    public g q;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       this.q = this.q8(g.class);
       return;
    }
}
