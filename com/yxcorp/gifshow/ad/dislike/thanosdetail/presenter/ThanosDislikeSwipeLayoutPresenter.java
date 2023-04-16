package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeSwipeLayoutPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeSwipeLayoutPresenter$onBind$1;
import msd.l;
import e59.b;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ge5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;

public final class ThanosDislikeSwipeLayoutPresenter extends PresenterV2	// class@001750
{
    public BaseFragment p;
    public u q;
    public DislikeViewModel r;
    public SwipeLayout s;
    public l t;
    public SlidePlayViewModel u;
    public d v;

    public void ThanosDislikeSwipeLayoutPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeSwipeLayoutPresenter.class, "9")) {
          return;
       }
       ThanosDislikeSwipeLayoutPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       a.m(slidePlayVie);
       this.u = slidePlayVie;
       tp = this.r;
       if (tp == null) {
          a.S("mDislikeViewModel");
       }
       tp.b(new ThanosDislikeSwipeLayoutPresenter$onBind$1(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeSwipeLayoutPresenter.class, "8")) {
          return;
       }
       if (this.getActivity() != null) {
          this.s = w9.c(this.getActivity());
       }
       ThanosDislikeSwipeLayoutPresenter tv = this.v;
       d e = (tv != null)? tv.e: null;
       this.t = e;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeSwipeLayoutPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.q = obj;
       obj = this.r8("thanos_dislike_view_model");
       a.o(obj, "inject\(AccessIds.THANOS_DISLIKE_VIEW_MODEL\)");
       this.r = obj;
       this.v = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
