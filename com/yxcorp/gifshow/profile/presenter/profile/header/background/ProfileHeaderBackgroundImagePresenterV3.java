package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mIsMine$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mScreenWidth$2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mDefaultBgColor$2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2;
import xl8.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$c;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$d;
import s1c.a;
import brd.t;
import j5c.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$e;
import z5c.l0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$f;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$h;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$i;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import sj.k;
import com.google.android.material.appbar.ProfileReboundBehavior;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$j;
import s1c.v;
import java.lang.Number;
import com.google.android.material.appbar.AppBarLayout;
import z5c.h3;
import android.view.ViewStub;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import com.yxcorp.gifshow.profile.util.b;
import m4c.a;
import android.app.Activity;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity$a;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.Integer;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.System;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$l;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import m4c.d;
import lnc.a1;
import ii5.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$k;

public final class ProfileHeaderBackgroundImagePresenterV3 extends PresenterV2	// class@0014b8
{
    public f A;
    public b B;
    public PublishSubject C;
    public b D;
    public b E;
    public PublishSubject F;
    public ProfileReboundBehavior G;
    public ViewStub H;
    public View I;
    public SectorProgressView J;
    public View K;
    public TextView L;
    public View M;
    public View N;
    public View O;
    public View P;
    public View Q;
    public View R;
    public float S;
    public boolean T;
    public final p U;
    public final p V;
    public final p W;
    public final p X;
    public final p Y;
    public final p Z;
    public View p;
    public View q;
    public View r;
    public KwaiImageView s;
    public View t;
    public AppBarLayout u;
    public View v;
    public BaseFragment w;
    public User x;
    public v y;
    public RxPageBus z;
    public static final ProfileHeaderBackgroundImagePresenterV3$a U0;

