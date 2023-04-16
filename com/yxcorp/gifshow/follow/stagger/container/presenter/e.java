package com.yxcorp.gifshow.follow.stagger.container.presenter.e;
import nl8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.listcomponent.event.a;
import oia.o;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oia.p;

public class e extends a	// class@001163
{

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.X7(this.S8().c("kscc.event.page.arch.common.canShowEmptyTips", new o(this)));
       this.X7(this.S8().c("kscc.event.page.arch.common.allowRefresh", new p(this)));
       return;
    }
}
