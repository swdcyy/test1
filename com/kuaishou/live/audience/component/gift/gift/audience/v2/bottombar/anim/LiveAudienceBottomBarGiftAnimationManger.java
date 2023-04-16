package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import gz0.a;
import t02.a0;
import android.view.View;
import uw1.m;
import java.lang.Object;
import gz0.b;
import gz0.l;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.j;
import gz0.n;
import gz0.i;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger$b;
import ekd.m1;
import android.widget.TextView;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.a;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnDismissListener;
import brd.t;
import gz0.o;
import erd.g;
import crd.b;
import ry1.b;
import gz0.p;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveSendGiftNotifyAnimationConfig;
import gz0.r;
import java.lang.Runnable;
import e93.f;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import lf3.g;
import jk1.c;
import jk1.f;
import ow0.a;
import java.lang.System;
import lnc.b9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.ImageView;
import gz0.m;
import ia1.b;
import com.kuaishou.live.common.core.basic.resource.c$b;
import com.kuaishou.live.common.core.basic.resource.c;
import java.lang.Long;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import gz0.u;
import com.kuaishou.live.common.core.basic.degrade.j;
import gz0.v;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import gz0.k;
import gz0.t;
import gz0.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import z12.x;
import k2b.u1;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;

public class LiveAudienceBottomBarGiftAnimationManger extends a	// class@000b00
{
    public final c A;
    public LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel e;
    public long f;
    public final View g;
    public final View h;
    public final TextView i;
    public boolean j;
    public a k;
    public AnimatorSet l;
    public ValueAnimator m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final Object r;
    public final b s;
    public LiveSendGiftNotifyAnimationConfig t;
    public final m u;
    public final DialogInterface$OnShowListener v;
    public final DialogInterface$OnDismissListener w;
    public final g x;
    public final ValueAnimator$AnimatorUpdateListener y;
    public final Animator$AnimatorListener z;

