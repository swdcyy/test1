package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter$mBackPressable$1;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ThanosDislikeBackPressedPresenter extends PresenterV2	// class@00174a
{
    public BaseFragment p;
    public DislikeViewModel q;
    public SlidePlayViewModel r;
    public a s;
    public ThanosDislikeBackPressedPresenter$a t;

    public void ThanosDislikeBackPressedPresenter(){
       super();
       this.s = new ThanosDislikeBackPressedPresenter$mBackPressable$1(this);
       this.t = new ThanosDislikeBackPressedPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeBackPressedPresenter.class, "6")) {
          return;
       }
       ThanosDislikeBackPressedPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       if (slidePlayVie != null) {
          a.o(slidePlayVie, "this");
          this.r = slidePlayVie;
          ThanosDislikeBackPressedPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tp1, this.t);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeBackPressedPresenter.class, "7")) {
          return;
       }
       ThanosDislikeBackPressedPresenter tr = this.r;
       if (tr == null) {
          a.S("mSlidePlayViewModel");
       }
       ThanosDislikeBackPressedPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tr.D(tp, this.t);
       return;
    }
    public final DislikeViewModel P8(){
       ThanosDislikeBackPressedPresenter obj = PatchProxy.apply(null, this, ThanosDislikeBackPressedPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mDislikeModel");
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeBackPressedPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.r8("thanos_dislike_view_model");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­HANOS_DISLIKE_VIEW_MODEL\)");
       this.q = obj;
       return;
    }
}
