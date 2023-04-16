package com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import c12.f;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$a;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$3;
import androidx.lifecycle.LifecycleObserver;
import ks3.i0$a;
import ks3.i0;
import java.lang.Boolean;
import oq5.c;
import jv1.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import va1.i0;
import com.kwai.robust.PatchProxyResult;
import k51.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import lu7.f;
import java.lang.Number;
import d61.y;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lb2.i;
import hf1.f;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import ym5.a;
import g31.e;
import g31.f;
import msd.a;
import msd.l;
import crd.b;
import k51.b;
import java.lang.Exception;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.widget.ImageView;
import wj2.r0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import t02.a0;
import os3.b;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import g31.c;
import android.view.View$OnClickListener;
import d61.i0;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$c;
import a32.k;
import a32.r;
import brd.t;
import g31.d;
import erd.g;

public class LiveAudienceTopBarPresenter extends f	// class@000be2
{
    public KwaiBindableImageView K;
    public TextView L;
    public KwaiImageView M;
    public ImageView N;
    public ViewGroup O;
    public KwaiImageView P;
    public KwaiImageView Q;
    public i0 R;
    public b S;
    public r0 T;
    public i U;
    public a0 U0;
    public LiveStreamFeedWrapper V;
    public final i0$a V0;
    public LivePlayLogger W;
    public b X;
    public a Y;
    public final c Z;
    public static String sLivePresenterClassName = "LiveAudienceTopBarPresenter";

    public void LiveAudienceTopBarPresenter(){
       super();
       this.Z = new LiveAudienceTopBarPresenter$a(this);
       this.V0 = new LiveAudienceTopBarPresenter$b(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopBarPresenter.class, "3")) {
          return;
       }
       super.F8();
       this.getLifecycle().addObserver(new LiveAudienceTopBarPresenter$3(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopBarPresenter.class, "6")) {
          return;
       }
       super.H8();
       LiveAudienceTopBarPresenter tR = this.R;
       if (tR != null) {
          tR.c(this.V0);
       }
       return;
    }
    public void Q(boolean p0){
       LiveAudienceTopBarPresenter liveAudience = LiveAudienceTopBarPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "5")) {
          return;
       }
       this.X.Q0(this.Z);
       i0.e(this.getActivity(), this.O);
       return;
    }
    public final boolean a9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveAudienceTopBarPresenter.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "15");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiveTopBarButtonPerfOpt", false);
       return b;
    }
    public UserVerifiedDetail b9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopBarPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.V.getUser() != null && this.V.getUser().mVerifiedDetail != null) {
          return this.V.getUser().mVerifiedDetail;
       }
       return null;
    }
    public void c9(){
       int i;
       LiveAudienceTopBarPresenter liveAudience = LiveAudienceTopBarPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "8")) {
          return;
       }
       if (this.L != null) {
          String str = f.a(this.V.getUser());
          Object obj = PatchProxy.apply(objArray, this, liveAudience, "10");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(!y.d(this.getActivity())){
             liveAudience = this.U;
             i = (liveAudience != null && liveAudience.b() == null)? 5: 4;
          }else {
             i = 6;
          }
          String str1 = f.e(str, i);
          this.L.setText(str1);
          b.d0(LiveLogTag.LIVE_PROFILE, "audience setName", "aliasName", str, "showName", str1);
       }
       return;
    }
    public void d9(boolean p0){
       LiveAudienceTopBarPresenter liveAudience = LiveAudienceTopBarPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "11")) {
          return;
       }
       if (d.a(0x4c5dd1b8).f2()) {
          p0 = false;
       }
       try{
          b.e(new e(p0), new f(this), this.a9());
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopBarPresenter.class, "2")) {
          return;
       }
       this.K = m1.f(p0, 0x7f0a189c);
       this.L = m1.f(p0, 0x7f0a21f7);
       this.M = m1.f(p0, 0x7f0a2701);
       this.O = m1.f(p0, 0x7f0a3fd0);
       this.N = m1.f(p0, 0x7f0a1b32);
       this.P = m1.f(p0, 0x7f0a21f9);
       this.Q = m1.f(p0, 0x7f0a2537);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopBarPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.T = this.s8(r0.class);
       this.U = this.s8(i.class);
       this.V = this.r8("LIVE_PHOTO");
       this.W = this.t8("LIVE_PLAY_LOGGER");
       this.X = this.q8(b.class);
       this.U0 = this.q8(a0.class);
       this.R = this.t8("LIVE_MERCHANT_PLAY_CONFIG_SERVICE");
       this.S = this.r8("LIVE_MERCHANT_AUDIENCE_TOP_SLIDE_BAR_SERVICE");
       return;
    }
    public void x(boolean p0){
       LiveAudienceTopBarPresenter liveAudience = LiveAudienceTopBarPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "4")) {
          return;
       }
       User user = this.V.getUser();
       HeadImageSize mIDDLE = HeadImageSize.MIDDLE;
       if (!PatchProxy.applyVoidTwoRefs(user, mIDDLE, this, liveAudience, "7")) {
          if (user != null) {
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-live:live-features:live-audience");
             uoa.d(ImageSource.FEED_AVATAR);
             a uoa1 = uoa.a();
             b uob = null;
             d uod = this.K.g0(uob, uob, d.i(user, mIDDLE));
             if (uod != null) {
                uod.r(uoa1);
             }
             liveAudience = this.K;
             if (uod != null) {
                uob = uod.e();
             }
             liveAudience.setController(uob);
          }
          this.K.setPlaceHolderImage(R.drawable.detail_avatar_secret);
          this.K.setOnClickListener(new c(this));
       }
       this.X.H6(this.Z);
       this.c9();
       i0.a(this.b9(), this.M, true);
       i0.b(this.getActivity(), this.O);
       this.U0.e2.a(new LiveAudienceTopBarPresenter$c(this));
       this.d9(y.d(this.getActivity()));
       if (!this.S.a()) {
          LiveAudienceTopBarPresenter tR = this.R;
          if (tR != null) {
             tR.b(this.V0);
          }
       }else {
          this.X7(this.S.b().subscribe(new d(this)));
       }
       return;
    }
}
