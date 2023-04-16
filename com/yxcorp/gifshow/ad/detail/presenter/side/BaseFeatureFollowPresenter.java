package com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$d;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$onBind$2;
import g19.b;
import msd.l;
import erd.g;
import crd.b;
import vy6.a;
import jta.c;
import g19.l;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$onBind$3;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$f;
import eda.l;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$g;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import jga.f$a;
import android.content.Intent;
import nsd.r0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Arrays;
import java.lang.StringBuilder;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import oe6.e;
import p1a.a$a;
import lnc.i3;
import im8.f;
import p1a.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$c;
import yy6.c;
import java.lang.Boolean;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.SideWindowInfo;
import mxb.c;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import brd.y;

public abstract class BaseFeatureFollowPresenter extends PresenterV2	// class@001693
{
    public boolean A;
    public SlidePlayViewModel B;
    public final a C;
    public final BaseFeatureFollowPresenter$e D;
    public QPhoto p;
    public f q;
    public PhotoDetailLogger r;
    public PhotoDetailParam s;
    public c t;
    public BaseFragment u;
    public y v;
    public l w;
    public SlidePlayFollowAnimationView x;
    public boolean y;
    public boolean z;
    public static final BaseFeatureFollowPresenter$a E;

    static {
       BaseFeatureFollowPresenter.E = new BaseFeatureFollowPresenter$a(null);
    }
    public void BaseFeatureFollowPresenter(){
       super();
       this.C = new BaseFeatureFollowPresenter$d(this);
       this.D = new BaseFeatureFollowPresenter$e(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseFeatureFollowPresenter.class, "18")) {
          return;
       }
       if (this.x == null) {
          View view = this.m8();
          a.o(view, "rootView");
          this.x = this.S8(view);
       }
       BaseFeatureFollowPresenter tu = this.u;
       String str = "mFragment";
       if (tu == null) {
          a.S(str);
       }
       Fragment parentFragme = tu.getParentFragment();
       if (parentFragme != null) {
          objArray = SlidePlayViewModel.B0(parentFragme);
       }
       this.B = objArray;
       this.X7(this.getPhoto().getUser().observable().subscribe(new b(new BaseFeatureFollowPresenter$onBind$2(this))));
       tu = this.B;
       if (tu != null) {
          BaseFeatureFollowPresenter tu1 = this.u;
          if (tu1 == null) {
             a.S(str);
          }
          tu.P(tu1, this.C);
       }
       tu = this.w;
       if (tu != null) {
          tu.a(this.D);
       }
       tu = this.B;
       boolean b = true;
       if (tu == null || tu.r() != b) {
          b = false;
       }
       this.A = b;
       tu = this.x;
       a.m(tu);
       this.X7(tu.e().subscribe(new b(new BaseFeatureFollowPresenter$onBind$3(this))));
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new BaseFeatureFollowPresenter$f(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new BaseFeatureFollowPresenter$g(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, BaseFeatureFollowPresenter.class, "19")) {
          return;
       }
       BaseFeatureFollowPresenter tB = this.B;
       if (tB != null) {
          BaseFeatureFollowPresenter tu = this.u;
          if (tu == null) {
             a.S("mFragment");
          }
          tB.D(tu, this.C);
       }
       return;
    }
    public abstract boolean P8();
    public final void R8(){
       String str4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseFeatureFollowPresenter uBaseFeature = BaseFeatureFollowPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseFeature, "21")) {
          return;
       }
       BaseFeatureFollowPresenter tx = this.x;
       int i = 1;
       if (tx != null && tx.d() == i) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       Activity uActivity = activity;
       if (uActivity != null) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             d.a(-1712118428).ne(uActivity, this.getPhoto().getFullSource(), "photo_follow", 14, a.B.getString(R.string.arg_RES_7f103077), this.getPhoto().mEntity, null, null, new BaseFeatureFollowPresenter$b(this)).h();
          }else {
             User user = this.getPhoto().getUser();
             String str = "getPhoto\(\).user";
             a.o(user, str);
             if (!user.isFollowingOrFollowRequesting()) {
                f$a uoa = PatchProxy.applyOneRefs(uActivity, this, uBaseFeature, "22");
                if (uoa != patchProxyRe) {
                }else {
                   a.p(uActivity, "activity");
                   String stringExtra = uActivity.getIntent().getStringExtra("arg_photo_exp_tag");
                   Object[] objArray1 = new Object[2];
                   BaseFeatureFollowPresenter ts = this.s;
                   String str1 = "mPhotoDetailParam";
                   if (ts == null) {
                      a.S(str1);
                   }
                   DetailCommonParam detailCommon = ts.getDetailCommonParam();
                   String str2 = "mPhotoDetailParam.detailCommonParam";
                   a.o(detailCommon, str2);
                   String str3 = "_";
                   if (detailCommon.getPreUserId() == null) {
                      str4 = str3;
                   }else {
                      ts = this.s;
                      if (ts == null) {
                         a.S(str1);
                      }
                      detailCommon = ts.getDetailCommonParam();
                      a.o(detailCommon, str2);
                      str4 = detailCommon.getPreUserId();
                   }
                   objArray1[0] = str4;
                   ts = this.s;
                   if (ts == null) {
                      a.S(str1);
                   }
                   detailCommon = ts.getDetailCommonParam();
                   a.o(detailCommon, str2);
                   if (detailCommon.getPrePhotoId() != null) {
                      ts = this.s;
                      if (ts == null) {
                         a.S(str1);
                      }
                      detailCommon = ts.getDetailCommonParam();
                      a.o(detailCommon, str2);
                      str3 = detailCommon.getPrePhotoId();
                   }
                   objArray1[i] = str3;
                   String str5 = String.format("%s/%s", Arrays.copyOf(objArray1, 2));
                   a.o(str5, "java.lang.String.format\(format, *args\)");
                   this.getPhoto().getUser().mPage = "photo";
                   f$a uoa2 = new f$a(this.getPhoto().getUser(), uActivity.Q2());
                   uoa2.c(this.getPhoto().getFullSource());
                   uoa2.o(uActivity.getUrl()+"#follow");
                   uoa2.g(stringExtra);
                   uoa2.f(this.getPhoto().getExpTag());
                   uoa2.n(str5);
                   uoa2.m(this.getPhoto());
                   uoa2.q(i);
                   a.o(uoa2, "FollowParams\n        .Bu¡­tSilenceSuccessTips\(true\)");
                   uoa = uoa2;
                }
                FollowHelper.b(uoa.b());
                user = this.getPhoto().getUser();
                a.o(user, str);
                user.setFollowStatus(User$FollowStatus.FOLLOWING);
                e.f0(false);
                a$a uoa1 = PatchProxy.apply(objArray, this, uBaseFeature, "30");
                if (uoa1 != patchProxyRe) {
                }else {
                   uoa1 = a$a.b(31, "user_follow", i);
                   a.o(uoa1, "LogListener.LogParam.cli¡­tion.RIGHT_AVATAR_FOLLOW\)");
                }
                i3 oi3 = i3.f();
                oi3.d("head_position", "BOTTOM_BAR");
                uoa1.m(oi3.e());
                BaseFeatureFollowPresenter tq = this.q;
                if (tq == null) {
                   a.S("mLogListener");
                }
                tq.get().a(uoa1);
                if (this.getPhoto().isAd()) {
                   if (this.getPhoto().isLiveStream()) {
                      tq = this.u;
                      if (tq == null) {
                         a.S("mFragment");
                      }
                      if (tq.f() != 7) {
                         i = 2;
                      }
                      i0.a().e(300, this.getPhoto().mEntity).d(new BaseFeatureFollowPresenter$c(i, this)).a();
                   }else {
                      i0.a().t(14, this.getPhoto().mEntity);
                   }
                }
                tq = this.t;
                if (tq == null) {
                   a.S("mStateLogger");
                }
                tq.b();
             }
          }
       }
       return;
    }
    public SlidePlayFollowAnimationView S8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeatureFollowPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.follow_animation_view);
       a.o(p0, "rootView.findViewById\(R.id.follow_animation_view\)");
       return p0;
    }
    public final void V8(){
       boolean b;
       BaseFeatureFollowPresenter uBaseFeature = BaseFeatureFollowPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseFeature, "20")) {
          return;
       }
       if (this.y == null) {
          return;
       }
       QPhoto photo = this.getPhoto();
       StringBuilder obj = PatchProxy.applyOneRefs(photo, this, uBaseFeature, "23");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          obj = "isFollowStatus: "+photo.getUserName()+" - "+photo.getCaption()+", "+mE.isLogined()+", ";
          User user = photo.getUser();
          if (user != null) {
             objArray = Boolean.valueOf(user.isFollowingOrFollowRequesting());
          }
          Object[] objArray1 = new Object[0];
          j0.a("BaseFeatureFollowPresenter", obj+objArray, objArray1);
          QCurrentUser mE1 = QCurrentUser.ME;
          a.o(mE1, "QCurrentUser.ME");
          if (mE1.isLogined() && photo.getUser() != null) {
             User user1 = photo.getUser();
             a.o(user1, "photo.user");
             if (user1.isFollowingOrFollowRequesting()) {
             label_00b1 :
                b = true;
             }
          }
          if (k.B(photo) != null) {
             PhotoAdvertisement photoAdverti = k.B(photo);
             a.m(photoAdverti);
             PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.THIRD_PLATFORM};
             if (photoAdverti.isAdGroup(uAdGroupArra)) {
                goto label_00b1 ;
             }
          }
          b = false;
       }
       if (b) {
          this.W8();
       }else {
          this.X8();
       }
       this.z = b;
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, BaseFeatureFollowPresenter.class, "27")) {
          return;
       }
       BaseFeatureFollowPresenter tx = this.x;
       if (tx != null && tx.d() == true) {
          tx = this.x;
          if (tx != null) {
             tx.b();
          }
       }
       tx = this.x;
       if (tx != null) {
          tx.setVisibility(8);
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, BaseFeatureFollowPresenter.class, "26")) {
          return;
       }
       BaseFeatureFollowPresenter tx = this.x;
       if (tx != null) {
          tx.f();
       }
       return;
    }
    public final QPhoto getPhoto(){
       Object[] objArray = null;
       BaseFeatureFollowPresenter obj = PatchProxy.apply(objArray, this, BaseFeatureFollowPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       SideWindowInfo sideWindowIn = c.J(obj);
       if (sideWindowIn != null) {
          objArray = sideWindowIn.mSidePhoto;
       }
       if (objArray != null) {
          sideWindowIn = sideWindowIn.mSidePhoto;
          a.o(sideWindowIn, "sideWindowInfo.mSidePhoto");
       }else {
          obj = this.p;
          if (obj == null) {
             a.S("mPhoto");
          }
       }
       return sideWindowIn;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseFeatureFollowPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.x8("LOG_LISTENER");
       a.o(obj, "injectRef\(AccessIds.LOG_LISTENER\)");
       this.q = obj;
       Object obj1 = this.r8("DETAIL_LOGGER");
       a.o(obj1, "inject\(AccessIds.DETAIL_LOGGER\)");
       this.r = obj1;
       obj1 = this.q8(PhotoDetailParam.class);
       a.o(obj1, "inject\(PhotoDetailParam::class.java\)");
       this.s = obj1;
       obj1 = this.q8(c.class);
       a.o(obj1, "inject\(PhotoDetailStatLogger::class.java\)");
       this.t = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.u = obj1;
       this.w = this.t8("NASA_SIDEBAR_STATUS");
       obj1 = this.r8("SLIDE_PLAY_FOLLOW_ANIM_STATUS_OBSERVER");
       a.o(obj1, "inject\(AccessIds.SLIDE_P¡­LOW_ANIM_STATUS_OBSERVER\)");
       this.v = obj1;
       return;
    }
}