    static {
       ProfileHeaderBackgroundImagePresenterV3.U0 = new ProfileHeaderBackgroundImagePresenterV3$a(null);
    }
    public void ProfileHeaderBackgroundImagePresenterV3(){
       super();
       this.U = s.c(new ProfileHeaderBackgroundImagePresenterV3$mIsMine$2(this));
       this.V = s.c(ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2.INSTANCE);
       this.W = s.c(new ProfileHeaderBackgroundImagePresenterV3$mScreenWidth$2(this));
       this.X = s.c(ProfileHeaderBackgroundImagePresenterV3$mDefaultBgColor$2.INSTANCE);
       this.Y = s.c(new ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2(this));
       this.Z = s.c(new ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2(this));
    }
    public static final b P8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("mBackgroundStatus");
       }
       return p0;
    }
    public static final b R8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("mBgBitmapColor");
       }
       return p0;
    }
    public static final KwaiImageView S8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mHeaderImage");
       }
       return p0;
    }
    public static final View V8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mHeaderImageMask");
       }
       return p0;
    }
    public static final View W8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mMaskLayerView");
       }
       return p0;
    }
    public static final PublishSubject X8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.F;
       if (p0 == null) {
          a.S("mRefreshBackground");
       }
       return p0;
    }
    public static final RxPageBus Y8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mRxPageBus");
       }
       return p0;
    }
    public static final View Z8(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mTabContainer");
       }
       return p0;
    }
    public static final User a9(ProfileHeaderBackgroundImagePresenterV3 p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mUser");
       }
       return p0;
    }
    public void E8(){
       g a;
       ProfileHeaderBackgroundImagePresenterV3 profileHeade = ProfileHeaderBackgroundImagePresenterV3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profileHeade, "9")) {
          return;
       }
       ProfileHeaderBackgroundImagePresenterV3 tr = this.r;
       if (tr == null) {
          a.S("mHeaderBgImageContainer");
       }
       int i = 0;
       tr.setVisibility(i);
       tr = this.q;
       String str = "mUserInfoContainer";
       if (tr == null) {
          a.S(str);
       }
       this.l9(tr, this.c9());
       tr = this.v;
       if (tr == null) {
          a.S("mMaskLayerView");
       }
       tr.setBackgroundColor(this.b9());
       tr = this.p;
       if (tr == null) {
          a.S("mTabContainer");
       }
       tr.setBackgroundColor(this.b9());
       tr = this.q;
       if (tr == null) {
          a.S(str);
       }
       tr.setOnClickListener(ProfileHeaderBackgroundImagePresenterV3$b.b);
       m1.b(this.m8(), new ProfileHeaderBackgroundImagePresenterV3$c(this), R.id.user_name_info_layout);
       tr = this.K;
       if (tr != null) {
          tr.setVisibility(i);
       }
       tr = this.K;
       if (tr != null) {
          tr.setOnClickListener(new ProfileHeaderBackgroundImagePresenterV3$d(this));
       }
       tr = this.y;
       if (tr == null) {
          a.S("mCallerContext");
       }
       a = l0.a;
       this.X7(tr.k.b().subscribe(new ProfileHeaderBackgroundImagePresenterV3$e(this), a));
       tr = this.D;
       if (tr == null) {
          a.S("mBackgroundStatus");
       }
       this.X7(tr.observable().subscribe(new ProfileHeaderBackgroundImagePresenterV3$f(this), l0.b));
       tr = this.C;
       if (tr == null) {
          a.S("mOnConfigurationChangedPublisher");
       }
       this.X7(tr.delay(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new ProfileHeaderBackgroundImagePresenterV3$g(this)));
       Boolean uBoolean = PatchProxy.apply(objArray, this, profileHeade, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = this.U.getValue();
       }
       if (!uBoolean.booleanValue()) {
          profileHeade = this.z;
          if (profileHeade == null) {
             a.S("mRxPageBus");
          }
          this.X7(profileHeade.f("PROFILE_HEAD_BG_IMAGE_EDIT").subscribe(new ProfileHeaderBackgroundImagePresenterV3$h(this), a));
          m1.a(this.m8(), new ProfileHeaderBackgroundImagePresenterV3$i(this), R.id.profile_background_container);
       }else {
          ProfileBackgroundPublishManager.j.a().b(this.d9());
       }
       profileHeade = this.G;
       if (profileHeade != null) {
          profileHeade.N(this.e9());
       }
       profileHeade = this.y;
       if (profileHeade == null) {
          a.S("mCallerContext");
       }
       profileHeade.s = new ProfileHeaderBackgroundImagePresenterV3$j(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "11")) {
          return;
       }
       ProfileHeaderBackgroundImagePresenterV3 tG = this.G;
       if (tG != null) {
          tG.T(this.e9());
       }
       ProfileBackgroundPublishManager.j.a().q(this.d9());
       return;
    }
    public final int b9(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = this.X.getValue();
       }
       return obj.intValue();
    }
    public final int c9(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.V.getValue();
       }
       return obj.intValue();
    }
    public final ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a d9(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z.getValue();
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3.class, "7")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.user_info_container);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.user_info_container\)");
       this.q = view;
       this.K = m1.f(p0, 0x7f0a1259);
       view = m1.f(p0, R.id.background);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.background\)");
       this.s = view;
       view = m1.f(p0, R.id.background_mask);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.background_mask\)");
       this.t = view;
       view = m1.f(p0, R.id.profile_background_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ile_background_container\)");
       this.r = view;
       view = m1.f(p0, R.id.app_bar_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.u = view;
       view = m1.f(p0, R.id.profile_background);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.profile_background\)");
       this.v = view;
       ProfileHeaderBackgroundImagePresenterV3 tu = this.u;
       if (tu == null) {
          a.S("mAppBarLayout");
       }
       this.G = h3.a(tu);
       view = m1.f(p0, R.id.video_upload_viewstub);
       a.o(view, "ViewBindUtils.bindWidget¡­id.video_upload_viewstub\)");
       this.H = view;
       view = m1.f(p0, R.id.tabs_container);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.tabs_container\)");
       this.p = view;
       this.M = m1.f(p0, 0x7f0a1266);
       this.N = m1.f(p0, 0x7f0a1265);
       this.O = m1.f(p0, 0x7f0a1263);
       this.P = m1.f(p0, 0x7f0a1264);
       this.Q = m1.f(p0, 0x7f0a32cb);
       this.R = m1.f(p0, 0x7f0a3cb0);
       return;
    }
    public final k e9(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y.getValue();
    }
    public final int h9(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.W.getValue();
       }
       return obj.intValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "8")) {
          return;
       }
       f obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.w = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.x = obj;
       obj = this.r8("PROFILE_PAGE_RXBUS");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_PAGE_RXBUS\)");
       this.z = obj;
       obj = this.q8(v.class);
       a.o(obj, "inject\(ProfileCallerContext::class.java\)");
       this.y = obj;
       obj = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FIGURATION_CHANGED_EVENT\)");
       this.C = obj;
       obj = this.r8("PROFILE_BACKGROUND_STYLE");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­PROFILE_BACKGROUND_STYLE\)");
       this.D = obj;
       obj = this.x8("DATA_USER_PROFILE");
       a.o(obj, "injectRef\(SocialAccessIds.DATA_USER_PROFILE\)");
       this.A = obj;
       Object obj1 = this.r8("PROFILE_BG_COLOR");
       a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_BG_COLOR\)");
       this.E = obj1;
       obj1 = this.r8("PROFILE_BACKGROUND_REFRESH");
       a.o(obj1, "inject\(com.yxcorp.gifsho¡­OFILE_BACKGROUND_REFRESH\)");
       this.F = obj1;
       obj1 = this.q8(b.class);
       a.o(obj1, "inject\(ProfileDataHelper::class.java\)");
       this.B = obj1;
       return;
    }
    public final void j9(){
       Activity activity;
       ProfileBackgroundPreviewSelectActivity$a a;
       ProfileBgVideoInfo profileBgVid1;
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "10")) {
          return;
       }
       ProfileHeaderBackgroundImagePresenterV3 tA = this.A;
       if (tA == null) {
          a.S("mUserProfileRef");
       }
       if (tA.get() == null) {
          return;
       }else {
          tA = this.D;
          String str = "mBackgroundStatus";
          if (tA == null) {
             a.S(str);
          }
          String str1 = "mUser";
          if (tA.a().d() == 3) {
             activity = this.getActivity();
             tA = this.D;
             if (tA == null) {
                a.S(str);
             }
             ProfileBgVideoInfo profileBgVid = tA.a().e();
             if (activity != null && profileBgVid != null) {
                a = ProfileBackgroundPreviewSelectActivity.A;
                tA = this.x;
                if (tA == null) {
                   a.S(str1);
                }
                String id = tA.getId();
                tA = this.D;
                if (tA == null) {
                   a.S(str);
                }
                profileBgVid1 = tA.a().e();
                long clipStart = (profileBgVid1 != null)? profileBgVid1.getClipStart(): 0;
                a.c(activity, profileBgVid, false, id, clipStart);
             }
             return;
          }else {
             tA = this.D;
             if (tA == null) {
                a.S(str);
             }
             profileBgVid1 = tA.a().e();
             String str2 = "this";
             if (profileBgVid1 != null) {
                activity = this.getActivity();
                if (activity != null && profileBgVid1.getCoverUrls() != null) {
                   a = ProfileBackgroundPreviewSelectActivity.A;
                   a.o(activity, str2);
                   ArrayList uArrayList = new ArrayList(profileBgVid1.getCoverUrls());
                   ProfileHeaderBackgroundImagePresenterV3 tD = this.D;
                   if (tD == null) {
                      a.S(str);
                   }
                   boolean b = tD.a().a();
                   ProfileHeaderBackgroundImagePresenterV3 tx = this.x;
                   if (tx == null) {
                      a.S(str1);
                   }
                   a.e(activity, uArrayList, b, false, tx.getId(), profileBgVid1.getFeed(), profileBgVid1.getUser());
                }
                return;
             }else {
                tA = this.D;
                if (tA == null) {
                   a.S(str);
                }
                ArrayList uArrayList1 = tA.a().b();
                if (uArrayList1 != null) {
                   Activity activity1 = this.getActivity();
                   if (activity1 != null) {
                      a.o(activity1, str2);
                      ProfileBackgroundPreviewSelectActivity$a.f(ProfileBackgroundPreviewSelectActivity.A, activity1, uArrayList1, false, false, null, null, null, 120, null);
                   }
                }
                return;
             }
          }
       }
    }
    public final void k9(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "17")) {
          return;
       }
       g.e(KsLogProfileTag.BG_IMMERSIVE.appendTag("ProfileHeaderBackgroundImagePresenterV3"), "mBitmapRatio: "+this.S);
       int i = (Math.abs((this.S - 0x3f68ba2f)) - 0x3dcccccd < 0)? this.h9(): (this.h9() * 5) / 8;
       ProfileHeaderBackgroundImagePresenterV3 ts = this.s;
       if (ts == null) {
          a.S("mHeaderImage");
       }
       ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
       if (layoutParams.height != i) {
          layoutParams.width = this.h9();
          layoutParams.height = i;
          ProfileHeaderBackgroundImagePresenterV3 ts1 = this.s;
          if (ts1 == null) {
             a.S("mHeaderImage");
          }
          ts1.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void l9(View p0,int p1){
       ProfileHeaderBackgroundImagePresenterV3 profileHeade = ProfileHeaderBackgroundImagePresenterV3.class;
       if (PatchProxy.isSupport(profileHeade) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, profileHeade, "18")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          layoutParams.topMargin = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void m9(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenterV3.class, "12")) {
          return;
       }
       List list = KsLogProfileTag.BG_IMMERSIVE.appendTag("ProfileHeaderBackgroundImagePresenterV3");
       StringBuilder str = "updateUserBackground start get: "+System.currentTimeMillis()+" uid: ";
       ProfileHeaderBackgroundImagePresenterV3 tx = this.x;
       if (tx == null) {
          a.S("mUser");
       }
       g.e(list, str+tx.getId());
       ProfileHeaderBackgroundImagePresenterV3 tB = this.B;
       if (tB == null) {
          a.S("mProfileDataHelper");
       }
       ProfileHeaderBackgroundImagePresenterV3$l ol = new ProfileHeaderBackgroundImagePresenterV3$l(this);
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoidOneRefs(ol, tB, b.class, "6")) {
          if (tB.j == null) {
             ol.onCompleted(tB.i);
             tB.a();
          }else {
             tB.k = ol;
          }
       }
       return;
    }
    public final void n9(Drawable p0,ImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileHeaderBackgroundImagePresenterV3.class, "14")) {
          return;
       }
       BitmapDrawable uBitmapDrawa = (!p0 instanceof BitmapDrawable)? null: p0;
       if (uBitmapDrawa) {
          Bitmap bitmap = uBitmapDrawa.getBitmap();
          if (bitmap != null) {
             int width = bitmap.getWidth();
             int height = bitmap.getHeight();
             float f = (!height)? 0: (float)width / (float)height;
             this.S = f;
             this.k9();
             d a = d.a;
             ProfileHeaderBackgroundImagePresenterV3 tu = this.u;
             if (tu == null) {
                a.S("mAppBarLayout");
             }
             ProfileHeaderBackgroundImagePresenterV3 ts = this.s;
             if (ts == null) {
                a.S("mHeaderImage");
             }
             a.f(tu, ts, a1.d(R.dimen.arg_RES_7f0702a5));
             this.X7(a.c(bitmap, true).subscribeOn(d.c).observeOn(d.a).subscribe(new ProfileHeaderBackgroundImagePresenterV3$k(this, p1, p0)));
          }
       }
       return;
    }
}
