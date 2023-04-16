package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$mDismissRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import z5c.o2;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$c;
import erd.g;
import z5c.l0;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$d;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.u;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$e;
import u36.d;
import o4c.s;
import u36.f;
import o4c.t;
import u36.g;
import o4c.u;
import u36.e;
import o4c.w;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import android.widget.ImageView;
import android.view.View;
import z5c.f3;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.p0;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import w5c.c;
import com.kwai.framework.model.user.UserStatus;
import qa6.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import gx5.c;
import n3d.a;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import com.yxcorp.gifshow.profile.kslog.KsLogStatus;
import z5c.x2;
import u36.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import ca9.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$f;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$g;
import java.lang.Throwable;
import n5c.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import wm5.a;
import vm5.o;
import java.lang.Number;
import android.net.Uri$Builder;
import android.net.Uri;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import java.util.Objects;
import java.util.HashMap;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag$a;
import java.io.File;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$h;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$i;
import com.airbnb.lottie.LottieAnimationView;
import bd.c;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.lang.Exception;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$j;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import x2c.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$k;
import gx5.h;

public final class ProfileHeaderStatusPresenter extends PresenterV2	// class@0014e1
{
    public View A;
    public KwaiImageView B;
    public ViewStub C;
    public View D;
    public KwaiImageView E;
    public ViewStub F;
    public View G;
    public LottieAnimationView H;
    public UserStatus I;
    public a J;
    public TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public int R;
    public final p p;
    public BaseProfileFragment q;
    public c r;
    public User s;
    public ProfileParam t;
    public int u;
    public KwaiImageView v;
    public View w;
    public ViewStub x;
    public ViewStub y;
    public View z;
    public static final ProfileHeaderStatusPresenter$a S;

