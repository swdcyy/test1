package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$mNetworkState$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$d;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$e;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$c;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import xl8.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$f;
import z5c.l0;
import erd.g;
import crd.b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.ProfileReboundBehavior;
import z5c.h3;
import sj.k;
import qrd.l1;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import j5c.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$g;
import erd.o;
import brd.w;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$h;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$i;
import android.view.TextureView$SurfaceTextureListener;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import m4c.d;
import java.lang.Boolean;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import java.util.HashMap;
import u99.d;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import q2b.h$b;
import k2b.u1;
import ekd.m1;
import android.view.ViewStub;
import io.reactivex.subjects.PublishSubject;

public final class ProfileHeaderBackgroundLivePresenter extends PresenterV2	// class@0014c3
{
    public LivePlayTextureView A;
    public View B;
    public KwaiImageView C;
    public LottieAnimationView D;
    public LottieAnimationView E;
    public long F;
    public int G;
    public BaseFeed H;
    public BaseFeed I;
    public LiveAutoPlayModule J;
    public ProfileReboundBehavior K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final p P;
    public final int[] Q;
    public final k R;
    public final NetworkState$a S;
    public final TextureView$SurfaceTextureListener T;
    public final y U;
    public b p;
    public PublishSubject q;
    public AppBarLayout r;
    public ProfileParam s;
    public BaseProfileFragment t;
    public a u;
    public ViewStub v;
    public View w;
    public KwaiImageView x;
    public ImageView y;
    public FrameAutoPlayCard z;
    public static final ProfileHeaderBackgroundLivePresenter$a V;

