package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import yha.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$mScaleAnimator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnAttachStateChangeListener;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import brd.t;
import cha.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$d;
import kga.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import com.kwai.framework.model.user.User;
import s0d.e;
import aha.c;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import android.content.Context;
import android.widget.TextView;
import android.content.res.ColorStateList;
import zf6.j;
import lu7.f;
import java.lang.CharSequence;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$e;
import erd.o;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$f;
import com.yxcorp.gifshow.follow.common.widget.wave.WaveView;
import com.yxcorp.gifshow.follow.common.widget.wave.WaveStyle;
import android.os.Build$VERSION;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.follow.config.model.EnableMyfollowSlide;
import java.lang.reflect.Type;
import kha.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import android.view.View;
import android.view.ViewStub;
import java.util.Objects;
import kga.e;
import a2.i0;
import android.animation.ValueAnimator;
import com.yxcorp.utility.n;

public final class FollowSlidePymiUserItemPresenter extends a	// class@00112c
{
    public final p A;
    public final View$OnAttachStateChangeListener B;
    public EnableMyfollowSlide v;
    public FollowingUserBannerFeed$UserBannerInfo w;
    public c x;
    public a y;
    public User z;
    public static final FollowSlidePymiUserItemPresenter$a C;

    static {
       FollowSlidePymiUserItemPresenter.C = new FollowSlidePymiUserItemPresenter$a(null);
    }
    public void FollowSlidePymiUserItemPresenter(){
       super();
       this.A = s.c(new FollowSlidePymiUserItemPresenter$mScaleAnimator$2(this));
       this.B = new FollowSlidePymiUserItemPresenter$c(this);
    }
    public void E8(){
       g a;
       FollowSlidePymiUserItemPresenter uFollowSlide = FollowSlidePymiUserItemPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFollowSlide, "13")) {
          return;
       }
       super.E8();
       this.R8().addOnAttachStateChangeListener(this.B);
       FollowSlidePymiUserItemPresenter ty = this.y;
       if (ty == null) {
          a.S("mViewPagerState");
       }
       a = c.a;
       this.X7(ty.c().subscribe(new FollowSlidePymiUserItemPresenter$d(this), a));
       ty = this.z;
       FollowSlidePymiUserItemPresenter tw = this.w;
       if (tw == null) {
          a.S("mUserBannerInfo");
       }
       if (ty != tw.mUser) {
          ty = this.w;
          if (ty == null) {
             a.S("mUserBannerInfo");
          }
          this.z = ty.mUser;
          ty = this.x;
          if (ty == null) {
             a.S("mAvatarRequestCache");
          }
          e[] uoeArray = ty.b(this.z);
          d uod = (uoeArray != null)? this.R8().g0(objArray, objArray, uoeArray): objArray;
          if (uod != null) {
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-follow:follow-pymi");
             uoa.d(ImageSource.FEED_AVATAR);
             uod.r(uoa.a());
          }
          KwaiImageView kwaiImageVie = this.R8();
          AbstractDraweeController uAbstractDra = (uod != null)? uod.e(): objArray;
          kwaiImageVie.setController(uAbstractDra);
          Context context = this.getContext();
          if (context != null) {
             this.S8().setTextColor(j.h(context, R.color.arg_RES_7f061641, 2));
          }
          TextView textView = this.S8();
          tw = this.w;
          if (tw == null) {
             a.S("mUserBannerInfo");
          }
          textView.setText(f.c(tw.mUser));
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowSlide, "12")) {
          if (this.a9()) {
             this.c9(true);
             this.d9();
          }else {
             this.e9();
          }
       }
       uFollowSlide = this.w;
       if (uFollowSlide == null) {
          a.S("mUserBannerInfo");
       }
       this.X7(uFollowSlide.observable().distinctUntilChanged(FollowSlidePymiUserItemPresenter$e.b).subscribe(new FollowSlidePymiUserItemPresenter$f(this), a));
       this.W8().setWaveStyle(WaveStyle.RING_FIX_WAVE_DIFFUSE);
       this.W8().a(false);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter.class, "10")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          this.S8().setFallbackLineSpacing(false);
       }
       b uob = new b();
       uob.v(a1.a(0x106000d));
       uob.s(DrawableCreator$Shape.Oval);
       this.R8().setForegroundDrawable(uob.a());
       this.R8().setPlaceHolderImage(R.drawable.detail_avatar_secret);
       this.v = a.a(EnableMyfollowSlide.class);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter.class, "17")) {
          return;
       }
       this.c9(false);
       this.R8().removeOnAttachStateChangeListener(this.B);
       return;
    }
    public final FollowSlidePymiUserItemPresenter$b Y8(){
       Object obj = PatchProxy.apply(null, this, FollowSlidePymiUserItemPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final boolean Z8(){
       boolean b;
       FollowSlidePymiUserItemPresenter obj = PatchProxy.apply(null, this, FollowSlidePymiUserItemPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (FollowConfigUtil.i()) {
          obj = this.v;
          if (obj != null && (obj != null && obj.animationUserHead == null)) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final boolean a9(){
       FollowSlidePymiUserItemPresenter obj = PatchProxy.apply(null, this, FollowSlidePymiUserItemPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       if (obj == null) {
          a.S("mUserBannerInfo");
       }
       FollowingUserBannerFeed$UserBannerInfo mAvatarInfo = obj.mAvatarInfo;
       boolean b = true;
       if (mAvatarInfo == null || mAvatarInfo.mStatus != b) {
          b = false;
       }
       return b;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter.class, "11")) {
          return;
       }
       if (this.a9()) {
          this.c9(true);
          this.d9();
       }
       return;
    }
    public final void c9(boolean p0){
       FollowSlidePymiUserItemPresenter uFollowSlide = FollowSlidePymiUserItemPresenter.class;
       if (PatchProxy.isSupport(uFollowSlide) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFollowSlide, "14")) {
          return;
       }
       if (p0) {
          if (this.V8() instanceof ViewStub) {
             View view = this.V8();
             Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewStub");
             view = view.inflate();
             a.o(view, "\(mLiveLabelView as ViewStub\).inflate\(\)");
             if (!PatchProxy.applyVoidOneRefs(view, this, a.class, "6")) {
                a.p(view, "<set-?>");
                this.r = view;
             }
             if (this.V8() instanceof ImageView) {
                View view1 = this.V8();
                Objects.requireNonNull(view1, "null cannot be cast to non-null type android.widget.ImageView");
                view1.setImageDrawable(e.a(2));
             }
          }
          if (this.V8().getVisibility()) {
             this.V8().setVisibility(0);
          }
       }else if(this.V8().getVisibility() != 8){
          this.V8().setVisibility(8);
       }
       return;
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter.class, "16")) {
          return;
       }
       if (i0.X(this.R8())) {
          FollowSlidePymiUserItemPresenter ty = this.y;
          if (ty == null) {
             a.S("mViewPagerState");
          }
          if (!ty.b()) {
             if (this.W8().getVisibility()) {
                this.W8().setVisibility(0);
             }
             if (!this.Y8().isRunning()) {
                this.Y8().start();
             }
          }
       }
    label_0049 :
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter.class, "15")) {
          return;
       }
       View[] viewArray = new View[]{this.V8()};
       n.Z(8, viewArray);
       this.Y8().cancel();
       if (this.W8().getVisibility() != 8) {
          this.W8().c();
          this.W8().setVisibility(8);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(FollowingUserBannerFeed$UserBannerInfo.class);
       a.o(obj, "inject\(UserBannerInfo::class.java\)");
       this.w = obj;
       obj = this.r8("PYMI_USER_AVATAR_REQUEST_CACHE");
       a.o(obj, "inject\(FollowAccessIds.P¡­SER_AVATAR_REQUEST_CACHE\)");
       this.x = obj;
       obj = this.r8("NIRVANA_FOLLOW_VIEW_PAGER_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­_FOLLOW_VIEW_PAGER_STATE\)");
       this.y = obj;
       return;
    }
}
