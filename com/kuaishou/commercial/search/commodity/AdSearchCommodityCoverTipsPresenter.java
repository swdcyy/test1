package com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverTipsPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverTipsPresenter$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.t;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverTipsPresenter$onBind$1;
import ry.c;
import msd.l;
import erd.g;
import crd.b;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import bm9.a;

public final class AdSearchCommodityCoverTipsPresenter extends PresenterV2	// class@001553
{
    public a p;
    public final a q;
    public QPhoto r;
    public ViewGroup s;
    public static final AdSearchCommodityCoverTipsPresenter$a t;

    static {
       AdSearchCommodityCoverTipsPresenter.t = new AdSearchCommodityCoverTipsPresenter$a(null);
    }
    public void AdSearchCommodityCoverTipsPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AdSearchCommodityCoverTipsPresenter.class, "3")) {
          return;
       }
       this.X7(RxBus.f.f(t.class).observeOn(d.a).subscribe(new c(new AdSearchCommodityCoverTipsPresenter$onBind$1(this))));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchCommodityCoverTipsPresenter.class, "1")) {
          return;
       }
       if (!p0 instanceof ViewGroup) {
          p0 = null;
       }
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdSearchCommodityCoverTipsPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       this.p = this.r8("FRAGMENT");
       return;
    }
}
