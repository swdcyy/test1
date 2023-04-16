package com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ok.x;
import com.yxcorp.gifshow.util.p0;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n$a;
import java.lang.Runnable;
import lnc.z3;
import zda.c1;
import zda.d1;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n$b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n$c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n$f;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import vy6.a;
import qvb.q;
import qvb.i;
import qvb.n0;
import jb5.d;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.yxcorp.gifshow.observers.ErrorCrashLambdaObserver;
import zda.a1;
import erd.g;
import brd.y;
import brd.t;
import crd.b;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import ww6.a;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import tkd.b;
import tkd.d;
import hv5.c;
import hn5.i0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import ww6.a$a;
import lnc.k4;
import ww6.b;
import ww6.d;
import ty6.a;
import km5.i;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import zda.z0;
import io.reactivex.internal.functions.Functions;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.a1;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist;
import com.kwai.framework.init.e;
import xw6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nasa.NasaRefreshView;
import yw6.g;
import bw6.a;
import fw6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import gi5.d;
import com.kwai.framework.player.gotham.impl.KwaiSessionKeyGenerator;
import wkd.b;
import com.yxcorp.gifshow.w;
import uv8.e1;
import lnc.t5;
import elb.d;
import uv8.m1;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeFeaturedMilanoContainerFragment;
import java.lang.Boolean;
import mea.c;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.yxcorp.gifshow.featured.detail.featured.milano.d;
import yw6.d;
import uy6.h;
import ww6.c;
import rda.c;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import androidx.fragment.app.c;
import jw6.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n$e;
import ex6.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n$d;
import bx6.b;
import i8a.j;
import java.util.List;
import java.util.Collections;
import uw9.v3;
import fx6.b;
import cx6.h;
import zda.y0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.DynamicPrefetchFeedResponse;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.PrefetchHomeFeedResponse;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import o56.f;
import on5.b;
import lo5.a;
import ko5.c;
import com.kwai.kcube.TabIdentifier;
import bf5.s;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.featured.detail.featured.presenter.m;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import com.yxcorp.gifshow.featured.detail.featured.presenter.l;
import erd.r;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import zda.b1;
import qvb.f;
import com.yxcorp.gifshow.featured.detail.featured.t;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.view.ViewStub;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import zda.x0;
import ekd.m1;
import uw9.l0;

public class n extends PresenterV2	// class@000f89
{
    public PublishSubject A;
    public MilanoContainerEventBus B;
    public GifshowActivity C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public SlidePlayViewModel H;
    public String I;
    public final p0 J;
    public boolean K;
    public boolean L;
    public n$f M;
    public final z3 N;
    public final a O;
    public final q P;
    public PhotoDetailParam Q;
    public NasaBizParam R;
    public a S;
    public NasaGrootDetailVMFragment T;
    public final x p;
    public NasaRefreshView q;
    public View r;
    public View s;
    public KwaiPlayerFailedStateView t;
    public ViewStub u;
    public ViewStub v;
    public View w;
    public BaseFragment x;
    public l0 y;
    public t z;

