package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mPlayListener$2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$b;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$c;
import s1c.v;
import brd.t;
import xl8.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$d;
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
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$e;
import erd.o;
import brd.w;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$f;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.io.File;
import android.content.Context;
import com.yxcorp.utility.n;
import android.net.Uri;
import m4c.t;
import lnc.a1;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import z5c.d3;
import px6.b;
import mx6.a;
import java.lang.Float;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import usd.q;
import ekd.m1;
import android.view.ViewStub;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Number;

public final class ProfileHeaderBackgroundVideoPresenter extends PresenterV2	// class@0014d0
{
    public b A;
    public PublishSubject B;
    public a C;
    public ProfileParam D;
    public User E;
    public PublishSubject F;
    public int G;
    public ProfileReboundBehavior H;
    public ProfileBgVideoInfo I;
    public ProfileBgVideoInfo J;
    public boolean K;
    public int L;
    public final p M;
    public final p N;
    public final k O;
    public AppBarLayout p;
    public ViewStub q;
    public View r;
    public KwaiPlayerKitView s;
    public KwaiImageView t;
    public ViewStub u;
    public View v;
    public SectorProgressView w;
    public TextView x;
    public BaseFragment y;
    public v z;
    public static final ProfileHeaderBackgroundVideoPresenter$a P;

