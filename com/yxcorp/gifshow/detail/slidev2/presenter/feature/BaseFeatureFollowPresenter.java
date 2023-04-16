package com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$d;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import le5.f;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import lnc.a1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$onBind$2;
import e8a.c;
import msd.l;
import erd.g;
import crd.b;
import vy6.a;
import jta.c;
import r7a.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$onBind$3;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$f;
import eda.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$g;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$b;
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
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$c;
import yy6.c;
import java.lang.Boolean;
import uw9.o;
import q87.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import brd.y;

public abstract class BaseFeatureFollowPresenter extends PresenterV2	// class@00190e
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
    public f w;
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
       BaseFeatureFollowPresenter tx;
       RxBus f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseFeatureFollowPresenter.class, "18")) {
          return;
       }
       if (this.x == null) {
          View view = this.m8();
          a.o(view, "rootView");
          this.x = this.S8(view);
          if (f.o() && (NasaExperimentUtils.l0 || NasaExperimentUtils.c0())) {
             tx = this.x;
             if (tx != null) {
                tx.setFollowViewPadding(a1.d(R.dimen.arg_RES_7f070271));
             }
          }
       }
       tx = this.u;
       String str = "mFragment";
       if (tx == null) {
          a.S(str);
       }
       Fragment parentFragme = tx.getParentFragment();
       if (parentFragme != null) {
          objArray = SlidePlayViewModel.B0(parentFragme);
       }
       this.B = objArray;
       tx = this.p;
       if (tx == null) {
          a.S("mPhoto");
       }
       this.X7(tx.getUser().observable().subscribe(new c(new BaseFeatureFollowPresenter$onBind$2(this))));
       tx = this.B;
       if (tx != null) {
          BaseFeatureFollowPresenter tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          tx.P(tu, this.C);
       }
       tx = this.w;
       if (tx != null) {
          tx.a(this.D);
       }
       tx = this.B;
       boolean b = true;
       if (tx == null || tx.r() != b) {
          b = false;
       }
       this.A = b;
       tx = this.x;
       a.m(tx);
       this.X7(tx.e().subscribe(new c(new BaseFeatureFollowPresenter$onBind$3(this))));
       f = RxBus.f;
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
       String str1;
       j0 oj0;
       int i1;
       BaseFeatureFollowPresenter tp;
       String str5;
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
          String str = "mPhoto";
          if (!mE.isLogined()) {
             b uob = d.a(-1712118428);
             uBaseFeature = this.p;
             if (uBaseFeature == null) {
                a.S(str);
             }
             String fullSource = uBaseFeature.getFullSource();
             str1 = a.B.getString(R.string.arg_RES_7f103077);
             uBaseFeature = this.p;
             if (uBaseFeature == null) {
                a.S(str);
             }
             uob.ne(uActivity, fullSource, "photo_follow", 14, str1, uBaseFeature.mEntity, null, null, new BaseFeatureFollowPresenter$b(this)).h();
          }else {
             tx = this.p;
             if (tx == null) {
                a.S(str);
             }
             User user = tx.getUser();
             a.o(user, "mPhoto.user");
             if (!user.isFollowingOrFollowRequesting()) {
                f$a uoa = PatchProxy.applyOneRefs(uActivity, this, uBaseFeature, "22");
                if (uoa != patchProxyRe) {
                }else {
                   a.p(uActivity, "activity");
                   String stringExtra = uActivity.getIntent().getStringExtra("arg_photo_exp_tag");
                   Object[] objArray1 = new Object[2];
                   BaseFeatureFollowPresenter ts = this.s;
                   String str2 = "mPhotoDetailParam";
                   if (ts == null) {
                      a.S(str2);
                   }
                   DetailCommonParam detailCommon = ts.getDetailCommonParam();
                   String str3 = "mPhotoDetailParam.detailCommonParam";
                   a.o(detailCommon, str3);
                   String str4 = "_";
                   if (detailCommon.getPreUserId() == null) {
                      str5 = str4;
                   }else {
                      ts = this.s;
                      if (ts == null) {
                         a.S(str2);
                      }
                      detailCommon = ts.getDetailCommonParam();
                      a.o(detailCommon, str3);
                      str5 = detailCommon.getPreUserId();
                   }
                   objArray1[0] = str5;
                   ts = this.s;
                   if (ts == null) {
                      a.S(str2);
                   }
                   detailCommon = ts.getDetailCommonParam();
                   a.o(detailCommon, str3);
                   if (detailCommon.getPrePhotoId() != null) {
                      ts = this.s;
                      if (ts == null) {
                         a.S(str2);
                      }
                      detailCommon = ts.getDetailCommonParam();
                      a.o(detailCommon, str3);
                      str4 = detailCommon.getPrePhotoId();
                   }
                   objArray1[i] = str4;
                   str1 = String.format("%s/%s", Arrays.copyOf(objArray1, 2));
                   a.o(str1, "java.lang.String.format\(format, *args\)");
                   ts = this.p;
                   if (ts == null) {
                      a.S(str);
                   }
                   ts.getUser().mPage = "photo";
                   BaseFeatureFollowPresenter tp1 = this.p;
                   if (tp1 == null) {
                      a.S(str);
                   }
                   f$a uoa2 = new f$a(tp1.getUser(), uActivity.Q2());
                   tp1 = this.p;
                   if (tp1 == null) {
                      a.S(str);
                   }
                   uoa2.c(tp1.getFullSource());
                   uoa2.o(uActivity.getUrl()+"#follow");
                   uoa2.g(stringExtra);
                   tx = this.p;
                   if (tx == null) {
                      a.S(str);
                   }
                   uoa2.f(tx.getExpTag());
                   uoa2.n(str1);
                   tx = this.p;
                   if (tx == null) {
                      a.S(str);
                   }
                   uoa2.m(tx);
                   uoa2.q(i);
                   a.o(uoa2, "FollowParams\n        .Bu¡­tSilenceSuccessTips\(true\)");
                   uoa = uoa2;
                }
                FollowHelper.b(uoa.b());
                tx = this.p;
                if (tx == null) {
                   a.S(str);
                }
                user = tx.getUser();
                a.o(user, "mPhoto.user");
                user.setFollowStatus(User$FollowStatus.FOLLOWING);
                e.f0(false);
                a$a uoa1 = PatchProxy.apply(objArray, this, uBaseFeature, "29");
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
                tq = this.p;
                if (tq == null) {
                   a.S(str);
                }
                if (tq.isAd()) {
                   tq = this.p;
                   if (tq == null) {
                      a.S(str);
                   }
                   if (tq.isLiveStream()) {
                      tq = this.u;
                      if (tq == null) {
                         a.S("mFragment");
                      }
                      if (tq.f() != 7) {
                         i = 2;
                      }
                      oj0 = i0.a();
                      i1 = 300;
                      tp = this.p;
                      if (tp == null) {
                         a.S(str);
                      }
                      oj0.e(i1, tp.mEntity).d(new BaseFeatureFollowPresenter$c(i, this)).a();
                   }else {
                      oj0 = i0.a();
                      i1 = 14;
                      tp = this.p;
                      if (tp == null) {
                         a.S(str);
                      }
                      oj0.t(i1, tp.mEntity);
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
       BaseFeatureFollowPresenter tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       o obj = PatchProxy.applyOneRefs(tp, this, uBaseFeature, "23");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = o.C();
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          StringBuilder str = "isFollowStatus: "+tp.getUserName()+" - "+tp.getCaption()+", "+mE.isLogined()+", ";
          User user = tp.getUser();
          if (user != null) {
             objArray = Boolean.valueOf(user.isFollowingOrFollowRequesting());
          }
          Object[] objArray1 = new Object[0];
          obj.s("BaseFeatureFollowPresenter", str+objArray, objArray1);
          QCurrentUser mE1 = QCurrentUser.ME;
          a.o(mE1, "QCurrentUser.ME");
          if (mE1.isLogined() && tp.getUser() != null) {
             User user1 = tp.getUser();
             a.o(user1, "photo.user");
             if (user1.isFollowingOrFollowRequesting()) {
             label_00ba :
                b = true;
             }
          }
          if (k.B(tp) != null) {
             PhotoAdvertisement photoAdverti = k.B(tp);
             a.m(photoAdverti);
             PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.THIRD_PLATFORM};
             if (photoAdverti.isAdGroup(uAdGroupArra)) {
                goto label_00ba ;
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
       a.o(obj1, "inject\(DetailAccessIds.S¡­LOW_ANIM_STATUS_OBSERVER\)");
       this.v = obj1;
       return;
    }
}
