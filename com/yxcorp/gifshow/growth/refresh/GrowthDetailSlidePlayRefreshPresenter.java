package com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter$onBind$1;
import nqa.a;
import msd.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class GrowthDetailSlidePlayRefreshPresenter extends PresenterV2	// class@0014bd
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public int r;
    public int s;
    public final q t;

    public void GrowthDetailSlidePlayRefreshPresenter(){
       super();
       this.r = -1;
       this.t = new GrowthDetailSlidePlayRefreshPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, GrowthDetailSlidePlayRefreshPresenter.class, "2")) {
          return;
       }
       GrowthDetailSlidePlayRefreshPresenter tp = this.p;
       a.m(tp);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp);
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment!!\)");
       this.q = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       slidePlayVie.e(this.t);
       this.X7(RxBus.f.f(l.class).observeOn(d.a).subscribe(new a(new GrowthDetailSlidePlayRefreshPresenter$onBind$1(this))));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, GrowthDetailSlidePlayRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
