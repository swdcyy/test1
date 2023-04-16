package com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter$a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import qvb.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import qqa.d;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter$onBind$1;
import qqa.c;
import msd.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.nasa.NasaRefreshView;

public final class ShareBackNasaRefreshPresenter extends PresenterV2	// class@0014c0
{
    public SlidePlayViewModel p;
    public int q;
    public int r;
    public BaseFragment s;
    public NasaRefreshView t;
    public final q u;

    public void ShareBackNasaRefreshPresenter(){
       super();
       this.q = -1;
       this.u = new ShareBackNasaRefreshPresenter$a(this);
    }
    public static final SlidePlayViewModel P8(ShareBackNasaRefreshPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ShareBackNasaRefreshPresenter.class, "6")) {
          return;
       }
       ShareBackNasaRefreshPresenter ts = this.s;
       if (ts == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ts);
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment\)");
       this.p = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       slidePlayVie.e(this.u);
       this.X7(RxBus.f.f(d.class).observeOn(d.a).subscribe(new c(new ShareBackNasaRefreshPresenter$onBind$1(this))));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ShareBackNasaRefreshPresenter.class, "7")) {
          return;
       }
       ShareBackNasaRefreshPresenter tp = this.p;
       if (tp == null) {
          a.S("mSlidePlayViewModel");
       }
       tp.b(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ShareBackNasaRefreshPresenter.class, "5")) {
          return;
       }
       View obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.s = obj;
       obj = m1.f(this.m8(), R.id.refresh_layout);
       a.o(obj, "ViewBindUtils.bindWidget¡­iew, R.id.refresh_layout\)");
       this.t = obj;
       return;
    }
}