    static {
       ProfileHeaderBackgroundLivePresenter.V = new ProfileHeaderBackgroundLivePresenter$a(null);
    }
    public void ProfileHeaderBackgroundLivePresenter(){
       super();
       this.L = 1;
       this.P = s.c(ProfileHeaderBackgroundLivePresenter$mNetworkState$2.INSTANCE);
       this.Q = new int[2]{6,7};
       this.R = new ProfileHeaderBackgroundLivePresenter$d(this);
       this.S = new ProfileHeaderBackgroundLivePresenter$b(this);
       this.T = new ProfileHeaderBackgroundLivePresenter$e(this);
       this.U = new ProfileHeaderBackgroundLivePresenter$c(this);
    }
    public static final BaseProfileFragment P8(ProfileHeaderBackgroundLivePresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final ProfileParam R8(ProfileHeaderBackgroundLivePresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mParam");
       }
       return p0;
    }
    public void E8(){
       g a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderBackgroundLivePresenter.class, "4")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter tp = this.p;
       if (tp == null) {
          a.S("mBackgroundStatus");
       }
       a = l0.a;
       this.X7(tp.observable().subscribe(new ProfileHeaderBackgroundLivePresenter$f(this), a));
       tp = this.r;
       if (tp == null) {
          a.S("mAppBarLayout");
       }
       ProfileReboundBehavior profileRebou = h3.a(tp);
       if (profileRebou != null) {
          profileRebou.N(this.R);
          objArray = profileRebou;
       }
       this.K = objArray;
       tp = this.t;
       if (tp == null) {
          a.S("mFragment");
       }
       t ot = tp.Vg().g();
       ProfileHeaderBackgroundLivePresenter tu = this.u;
       if (tu == null) {
          a.S("mAppBarScrollState");
       }
       this.X7(t.merge(ot, tu.b().map(ProfileHeaderBackgroundLivePresenter$g.b)).subscribe(new ProfileHeaderBackgroundLivePresenter$h(this), a));
       tp = this.q;
       if (tp == null) {
          a.S("mOnConfigurationChangedPublisher");
       }
       this.X7(tp.delay(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new ProfileHeaderBackgroundLivePresenter$i(this)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter.class, "7")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter tA = this.A;
       if (tA != null) {
          tA.g(this.T);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter.class, "6")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter tK = this.K;
       if (tK != null) {
          tK.T(this.R);
       }
       if (this.J != null) {
          this.a9("unbind");
          tK = this.J;
          if (tK != null) {
             tK.e0(this.U);
          }
          tK = this.z;
          if (tK != null) {
             tK.q();
          }
          this.V8().c(this.S);
       }
       return;
    }
    public final int S8(int p0,int p1){
       p0 = (p1 == 1)? (p0 * 3) / 5: (p0 * 150) / 414;
       return p0;
    }
    public final NetworkState V8(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundLivePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.getValue();
    }
    public final void W8(int p0,int p1,FrameAutoPlayCard p2,LivePlayTextureView p3){
       ProfileHeaderBackgroundLivePresenter this;
       LiveStreamFeed this1;
       boolean this1;
       d a;
       ProfileHeaderBackgroundLivePresenter profileHeade = this;
       int i = p0;
       int i1 = p1;
       Object obj = p2;
       object oobject = p3;
       if (PatchProxy.isSupport(ProfileHeaderBackgroundLivePresenter.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, ProfileHeaderBackgroundLivePresenter.class, "19")) {
          return;
       }
       String str = "playView";
       a.p(obj, str);
       int i2 = n.z(this.getContext());
       int i3 = profileHeade.S8(i2, profileHeade.G);
       ProfileHeaderBackgroundLivePresenter y = profileHeade.y;
       this = profileHeade.H;
       Object obj1 = null;
       if (!this instanceof LiveStreamFeed) {
          this = obj1;
       }
       int i4 = 0;
       int i5 = 1;
       if (this != null) {
          this1 = this.mConfig;
          if (this1 != null && this1.mLandscape == i5) {
             this1 = true;
          label_0059 :
             if (PatchProxy.isSupport(d.class)) {
                Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(i2),Integer.valueOf(i3),obj,oobject,y,Boolean.valueOf(this1)};
                if (!PatchProxy.applyVoid(objArray, obj1, d.class, "2")) {
                label_0098 :
                   a.p(obj, str);
                   if (i && i1) {
                      a = d.a;
                      float f = a.a(i, i1);
                      float f1 = a.a(i2, i3);
                      if (this1) {
                         if (f - f1 < 0) {
                            i4 = (int)((float)i2 / f);
                            d.e(oobject, i2, i4, 17);
                            a.d(y, i2, i4);
                            a.d(obj, i2, i3);
                         }else {
                            i4 = (int)((float)i3 * f);
                            d.e(oobject, i4, i3, 17);
                            a.d(y, i4, i3);
                            a.d(obj, i2, i3);
                         }
                      }else {
                         a.d(y, i2, (int)((float)i2 / f));
                         a.d(obj, i2, i3);
                         int i6 = (i1 * i2) / i;
                         int i7 = i6 / 3;
                         d.e(oobject, i2, i6, -1);
                         i3 = i3 / 2;
                         if (i3 < i7 && oobject != null) {
                            oobject.setTranslationY((float)(i3 - i7));
                         }
                      }
                   }
                }
             }else {
                goto label_0098 ;
             }
             return;
          }
       }
       this1 = false;
       goto label_0059 ;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter.class, "22")) {
          return;
       }
       View[] viewArray = new View[]{this.x};
       n.Z(0, viewArray);
       View[] viewArray1 = new View[]{this.y};
       n.Z(8, viewArray1);
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter.class, "17")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter tD = this.D;
       if (tD != null && (tD != null && !tD.p())) {
          tD = this.D;
          if (tD != null) {
             tD.setRepeatCount(-1);
          }
          tD = this.D;
          if (tD != null) {
             tD.s();
          }
       }
    label_0027 :
       tD = this.E;
       if (tD != null && (tD != null && !tD.p())) {
          tD = this.E;
          if (tD != null) {
             tD.setRepeatCount(-1);
          }
          tD = this.E;
          if (tD != null) {
             tD.s();
          }
       }
    label_0041 :
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter.class, "18")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter tD = this.D;
       if (tD != null && tD.p() == true) {
          tD = this.D;
          if (tD != null) {
             tD.f();
          }
       }
       tD = this.E;
       if (tD != null && tD.p() == true) {
          tD = this.E;
          if (tD != null) {
             tD.f();
          }
       }
       return;
    }
    public final void a9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter.class, "20")) {
          return;
       }
       this.Z8();
       ProfileHeaderBackgroundLivePresenter tH = this.H;
       ProfileHeaderBackgroundLivePresenter tJ = this.J;
       ProfileHeaderBackgroundLivePresenter tt = this.t;
       if (tt == null) {
          a.S("mFragment");
       }
       d.h("ProfileHeaderBackgroundLivePresenter", "stopPlay", d.c(tH, tJ, tt, "reason", p0));
       ProfileHeaderBackgroundLivePresenter tJ1 = this.J;
       if (tJ1 != null) {
          tJ1.m0(LiveStopReason.SLIDE_AWAY);
       }
       return;
    }
    public final void b9(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderBackgroundLivePresenter.class, "24")) {
          return;
       }
       if (!this.F) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       ProfileHeaderBackgroundLivePresenter tH = this.H;
       if (!tH instanceof LiveStreamFeed) {
          tH = objArray;
       }
       if (tH != null) {
          LiveStreamFeed mLiveStreamM = tH.mLiveStreamModel;
          if (mLiveStreamM != null) {
             LiveStreamModel mAudienceCou = mLiveStreamM.mAudienceCount;
          label_0031 :
             if (!TextUtils.x(mAudienceCou)) {
                tH = this.H;
                if (!tH instanceof LiveStreamFeed) {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   mLiveStreamM = objArray1.mLiveStreamModel;
                   if (mLiveStreamM != null) {
                      objArray = mLiveStreamM.mAudienceCount;
                   }
                }
             }else {
                objArray = "0";
             }
             oi3.d("online_cnt", objArray);
             oi3.c("portrait_duration", Long.valueOf((System.currentTimeMillis() - this.F)));
             oi3.c("pos", Integer.valueOf(1));
             this.F = 0;
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ProfileHeaderBackgroundLivePresenter tH1 = this.H;
             a.m(tH1);
             uContentPack.photoPackage = w1.f(tH1);
             h$b uob = h$b.e(10, "COVER_AUTO_PLAY");
             uob.h(uContentPack);
             a.o(uob, "taskEventBuilder.setContentPackage\(contentPackage\)");
             uob.k(uElementPack);
             u1.r0(uob);
             return;
          }
       }
       objArray1 = objArray;
       goto label_0031 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.app_bar_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.r = view;
       p0 = m1.f(p0, R.id.profile_background_live);
       a.o(p0, "ViewBindUtils.bindWidget¡­.profile_background_live\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("PROFILE_BACKGROUND_STYLE");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­PROFILE_BACKGROUND_STYLE\)");
       this.p = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.s = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.t = obj;
       obj = this.r8("PROFILE_APP_BAR_SCROLL_STATE");
       a.o(obj, "inject\(ProfileCommonAcce¡­ILE_APP_BAR_SCROLL_STATE\)");
       this.u = obj;
       obj = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FIGURATION_CHANGED_EVENT\)");
       this.q = obj;
       return;
    }
}
