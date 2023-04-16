package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$mSideBarListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import zm5.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import rf5.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import uic.a0;
import brd.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$b;
import erd.o;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$c;
import erd.r;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$mSideBarListener$2$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mhc.y1;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;

public final class SlidePlayFollowSceneRecordPresenter extends PresenterV2	// class@0018cb
{
    public a p;
    public SlidePlayViewModel q;
    public u r;
    public BaseFragment s;
    public final a t;
    public boolean u;
    public final p v;

    public void SlidePlayFollowSceneRecordPresenter(){
       super();
       this.t = new SlidePlayFollowSceneRecordPresenter$a(this);
       this.u = true;
       this.v = s.c(new SlidePlayFollowSceneRecordPresenter$mSideBarListener$2(this));
    }
    public static final a P8(SlidePlayFollowSceneRecordPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mSlidePlaySceneRecord");
       }
       return p0;
    }
    public static final u R8(SlidePlayFollowSceneRecordPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFollowSceneRecordPresenter.class, "2")) {
          return;
       }
       u1.a(this);
       SlidePlayFollowSceneRecordPresenter ts = this.s;
       String str = "mFragment";
       if (ts == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ts.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.q = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       SlidePlayFollowSceneRecordPresenter ts1 = this.s;
       if (ts1 == null) {
          a.S(str);
       }
       slidePlayVie.P(ts1, this.t);
       this.X7(RxBus.f.f(a0.class).distinctUntilChanged(SlidePlayFollowSceneRecordPresenter$b.b).filter(new SlidePlayFollowSceneRecordPresenter$c(this)).subscribe(new SlidePlayFollowSceneRecordPresenter$d(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFollowSceneRecordPresenter.class, "3")) {
          return;
       }
       u1.b(this);
       SlidePlayFollowSceneRecordPresenter tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       SlidePlayFollowSceneRecordPresenter ts = this.s;
       if (ts == null) {
          a.S("mFragment");
       }
       tq.D(ts, this.t);
       return;
    }
    public final SlidePlayFollowSceneRecordPresenter$mSideBarListener$2$a S8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayFollowSceneRecordPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFollowSceneRecordPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_PLAY_SCENE_RECORD");
       a.o(obj, "inject\(AccessIds.DETAIL_PLAY_SCENE_RECORD\)");
       this.p = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       return;
    }
    public final void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayFollowSceneRecordPresenter.class, "5")) {
          return;
       }
       a.p(p0, "shownEvent");
       SlidePlayFollowSceneRecordPresenter ts = this.s;
       if (ts == null) {
          a.S("mFragment");
       }
       if (ts.Vg().a()) {
          ts = this.p;
          if (ts == null) {
             a.S("mSlidePlaySceneRecord");
          }
          ts.b((p0.a ^ 0x01), 4);
       }
       return;
    }
}
