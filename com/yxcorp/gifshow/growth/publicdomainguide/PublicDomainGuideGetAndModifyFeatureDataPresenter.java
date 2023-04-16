package com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter$slidePlayViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gqa.j;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.c;
import brd.t;
import com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter$a;
import erd.g;
import crd.b;
import qw6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;

public final class PublicDomainGuideGetAndModifyFeatureDataPresenter extends PresenterV2	// class@001488
{
    public BaseFragment p;
    public final p q;
    public final a r;

    public void PublicDomainGuideGetAndModifyFeatureDataPresenter(){
       super();
       this.q = s.c(new PublicDomainGuideGetAndModifyFeatureDataPresenter$slidePlayViewModel$2(this));
       this.r = new PublicDomainGuideGetAndModifyFeatureDataPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, PublicDomainGuideGetAndModifyFeatureDataPresenter.class, "3")) {
          return;
       }
       j b = j.b;
       Objects.requireNonNull(b);
       if (j.a == null) {
          Objects.requireNonNull(b);
          j.a = new WeakReference(this.p0());
       }
       this.X7(RxBus.f.f(c.class).subscribe(new PublicDomainGuideGetAndModifyFeatureDataPresenter$a(this)));
       this.p0().h(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PublicDomainGuideGetAndModifyFeatureDataPresenter.class, "4")) {
          return;
       }
       this.p0().l(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PublicDomainGuideGetAndModifyFeatureDataPresenter.class, "2")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
    public final SlidePlayViewModel p0(){
       Object obj = PatchProxy.apply(null, this, PublicDomainGuideGetAndModifyFeatureDataPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
}
