package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$a;
import nsd.u;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2$a;
import qw6.a;
import qvb.i;
import nga.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$b;
import erd.r;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$c;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.events.realaction.RealAction;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$d;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$e;
import com.kwai.robust.PatchProxyResult;

public final class FollowSlideAcquaintanceRecordPresenter extends PresenterV2	// class@001114
{
    public w p;
    public BaseFeed q;
    public Set r;
    public final p s;
    public static final FollowSlideAcquaintanceRecordPresenter$a t;

    static {
       FollowSlideAcquaintanceRecordPresenter.t = new FollowSlideAcquaintanceRecordPresenter$a(null);
    }
    public void FollowSlideAcquaintanceRecordPresenter(){
       super();
       this.r = new LinkedHashSet();
       this.s = s.c(new FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2(this));
    }
    public void E8(){
       g a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowSlideAcquaintanceRecordPresenter.class, "5")) {
          return;
       }
       FollowSlideAcquaintanceRecordPresenter tp = this.p;
       String str = "mFollowSlideInjectAdapter";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.h(this.P8());
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       slidePlayVie = tp.O();
       i oi = (slidePlayVie != null)? slidePlayVie.X0(): objArray;
       if (!oi instanceof a) {
          oi = objArray;
       }
       if (oi != null) {
          objArray = oi.t;
       }
       this.q = objArray;
       RxBus f = RxBus.f;
       a = c.a;
       this.X7(f.f(n.class).observeOn(d.a).filter(FollowSlideAcquaintanceRecordPresenter$b.b).subscribe(new FollowSlideAcquaintanceRecordPresenter$c(this), a));
       this.X7(f.g(RealAction.class, RxBus$ThreadMode.MAIN).filter(FollowSlideAcquaintanceRecordPresenter$d.b).subscribe(new FollowSlideAcquaintanceRecordPresenter$e(this), a));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideAcquaintanceRecordPresenter.class, "8")) {
          return;
       }
       FollowSlideAcquaintanceRecordPresenter tp = this.p;
       if (tp == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.l(this.P8());
       }
       return;
    }
    public final FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2$a P8(){
       Object obj = PatchProxy.apply(null, this, FollowSlideAcquaintanceRecordPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final w R8(){
       FollowSlideAcquaintanceRecordPresenter obj = PatchProxy.apply(null, this, FollowSlideAcquaintanceRecordPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideAcquaintanceRecordPresenter.class, "4")) {
          return;
       }
       Object obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.p = obj;
       return;
    }
}
