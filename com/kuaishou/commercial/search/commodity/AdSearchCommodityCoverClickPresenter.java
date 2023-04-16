package com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverClickPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverClickPresenter$a;
import nsd.u;
import n49.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.s;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverClickPresenter$onBind$1;
import ry.a;
import msd.l;
import erd.g;
import crd.b;

public final class AdSearchCommodityCoverClickPresenter extends PresenterV2	// class@001550
{
    public QPhoto p;
    public o q;
    public static final AdSearchCommodityCoverClickPresenter$a r;

    static {
       AdSearchCommodityCoverClickPresenter.r = new AdSearchCommodityCoverClickPresenter$a(null);
    }
    public void AdSearchCommodityCoverClickPresenter(){
       super();
       this.q = new o();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AdSearchCommodityCoverClickPresenter.class, "2")) {
          return;
       }
       AdSearchCommodityCoverClickPresenter tp = this.p;
       if (tp != null && tp.mEntity != null) {
          this.X7(RxBus.f.f(s.class).observeOn(d.a).subscribe(new a(new AdSearchCommodityCoverClickPresenter$onBind$1(this))));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdSearchCommodityCoverClickPresenter.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       return;
    }
}