    static {
       ProfileHeaderBackgroundVideoPresenter.P = new ProfileHeaderBackgroundVideoPresenter$a(null);
    }
    public void ProfileHeaderBackgroundVideoPresenter(){
       super();
       this.G = 5;
       this.L = 1;
       this.M = s.c(new ProfileHeaderBackgroundVideoPresenter$mProgressListener$2(this));
       this.N = s.c(new ProfileHeaderBackgroundVideoPresenter$mPlayListener$2(this));
       this.O = new ProfileHeaderBackgroundVideoPresenter$b(this);
    }
    public static final PublishSubject P8(ProfileHeaderBackgroundVideoPresenter p0){
       p0 = p0.F;
       if (p0 == null) {
          a.S("mRefreshBackground");
       }
       return p0;
    }
    public void E8(){
       g a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderBackgroundVideoPresenter.class, "6")) {
          return;
       }
       ProfileHeaderBackgroundVideoPresenter tz = this.z;
       if (tz == null) {
          a.S("mCallerContext");
       }
       tz.s = new ProfileHeaderBackgroundVideoPresenter$c(this);
       tz = this.A;
       if (tz == null) {
          a.S("mBackgroundStatus");
       }
       a = l0.a;
       this.X7(tz.observable().subscribe(new ProfileHeaderBackgroundVideoPresenter$d(this), a));
       tz = this.p;
       if (tz == null) {
          a.S("mAppBarLayout");
       }
       ProfileReboundBehavior profileRebou = h3.a(tz);
       if (profileRebou != null) {
          profileRebou.N(this.O);
          objArray = profileRebou;
       }
       this.H = objArray;
       tz = this.y;
       if (tz == null) {
          a.S("mFragment");
       }
       t ot = tz.Vg().g();
       ProfileHeaderBackgroundVideoPresenter tC = this.C;
       if (tC == null) {
          a.S("mAppBarScrollState");
       }
       this.X7(t.merge(ot, tC.b().map(ProfileHeaderBackgroundVideoPresenter$e.b)).subscribe(new ProfileHeaderBackgroundVideoPresenter$f(this), a));
       tz = this.B;
       if (tz == null) {
          a.S("mOnConfigurationChangedPublisher");
       }
       this.X7(tz.delay(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new ProfileHeaderBackgroundVideoPresenter$g(this)));
       if (this.V8()) {
          ProfileBackgroundPublishManager.j.a().b(this.W8());
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundVideoPresenter.class, "19")) {
          return;
       }
       ProfileHeaderBackgroundVideoPresenter ts = this.s;
       if (ts != null) {
          ts.release();
       }
       ProfileBackgroundPublishManager.j.a().q(this.W8());
       return;
    }
    public final void R8(ProfileBgVideoInfo p0){
       ProfileHeaderBackgroundVideoPresenter profileHeade = ProfileHeaderBackgroundVideoPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, profileHeade, "11")) {
          return;
       }
       float f = 0x3f000000;
       b uob = null;
       if (this.K == null && (p0 != null && p0.getLocalVideo() == true)) {
          File localCoverFi = p0.getLocalCoverFile();
          if (localCoverFi != null) {
             this.K = true;
             int i = n.z(this.getContext());
             ProfileHeaderBackgroundVideoPresenter tt = this.t;
             if (tt != null) {
                Uri uri = Uri.fromFile(localCoverFi);
                ProfileHeaderBackgroundVideoPresenter tI = this.I;
                float showAreaCent = (tI != null)? tI.getShowAreaCenterYRadio(): 0x3f000000;
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-social:profile");
                uoa.d(ImageSource.DETAIL_COVER_VIDEO);
                tt.I(uri, new t(showAreaCent, i, ((i * 150) / 414), a1.e(24.00f)), uob, uoa.a());
             }
          }
       }
       if (this.K == null) {
          if (p0 != null) {
             uob = p0.getCoverUrls();
          }
          ArrayList uArrayList = PatchProxy.applyOneRefs(uob, this, profileHeade, "12");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             if (uob != null) {
                Iterator iterator = uob.iterator();
                while (iterator.hasNext()) {
                   String url = iterator.next().getUrl();
                   a.o(url, "cdnUrl.url");
                   uArrayList.add(url);
                }
             }
          }
          Object obj = uArrayList;
          this.K = true;
          int i1 = n.z(this.getContext());
          ProfileHeaderBackgroundVideoPresenter tt1 = this.t;
          if (tt1 != null) {
             profileHeade = this.I;
             if (profileHeade != null) {
                f = profileHeade.getShowAreaCenterYRadio();
             }
             a$a uoa1 = a.d();
             uoa1.b(":ks-features:ft-social:profile");
             uoa1.d(ImageSource.DETAIL_COVER_VIDEO);
             tt1.Q(obj, 0, 0, new t(f, i1, ((i1 * 150) / 414), a1.e(24.00f)), uoa1.a(), null);
          }
       }
       return;
    }
    public final void S8(){
       IWaynePlayer iWaynePlayer;
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundVideoPresenter.class, "9")) {
          return;
       }
       ProfileHeaderBackgroundVideoPresenter tI = this.I;
       int i = 0;
       if (tI != null) {
          iWaynePlayer = this.X8();
          int videoWidth = (iWaynePlayer != null)? iWaynePlayer.getVideoWidth(): 0;
          tI.setVideoWidth(videoWidth);
       }
       tI = this.I;
       if (tI != null) {
          iWaynePlayer = this.X8();
          if (iWaynePlayer != null) {
             i = iWaynePlayer.getVideoHeight();
          }
          tI.setVideoHeight(i);
       }
       return;
    }
    public final boolean V8(){
       ProfileHeaderBackgroundVideoPresenter obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundVideoPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.E;
       if (obj == null) {
          a.S("mUser");
       }
       return d3.a(obj);
    }
    public final ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a W8(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundVideoPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.getValue();
    }
    public final IWaynePlayer X8(){
       Object[] objArray = null;
       ProfileHeaderBackgroundVideoPresenter obj = PatchProxy.apply(objArray, this, ProfileHeaderBackgroundVideoPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj != null) {
          b playerKitCon = obj.getPlayerKitContext();
          if (playerKitCon != null) {
             a uoa = playerKitCon.e(a.class);
             if (uoa != null) {
                objArray = uoa.getPlayer();
             }
          }
       }
       return objArray;
    }
    public final void Y8(){
       ProfileHeaderBackgroundVideoPresenter profileHeade = ProfileHeaderBackgroundVideoPresenter.class;
       if (PatchProxy.applyVoid(null, this, profileHeade, "20")) {
          return;
       }
       ProfileHeaderBackgroundVideoPresenter tI = this.I;
       if (tI != null) {
          ProfileHeaderBackgroundVideoPresenter ts = this.s;
          if (ts != null) {
             float showAreaCent = tI.getShowAreaCenterYRadio();
             int videoHeight = tI.getVideoHeight();
             int videoWidth = tI.getVideoWidth();
             if (PatchProxy.isSupport(profileHeade) && (!PatchProxy.applyVoidFourRefs(ts, Float.valueOf(showAreaCent), Integer.valueOf(videoHeight), Integer.valueOf(videoWidth), this, ProfileHeaderBackgroundVideoPresenter.class, "21") && (videoHeight && videoWidth))) {
                int i = n.z(this.getContext());
                ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = (videoHeight * i) / videoWidth;
                ts.setLayoutParams(layoutParams);
                i = ((i * 150) / 414) + a1.e(24.00f);
                ts.setTranslationY(q.m(q.t(((float)(i / 2) - ((float)layoutParams.height * showAreaCent)), 0), (float)(i - layoutParams.height)));
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter.class, "4")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.profile_background_video);
       a.o(p0, "ViewBindUtils.bindWidget¡­profile_background_video\)");
       this.q = p0;
       p0 = m1.f(this.m8(), R.id.app_bar_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundVideoPresenter.class, "5")) {
          return;
       }
       Object obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.y = obj;
       obj = this.r8("PROFILE_BACKGROUND_STYLE");
       a.o(obj, "inject\(AccessIds.PROFILE_BACKGROUND_STYLE\)");
       this.A = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.D = obj;
       obj = this.r8("PROFILE_APP_BAR_SCROLL_STATE");
       a.o(obj, "inject\(ProfileCommonAcce¡­ILE_APP_BAR_SCROLL_STATE\)");
       this.C = obj;
       obj = this.q8(v.class);
       a.o(obj, "inject\(ProfileCallerContext::class.java\)");
       this.z = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.E = obj;
       obj = this.r8("PROFILE_BACKGROUND_REFRESH");
       a.o(obj, "inject\(AccessIds.PROFILE_BACKGROUND_REFRESH\)");
       this.F = obj;
       obj = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­FIGURATION_CHANGED_EVENT\)");
       this.B = obj;
       obj = this.r8("PROFILE_STYLE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.G = obj.intValue();
       return;
    }
}
