package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import zm5.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import tkd.b;
import tkd.d;
import hv5.a;
import fv5.a;
import androidx.fragment.app.Fragment;
import vy6.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$d;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$e;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$f;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$g;
import com.yxcorp.gifshow.util.rx.RxBus;
import uic.a0;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$h;
import erd.o;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$i;
import erd.r;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$j;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import java.util.List;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import gv5.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import io.reactivex.subjects.PublishSubject;
import im8.f;
import xx9.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import mhc.y1;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;

public final class SlidePlaySwitchNextNebulaFollowGuidePresenter extends PresenterV2	// class@0018e9
{
    public a A;
    public g B;
    public boolean C;
    public boolean D;
    public f E;
    public a F;
    public NasaBizParam G;
    public final e H;
    public final a I;
    public boolean J;
    public final p K;
    public t p;
    public t q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public QPhoto t;
    public a u;
    public a v;
    public PublishSubject w;
    public PublishSubject x;
    public t y;
    public u z;
    public static final SlidePlaySwitchNextNebulaFollowGuidePresenter$a L;

    static {
       SlidePlaySwitchNextNebulaFollowGuidePresenter.L = new SlidePlaySwitchNextNebulaFollowGuidePresenter$a(null);
    }
    public void SlidePlaySwitchNextNebulaFollowGuidePresenter(){
       super();
       this.H = new SlidePlaySwitchNextNebulaFollowGuidePresenter$c(this);
       this.I = new SlidePlaySwitchNextNebulaFollowGuidePresenter$b(this);
       this.J = true;
       this.K = s.c(new SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2(this));
    }
    public static final a P8(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("mSlidePlaySceneRecord");
       }
       return p0;
    }
    public static final SlidePlayViewModel R8(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public static final u S8(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "3")) {
          return;
       }
       u1.a(this);
       b uob = d.a(0x6c2883df);
       a.o(uob, "PluginManager.get\(Follow¡­DetailPlugin::class.java\)");
       this.F = uob.hZ();
       SlidePlaySwitchNextNebulaFollowGuidePresenter tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.s = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       SlidePlaySwitchNextNebulaFollowGuidePresenter tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tr1, this.I);
       tr = this.p;
       if (tr == null) {
          a.S("mDetailPlayedTimeDown");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextNebulaFollowGuidePresenter$d(this)));
       tr = this.w;
       if (tr == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextNebulaFollowGuidePresenter$e(this)));
       tr = this.x;
       if (tr == null) {
          a.S("mAiTextFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextNebulaFollowGuidePresenter$f(this)));
       tr = this.y;
       if (tr == null) {
          a.S("mPreparePipModeObserver");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextNebulaFollowGuidePresenter$g(this)));
       this.X7(RxBus.f.f(a0.class).distinctUntilChanged(SlidePlaySwitchNextNebulaFollowGuidePresenter$h.b).filter(new SlidePlaySwitchNextNebulaFollowGuidePresenter$i(this)).subscribe(new SlidePlaySwitchNextNebulaFollowGuidePresenter$j(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "4")) {
          return;
       }
       u1.b(this);
       SlidePlaySwitchNextNebulaFollowGuidePresenter ts = this.s;
       if (ts == null) {
          a.S("mSlidePlayViewModel");
       }
       SlidePlaySwitchNextNebulaFollowGuidePresenter tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       ts.D(tr, this.I);
       return;
    }
    public final SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a V8(){
       Object obj = PatchProxy.apply(null, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final String W8(){
       FollowSlideRecoGuide obj = PatchProxy.apply(null, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Z8();
       if (obj != null) {
          obj = obj.mToastReason;
          if (obj != null) {
          label_001d :
             return obj;
          }
       }
       String str = "";
       goto label_001d ;
    }
    public final int X8(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (DateUtils.H(iterator.next().longValue())) {
                i = i + 1;
             }
          }
       }
       return i;
    }
    public final long Y8(){
       long l;
       FollowSlideRecoGuide obj = PatchProxy.apply(null, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.Z8();
       obj = (obj != null)? obj.mShowDuration: 0;
       return obj;
    }
    public final FollowSlideRecoGuide Z8(){
       Object[] objArray = null;
       SlidePlaySwitchNextNebulaFollowGuidePresenter obj = PatchProxy.apply(objArray, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = obj.mEntity;
       if (mEntity != null) {
          objArray = a.a.a(mEntity);
       }
       return objArray;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­LAY_TIME_DOWN_OBSERVABLE\)");
       this.p = obj;
       obj = this.r8("DETAIL_PLAY_SCENE_RECORD");
       a.o(obj, "inject\(AccessIds.DETAIL_PLAY_SCENE_RECORD\)");
       this.A = obj;
       obj = this.r8("DETAIL_PLAY_PROGRESS_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­PLAY_PROGRESS_OBSERVABLE\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.u = obj;
       obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.w = obj;
       obj = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.x = obj;
       this.E = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.v = obj;
       obj = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       a.o(obj, "inject\(AccessIds.PREPARE¡­IN_PICTURE_MODE_OBSERVER\)");
       this.y = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.z = obj;
       this.G = this.s8(NasaBizParam.class);
       return;
    }
    public final void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "17")) {
          return;
       }
       a.p(p0, "shownEvent");
       SlidePlaySwitchNextNebulaFollowGuidePresenter tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       if (tr.Vg().a()) {
          tr = this.A;
          if (tr == null) {
             a.S("mSlidePlaySceneRecord");
          }
          tr.b((p0.a ^ 0x01), 4);
       }
       return;
    }
}
