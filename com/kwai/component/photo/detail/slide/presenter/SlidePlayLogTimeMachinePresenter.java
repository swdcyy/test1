package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$a;
import nsd.u;
import java.lang.String;
import com.kwai.kcube.TabIdentifier;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import i50.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$1;
import of5.o;
import msd.l;
import erd.g;
import crd.b;
import le5.g;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$2;
import cda.d;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$3;
import cda.h;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$4;
import lnc.u1;
import java.util.Collection;
import com.yxcorp.gifshow.log.timemachine.TMLogManager;
import com.yxcorp.gifshow.log.timemachine.FeedOpType;
import com.yxcorp.gifshow.log.timemachine.FeedOpType$a;
import of5.n;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cda.g;
import java.util.List;
import trd.t;
import cda.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$b;

public final class SlidePlayLogTimeMachinePresenter extends PresenterV2	// class@000a8f
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public final String r;
    public static final SlidePlayLogTimeMachinePresenter$a s;

    static {
       SlidePlayLogTimeMachinePresenter.s = new SlidePlayLogTimeMachinePresenter$a(null);
    }
    public void SlidePlayLogTimeMachinePresenter(String p0){
       super();
       this.r = p0;
    }
    public static final String P8(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlidePlayLogTimeMachinePresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayLogTimeMachinePresenter.s.a(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayLogTimeMachinePresenter.class, "1")) {
          return;
       }
       SlidePlayLogTimeMachinePresenter tp = this.p;
       a.m(tp);
       this.q = SlidePlayViewModel.B0(tp);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(b.class, mAIN).subscribe(new o(new SlidePlayLogTimeMachinePresenter$onBind$1(this))));
       this.X7(f.g(g.class, mAIN).subscribe(new o(new SlidePlayLogTimeMachinePresenter$onBind$2(this))));
       this.X7(f.g(d.class, mAIN).subscribe(new o(new SlidePlayLogTimeMachinePresenter$onBind$3(this))));
       t ot = f.g(h.class, mAIN);
       this.X7(ot.subscribe(new o(new SlidePlayLogTimeMachinePresenter$onBind$4(this))));
       u1.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayLogTimeMachinePresenter.class, "2")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void R8(String p0,Collection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayLogTimeMachinePresenter.class, "10")) {
          return;
       }
       if (!p1.isEmpty()) {
          SlidePlayLogTimeMachinePresenter tr = this.r;
          if (tr != null && (!PatchProxy.applyVoidThreeRefs(tr, p0, p1, this, SlidePlayLogTimeMachinePresenter.class, "11") && !TMLogManager.e.c(tr))) {
             FeedOpType uFeedOpType = FeedOpType.Companion.a(p0);
             if (uFeedOpType != null) {
                c.a(new n(p1, uFeedOpType, tr));
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayLogTimeMachinePresenter.class, "5")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
    public final void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayLogTimeMachinePresenter.class, "4")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.b;
       if (p0 != null) {
          this.R8("REMOVE_INVALID_FEED", t.k(p0));
       }
       return;
    }
    public final void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayLogTimeMachinePresenter.class, "3")) {
          return;
       }
       a.p(p0, "event");
       SlidePlayLogTimeMachinePresenter tq = this.q;
       if (tq != null) {
          QPhoto currentPhoto = tq.getCurrentPhoto();
          if (currentPhoto != null) {
             String photoId = currentPhoto.getPhotoId();
             if (photoId != null) {
                if (a.g(photoId, p0.a)) {
                   SlidePlayLogTimeMachinePresenter tq1 = this.q;
                   a.m(tq1);
                   QPhoto currentPhoto1 = tq1.getCurrentPhoto();
                   a.m(currentPhoto1);
                   this.R8("REMOVE_REDUCE_FEED", t.k(currentPhoto1));
                }else {
                   SlidePlayLogTimeMachinePresenter tq2 = this.q;
                   a.m(tq2);
                   List list = tq2.e0();
                   if (list != null) {
                      c.a(new SlidePlayLogTimeMachinePresenter$b(this, new ArrayList(list), p0));
                   }
                }
             }
          }
       }
       return;
    }
}
