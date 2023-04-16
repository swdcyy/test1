package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$a;
import nsd.u;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2;
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
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2$a;
import qw6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$c;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.events.realaction.RealAction;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$d;
import erd.r;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import g7c.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$b;

public final class FollowSlideRecoFeedRecordPresenter extends PresenterV2	// class@001134
{
    public w p;
    public Set q;
    public Map r;
    public final p s;
    public static final FollowSlideRecoFeedRecordPresenter$a t;

    static {
       FollowSlideRecoFeedRecordPresenter.t = new FollowSlideRecoFeedRecordPresenter$a(null);
    }
    public void FollowSlideRecoFeedRecordPresenter(){
       super();
       this.q = new LinkedHashSet();
       this.r = new LinkedHashMap();
       this.s = s.c(new FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2(this));
    }
    public void E8(){
       g a;
       if (PatchProxy.applyVoid(null, this, FollowSlideRecoFeedRecordPresenter.class, "5")) {
          return;
       }
       FollowSlideRecoFeedRecordPresenter tp = this.p;
       if (tp == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.h(this.P8());
       }
       RxBus f = RxBus.f;
       a = c.a;
       this.X7(f.f(n.class).observeOn(d.a).subscribe(new FollowSlideRecoFeedRecordPresenter$c(this), a));
       this.X7(f.g(RealAction.class, RxBus$ThreadMode.MAIN).filter(FollowSlideRecoFeedRecordPresenter$d.b).subscribe(new FollowSlideRecoFeedRecordPresenter$e(this), a));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideRecoFeedRecordPresenter.class, "6")) {
          return;
       }
       FollowSlideRecoFeedRecordPresenter tp = this.p;
       if (tp == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.l(this.P8());
       }
       return;
    }
    public final FollowSlideRecoFeedRecordPresenter$itemAppearanceChangedListener$2$a P8(){
       Object obj = PatchProxy.apply(null, this, FollowSlideRecoFeedRecordPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final a R8(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideRecoFeedRecordPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FollowSlideRecoFeedRecordPresenter$b(p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideRecoFeedRecordPresenter.class, "4")) {
          return;
       }
       Object obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.p = obj;
       return;
    }
}
