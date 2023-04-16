package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q64.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ym4.b;
import ym4.g;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.h$c;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;

public class k extends PresenterV2	// class@001a7e
{
    public h$c p;
    public r$b q;
    public final b r;

    public void k(){
       super();
       this.r = new k(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       g.b("merchantNotify", this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       g.c("merchantNotify", this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.r8("SANDEAGO_CATEGORY_UPDATE_SERVICE");
       this.q = this.r8("SANDEAGO_PROPERTY_UPDATE_SERVICE");
       return;
    }
}
