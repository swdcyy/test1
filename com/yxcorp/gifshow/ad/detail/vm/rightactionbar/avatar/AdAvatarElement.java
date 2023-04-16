package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import hs7.d;
import rp7.a;
import jh5.a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$c;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qp7.b;
import androidx.fragment.app.Fragment;
import uw9.v3;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import os7.a;
import java.lang.Boolean;
import t19.c;
import t19.b;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$initVisibleMutexItem$1;
import msd.l;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$initVisibleMutexItem$2;
import qp7.b1;
import tw.j;
import qp7.x0;
import s0d.f;
import s0d.e;
import android.graphics.drawable.Drawable;
import wb5.i;
import com.facebook.imagepipeline.request.ImageRequest;
import os7.a$c;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.d;
import com.kwai.framework.model.user.DynamicPendant;
import java.lang.Float;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$e;
import erd.g;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$f;
import io.reactivex.internal.functions.Functions;
import qp7.c;
import ms7.a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$h;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$i;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$j;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$k;
import androidx.lifecycle.Observer;
import zz5.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$7;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$8;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$9;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import msd.a;
import wl9.x;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$11;
import d29.d;
import rz8.b;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$12;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$onBind$13;
import lnc.b9;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$a;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import android.content.Intent;
import android.app.Activity;
import nsd.r0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Arrays;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f$a;
import java.lang.StringBuilder;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import oe6.e;
import p1a.a$a;
import p1a.a;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import yy6.c;
import qp7.t0;
import w19.e;
import d29.f;
import java.util.Objects;
import java.lang.Integer;
import lnc.i3;
import qd5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.k2;
import k2b.u1;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.google.common.collect.ImmutableMap$b;
import java.util.Map;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import n49.s;
import n49.e;
import n49.o;
import java.util.HashMap;
import az6.a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.c;
import d29.e;
import tl8.g;
import lnc.y0;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$l;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import nx8.n;

public final class AdAvatarElement extends DispatchBaseElement	// class@001721
{
    public c A;
    public SlidePlayViewModel B;
    public View$OnClickListener C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Runnable I;
    public AvatarInfoResponse J;
    public int K;
    public b L;
    public b M;
    public b N;
    public final Runnable O;
    public final b1 P;
    public QPhoto t;
    public GifshowActivity u;
    public BaseFragment v;
    public d w;
    public PhotoDetailParam x;
    public a y;
    public o z;