    public void n(){
       super(null);
    }
    public void n(x p0){
       super();
       this.F = false;
       this.J = new p0(new n$a(this));
       this.K = false;
       this.L = false;
       this.N = new z3(new c1(this), new d1(this));
       this.O = new n$b(this);
       this.P = new n$c(this);
       this.p = p0;
    }
    public void n(x p0,boolean p1){
       super();
       this.F = false;
       this.J = new p0(new n$a(this));
       this.K = false;
       this.L = false;
       this.N = new z3(new c1(this), new d1(this));
       this.O = new n$b(this);
       this.P = new n$c(this);
       this.p = p0;
       this.F = p1;
    }
    public static void P8(n p0){
       n m = p0.M;
       if (m != null) {
          m.a(false);
          p0.H.g(p0.M);
       }
       p0.H.w1();
       if (p0.L != null) {
          int[] ointArray = new int[]{2};
          p0.H.Q1(1, ointArray);
          p0.N.a("lazyThirdFragment");
       }else {
          p0.H.P1(false);
       }
       return;
    }
    public static void R8(n p0){
       p0.L = false;
       p0.H.w1();
       int[] ointArray = new int[]{1};
       p0.H.Q1(false, ointArray);
    }
    public void E8(){
       int i;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "13")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.x);
       this.H = slidePlayVie;
       slidePlayVie.E(this.O);
       this.H.e(this.P);
       if (this.F != null && this.D == null) {
          n0 on0 = this.H.X0();
          if (on0 instanceof d) {
             on0.M(RefreshType.PRELOAD_FRAGMENT);
          }
       }
       boolean b = false;
       this.H.T(b);
       ErrorCrashLambdaObserver uErrorCrashL = new ErrorCrashLambdaObserver(new a1(this));
       this.z.subscribe(uErrorCrashL);
       this.X7(uErrorCrashL);
       if (!PatchProxy.applyVoid(objArray, this, on, "3")) {
          on = this.x;
          if (on instanceof HomeMilanoBaseContainerFragment) {
             this.Q = on.wh();
             this.R = this.x.vh();
             this.S = this.x.uh();
          }else if(FollowConfigUtil.i()){
             i = 0x4999d7cf;
             if (d.a(i).pW(this.x)) {
                this.Q = d.a(i).Im(this.x);
                this.R = d.a(i).A5(this.x);
                this.S = d.a(i).r10(this.x);
             }
          }
          i0.b("CheckHomeMilano", "inElse");
          PhotoDetailParam photoDetailP = new PhotoDetailParam();
          this.Q = photoDetailP;
          photoDetailP.setSource(this.x.f()).setBizType(4);
          this.Q.getSlidePlayConfig().setEnableLazyLoad(b);
          boolean b1 = true;
          this.Q.getDetailPlayConfig().setUseHardDecoder(b1);
          this.Q.getSlidePlayConfig().setEnableSlidePositionChangeEvent(b1);
          this.R = new NasaBizParam();
          NasaSlideParam$a uoa = new NasaSlideParam$a();
          uoa.T("FEATURED");
          this.R.setNasaSlideParam(uoa.a());
          a$a uoa1 = new a$a();
          uoa1.i(b1);
          uoa1.g(b);
          uoa1.c("FEATURED");
          if (k4.b()) {
             int[] ointArray = new int[b1];
             ointArray[b] = b1;
             uoa1.f(new b(b1, ointArray));
          }
          uoa1.l(new d(b1, b1, a.a(90)));
          this.S = uoa1.a();
       }
       this.Z8();
       i.g(this.Q, this.R);
       this.X7(this.B.W.subscribe(new z0(this), Functions.d()));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, n.class, "12")) {
          return;
       }
       this.C = this.getActivity();
       this.w = this.getActivity().findViewById(0x7f0a007f);
       this.q.getLayoutParams().topMargin = (i.c())? n.A(this.getContext()): 0;
       this.q.setRefreshInitialOffset(0);
       this.q.setRefreshTargetOffset((float)(a1.d(R.dimen.arg_RES_7f070fb5) - 1));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "15")) {
          return;
       }
       n tT = this.T;
       if (tT != null) {
          Objects.requireNonNull(tT);
          String str = "2";
          if (!PatchProxy.applyVoidWithListener(objArray, tT, SlidePlayPhotoDetailVMFragment.class, str)) {
             if (tT.W == null) {
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
             }else {
                tT.f0();
                tT.F.s();
                DetailSlidePlayFragment d = tT.D;
                if (d != null) {
                   d.r();
                }
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
             }
          }
       }
       tT = this.J;
       e.c(tT.a);
       p0 b = tT.b;
       if (b != null) {
          b.dispose();
       }
       boolean b1 = false;
       this.K = b1;
       this.L = b1;
       n tM = this.M;
       if (tM != null) {
          tM.a(b1);
          this.H.g(this.M);
       }
       this.H.P1(b1);
       this.H.b(this.P);
       tT = this.H;
       Objects.requireNonNull(tT);
       if (!PatchProxy.applyVoid(objArray, tT, SlidePlayViewModel.class, "43")) {
          SlidePlayViewModel h = tT.h;
          if (h != null) {
             h.m();
             tT.h.u();
          }
       }
       b uob = b.e(this.I);
       if (uob != null) {
          uob.d();
       }
       return;
    }
    public boolean S8(){
       return false;
    }
    public void V8(){
       n tx;
       n tQ;
       boolean b2;
       a uoa1;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "4")) {
          return;
       }
       if (this.q.u()) {
          this.q.setRefreshing(false);
       }
       if (!this.H.Y0()) {
          return;
       }else {
          boolean b = true;
          this.D = b;
          this.Q.mPhoto = this.H.O0().get(false);
          this.Q.getDetailPlayConfig().setSharedPlaySessionKeyGeneratorInternal(new d());
          w ow = b.a(-1343064608);
          if (ow != null) {
             tx = this.x;
             ow.z().l(tx, t5.a(tx));
          }
          boolean b1 = this.X8();
          this.K = b1;
          if (b1) {
             String str = "6";
             if (!PatchProxy.applyVoid(objArray, this, on, str)) {
                d mLazyLoadThi = m1.a().mLazyLoadThirdFragment;
                this.L = mLazyLoadThi;
                tQ = this.x;
                Objects.requireNonNull(tQ);
                if (PatchProxy.isSupport(HomeFeaturedMilanoContainerFragment.class)) {
                   uoa1 = PatchProxy.applyOneRefs(Boolean.valueOf(mLazyLoadThi), tQ, HomeFeaturedMilanoContainerFragment.class, str);
                   if (uoa1 != patchProxyRe) {
                   label_00fc :
                      this.S = uoa1;
                      if (("drag").equals(m1.a().mManualInit)) {
                         n$f uof = new n$f(this, b);
                         this.M = uof;
                         this.H.i(uof);
                      }
                      str1 = "lazySecFragment";
                      if (("tti_high").equals(m1.a().mAutoInit)) {
                         this.N.b(str1, Boolean.TRUE);
                      }else {
                         this.N.b(str1, Boolean.FALSE);
                      }
                   }
                }
                a$a uoa2 = new a$a();
                uoa2.i(b);
                uoa2.g(false);
                uoa2.c("FEATURED");
                if (mLazyLoadThi != null) {
                   uoa2.f(new b(b, new int[2]{1,2}));
                }else {
                   int[] ointArray = new int[b];
                   ointArray[0] = b;
                   uoa2.f(new b(b, ointArray));
                }
                uoa2.l(new d(b, b, a.a(90)));
                c uoc1 = c.f();
                if (uoc1 != null && (uoc1.mEnablePoorNetworkOpt != null && uoc1.mDisableRetryAtLastPhoto != null)) {
                   uoa2.j(d.a);
                }
             label_00e4 :
                if (h.h) {
                   uoa2.m(new c(b, h.a(), h.b()));
                }
                uoa1 = uoa2.a();
                goto label_00fc ;
             }
          }else {
             str1 = "NasaViewPagerFragmentPresenter";
             if (p0.a()) {
                this.J.b(str1, Boolean.TRUE);
             }else if(k4.b()){
                this.J.b(str1, Boolean.FALSE);
             }
          }
          tQ = this.Q;
          c uoc = new c(this.R, tQ, tQ.mPhoto, this.C);
          tx = this.T;
          if (tx != null) {
             uoc.g = tx;
          }
          Object obj = PatchProxy.apply(objArray, this, on, "7");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else {
             n tx1 = this.x;
             b2 = (tx1 != null && (tx1 instanceof HomeFeaturedMilanoContainerFragment && SlideDispatchHelper.e()))? true: false;
          }
          if (b2) {
             uoc.f(SlideDispatchHelper.g());
          }
          a uoa = this.H.x0(this.x.getChildFragmentManager(), objArray, uoc, this.S);
          if (this.R.getNasaSlideParam().mForceDisablePullToRefresh == null) {
             uoa.p(new n$e(this));
          }
          uoa.o(new n$d(this));
          if (this.getActivity() != null && !this.getActivity().isFinishing()) {
             if (this.R.getNasaSlideParam().mEnableCaptionOpt != null) {
                this.H.h1(Collections.singletonList(new j(this.getActivity())));
             }
             this.H.i1(this.Q.mPhoto, this.y);
          }
          this.H.R1(b);
          b uob = this.H.Q0("kwai_data_source_service");
          if (uob != null) {
             uob.e().d(this.C, this.Q.mPhoto, new y0(this), objArray);
          }
          if (ow != null) {
             on = this.x;
             ow.z().d(on, t5.a(on), false);
          }
          return;
       }
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "18")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "REFRESH";
       i3 oi3 = i3.f();
       oi3.d("refresh_type", p0);
       uElementPack.params = oi3.e();
       if (this.H.getCurrentPhoto() != null) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.H.getCurrentPhoto().mEntity);
          u1.M("", this.x, 1, uElementPack, uContentPack, null);
       }
       return;
    }
    public final boolean X8(){
       n obj = PatchProxy.apply(null, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = false;
       if (obj != null && (obj instanceof HomeFeaturedMilanoContainerFragment && m1.a().mLazyLoadSecondFragment != null)) {
          obj = this.H;
          if (obj != null && obj.Y0() == 1) {
             Object obj1 = this.H.h0();
             obj = (obj1 instanceof DynamicPrefetchFeedResponse || obj1 instanceof PrefetchHomeFeedResponse)? 1: null;
             if (obj && (this.x.getActivity() != null && (this.x.getActivity().getIntent() != null && (f.b(this.x.getActivity()) && b.f.equals(c.b(this.x.getActivity()).f(this.x.getActivity().getIntent())))))) {
                b = true;
             }
          }
       }
    label_0085 :
       return b;
    }
    public void Y8(){
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "8")) {
          return;
       }
       if (this.K != null) {
          boolean b = false;
          this.K = b;
          this.L = b;
          n tN = this.N;
          e.c(tN.a);
          e.c(tN.b);
          tN = this.M;
          if (tN != null) {
             tN.a(b);
             this.H.g(this.M);
          }
          this.H.P1(b);
       }
       this.H.V1(RefreshType.PULL_DOWN);
       n tB = this.B;
       if (tB != null) {
          tB.P.onNext(new s(13));
       }
       if (!PatchProxy.applyVoid(null, this, on, "9")) {
          this.W8("pull");
          Kgi.c(m.b);
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, n.class, "14")) {
          return;
       }
       boolean b = b.f.equals(c.b(this.getActivity()).f(this.getActivity().getIntent()));
       n tx = this.x;
       if (tx instanceof HomeFeaturedMilanoContainerFragment && b) {
          z a = d.a;
          this.X7(tx.m().compose(this.x.Ug(FragmentEvent.STOP)).filter(l.b).delay(1, TimeUnit.MILLISECONDS, a).observeOn(a).subscribe(new b1(this), Functions.e));
       }
       return;
    }
    public void a9(){
    }
    public void b9(f p0,s p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "17")) {
          return;
       }
       if (p0 instanceof t) {
          RefreshType refreshType = null;
          p1 = p1.a;
          if (p1 == 2) {
             refreshType = RefreshType.BOTTOM_TAB_CLICK;
          }else if(p1 == 9){
             refreshType = RefreshType.BACK_CLICK;
          }else if(p1 == 3){
             refreshType = RefreshType.LINK_OR_PUSH;
          }else if(p1 == 6){
             refreshType = RefreshType.FOREGROUND2;
             this.W8("platform_refresh");
          }
          p0.M(refreshType);
       }
       return;
    }
    public void c9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "11")) {
          return;
       }
       this.r.setVisibility(0);
       this.r.setOnClickListener(objArray);
       this.s.setVisibility(0);
       n tt = this.t;
       if (tt != null) {
          tt.setVisibility(8);
       }
       return;
    }
    public void d9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "10")) {
          return;
       }
       int i = 0;
       this.r.setVisibility(i);
       if (this.t == null) {
          this.t = this.u.inflate();
       }
       this.t.setVisibility(i);
       this.s.setVisibility(8);
       this.t.f(new x0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a39ec);
       this.q = m1.f(p0, 0x7f0a3537);
       this.u = m1.f(p0, 0x7f0a0908);
       this.r = m1.f(p0, 0x7f0a3a1a);
       this.v = m1.f(p0, 0x7f0a2c32);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.x = this.r8("FRAGMENT");
       this.y = this.q8(l0.class);
       this.z = this.r8("NASA_REFRESH_OBSERVABLE");
       this.A = this.r8("DETAIL_PHOTO_UPDATED_EVENT");
       this.B = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
