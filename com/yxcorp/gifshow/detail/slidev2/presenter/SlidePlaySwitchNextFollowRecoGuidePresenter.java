package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$d;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$c;
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
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$e;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$f;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$h;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$i;
import com.yxcorp.gifshow.util.rx.RxBus;
import uic.a0;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$j;
import erd.o;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$k;
import erd.r;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$l;
import io.reactivex.internal.functions.Functions;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import java.util.List;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gv5.a;
import com.kwai.framework.model.feed.BaseFeed;
import xx9.a;
import uw9.o;
import java.lang.StringBuilder;
import kp.r1;
import q87.c;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import s4a.g;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$m;
import s4a.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import im8.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.System;
import java.lang.Long;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import mhc.y1;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter extends PresenterV2	// class@0018dc
{
    public a A;
    public g B;
    public boolean C;
    public boolean D;
    public boolean E;
    public f F;
    public a G;
    public NasaBizParam H;
    public final e I;
    public final a J;
    public boolean K;
    public final p L;
    public final IMediaPlayer$OnInfoListener M;
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
    public static final SlidePlaySwitchNextFollowRecoGuidePresenter$a N;

    static {
       SlidePlaySwitchNextFollowRecoGuidePresenter.N = new SlidePlaySwitchNextFollowRecoGuidePresenter$a(null);
    }
    public void SlidePlaySwitchNextFollowRecoGuidePresenter(){
       super();
       this.I = new SlidePlaySwitchNextFollowRecoGuidePresenter$d(this);
       this.J = new SlidePlaySwitchNextFollowRecoGuidePresenter$b(this);
       this.K = true;
       this.L = s.c(new SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2(this));
       this.M = new SlidePlaySwitchNextFollowRecoGuidePresenter$c(this);
    }
    public static final a P8(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("mSlidePlaySceneRecord");
       }
       return p0;
    }
    public static final SlidePlayViewModel R8(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public static final u S8(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "3")) {
          return;
       }
       u1.a(this);
       b uob = d.a(0x6c2883df);
       a.o(uob, "PluginManager.get\(Follow¡­DetailPlugin::class.java\)");
       this.G = uob.hZ();
       SlidePlaySwitchNextFollowRecoGuidePresenter tr = this.r;
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
       SlidePlaySwitchNextFollowRecoGuidePresenter tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tr1, this.J);
       tr = this.q;
       if (tr == null) {
          a.S("mDetailPlayedProgressObservable");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextFollowRecoGuidePresenter$e(this)));
       tr = this.p;
       if (tr == null) {
          a.S("mDetailPlayedTimeDown");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextFollowRecoGuidePresenter$f(this)));
       tr = this.w;
       if (tr == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextFollowRecoGuidePresenter$g(this)));
       tr = this.x;
       if (tr == null) {
          a.S("mAiTextFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextFollowRecoGuidePresenter$h(this)));
       tr = this.y;
       if (tr == null) {
          a.S("mPreparePipModeObserver");
       }
       this.X7(tr.subscribe(new SlidePlaySwitchNextFollowRecoGuidePresenter$i(this)));
       this.X7(RxBus.f.f(a0.class).distinctUntilChanged(SlidePlaySwitchNextFollowRecoGuidePresenter$j.b).filter(new SlidePlaySwitchNextFollowRecoGuidePresenter$k(this)).subscribe(new SlidePlaySwitchNextFollowRecoGuidePresenter$l(this), Functions.d()));
       tr = this.u;
       if (tr == null) {
          a.S("mDetailPlayModule");
       }
       tr.getPlayer().addOnInfoListener(this.M);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "4")) {
          return;
       }
       u1.b(this);
       SlidePlaySwitchNextFollowRecoGuidePresenter tu = this.u;
       if (tu == null) {
          a.S("mDetailPlayModule");
       }
       tu.getPlayer().removeOnInfoListener(this.M);
       tu = this.s;
       if (tu == null) {
          a.S("mSlidePlayViewModel");
       }
       SlidePlaySwitchNextFollowRecoGuidePresenter tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       tu.D(tr, this.J);
       return;
    }
    public final long V8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       FollowSlideRecoGuide uFollowSlide = this.a9(p0);
       long l = (uFollowSlide != null)? uFollowSlide.mShowInterval * (long)1000: -0.00f;
       SlidePlaySwitchNextFollowRecoGuidePresenter tu = this.u;
       if (tu == null) {
          a.S("mDetailPlayModule");
       }
       e player = tu.getPlayer();
       a.o(player, "mDetailPlayModule.player");
       long duration = player.getDuration();
       if (duration - l <= 0) {
          l = (long)((double)duration * 0x3fe3333333333333);
       }
       return l;
    }
    public final QPhoto W8(){
       Object[] objArray = null;
       SlidePlaySwitchNextFollowRecoGuidePresenter obj = PatchProxy.apply(objArray, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       String str = "mSlidePlayViewModel";
       if (obj == null) {
          a.S(str);
       }
       List list = obj.e0();
       SlidePlaySwitchNextFollowRecoGuidePresenter ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       int i = ts.a0() + 1;
       if (list.size() > i) {
          objArray = list.get(i);
       }
       return objArray;
    }
    public final SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a X8(){
       Object obj = PatchProxy.apply(null, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public final int Y8(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "18");
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
    public final boolean Z8(QPhoto p0){
       CharSequence uCharSequenc;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       FollowSlideRecoGuide uFollowSlide = this.a9(p0);
       uFollowSlide = (uFollowSlide != null)? uFollowSlide.mType: null;
       return TextUtils.n(uFollowSlide, "slide_play_auto_next_guide_text");
    }
    public final FollowSlideRecoGuide a9(QPhoto p0){
       FollowSlideRecoGuide uFollowSlide;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.mEntity;
          if (p0 != null) {
             uFollowSlide = a.a.a(p0);
          label_001d :
             return uFollowSlide;
          }
       }
       uFollowSlide = null;
       goto label_001d ;
    }
    public final String b9(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FollowSlideRecoGuide uFollowSlide = this.a9(p0);
       if (uFollowSlide != null) {
          uFollowSlide = uFollowSlide.mToastReason;
          if (uFollowSlide != null) {
          label_001c :
             return uFollowSlide;
          }
       }
       String str = "";
       goto label_001c ;
    }
    public final long c9(QPhoto p0){
       long l;
       FollowSlideRecoGuide obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       FollowSlideRecoGuide uFollowSlide = this.a9(p0);
       obj = (uFollowSlide != null)? uFollowSlide.mShowDuration: 5;
       return obj;
    }
    public final void d9(QPhoto p0){
       int b;
       boolean b1;
       SlidePlaySwitchNextFollowRecoGuidePresenter tB;
       List list;
       SlidePlaySwitchNextFollowRecoGuidePresenter tt;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "6")) {
          return;
       }
       c$b obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "16");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          SlidePlaySwitchNextFollowRecoGuidePresenter tA = this.A;
          if (tA == null) {
             a.S("mSlidePlaySceneRecord");
          }
          if (tA.a()) {
             FollowSlideRecoGuide uFollowSlide2 = this.a9(p0);
             if (uFollowSlide2 != null && uFollowSlide2.mRecoGuideHasShowed == null) {
                uFollowSlide2 = this.a9(p0);
                if (uFollowSlide2 != null && uFollowSlide2.mFollowGuideV2HasShowed == null) {
                   uFollowSlide2 = this.a9(p0);
                   if (uFollowSlide2 != null && uFollowSlide2.mFollowGuideV1HasShowed == null) {
                      tA = this.s;
                      str1 = "mSlidePlayViewModel";
                      if (tA == null) {
                         a.S(str1);
                      }
                      if (tA.C() && (!TextUtils.x(this.b9(p0)) && (this.C == null && this.D == null))) {
                         tA = this.s;
                         if (tA == null) {
                            a.S(str1);
                         }
                         List list1 = tA.I0();
                         b = (list1 != null)? list1.size(): 0;
                         if (b > 1) {
                            tA = this.s;
                            if (tA == null) {
                               a.S(str1);
                            }
                            b = tA.a0();
                            SlidePlaySwitchNextFollowRecoGuidePresenter ts = this.s;
                            if (ts == null) {
                               a.S(str1);
                            }
                            if (b != (ts.Q() - 1)) {
                               tA = this.s;
                               if (tA == null) {
                                  a.S(str1);
                               }
                               if (!tA.b1() - null) {
                                  Object obj2 = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "17");
                                  if (obj2 != patchProxyRe) {
                                     b = obj2.booleanValue();
                                  }else if(this.Z8(p0)){
                                     tA = this.G;
                                     list1 = (tA != null)? tA.c(): null;
                                     b = this.Y8(list1);
                                     tt = this.G;
                                     int i1 = (tt != null)? tt.d(): 1;
                                     if (b >= i1) {
                                        b = false;
                                     }
                                  }
                                  b = true;
                                  if (b) {
                                     tA = this.v;
                                     if (tA == null) {
                                        a.S("mScreenCleanStatusCombination");
                                     }
                                     if (!tA.c()) {
                                        b = true;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       label_00f0 :
          b = false;
       }
       if (!b) {
          return;
       }else {
          Object[] objArray = new Object[i];
          o.C().w("FollowRecoGuidePresenter", "showGuidePopup"+r1.t1(p0.mEntity), objArray);
          Activity activity = this.getActivity();
          a.m(activity);
          obj = new c$b(activity);
          long l = this.c9(p0) * 1000;
          Object obj1 = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.c9(p0) - 1000 >= 0){
             i = 1;
          }
          b1 = i;
          this.B = new g(obj, l, b1);
          if (this.Z8(p0)) {
             tB = this.B;
             if (tB != null) {
                tB.e0(1);
             }
             tB = this.B;
             if (tB != null) {
                tB.d0(TextUtils$TruncateAt.MIDDLE);
             }
          }else {
             tB = this.B;
             if (tB != null) {
                tB.e0(1);
             }
             tB = this.B;
             if (tB != null) {
                tB.d0(TextUtils$TruncateAt.END);
             }
          }
          tB = this.B;
          if (tB != null) {
             tB.g0(this.b9(p0), R.raw.arg_RES_7f0f008a);
          }
          tB = this.B;
          if (tB != null) {
             tB.c0(new SlidePlaySwitchNextFollowRecoGuidePresenter$m(this, p0));
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "14")) {
             ShowMetaData showMetaData = new ShowMetaData();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ELSE_TEXT_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("text", this.b9(p0));
             FollowSlideRecoGuide uFollowSlide1 = this.a9(p0);
             String str = "";
             if (uFollowSlide1 != null) {
                uFollowSlide1 = uFollowSlide1.mTextType;
                if (uFollowSlide1 != null) {
                label_01bd :
                   oi3.d("text_type", uFollowSlide1);
                   uFollowSlide1 = this.a9(p0);
                   if (uFollowSlide1 != null) {
                      uFollowSlide1 = uFollowSlide1.mType;
                      if (uFollowSlide1 != null) {
                         str = uFollowSlide1;
                      }
                   }
                   oi3.d("type", str);
                   uElementPack.params = oi3.e();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   tt = this.t;
                   if (tt == null) {
                      a.S("mPhoto");
                   }
                   uContentPack.photoPackage = w1.f(tt.mEntity);
                   showMetaData.setElementPackage(uElementPack);
                   showMetaData.setContentPackage(uContentPack);
                   u1.B0(showMetaData);
                }
             }
             str1 = str;
             goto label_01bd ;
          }
          QPhoto mEntity = p0.mEntity;
          if (mEntity != null) {
             FollowSlideRecoGuide uFollowSlide = a.a.a(mEntity);
             if (uFollowSlide != null) {
                uFollowSlide.mRecoGuideHasShowed = true;
             }
          }
          tB = this.F;
          if (tB != null) {
             tB.set(Boolean.TRUE);
          }
          tB = this.H;
          if (tB != null) {
             NasaSlideParam nasaSlidePar = tB.getNasaSlideParam();
             if (nasaSlidePar != null) {
                nasaSlidePar.mIsRecoGuideHasShowed = true;
             }
          }
          if (this.Z8(p0)) {
             long l1 = System.currentTimeMillis();
             if (!PatchProxy.isSupport(SlidePlaySwitchNextFollowRecoGuidePresenter.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "7")) {
                SlidePlaySwitchNextFollowRecoGuidePresenter tG = this.G;
                if (tG != null) {
                   list = tG.c();
                   if (list != null) {
                   label_0247 :
                      if (!this.Y8(list)) {
                         list = new ArrayList();
                      }
                      list.add(Long.valueOf(l1));
                      tB = this.G;
                      if (tB != null) {
                         tB.b(list);
                      }
                   }
                }
                list = new ArrayList();
                goto label_0247 ;
             }
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "1")) {
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
       this.F = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.v = obj;
       obj = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       a.o(obj, "inject\(AccessIds.PREPARE¡­IN_PICTURE_MODE_OBSERVER\)");
       this.y = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.z = obj;
       this.H = this.s8(NasaBizParam.class);
       return;
    }
    public final void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "20")) {
          return;
       }
       a.p(p0, "shownEvent");
       SlidePlaySwitchNextFollowRecoGuidePresenter tr = this.r;
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
