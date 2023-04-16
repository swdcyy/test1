package com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment;
import ml8.d;
import f12.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LivePrivateAutoCheckParams;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f12.a;
import pw6.d;
import pw6.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import xa2.j;
import com.kwai.library.widget.edittext.SettingPasswordEdit;
import xa2.k;
import com.kwai.framework.model.user.User;
import java.lang.System;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import xa2.e;
import com.kuaishou.live.core.show.liveprivate.a;
import erd.g;
import crd.b;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.m1;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import xa2.b;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.os.Bundle;
import i2b.a;
import d61.i;
import jp.a;
import z12.d;
import com.kuaishou.android.model.mix.CoverMeta;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveStreamFeedPrivateInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.widget.RelativeLayout;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import oz6.a;
import android.graphics.Typeface;
import ekd.d0;
import xa2.g;
import com.kwai.library.widget.edittext.SettingPasswordEdit$a;
import xa2.f;
import java.lang.Runnable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lnc.b9;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dw6.b;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;

public class LiveAudiencePrivatePasswordFragment extends BaseFragment implements d, b	// class@000c85
{
    public LiveStreamFeed j;
    public LiveAudiencePrivatePasswordFragment$b k;
    public b l;
    public LivePrivateAutoCheckParams m;
    public d n;
    public ViewGroup o;
    public ViewGroup p;
    public SettingPasswordEdit q;
    public TextView r;
    public View s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public m w;
    public static final int x;

    public void LiveAudiencePrivatePasswordFragment(){
       super();
       this.w = new LiveAudiencePrivatePasswordFragment$a(this);
    }
    public static LiveAudiencePrivatePasswordFragment eh(LiveStreamFeed p0,LivePrivateAutoCheckParams p1,LiveAudiencePrivatePasswordFragment$b p2){
       LiveAudiencePrivatePasswordFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveAudiencePrivatePasswordFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudiencePrivatePasswordFragment();
       obj.k = p2;
       obj.j = p0;
       obj.m = p1;
       return obj;
    }
    public void I(){
       a.e(this);
    }
    public int M(){
       return 5;
    }
    public void Mg(String p0){
       c.a(this, p0);
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveAudiencePrivatePasswordFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(this.j);
    }
    public void Q(){
       a.d(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveAudiencePrivatePasswordFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(this.j);
    }
    public void U(){
       a.f(this);
    }
    public boolean Xg(){
       return true;
    }
    public void a0(){
       a.c(this);
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePrivatePasswordFragment.class, "10")) {
          return;
       }
       String str = k.a(this.q.getPassword());
       LiveStreamFeed mUser = this.j.mUser;
       String id = (mUser != null)? mUser.getId(): "";
       long l = System.currentTimeMillis();
       this.l = e.a().Z(id, str).map(new e()).subscribeOn(d.a).subscribe(new e(this, l), new a(this, l));
       return;
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePrivatePasswordFragment.class, "13")) {
          return;
       }
       n.C(n.d(this.q));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePrivatePasswordFragment.class, "1")) {
          return;
       }
       this.o = m1.f(p0, 0x7f0a19b5);
       this.p = m1.f(p0, 0x7f0a19bc);
       this.q = m1.f(p0, 0x7f0a19b9);
       this.r = m1.f(p0, 0x7f0a19be);
       this.s = m1.f(p0, 0x7f0a19bb);
       this.t = m1.f(p0, 0x7f0a19b8);
       m1.a(p0, new b(this), R.id.live_audience_private_entrance_exit_button);
       m1.a(p0, this.w, R.id.live_audience_private_entrance_join_button);
       this.u = m1.f(p0, 0x7f0a19c0);
       this.v = m1.f(p0, 0x7f0a19bf);
       return;
    }
    public void f0(){
       a.b(this);
    }
    public String o(){
       return "LIVE_INPUT_PASSWD";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       LiveAudiencePrivatePasswordFragment tq;
       int i;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudiencePrivatePasswordFragment.class, "3");
       if (p2 != patchProxyRe) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0a43, p1, false);
       this.doBindView(view);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePrivatePasswordFragment.class, "11") && !i.a(this.t)) {
          ImageRequest[] imageRequest = b.f(this.j.mCoverMeta, a.c, new d(10, 0.13f, 0.13f));
          if (imageRequest.length) {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.t.getController());
             uod.u(imageRequest);
             AbstractDraweeController uAbstractDra = uod.e();
             this.t.setController(uAbstractDra);
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setColor(a1.a(R.color.arg_RES_7f0600a6));
             gradientDraw.setOrientation(GradientDrawable$Orientation.TL_BR);
             gradientDraw.setAlpha(216);
             this.t.setForegroundDrawable(gradientDraw);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePrivatePasswordFragment.class, "7")) {
          tq = this.j;
          int i1 = 0x7f102a69;
          if (tq != null) {
             LiveStreamFeed mLiveStreamM = tq.mLiveStreamModel;
             if (mLiveStreamM != null) {
                LiveStreamModel mLivePrivate = mLiveStreamM.mLivePrivateInfo;
                if (mLivePrivate != null) {
                   if (!TextUtils.x(mLivePrivate.mLivePrivateTitle)) {
                      this.u.setText(mLivePrivate.mLivePrivateTitle);
                   }else {
                      this.u.setText(i1);
                   }
                   if (!TextUtils.x(mLivePrivate.mLivePrivateDescription)) {
                      this.v.setVisibility(false);
                      this.v.setText(mLivePrivate.mLivePrivateDescription);
                   }else {
                      this.v.setVisibility(8);
                   }
                }
             }
          }
          this.u.setText(i1);
          this.v.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePrivatePasswordFragment.class, "15")) {
          Context context = this.q.getContext();
          LiveAudiencePrivatePasswordFragment tj = this.j;
          Object obj = PatchProxy.applyOneRefs(tj, objArray, k.class, "3");
          i = 4;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(tj != null && (r1.l1(tj) == 3 || r1.l1(tj) == i)){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             i = 6;
          }
          a uoa = new a();
          uoa.d(R.drawable.arg_RES_7f0810f6);
          uoa.g(i);
          uoa.f(n.c(context, 44.00f));
          uoa.e(n.c(context, 44.00f));
          uoa.h(R.color.arg_RES_7f061e52);
          uoa.i(24);
          uoa.j(2);
          uoa.k(d0.a("alte-din.ttf", context));
          this.q.b(uoa);
          this.q.setInputType(1);
          this.q.a();
          this.q.setOnTextFinishListener(new g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePrivatePasswordFragment.class, "14")) {
          if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePrivatePasswordFragment.class, "12")) {
             tq = this.q;
             if (tq != null) {
                tq.post(new f(this));
             }
          }
          this.o.setVisibility(8);
          this.p.setVisibility(false);
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePrivatePasswordFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       b9.a(this.l);
       LiveAudiencePrivatePasswordFragment tn = this.n;
       if (tn != null) {
          tn.unbind();
          this.n.destroy();
       }
       return;
    }
    public void sc(b p0){
       a.a(this, p0);
    }
    public boolean yb(){
       Object obj = PatchProxy.apply(null, this, LiveAudiencePrivatePasswordFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED);
    }
}
