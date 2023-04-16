package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeGesturePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.GestureDetector;
import android.content.Context;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeGesturePresenter$a;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeGesturePresenter$doBindView$1;
import n29.i;
import msd.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ThanosDislikeGesturePresenter extends PresenterV2	// class@00174d
{
    public boolean p;
    public DislikeViewModel q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public ScaleHelpView t;
    public final GestureDetector u;

    public void ThanosDislikeGesturePresenter(){
       super();
       this.u = new GestureDetector(this.getContext(), new ThanosDislikeGesturePresenter$a(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeGesturePresenter.class, "5")) {
          return;
       }
       this.p = false;
       ThanosDislikeGesturePresenter tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.s = slidePlayVie;
       tr = this.t;
       if (tr != null) {
          tr.e(this.u);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeGesturePresenter.class, "6")) {
          return;
       }
       ThanosDislikeGesturePresenter tt = this.t;
       if (tt != null) {
          tt.j(this.u);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeGesturePresenter.class, "4")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2a96);
       this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new i(new ThanosDislikeGesturePresenter$doBindView$1(this))));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeGesturePresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("thanos_dislike_view_model");
       a.o(obj, "inject\(AccessIds.THANOS_DISLIKE_VIEW_MODEL\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       return;
    }
    public final void onSplashEyemaxEnterDetailEvent(x p0){
       this.p = true;
    }
}
