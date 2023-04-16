package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$a;
import nsd.u;
import lnc.a1;
import lnc.d2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$onBind$1;
import android.view.View;
import msd.l;
import lnc.y0;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$c;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$d;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public final class ThanosToggleStatePresenter extends PresenterV2	// class@0015c8
{
    public QPhoto p;
    public BaseFragment q;
    public PublishSubject r;
    public View s;
    public final int t;
    public final ThanosToggleStatePresenter$b u;
    public static int v;
    public static final ThanosToggleStatePresenter$a w;

    static {
       ThanosToggleStatePresenter.w = new ThanosToggleStatePresenter$a(null);
       ThanosToggleStatePresenter.v = a1.e(360.00f);
    }
    public void ThanosToggleStatePresenter(){
       super();
       this.t = d2.f();
       this.u = new ThanosToggleStatePresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ThanosToggleStatePresenter.class, "3")) {
          return;
       }
       this.P8();
       ThanosToggleStatePresenter tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(tq.getParentFragment());
       if (slidePlayVie != null) {
          ThanosToggleStatePresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tq1, this.u);
       }
       tq = this.s;
       if (tq == null) {
          a.S("mToggleStateView");
       }
       y0.a(tq, new ThanosToggleStatePresenter$onBind$1(this));
       tq = this.r;
       if (tq == null) {
          a.S("mCardToggleStateSubject");
       }
       this.X7(tq.subscribe(new ThanosToggleStatePresenter$c(this)));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, ThanosToggleStatePresenter.class, "7")) {
          return;
       }
       ThanosToggleStatePresenter ts = this.s;
       if (ts == null) {
          a.S("mToggleStateView");
       }
       ts.setVisibility(8);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, ThanosToggleStatePresenter.class, "5")) {
          return;
       }
       ThanosToggleStatePresenter tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = tp.mEntity;
       if (mEntity != null) {
          i0.a().e(141, mEntity).d(ThanosToggleStatePresenter$d.b).a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosToggleStatePresenter.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.iv_toggle_state);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.iv_toggle_state\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosToggleStatePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("CARD_TOGGLE_STATE");
       a.o(obj, "inject\(AccessIds.CARD_TOGGLE_STATE\)");
       this.r = obj;
       return;
    }
}
