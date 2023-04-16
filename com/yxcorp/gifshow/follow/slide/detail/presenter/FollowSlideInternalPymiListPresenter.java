package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$mUserListAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$mLayoutManager$2;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$mUserFollowState$2;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$mViewPagerState$2;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$b;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$c;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$onBind$1;
import fia.u;
import msd.l;
import erd.g;
import crd.b;
import eda.n;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$e;
import kotlin.jvm.internal.a;
import java.util.Objects;
import cia.w;
import ge5.d;
import joc.d;
import joc.c;
import hf5.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import tw6.e;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$f;
import kga.c;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$g;
import dha.i;
import fia.p;
import erd.r;
import fia.q;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import fia.r;
import zha.a;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import fia.s;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import lnc.b9;
import android.view.View;
import com.yxcorp.utility.n;
import cha.a;
import java.lang.Integer;
import bia.h;
import vha.c;
import com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.a;
import java.lang.Math;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import gha.r;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import xga.b;
import com.yxcorp.gifshow.log.d0;
import lnc.i3;
import xha.a;
import com.yxcorp.gifshow.log.c0;
import k2b.e0;
import uh5.e;
import xha.b;
import ekd.m1;
import fia.x;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;

public class FollowSlideInternalPymiListPresenter extends PresenterV2 implements g	// class@001123
{
    public final p A;
    public b B;
    public boolean C;
    public final p D;
    public final FollowSlideInternalPymiListPresenter$b E;
    public final RecyclerView$r F;
    public final e G;
    public a H;
    public final p p;
    public b q;
    public b r;
    public NasaBizParam s;
    public View t;
    public int u;
    public w v;
    public int w;
    public final p x;
    public b y;
    public PymiUserRecyclerView z;
    public static final FollowSlideInternalPymiListPresenter$a I;