    public void AdAvatarElement(){
       super(d.d, null);
       this.O = new AdAvatarElement$c(this);
       this.P = new AdAvatarElement$b(this);
    }
    public static final QPhoto n0(AdAvatarElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final SlidePlayViewModel o0(AdAvatarElement p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAvatarElement.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          d j = p0.j;
          a.o(j, "callerContext.mPhoto");
          this.t = j;
          j = p0.a;
          a.o(j, "callerContext.mActivity");
          this.u = j;
          j = p0.b;
          a.o(j, "callerContext.mFragment");
          this.v = j;
          this.w = p0;
          if (j == null) {
             a.S("mFragment");
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(j.getParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
          this.B = slidePlayVie;
          j = p0.c;
          a.o(j, "callerContext.mPhotoDetailParam");
          this.x = j;
          j = p0.h;
          a.o(j, "callerContext.mLogListener");
          this.y = j;
          j = p0.m;
          a.o(j, "callerContext.mPhotoAdActionBarClickProcessor");
          this.z = j;
          v3 f = p0.d.f;
          a.o(f, "callerContext.mPhotoDeta¡­GlobalParams.mStateLogger");
          this.A = f;
       }
       return;
    }
    public a f0(a p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, AdAvatarElement.class, "31");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(p0);
       }
       return uoa;
    }
    public void j0(boolean p0){
       AdAvatarElement tv;
       b uob1;
       String str2;
       AdAvatarElement tt2;
       a uoa1;
       ImageRequest[] imageRequest;
       Object[] objArray1;
       AdAvatarElement uAdAvatarEle = AdAvatarElement.class;
       if (PatchProxy.isSupport(uAdAvatarEle) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdAvatarEle, "2")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uAdAvatarEle, "8")) {
          c uoc = new c();
          this.N = new b(uoc, new AdAvatarElement$initVisibleMutexItem$1(this));
          this.M = new b(uoc, new AdAvatarElement$initVisibleMutexItem$2(this));
       }
       this.t0();
       this.i(this.P);
       String str = "mPhoto";
       if (!PatchProxy.applyVoid(objArray, this, uAdAvatarEle, "6")) {
          tv = this.t;
          if (tv == null) {
             a.S(str);
          }
          String str3 = j.s(tv);
          String str4 = (str3 == null || !str3.length())? 1: null;
          if (!str4) {
             if (!PatchProxy.applyVoidOneRefs(str3, this, uAdAvatarEle, "7")) {
                a uoa = this.E();
                e[] uoeArray = f.x().t(str3).w();
                tt2 = this.t;
                if (tt2 == null) {
                   a.S(str);
                }
                uoa.j(uoeArray, i.b(tt2.getUserSex()), objArray, objArray);
             }
          }else if(PatchProxy.applyVoid(objArray, this, uAdAvatarEle, "9")){
             uAdAvatarEle = this.t;
             if (uAdAvatarEle == null) {
                a.S(str);
             }
             User user1 = uAdAvatarEle.getUser();
             if (user1 != null) {
                User mDynamicPend = user1.mDynamicPendant;
                User mPendants = user1.mPendants;
                if (mPendants != null || mDynamicPend != null) {
                   str2 = (mDynamicPend != null)? mDynamicPend.getLottieUrl(): objArray;
                   if (str2 != null && (mDynamicPend.getWidthRadio() != null && mDynamicPend.getHeightRadio() != null)) {
                      objArray = new a$c();
                      objArray.a = mDynamicPend.getLottieUrl();
                      Float widthRadio = mDynamicPend.getWidthRadio();
                      a.m(widthRadio);
                      objArray.b = widthRadio.floatValue();
                      Float heightRadio = mDynamicPend.getHeightRadio();
                      a.m(heightRadio);
                      objArray.c = heightRadio.floatValue();
                   }
                label_0113 :
                   uoa1 = this.E();
                   imageRequest = d.i(user1, HeadImageSize.ADJUST_MIDDLE);
                   AdAvatarElement tt3 = this.t;
                   if (tt3 == null) {
                      a.S(str);
                   }
                   uoa1.j(imageRequest, i.b(tt3.getUserSex()), objArray, b.c(mPendants));
                }else {
                   uoa1 = this.E();
                   imageRequest = d.i(user1, HeadImageSize.ADJUST_MIDDLE);
                   tt2 = this.t;
                   if (tt2 == null) {
                      a.S(str);
                   }
                   uoa1.j(imageRequest, i.b(tt2.getUserSex()), objArray, objArray);
                }
             }
          }
       }
    label_0135 :
       this.x0();
       AdAvatarElement tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       User user = tt.getUser();
       String str1 = "mFragment";
       if (user != null) {
          b uob = RxBus.f.f(n.class).observeOn(d.a).subscribe(new AdAvatarElement$e(user, this));
          a.o(uob, "RxBus.INSTANCE.toObserva¡­            }\n          }");
          this.j(uob);
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          user.startSyncWithFragment(tv.m());
          uob1 = user.observable().subscribe(new AdAvatarElement$f(user, this), Functions.e);
          a.o(uob1, "user.observable\(\).subscr¡­Functions.ERROR_CONSUMER\)");
          this.j(uob1);
       }
       g e = Functions.e;
       str2 = "Functions.ERROR_CONSUMER";
       a.o(e, str2);
       this.j(this.A().f(new AdAvatarElement$g(this), e));
       a.o(e, str2);
       this.j(this.A().c(new AdAvatarElement$h(this), e));
       a.o(e, str2);
       this.j(this.A().d(new AdAvatarElement$i(this), e));
       a.o(e, str2);
       this.j(this.A().e(new AdAvatarElement$j(this), e));
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       tv = this.v;
       if (tv == null) {
          a.S(str1);
       }
       d.b(tt, tv, new AdAvatarElement$k(this));
       AdAvatarElement tv1 = this.v;
       if (tv1 == null) {
          a.S(str1);
       }
       AdAvatarElement tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       AdLiveConversionObservable uAdLiveConve = new AdLiveConversionObservable(tv1, tt1, new AdAvatarElement$onBind$7(this), AdAvatarElement$onBind$8.INSTANCE, new AdAvatarElement$onBind$9(this));
       uob1 = tt.c();
       if (uob1 != null) {
          this.j(uob1);
       }
       if (this.p0()) {
          uob1 = RxBus.f.f(x.class).observeOn(d.a).subscribe(new d(new AdAvatarElement$onBind$11(this)));
          a.o(uob1, "RxBus.INSTANCE.toObserva¡­::onHomeSplashStateEvent\)");
          this.j(uob1);
       }
       uAdAvatarEle = this.t;
       if (uAdAvatarEle == null) {
          a.S(str);
       }
       this.j(new b(uAdAvatarEle, new AdAvatarElement$onBind$12(this), new AdAvatarElement$onBind$13(this)).a());
       return;
    }
    public void l0(boolean p0){
       AdAvatarElement uAdAvatarEle = AdAvatarElement.class;
       if (PatchProxy.isSupport(uAdAvatarEle) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdAvatarEle, "4")) {
          return;
       }
       this.E().g();
       this.E().w(Boolean.FALSE, null, false);
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(AdAvatarElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdAvatarElement.class, "3")) {
          return;
       }
       b9.a(this.L);
       this.w0(null);
       this.E = false;
       this.F = false;
       return;
    }
    public final void onHomeSplashStateEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAvatarElement.class, "28")) {
          return;
       }
       AdAvatarElement tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       p0 = (p0 != null)? p0.a: null;
       if (a.g(tt, p0)) {
          k1.s(this.O, this, 1000);
       }
       return;
    }
    public final boolean p0(){
       boolean b1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdAvatarElement obj = PatchProxy.apply(objArray, this, AdAvatarElement.class, "26");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       BaseFeed entity = obj.getEntity();
       Object obj1 = PatchProxy.applyOneRefs(entity, objArray, c.class, "18");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve = c.k(entity);
          if (uCaptionAdve != null && uCaptionAdve.mAvatarIconAnimation == 1) {
             uCaptionAdve = c.k(entity);
             uCaptionAdve = (uCaptionAdve != null)? uCaptionAdve.mAvatarIconAnimationUrlA: objArray;
             if (!TextUtils.x(uCaptionAdve)) {
                uCaptionAdve = c.k(entity);
                if (uCaptionAdve != null) {
                   objArray = uCaptionAdve.mAvatarIconAnimationUrlB;
                }
                if (!TextUtils.x(objArray)) {
                   b1 = true;
                }
             }
          }
       label_005e :
          b1 = false;
       }
       if (b1) {
          AdAvatarElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          if (!c.b0(tt.mEntity)) {
             b = true;
          }
       }
       return b;
    }
    public d q(){
       k ok = PatchProxy.apply(null, this, AdAvatarElement.class, "32");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k();
       }
       return ok;
    }
    public final void q0(){
       AdAvatarElement tu;
       AdAvatarElement tt;
       String fullSource;
       String str5;
       if (PatchProxy.applyVoid(null, this, AdAvatarElement.class, "18")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String str = "mActivity";
       String str1 = "mPhoto";
       if (!mE.isLogined()) {
          String str2 = a.B.getString(R.string.arg_RES_7f103077);
          a.o(str2, "AppEnv.APP.getString\(R.string.login_prompt_follow\)");
          b uob = d.a(-1712118428);
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          tt = this.t;
          if (tt == null) {
             a.S(str1);
          }
          fullSource = tt.getFullSource();
          tt = this.t;
          if (tt == null) {
             a.S(str1);
          }
          uob.ne(tu, fullSource, "photo_follow", 14, str2, tt.mEntity, null, null, new AdAvatarElement$a(this)).h();
          return;
       }else {
          tt = this.u;
          if (tt == null) {
             a.S(str);
          }
          String stringExtra = tt.getIntent().getStringExtra("arg_photo_exp_tag");
          int i = 2;
          Object[] objArray = new Object[i];
          tu = this.x;
          fullSource = "mPhotoDetailParam";
          if (tu == null) {
             a.S(fullSource);
          }
          DetailCommonParam detailCommon = tu.getDetailCommonParam();
          String str3 = "mPhotoDetailParam.detailCommonParam";
          a.o(detailCommon, str3);
          String str4 = "_";
          if (detailCommon.getPreUserId() == null) {
             str5 = str4;
          }else {
             tu = this.x;
             if (tu == null) {
                a.S(fullSource);
             }
             detailCommon = tu.getDetailCommonParam();
             a.o(detailCommon, str3);
             str5 = detailCommon.getPreUserId();
          }
          objArray[0] = str5;
          tu = this.x;
          if (tu == null) {
             a.S(fullSource);
          }
          detailCommon = tu.getDetailCommonParam();
          a.o(detailCommon, str3);
          if (detailCommon.getPrePhotoId() != null) {
             tu = this.x;
             if (tu == null) {
                a.S(fullSource);
             }
             detailCommon = tu.getDetailCommonParam();
             a.o(detailCommon, str3);
             str4 = detailCommon.getPrePhotoId();
          }
          objArray[1] = str4;
          String str6 = String.format("%s/%s", Arrays.copyOf(objArray, i));
          a.o(str6, "java.lang.String.format\(format, *args\)");
          AdAvatarElement tt1 = this.t;
          if (tt1 == null) {
             a.S(str1);
          }
          tt1.getUser().mPage = "photo";
          tt1 = this.u;
          if (tt1 == null) {
             a.S(str);
          }
          StringBuilder str7 = tt1.Q2();
          AdAvatarElement tt2 = this.t;
          if (tt2 == null) {
             a.S(str1);
          }
          f$a uoa = new f$a(tt2.getUser(), str7);
          tt1 = this.t;
          if (tt1 == null) {
             a.S(str1);
          }
          uoa.c(tt1.getFullSource());
          str7 = "";
          tt2 = this.u;
          if (tt2 == null) {
             a.S(str);
          }
          uoa.o(str7+tt2.getUrl()+"#follow");
          uoa.g(stringExtra);
          tt = this.t;
          if (tt == null) {
             a.S(str1);
          }
          uoa.f(tt.getExpTag());
          uoa.n(str6);
          uoa.q(1);
          FollowHelper.b(uoa.b());
          tt = this.t;
          if (tt == null) {
             a.S(str1);
          }
          User user = tt.getUser();
          a.o(user, "mPhoto.user");
          user.setFollowStatus(User$FollowStatus.FOLLOWING);
          e.f0(0);
          tt = this.y;
          if (tt == null) {
             a.S("mLogListener");
          }
          tt.a(a$a.b(31, "user_follow", 1));
          j0 oj0 = o.z();
          int i1 = 14;
          AdAvatarElement tt3 = this.t;
          if (tt3 == null) {
             a.S(str1);
          }
          oj0.t(i1, tt3.mEntity);
          tt = this.A;
          if (tt == null) {
             a.S("mStateLogger");
          }
          tt.b();
          return;
       }
    }
    public c r(){
       a uoa = PatchProxy.apply(null, this, AdAvatarElement.class, "33");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final boolean r0(){
       AdAvatarElement obj = PatchProxy.apply(null, this, AdAvatarElement.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       boolean b = true;
       if (!obj.useLive() || (this.K != b || this.H().A())) {
          b = false;
       }
       return b;
    }
    public final void s0(){
       f a;
       i3 oi3;
       String str3;
       ClientEvent$ElementPackage uElementPack;
       String str4;
       ClientContent$ContentPackage uContentPack;
       AvatarInfoResponse mPhoto;
       ClientContent$LiveStreamPackage liveStreamPa;
       JsonObject jsonObject;
       k2 d;
       CommonParams uCommonParam;
       ImmutableMap$b uob;
       CommonParams mEntryTag;
       Object obj = this;
       AdAvatarElement uAdAvatarEle = AdAvatarElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uAdAvatarEle, "16")) {
          return;
       }
       String str = "mPhotoDetailParam";
       String str1 = "mPhoto";
       if (!PatchProxy.applyVoid(objArray, obj, uAdAvatarEle, "30")) {
          a = f.a;
          uAdAvatarEle = obj.t;
          if (uAdAvatarEle == null) {
             a.S(str1);
          }
          AdAvatarElement v = obj.v;
          if (v == null) {
             a.S("mFragment");
          }
          boolean b = this.r0();
          AdAvatarElement j = obj.J;
          t0 ot0 = this.H();
          AdAvatarElement x = obj.x;
          if (x == null) {
             a.S(str);
          }
          int i1 = 1;
          boolean b1 = (obj.K == i1)? true: false;
          int i2 = (obj.C != null)? 1: 2;
          Objects.requireNonNull(a);
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             Object[] objArray1 = new Object[]{uAdAvatarEle,v,Boolean.valueOf(b),j,ot0,x,Boolean.valueOf(b1),Integer.valueOf(i2)};
             if (!PatchProxy.applyVoid(objArray1, a, uof, "2")) {
             }
          }else {
          }
       }
    label_0177 :
       uAdAvatarEle = obj.t;
       if (uAdAvatarEle == null) {
          a.S(str1);
       }
       int i = 13;
       String str2 = "mActivity";
       if (s.q(uAdAvatarEle, i)) {
          uAdAvatarEle = obj.z;
          if (uAdAvatarEle == null) {
             a.S("mPhotoAdActionBarClickProcessor");
          }
          AdAvatarElement t = obj.t;
          if (t == null) {
             a.S(str1);
          }
          AdAvatarElement u = obj.u;
          if (u == null) {
             a.S(str2);
          }
          uAdAvatarEle.a(t, u, new e(i));
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("clickType", Integer.valueOf(i));
          AdAvatarElement u1 = obj.u;
          if (u1 == null) {
             a.S(str2);
          }
          AdAvatarElement t1 = obj.t;
          if (t1 == null) {
             a.S(str1);
          }
          uAdAvatarEle = obj.x;
          if (uAdAvatarEle == null) {
             a.S(str);
          }
          DetailCommonParam detailCommon = uAdAvatarEle.getDetailCommonParam();
          a.o(detailCommon, "mPhotoDetailParam.detailCommonParam");
          QPreInfo preInfo = detailCommon.getPreInfo();
          uAdAvatarEle = obj.x;
          if (uAdAvatarEle == null) {
             a.S(str);
          }
          c.c(u1, t1, preInfo, uAdAvatarEle.mPhotoIndex, true, obj.C, AdAvatarElement$d.b, hashMap);
          return;
       }
    }
    public final void t0(){
       if (PatchProxy.applyVoid(null, this, AdAvatarElement.class, "5")) {
          return;
       }
       this.G = false;
       this.H = false;
       this.K = 3;
       this.E().h();
       return;
    }
    public final void u0(boolean p0,String p1){
       AdAvatarElement uAdAvatarEle = AdAvatarElement.class;
       if (PatchProxy.isSupport(uAdAvatarEle) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAdAvatarEle, "22")) {
          return;
       }
       if (this.H == null) {
          this.H = true;
          this.E().w(Boolean.valueOf(p0), p1, false);
       }
       return;
    }
    public final void v0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdAvatarElement.class, "29")) {
          return;
       }
       if (this.D == null || (this.E == null && this.F != null)) {
          f a = f.a;
          AdAvatarElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          boolean b = this.r0();
          AdAvatarElement tJ = this.J;
          t0 ot0 = this.H();
          int i = 0;
          boolean b1 = (this.K == 1)? true: false;
          AdAvatarElement ty = this.y;
          if (ty == null) {
             a.S("mLogListener");
          }
          Objects.requireNonNull(a);
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             Object[] objArray1 = new Object[]{tt,Boolean.valueOf(b),tJ,ot0,Boolean.valueOf(b1),ty};
             if (PatchProxy.applyVoid(objArray1, a, uof, "1")) {
             label_00ab :
                this.E = true;
             }
          }
          a.p(tt, "photo");
          a.p(ot0, "pageConfig");
          a.p(ty, "logListener");
          if (tJ != null) {
             objArray = tJ.mPhoto;
          }
          String str = a.a(tt, b, tJ, ot0, b1).e();
          int i1 = 319;
          String str1 = (b)? "live": "not_live";
          a$a uoa = a$a.s(i1, str1);
          uoa.h(new e(b, objArray, tt));
          uoa.m(str);
          uoa.r(1);
          ty.b(uoa);
          goto label_00ab ;
       }
    label_00ad :
       return;
    }
    public final void w0(AvatarInfoResponse p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAvatarElement.class, "23")) {
          return;
       }
       this.J = p0;
       p0 = (p0 != null)? p0.mType: 3;
       this.K = p0;
       return;
    }
    public final void x0(){
       boolean b;
       AdAvatarElement uAdAvatarEle = AdAvatarElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdAvatarEle, "11")) {
          return;
       }
       AdAvatarElement obj = PatchProxy.apply(objArray, this, uAdAvatarEle, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined()) {
             obj = this.t;
             if (obj == null) {
                a.S("mPhoto");
             }
             User user = obj.getUser();
             a.o(user, "mPhoto.user");
             if (y0.p(Boolean.valueOf(user.isFollowingOrFollowRequesting()))) {
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          obj = this.t;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (s.s(obj)) {
          label_0082 :
             this.I = objArray;
             if (!PatchProxy.applyVoid(objArray, this, uAdAvatarEle, "13")) {
                uAdAvatarEle = this.M;
                if (uAdAvatarEle != null) {
                   uAdAvatarEle.b(false);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, this, uAdAvatarEle, "14")){
             this.E().p(Boolean.FALSE);
             uAdAvatarEle = this.M;
             if (uAdAvatarEle != null) {
                uAdAvatarEle.b(true);
             }
          }
          this.I = new AdAvatarElement$l(this);
       }else {
          goto label_0082 ;
       }
       this.y0();
       return;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, AdAvatarElement.class, "15")) {
          return;
       }
       AdAvatarElement tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       PhotoAdvertisement photoAdverti = k.B(tt);
       AdAvatarElement tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       boolean i = 13;
       if (s.q(tt1, i)) {
          tt1 = this.t;
          if (tt1 == null) {
             a.S(str);
          }
          if (s.s(tt1)) {
             tt1 = 1;
          label_0039 :
             i = n.d(i, photoAdverti);
             if (tt1 || i) {
                tt1 = this.t;
                if (tt1 == null) {
                   a.S(str);
                }
                if (!c.b0(tt1.mEntity)) {
                   boolean b = s.c(photoAdverti);
                   AdAvatarElement tN = this.N;
                   if (tN != null) {
                      tN.b(b);
                   }
                }else {
                label_005c :
                   tt = this.N;
                   if (tt != null) {
                      tt.b(false);
                   }
                }
             }else {
                goto label_005c ;
             }
             return;
          }
       }
       tt1 = null;
       goto label_0039 ;
    }
}
