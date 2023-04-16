package com.yxcorp.gifshow.detail.presenter.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import y4a.y;
import erd.g;
import crd.b;
import brd.t;
import de5.a;

public class l extends PresenterV2	// class@0016de
{
    public a p;
    public MilanoContainerEventBus q;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.X7(this.q.d.subscribe(new y(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