    static {
       FollowSlideInternalPymiListPresenter.I = new FollowSlideInternalPymiListPresenter$a(null);
    }
    public void FollowSlideInternalPymiListPresenter(){
       super();
       this.p = s.c(FollowSlideInternalPymiListPresenter$mUserListAdapter$2.INSTANCE);
       this.x = s.c(new FollowSlideInternalPymiListPresenter$mLayoutManager$2(this));
       this.A = s.c(FollowSlideInternalPymiListPresenter$mUserFollowState$2.INSTANCE);
       this.B = new b(Boolean.FALSE);
       this.D = s.c(new FollowSlideInternalPymiListPresenter$mViewPagerState$2(this));
       this.E = new FollowSlideInternalPymiListPresenter$b(this);
       this.F = new FollowSlideInternalPymiListPresenter$c(this);
       this.G = new FollowSlideInternalPymiListPresenter$d(this);
    }
    public void E8(){
       FollowSlideInternalPymiListPresenter tv;
       g a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowSlideInternalPymiListPresenter uFollowSlide = FollowSlideInternalPymiListPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFollowSlide, "14")) {
          return;
       }
       c.i(KsLogFollowTag.NIRVANA_PYMI.appendTag("FollowSlideInternalPymiListPresenter"), "onBind");
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(l.class, mAIN).subscribe(new u(new FollowSlideInternalPymiListPresenter$onBind$1(this))));
       this.X7(f.g(n.class, mAIN).subscribe(new FollowSlideInternalPymiListPresenter$e(this)));
       String str = "mFollowSlideInjectAdapter";
       if (!PatchProxy.applyVoid(objArray, this, uFollowSlide, "18") && this.X8()) {
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          FollowSlideInternalPymiListPresenter tE = this.E;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoidOneRefs(tE, tv, w.class, "5")) {
             w j = tv.j;
             if (j != null) {
                d b = j.b;
                if (b != null) {
                   b.k(tE);
                }
             }
             w f1 = tv.f;
             if (f1 != null) {
                f1.q9(tE);
             }
          }
       }
    label_0083 :
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = tv.O();
       if (slidePlayVie != null) {
          slidePlayVie.c0(this.G);
       }
       tv = this.r;
       if (tv == null) {
          a.S("mPymiContainerVisibleObservableData");
       }
       a = c.a;
       this.X7(tv.observable().distinctUntilChanged().subscribe(new FollowSlideInternalPymiListPresenter$f(this), a));
       tv = this.q;
       if (tv == null) {
          a.S("mPymiTipsShowResponseObservableData");
       }
       this.X7(tv.observable().subscribe(new FollowSlideInternalPymiListPresenter$g(this), a));
       if (!PatchProxy.applyVoid(objArray, this, uFollowSlide, "15")) {
          i oi = PatchProxy.apply(objArray, this, uFollowSlide, "8");
          if (oi == patchProxyRe) {
             oi = this.A.getValue();
          }
          this.X7(oi.b().filter(p.b).map(q.b).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new r(this), a));
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowSlide, "17")) {
          t ot = PatchProxy.apply(objArray, this, uFollowSlide, "16");
          if (ot != patchProxyRe) {
          }else {
             PymiTipsShowResponse pymiTipsShow = a.b().a("FOLLOW_PYMI_LIST");
             if (pymiTipsShow != null) {
                PymiTipsShowResponse mPymiUserBar = pymiTipsShow.mPymiUserBar;
                PymiTipsShowResponse$PymiTipModel mInfos = (mPymiUserBar != null)? mPymiUserBar.mInfos: objArray;
                if (!q.f(mInfos)) {
                   mPymiUserBar = pymiTipsShow.mPymiUserBar;
                   if (mPymiUserBar != null) {
                      objArray = mPymiUserBar.mInfos;
                   }
                   a.m(objArray);
                   Iterator iterator = objArray.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().resetState();
                   }
                }
                ot = t.just(pymiTipsShow);
                a.o(ot, "Observable.just\(it\)");
             }else {
                ot = t.empty();
                a.o(ot, "Observable.empty\(\)");
             }
          }
          this.X7(ot.subscribe(new s(this), c.a));
       }
       return;
    }
    public void J8(){
       FollowSlideInternalPymiListPresenter uFollowSlide = FollowSlideInternalPymiListPresenter.class;
       if (PatchProxy.applyVoid(null, this, uFollowSlide, "20")) {
          return;
       }
       String str = "mFollowSlideInjectAdapter";
       if (!PatchProxy.applyVoid(null, this, uFollowSlide, "19")) {
          c.i(KsLogFollowTag.NIRVANA_PYMI.appendTag("FollowSlideInternalPymiListPresenter"), "removeHorizontalTouchInterceptorIfNeed");
          if (this.X8()) {
             uFollowSlide = this.v;
             if (uFollowSlide == null) {
                a.S(str);
             }
             FollowSlideInternalPymiListPresenter tE = this.E;
             Objects.requireNonNull(uFollowSlide);
             if (!PatchProxy.applyVoidOneRefs(tE, uFollowSlide, w.class, "6")) {
                w j = uFollowSlide.j;
                if (j != null) {
                   d b = j.b;
                   if (b != null) {
                      b.t(tE);
                   }
                }
                w f = uFollowSlide.f;
                if (f != null) {
                   f.m3(tE);
                }
             }
          }
       }
       uFollowSlide = this.v;
       if (uFollowSlide == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = uFollowSlide.O();
       if (slidePlayVie != null) {
          slidePlayVie.d0(this.G);
       }
       uFollowSlide = this.z;
       if (uFollowSlide != null) {
          a.m(uFollowSlide);
          uFollowSlide.removeOnScrollListener(this.F);
       }
       b9.a(this.y);
       this.y = null;
       return;
    }
    public final void P8(List p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter.class, "23")) {
          return;
       }
       int i = 1;
       if (q.f(p0)) {
          View[] viewArray = new View[i];
          viewArray[0] = this.t;
          n.Z(8, viewArray);
       }
       a uoa = this.W8();
       Objects.requireNonNull(uoa);
       Object obj = PatchProxy.apply(null, uoa, a.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Integer integer = uoa.a.a();
          if (integer == null || integer.intValue()) {
             i = 0;
          }
          b = i;
       }
       if (b) {
          this.Y8();
       }
       if (p0 != null) {
          this.V8().t1(p0);
          this.V8().s1(p0);
       }
       return;
    }
    public final FeedsLayoutManager R8(){
       Object obj = PatchProxy.apply(null, this, FollowSlideInternalPymiListPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public final b S8(){
       FollowSlideInternalPymiListPresenter obj = PatchProxy.apply(null, this, FollowSlideInternalPymiListPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPymiTipsShowResponseObservableData");
       }
       return obj;
    }
    public final h V8(){
       Object obj = PatchProxy.apply(null, this, FollowSlideInternalPymiListPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final a W8(){
       Object obj = PatchProxy.apply(null, this, FollowSlideInternalPymiListPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final boolean X8(){
       boolean b;
       FollowSlideInternalPymiListPresenter obj = PatchProxy.apply(null, this, FollowSlideInternalPymiListPresenter.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj != null) {
          NasaSlideParam nasaSlidePar = obj.getNasaSlideParam();
          if (nasaSlidePar != null) {
             b = nasaSlidePar.isFollowNasaDetail();
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public final void Y8(){
       FollowSlideInternalPymiListPresenter tv;
       PymiTipsShowResponse pymiTipsShow;
       PymiTipsShowResponse mPymiUserBar;
       b a;
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, FollowSlideInternalPymiListPresenter.class, "24")) {
          return;
       }
       FollowSlideInternalPymiListPresenter tz = this.z;
       if (tz == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = (tz != null)? tz.getLayoutManager(): null;
       if (!layoutManage instanceof LinearLayoutManager) {
          layoutManage = null;
       }
       int i = (layoutManage != null)? layoutManage.c(): -1;
       i = Math.min((i + 1), this.V8().getItemCount());
       int i1 = 0;
       while (i1 < i) {
          Object obj = this.V8().N0(i1);
          if (obj != null && obj.mIsShown == null) {
             if (!PatchProxy.isSupport(FollowSlideInternalPymiListPresenter.class) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i1), this, FollowSlideInternalPymiListPresenter.class, "26")) {
                tv = this.q;
                if (tv == null) {
                   a.S("mPymiTipsShowResponseObservableData");
                }
                pymiTipsShow = tv.a();
                mPymiUserBar = (pymiTipsShow != null)? pymiTipsShow.mPymiUserBar: null;
                if (mPymiUserBar != null) {
                   mPymiUserBar = pymiTipsShow.mPymiUserBar;
                   FollowingUserBannerFeed uFollowingUs = r.a(mPymiUserBar.mFeedId, mPymiUserBar.mExpTag, mPymiUserBar.mType, obj);
                   r1.g5(uFollowingUs, i1);
                   r1.Y4(uFollowingUs, pymiTipsShow.mLlsid);
                   b uob = new b(uFollowingUs);
                   a = uob.a;
                   a.o(a, "feedLoggerCard.mFeed");
                   d0 uod0 = d0.d(a, a.getId(), uob.h);
                   i3 oi3 = i3.f();
                   oi3.d("follow_group_id", a.c());
                   oi3.d("follow_live_source", "live_top");
                   uod0.c(oi3.e());
                   c0.q().n(uod0);
                }
             }
             tv = this.v;
             if (tv == null) {
                a.S("mFollowSlideInjectAdapter");
             }
             a.g(tv.N(), obj, "LIVE_IN_PROCESS_VISITED_AUTHOR_HEAD", -1, i1, null, this.V8().r1().size());
             if (!PatchProxy.isSupport(FollowSlideInternalPymiListPresenter.class) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i1), this, FollowSlideInternalPymiListPresenter.class, "25")) {
                tv = this.q;
                if (tv == null) {
                   a.S("mPymiTipsShowResponseObservableData");
                }
                pymiTipsShow = tv.a();
                mPymiUserBar = (pymiTipsShow != null)? pymiTipsShow.mPymiUserBar: null;
                if (mPymiUserBar != null) {
                   String str = (e.f())? "FREQUENTLY_VISITED_AUTHOR_HEAD": "LIVE_IN_PROCESS_VISITED_AUTHOR_HEAD";
                   b.c(obj, str, i1, 0, pymiTipsShow.mLlsid, "slide");
                }
             }
             obj.mIsShown = true;
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter.class, "11")) {
          return;
       }
       a.p(p0, "rootView");
       this.t = m1.f(p0, 0x7f0a335e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideInternalPymiListPresenter.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new x();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FollowSlideInternalPymiListPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FollowSlideInternalPymiListPresenter.class, new x());
       }else {
          obj.put(FollowSlideInternalPymiListPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideInternalPymiListPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("PYMI_RESPONSE_DATA");
       a.o(obj, "inject\(FollowAccessIds.PYMI_RESPONSE_DATA\)");
       this.q = obj;
       obj = this.r8("PYMI_CONTAINER_VISIBLE");
       a.o(obj, "inject\(FollowAccessIds.PYMI_CONTAINER_VISIBLE\)");
       this.r = obj;
       this.s = this.s8(NasaBizParam.class);
       obj = this.r8("NIRVANA_PYMI_CONTAINER_PADDING");
       a.o(obj, "inject\(FollowAccessIds.N¡­A_PYMI_CONTAINER_PADDING\)");
       this.u = obj.intValue();
       obj = this.r8("FOLLOW_VERSION");
       a.o(obj, "inject\(FollowAccessIds.FOLLOW_VERSION\)");
       this.w = obj.intValue();
       obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.v = obj;
       return;
    }
    public final void onLoginEvent(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter.class, "22")) {
          return;
       }
       if (p0.b != null) {
          this.V8().M0();
       }
       return;
    }
}