    public void LiveAudienceBottomBarGiftAnimationManger(a0 p0,View p1,m p2){
       super(p0, p1);
       this.r = new Object();
       this.s = new b();
       l ol = new l(this);
       this.v = ol;
       j oj = new j(this);
       this.w = oj;
       n on = new n(this);
       this.x = on;
       this.y = new i(this);
       this.z = new LiveAudienceBottomBarGiftAnimationManger$a(this);
       LiveAudienceBottomBarGiftAnimationManger$b uob = new LiveAudienceBottomBarGiftAnimationManger$b(this);
       this.A = uob;
       this.u = p2;
       this.g = m1.f(p1, 0x7f0a1959);
       this.h = m1.f(p1, 0x7f0a195a);
       TextView textView = m1.f(p1, R.id.live_audience_gift_bottom_money_count);
       this.i = textView;
       textView.setTypeface(d0.a("alte-din.ttf", a.a().a()));
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarGiftAnimationManger.class, "1")) {
       }else {
          this.k = new a();
          if (p2 != null) {
             p2.n(ol);
             p2.s3(oj);
             this.k.c(p2.c().subscribe(new o(this)));
          }
          this.k.c(this.d.b3.W().subscribe(new p(this)));
          if (this.e() != null) {
             f.k("preparePlayAnimation", new r(this), this, this.e().mWatchDurationMs);
          }
          this.d.Z2.u().u0(510, SCActionSignal.class, on);
          this.d.x1.fl(uob);
          if (a.i() <= 0) {
             a.r(System.currentTimeMillis());
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarGiftAnimationManger.class, "15")) {
          return;
       }
       LiveAudienceBottomBarGiftAnimationManger tu = this.u;
       if (tu != null) {
          tu.g(this.v);
          this.u.m5(this.w);
       }
       this.d.x1.ii(this.A);
       this.d.Z2.u().o(510, this.x);
       b9.a(this.k);
       this.k = null;
       this.d();
       this.i();
       f.g(this);
       this.n = false;
       this.j = false;
       this.o = false;
       this.p = false;
       this.q = false;
       return;
    }
    public final boolean c(){
       boolean b = (this.n != null && (this.j != null && this.o == null))? true: false;
       return b;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarGiftAnimationManger.class, "10")) {
          return;
       }
       LiveAudienceBottomBarGiftAnimationManger tl = this.l;
       if (tl != null) {
          tl.removeAllListeners();
          this.l.cancel();
          this.l = null;
       }
       tl = this.m;
       if (tl != null) {
          tl.removeAllListeners();
          this.m.cancel();
          this.m = null;
       }
       return;
    }
    public final LiveSendGiftNotifyAnimationConfig e(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceBottomBarGiftAnimationManger.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t == null) {
          this.t = a.t().u("SOURCE_LIVE").getValue("sendGiftNotifyAnimationConfig", LiveSendGiftNotifyAnimationConfig.class, null);
       }
       return this.t;
    }
    public final boolean f(){
       AnimatorSet uAnimatorSet;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceBottomBarGiftAnimationManger liveAudience = LiveAudienceBottomBarGiftAnimationManger.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, liveAudience, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.d.Y2.d()) {
          return b;
       }
       if (!this.s.isValid()) {
          return b;
       }
       long l = d.a(0x630bc993).d1().q();
       if (l - null <= 0) {
          return b;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "6")) {
          this.c.a(this.z);
          this.c.c(this.y);
          this.c.setVisibility(b);
          this.c.setProgress(0);
          this.c.clearAnimation();
          c.b(this.c, this.s, new m(this));
       }
       if (l - 199 <= 0) {
          if (PatchProxy.isSupport(liveAudience) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, liveAudience, "12") && this.l == null)) {
             if (PatchProxy.isSupport(liveAudience)) {
                uAnimatorSet = PatchProxy.applyOneRefs(Long.valueOf(l), this, liveAudience, "14");
                if (uAnimatorSet != patchProxyRe) {
                label_0135 :
                   this.l = uAnimatorSet;
                   uAnimatorSet.addListener(new t(this));
                   this.l.setStartDelay(1100);
                   this.l.start();
                }
             }
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.g, propertyValu);
             objectAnimat.addListener(new u(this));
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             uAnimatorSet1.addListener(new v(this));
             Animator[] uAnimatorArr = new Animator[]{j.a(this.h, new float[2]{0,0x3f800000}),j.a(this.i, new float[2]{0,0x3f800000})};
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet1.setDuration(100);
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             valueAnimato.setInterpolator(new LinearInterpolator());
             valueAnimato.addUpdateListener(new k(this, l));
             valueAnimato.setDuration(1300);
             AnimatorSet uAnimatorSet2 = new AnimatorSet();
             Animator[] uAnimatorArr1 = new Animator[]{objectAnimat,uAnimatorSet1,valueAnimato};
             uAnimatorSet2.playSequentially(uAnimatorArr1);
             uAnimatorSet = uAnimatorSet2;
             goto label_0135 ;
          }
          this.o = true;
          f.k("playBottomBarGiftAnimation", new j(this), this.r, 0x2710);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "19")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          showEvent.elementPackage = uElementPack;
          uElementPack.action2 = "GIFT_EFFECT_CARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          showEvent.contentPackage = uContentPack;
          uContentPack.liveStreamPackage = this.d.Z2.a();
          u1.C0("", x.k(this.d.Z2), 9, uElementPack, uContentPack);
       }
       return true;
    }
    public final void g(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceBottomBarGiftAnimationManger liveAudience = LiveAudienceBottomBarGiftAnimationManger.class;
       if (PatchProxy.applyVoid(null, this, liveAudience, "4")) {
          return;
       }
       if (!this.c()) {
          return;
       }
       LiveSendGiftNotifyAnimationConfig liveSendGift = this.e();
       if (liveSendGift == null) {
          return;
       }
       LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel obj = PatchProxy.applyOneRefs(liveSendGift, this, liveAudience, "18");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = a.g(LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel.class);
          b = (obj != null && ((System.currentTimeMillis() - obj.mLastShowTime) - liveSendGift.mAppearFrequencyDurationMs < 0 && obj.mShowCount >= liveSendGift.mAppearFrequencyTimes))? true: false;
       }
       Object obj1 = PatchProxy.applyOneRefs(liveSendGift, this, liveAudience, "17");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          long l = a.i();
          if (l > 0) {
             long l1 = liveSendGift.mIntervalDaysMs + liveSendGift.mSilenceDaysMs;
             long l2 = System.currentTimeMillis() - l;
             if (l1 > 0 && (l2 % l1) - liveSendGift.mSilenceDaysMs > 0) {
                i = 1;
             }
          }
          b1 = i;
       }
       if (!b && (b1 || (this.f() && !PatchProxy.applyVoidOneRefs(liveSendGift, this, liveAudience, "16")))) {
          LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel liveGiftBoxA = a.g(LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel.class);
          if (liveGiftBoxA == null) {
             liveGiftBoxA = new LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel();
             liveGiftBoxA.mLastShowTime = System.currentTimeMillis();
             liveGiftBoxA.mShowCount = 1;
          }else if((System.currentTimeMillis() - liveGiftBoxA.mLastShowTime) - liveSendGift.mAppearFrequencyDurationMs > 0){
             liveGiftBoxA.mLastShowTime = System.currentTimeMillis();
             liveGiftBoxA.mShowCount = 1;
          }else {
             liveGiftBoxA.mShowCount = liveGiftBoxA.mShowCount + 1;
          }
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"live_audience_gift_box_animation_strategy_model", b.e(liveGiftBoxA));
          g.a(uEditor);
       }
    label_00e7 :
       return;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceBottomBarGiftAnimationManger.class, "11")) {
          return;
       }
       this.b.setVisibility(0);
       this.a.setBackground(objArray);
       this.c.setVisibility(8);
       this.c.f();
       this.c.clearAnimation();
       this.c.v(this.z);
       this.c.x(this.y);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarGiftAnimationManger.class, "9")) {
          return;
       }
       this.h();
       this.i.setText("");
       this.g.setVisibility(8);
       this.g.setAlpha(0x3f800000);
       this.h.setVisibility(8);
       this.i.setVisibility(8);
       f.g(this.r);
       this.o = false;
       return;
    }
    public void j(boolean p0){
       LiveAudienceBottomBarGiftAnimationManger liveAudience = LiveAudienceBottomBarGiftAnimationManger.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "8")) {
          return;
       }
       if (this.n == p0) {
          return;
       }
       if (!p0) {
          this.d();
          this.i();
       }
       this.n = p0;
       return;
    }
}