    static {
       ProfileHeaderStatusPresenter.S = new ProfileHeaderStatusPresenter$a(null);
    }
    public void ProfileHeaderStatusPresenter(){
       super();
       this.p = s.c(new ProfileHeaderStatusPresenter$mDismissRunnable$2(this));
       this.u = 5;
       this.P = -1;
    }
    public static final BaseProfileFragment P8(ProfileHeaderStatusPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mBaseFragment");
       }
       return p0;
    }
    public static void W8(ProfileHeaderStatusPresenter p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.V8(p1);
       return;
    }
    public void E8(){
       g a;
       ProfileHeaderStatusPresenter profileHeade = ProfileHeaderStatusPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profileHeade, "4")) {
          return;
       }
       ProfileHeaderStatusPresenter tq = this.q;
       String str = "mBaseFragment";
       if (tq == null) {
          a.S(str);
       }
       this.Q = o2.c(tq);
       tq = this.r;
       if (tq == null) {
          a.S("mLoadState");
       }
       this.X7(tq.e().subscribe(new ProfileHeaderStatusPresenter$c(this), l0.a("ProfileHeaderStatusPresenter")));
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       a = l0.a;
       this.X7(tq.Vg().f().subscribe(new ProfileHeaderStatusPresenter$d(this), a));
       RxBus f = RxBus.f;
       this.X7(f.g(u.class, RxBus$ThreadMode.MAIN).subscribe(new ProfileHeaderStatusPresenter$e(this)));
       if (this.c9() && !PatchProxy.applyVoid(objArray, this, profileHeade, "19")) {
          this.X7(f.f(d.class).subscribe(new s(this), a));
          this.X7(f.f(f.class).subscribe(new t(this), a));
          this.X7(f.f(g.class).subscribe(new u(this), a));
          this.X7(f.f(e.class).subscribe(new w(this), a));
       }
       return;
    }
    public void J8(){
       ProfileHeaderStatusPresenter profileHeade = ProfileHeaderStatusPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profileHeade, "5")) {
          return;
       }
       u.c(this.J);
       ProfileHeaderStatusPresenter tB = this.B;
       if (tB != null) {
          Runnable runnable = PatchProxy.apply(objArray, this, profileHeade, "1");
          if (runnable == PatchProxyResult.class) {
             runnable = this.p.getValue();
          }
          tB.removeCallbacks(runnable);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "13")) {
          return;
       }
       if (this.z == null) {
          ProfileHeaderStatusPresenter ty = this.y;
          if (ty == null) {
             a.S("mStatusClickAreaViewStub");
          }
          View view = f3.a(ty);
          this.z = view;
          if (view != null) {
             view.setOnClickListener(new ProfileHeaderStatusPresenter$b(this));
          }
       }
       n.Y(this.z, 0, 0);
       return;
    }
    public final void S8(){
       ProfileHeaderStatusPresenter profileHeade = ProfileHeaderStatusPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profileHeade, "41")) {
          return;
       }
       String str = "ProfileHeaderStatusPresenter";
       if (this.R != 3) {
          g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag(str), "status is uploading when onResume");
          return;
       }else {
          ProfileHeaderStatusPresenter ts = this.s;
          if (ts == null) {
             a.S("mUser");
          }
          ProfileHeaderStatusPresenter tt = this.t;
          String str1 = "mParam";
          if (tt == null) {
             a.S(str1);
          }
          if (!p0.b(ts, tt.mUserProfile, 2)) {
             g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag(str), "hide status entrance");
             profileHeade = this.A;
             if (profileHeade != null) {
                profileHeade.setVisibility(8);
             }
             return;
          }else {
             boolean b = false;
             ProfileHeaderStatusPresenter.W8(this, b, 1, objArray);
             this.X8();
             if (!PatchProxy.applyVoid(objArray, this, profileHeade, "43") && this.Z8()) {
                ProfileHeaderStatusPresenter tt1 = this.t;
                if (tt1 == null) {
                   a.S(str1);
                }
                ProfileParam mUserProfile = tt1.mUserProfile;
                if (mUserProfile != null) {
                   UserProfile mProfile = mUserProfile.mProfile;
                   if (mProfile != null) {
                      if (mProfile.mDynamicPendant == null) {
                         UserInfo mAvatarPenda = mProfile.mAvatarPendants;
                         if (mAvatarPenda != null) {
                            mAvatarPenda = (!mAvatarPenda.length)? 1: 0;
                            if (!mAvatarPenda) {
                            label_0086 :
                               if (b) {
                               label_009f :
                                  if (!PatchProxy.applyVoid(objArray, this, profileHeade, "42")) {
                                     profileHeade = this.v;
                                     if (profileHeade == null) {
                                        a.S("mAvatarBackgroundView");
                                     }
                                     profileHeade.setVisibility(8);
                                  }
                                  return;
                               }
                            }
                         }
                         b = true;
                         goto label_0086 ;
                      }
                      g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag(str), "hide pendant for status");
                      ts = this.w;
                      if (ts == null) {
                         a.S("mPendantContainer");
                      }
                      ts.setVisibility(8);
                      goto label_009f ;
                   }else {
                      goto label_009f ;
                   }
                }else {
                   goto label_009f ;
                }
             }else {
                goto label_009f ;
             }
          }
       }
    }
    public final void V8(boolean p0){
       if (PatchProxy.isSupport(ProfileHeaderStatusPresenter.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProfileHeaderStatusPresenter.class, "17")) {
          return;
       }
       this.b9();
       return;
    }
    public final void X8(){
       String str;
       ProfileHeaderStatusPresenter tB;
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "9")) {
          return;
       }
       ProfileHeaderStatusPresenter profileHeade = null;
       if (this.c9()) {
          QPhoto qPhoto = c.d();
          if (!this.a9() && qPhoto != null) {
             this.l9();
          }else if(this.a9() && qPhoto == null){
             this.m9();
          }else if(this.a9() && qPhoto != null){
             profileHeade = this.I;
             if (profileHeade != null) {
                str = String.valueOf(profileHeade.mZtPhotoId);
                if (str != null) {
                label_004c :
                   if (a.g(str, qPhoto.getPhotoId())) {
                      this.m9();
                   }else {
                      this.l9();
                   }
                }
             }
             str = "";
             goto label_004c ;
          }else {
             g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "user has no status");
             tB = this.B;
             if (tB != null) {
                tB.setVisibility(8);
             }
             this.q9(profileHeade);
          }
       }else if(this.a9()){
          this.m9();
       }else {
          g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "user has no status");
          tB = this.A;
          if (tB != null) {
             tB.setVisibility(8);
          }
          this.q9(profileHeade);
       }
       return;
    }
    public final void Y8(){
       String str;
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "29")) {
          return;
       }
       if (this.c9()) {
          QPhoto qPhoto = c.d();
          if (!this.a9() && qPhoto != null) {
             this.h9(qPhoto);
          }else if(this.a9() && qPhoto == null){
             this.j9();
          }else if(this.a9() && qPhoto != null){
             ProfileHeaderStatusPresenter tI = this.I;
             if (tI != null) {
                str = String.valueOf(tI.mZtPhotoId);
                if (str != null) {
                label_0045 :
                   if (a.g(str, qPhoto.getPhotoId())) {
                      this.j9();
                   }else {
                      this.h9(qPhoto);
                   }
                }
             }
             str = "";
             goto label_0045 ;
          }
          return;
       }else {
          this.j9();
          return;
       }
    }
    public final boolean Z8(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderStatusPresenter.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a9() || c.d() != null)? true: false;
       return b;
    }
    public final boolean a9(){
       boolean b = (this.I != null)? true: false;
       return b;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "37")) {
          return;
       }
       ProfileHeaderStatusPresenter tD = this.D;
       if (tD != null) {
          tD.setVisibility(8);
       }
       tD = this.G;
       if (tD != null) {
          tD.setVisibility(8);
       }
       return;
    }
    public final boolean c9(){
       ProfileHeaderStatusPresenter obj = PatchProxy.apply(null, this, ProfileHeaderStatusPresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj == null) {
          a.S("mUser");
       }
       return a.b(obj);
    }
    public final void d9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderStatusPresenter.class, "39")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       Object[] objArray1 = objArray;
       if (objArray1 != null) {
          b uob = d.a(0x763547f8);
          ProfileHeaderStatusPresenter ts = this.s;
          if (ts == null) {
             a.S("mUser");
          }
          ProfileHeaderStatusPresenter tt = this.t;
          if (tt == null) {
             a.S("mParam");
          }
          uob.yR(objArray1, ts, tt.mUserProfile, false, true, null);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.profile_status_stub);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.profile_status_stub\)");
       this.x = view;
       view = m1.f(p0, R.id.profile_avatar_pendant);
       a.o(view, "ViewBindUtils.bindWidget¡­d.profile_avatar_pendant\)");
       this.w = view;
       p0 = m1.f(p0, R.id.avatar_background);
       a.o(p0, "ViewBindUtils.bindWidget¡­, R.id.avatar_background\)");
       this.v = p0;
       return;
    }
    public final void e9(int p0){
       String str = "ProfileHeaderStatusPresenter";
       ProfileHeaderStatusPresenter profileHeade = ProfileHeaderStatusPresenter.class;
       if (PatchProxy.isSupport(profileHeade) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, profileHeade, "22")) {
          return;
       }
       try{
          g.e(KsLogProfileStatusTag.STATUS_PUBLISH.appendTag(str), "retry id: "+p0);
          x2.a(KsLogInfoProductionTag.STATUS_PUBLISH, KsLogStatus.RETRY);
          this.X7(b.s(b.class, LoadPolicy.DIALOG).R(new ProfileHeaderStatusPresenter$f(p0), ProfileHeaderStatusPresenter$g.b));
       }catch(java.lang.Exception e5){
          KsLogProfileStatusTag sTATUS_PUBLI = KsLogProfileStatusTag.STATUS_PUBLISH;
          sTATUS_PUBLI.appendTag(str);
          KsLogProfileStatusTag ksLogProfile = sTATUS_PUBLI;
          g.d(ksLogProfile, "retry exception", e5);
       }
       return;
    }
    public final void h9(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter.class, "31")) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       if (activity != null) {
          ProfileHeaderStatusPresenter tq = this.q;
          if (tq == null) {
             a.S("mBaseFragment");
          }
          if (!PatchProxy.applyVoidThreeRefs(activity, tq, p0, null, a.class, "3")) {
             a.p(activity, "activity");
             a.p(tq, "fragment");
             a.p(p0, "photo");
             PhotoDetailParam photoDetailP = new PhotoDetailParam(p0).setPhotoIndex(0).setFeedPosition(0).setBizType(4).setSource(218);
             a.o(photoDetailP, "param");
             photoDetailP.getSlidePlayConfig().setEnablePullRefresh(0);
             DetailPlayConfig detailPlayCo = photoDetailP.getDetailPlayConfig();
             a.o(detailPlayCo, "param.detailPlayConfig");
             detailPlayCo.setUseHardDecoder(true);
             photoDetailP.setSlidePlayId(a.a.a(p0, tq));
             NasaSlideParam$a uoa = new NasaSlideParam$a();
             uoa.T("DETAIL");
             uoa.g0(true);
             uoa.x(Boolean.FALSE);
             uoa = uoa.k(0);
             uoa.e(0);
             uoa.z(0);
             uoa.i(true);
             uoa.A(0);
             uoa.C(0);
             NasaSlideParam nasaSlidePar = uoa.a();
             d.a(0x66aa3a58).z20(activity, 1025, photoDetailP, null, 0, 0, nasaSlidePar, false, null);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.r = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.s = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.t = obj;
       obj = this.r8("PROFILE_STYLE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.u = obj.intValue();
       return;
    }
    public final void j9(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "30")) {
          return;
       }
       ProfileHeaderStatusPresenter tI = this.I;
       if (tI != null) {
          UserStatus mId = tI.mId;
          if (mId != null) {
             Uri$Builder uBuilder = new Uri$Builder().scheme("kwai").authority("mood").appendPath("detail");
             uBuilder.appendQueryParameter("moodId", mId);
             Uri$Builder uBuilder1 = uBuilder;
             Uri uri = uBuilder1.appendQueryParameter("source", "profile").build();
             Context context = this.getContext();
             if (context != null) {
                a.b(b.j(context, uri.toString()), null);
             }
          }
       }
       return;
    }
    public final void k9(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "38")) {
          return;
       }
       this.P = -1;
       this.s9(0);
       return;
    }
    public final void l9(){
       g g;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderStatusPresenter.class, "11")) {
          return;
       }
       ProfileHeaderStatusPresenter tB = this.B;
       if (tB != null) {
          tB.setVisibility(0);
          c h = c.h;
          Objects.requireNonNull(h);
          String obj = PatchProxy.apply(objArray, h, c.class, "7");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             g = c.g;
             if (g != null) {
                objArray = g.a();
             }
          }
          obj = c.c();
          HashMap hashMap = new HashMap(KsLogProfileStatusTag.Companion.a(2));
          String str = "";
          Object[] objArray1 = (objArray != null)? objArray: str;
          hashMap.put("dynamicImagePath", objArray1);
          if (obj != null) {
             str = obj;
          }
          hashMap.put("staticImagePath", str);
          g.g(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "showMockStatus", hashMap);
          if (obj != null) {
             tB.w(new File(obj), 0, 0, new ProfileHeaderStatusPresenter$h(this, tB, objArray, obj));
             this.R8();
          }else {
             tB = this.A;
             if (tB != null) {
                tB.setVisibility(8);
             }
          }
       }
       return;
    }
    public final void m9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderStatusPresenter.class, "10")) {
          return;
       }
       ProfileHeaderStatusPresenter tB = this.B;
       if (tB != null) {
          int i = 0;
          tB.setVisibility(i);
          this.R8();
          ProfileHeaderStatusPresenter tI = this.I;
          UserStatus mDynamicImag = (tI != null)? tI.mDynamicImageUrls: objArray;
          if (tI != null) {
             objArray = tI.mStaticImageUrls;
          }
          HashMap hashMap = new HashMap(KsLogProfileStatusTag.Companion.a(2));
          String str = 1;
          boolean b = (mDynamicImag == null || mDynamicImag.isEmpty())? true: false;
          hashMap.put("dynamicImageUrls", String.valueOf(b));
          b = (objArray == null || objArray.isEmpty())? true: false;
          hashMap.put("staticImageUrls", String.valueOf(b));
          g.g(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "showStatus", hashMap);
          if (objArray != null && !objArray.isEmpty()) {
             str = null;
          }
          if (str) {
             tB = this.A;
             if (tB != null) {
                tB.setVisibility(8);
             }
          }else {
             CDNUrl[] uCDNUrlArray = new CDNUrl[i];
             Object[] objArray1 = objArray.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-social:profile");
             tB.Y(objArray1, uoa.a(), new ProfileHeaderStatusPresenter$i(this, tB, mDynamicImag, objArray));
          }
       }
       return;
    }
    public final void n9(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderStatusPresenter.class, "21")) {
          return;
       }
       ProfileHeaderStatusPresenter tH = this.H;
       if (tH != null) {
          tH.setVisibility(8);
          if (tH.p()) {
             tH.f();
          }
       }
       return;
    }
    public final void o9(KwaiImageView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileHeaderStatusPresenter.class, "12")) {
          return;
       }
       int i = 0;
       try{
          if (!p1 instanceof c) {
             p1 = i;
          label_0011 :
             if (p1 != null) {
                p1 = p1.g();
                a.o(p1, "it.underlyingBitmap");
                if (p1 != null && !p1.isRecycled()) {
                   p0.setPlaceHolderImage(new BitmapDrawable(a1.m(), p1.copy(p1.getConfig(), true)));
                }
             }
          }else {
             goto label_0011 ;
          }
       }catch(java.lang.Exception e4){
          g.b(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), e4.getMessage(), e4, i);
       }
       return;
    }
    public final void q9(boolean p0){
       ProfileHeaderStatusPresenter profileHeade = ProfileHeaderStatusPresenter.class;
       if (PatchProxy.isSupport(profileHeade) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, profileHeade, "14")) {
          return;
       }
       profileHeade = this.z;
       int i = (p0)? 0: 8;
       n.Y(profileHeade, i, false);
       return;
    }
    public final void s9(int p0){
       this.R = p0;
    }
    public final void t9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderStatusPresenter.class, "40")) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       if (activity != null) {
          ImageSelectSupplier$c uoc = ImageSelectSupplier$c.a();
          uoc.b(new ProfileHeaderStatusPresenter$j(this));
          c uoc1 = d.a(0x763547f8);
          ProfileHeaderStatusPresenter tt = this.t;
          if (tt == null) {
             a.S("mParam");
          }
          ProfileStatusInfo profileStatu = a.f(tt.mUserProfile);
          if (profileStatu != null) {
             objArray = profileStatu.mUserStatus;
          }
          uoc1.AJ(activity, objArray, new ProfileHeaderStatusPresenter$k(this), uoc);
       }
       return;
    }
}
