package com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.LiveGiftNamingAnimationState;
import ug1.j;
import com.kuaishou.live.common.core.component.gift.f;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.io.File;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import android.widget.ImageView;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView$b;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;
import android.view.View;
import va1.n0;
import lnc.a1;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.System;
import android.widget.TextView;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.CharSequence;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView;
import ug1.d0;
import va1.a0;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import ug1.k;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import android.text.SpannableString;
import android.animation.ArgbEvaluator;
import android.animation.AnimatorSet;
import th0.g;
import android.animation.TimeInterpolator;
import ekd.f;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import th0.f;
import android.animation.ValueAnimator;
import ug1.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import android.content.res.Resources;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import l12.d;
import va1.f0;
import android.graphics.Bitmap;
import java.util.List;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView$SpringNamingStyle;
import wj1.c;
import com.kuaishou.live.core.basic.widget.LiveGradientBackgroundView;
import com.kuaishou.live.common.core.component.gift.BatchAnimBgView;
import ug1.o;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView;
import android.view.animation.LinearInterpolator;
import ug1.n;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$o;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import rnc.i;
import android.graphics.Canvas;
import android.view.ViewGroup;
import ug1.l;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView$c;
import java.lang.Number;
import d61.c0;
import wj1.a;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c$a;
import com.yxcorp.gifshow.image.KwaiAnimImageView;
import com.kuaishou.live.core.basic.widget.StrokeSpanTextView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView$a;
import android.view.View$OnClickListener;
import android.graphics.drawable.Animatable;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import qkd.b;
import bh1.a;
import ug1.i;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$n;

public class GiftAnimItemView extends RelativeLayout	// class@00112c
{
    public boolean A;
    public boolean B;
    public boolean C;
    public long D;
    public GiftMessage E;
    public GiftAnimItemView$c F;
    public c G;
    public GiftAnimContainerView$n H;
    public int I;
    public int J;
    public GiftAnimContainerView$o K;
    public List L;
    public boolean M;
    public LiveGiftNamingAnimationState N;
    public final Runnable O;
    public SCLiveGiftTitleChangeInfo P;
    public final x Q;
    public boolean R;
    public final boolean S;
    public KwaiImageView b;
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public KwaiImageView f;
    public KwaiAnimImageView g;
    public StrokeSpanTextView h;
    public TextView i;
    public View j;
    public KwaiImageView k;
    public View l;
    public BatchAnimBgView m;
    public View n;
    public BatchAnimBgView o;
    public LiveGradientBackgroundView p;
    public View q;
    public View r;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public KwaiImageView v;
    public LiveGiftSlotSpringNamingView w;
    public KwaiImageView x;
    public KwaiImageView y;
    public Runnable z;
    public static final int T;

    public void GiftAnimItemView(Context p0){
       super(p0, null, 0);
    }
    public void GiftAnimItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GiftAnimItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.I = -1;
       this.L = new ArrayList();
       this.N = LiveGiftNamingAnimationState.NOT_DISPLAY;
       this.O = new j(this);
       this.Q = Suppliers.a(f.b);
       this.S = a.t().u("SOURCE_LIVE").d("liveGiftSlotAnimationBugFixSwitch", true);
    }
    public static void o(KwaiImageView p0,File p1,Runnable p2,long p3){
       if (PatchProxy.isSupport(GiftAnimItemView.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), null, GiftAnimItemView.class, "43")) {
          return;
       }
       p0.setVisibility(0);
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       uod.w(ImageRequest.a(p1));
       uod.s(new GiftAnimItemView$b(p2, p0, p3));
       p0.setController(uod.e());
       return;
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(GiftAnimItemView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GiftAnimItemView.class, "10")) {
          return;
       }
       int i = 0;
       if (p0) {
          n0.p(this, -2);
          n0.p(this.r, a1.d(R.dimen.arg_RES_7f07077e));
          this.r.setPadding(i, i, i, i);
          n0.n(this.l, i);
       }else {
          n0.p(this, a1.d(R.dimen.arg_RES_7f07077a));
          n0.p(this.r, a1.d(R.dimen.arg_RES_7f07077d));
          this.r.setPadding(i, i, i, a1.d(R.dimen.arg_RES_7f07077f));
          n0.n(this.l, a1.e(2.00f));
       }
       return;
    }
    public boolean b(GiftMessage p0,boolean p1){
       GiftAnimItemView obj1;
       int i1;
       String str1;
       StringBuilder str2;
       int i2;
       float f;
       String giftSlotComo;
       int this;
       GiftAnimItemView m;
       Animator[] uAnimatorArr;
       GiftMessage mNewGiftSlot;
       CharSequence obj2;
       int b1;
       Gift mName;
       GiftMessage mGiftSlotSel;
       CDNUrl[] uCDNUrlArray;
       GiftMessage giftMessage = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(GiftAnimItemView.class)) {
          obj1 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p1), giftMessage, GiftAnimItemView.class, "11");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       obj1 = giftMessage.E;
       if (obj1 == null || (obj.mMergeKey).equals(obj1.mMergeKey)) {
          boolean i = 0;
          giftMessage.setVisibility(i);
          giftMessage.E = obj;
          boolean b = true;
          giftMessage.C = b;
          long l = 300;
          giftMessage.D = System.currentTimeMillis() + l;
          giftMessage.d.setSingleLine(b);
          giftMessage.d.setText(b.c(obj.mUser));
          b.c0(LiveLogTag.GIFT, "slot animation view bind", "isNaming", Boolean.valueOf(obj.mIsNaming));
          Object[] objArray = null;
          if (obj.mIsNaming != null && !LiveGiftSlotSpringNamingView.c(giftMessage.P, obj)) {
             if (!PatchProxy.applyVoid(objArray, giftMessage, GiftAnimItemView.class, "12")) {
                giftMessage.x.setVisibility(i);
                giftMessage.x.v(d0.a("live_gift_slot_naming_label.webp"), i, i);
             }
             giftMessage.c.setVisibility(8);
          }else {
             this.g();
             if (!PatchProxy.isSupport(GiftAnimItemView.class) || (!PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), giftMessage, GiftAnimItemView.class, "38") && !p1)) {
                if (a0.g(p0)) {
                   mNewGiftSlot = obj.mGiftSlotSelfAvatarRingImageUrls;
                   mGiftSlotSel = obj.mGiftSlotSelfAvatarRingDynamicImageUrls;
                }else {
                   QLiveMessage mLiveAudienc = obj.mLiveAudienceState;
                   if (mLiveAudienc != null) {
                      LiveAudienceState livePrivileg = mLiveAudienc.livePrivilegeState;
                      if (livePrivileg != null) {
                         LivePrivilegeState avatarFrame = livePrivileg.avatarFrame;
                         if (avatarFrame != null) {
                            uCDNUrlArray = e0.i(avatarFrame);
                            mGiftSlotSel = e0.i(obj.mLiveAudienceState.livePrivilegeState.avatarFrameAnimation);
                         }
                      }
                   }
                   uCDNUrlArray = objArray;
                   mGiftSlotSel = uCDNUrlArray;
                }
                giftMessage.c.setVisibility(i);
                l.d(giftMessage.c, mGiftSlotSel, b, new k(giftMessage, mNewGiftSlot), l.f());
             }
          }
          giftMessage.b.setVisibility(i);
          ViewGroup$MarginLayoutParams layoutParams = giftMessage.j.getLayoutParams();
          layoutParams.leftMargin = n.c(a.a().a(), 6.00f);
          giftMessage.j.setLayoutParams(layoutParams);
          g.d(giftMessage.b, obj.mUser, HeadImageSize.MIDDLE);
          String str = null;
          if (PatchProxy.isSupport(GiftAnimItemView.class) && (!PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), giftMessage, GiftAnimItemView.class, "25") && !p1)) {
             i2 = a1.a(R.color.arg_RES_7f060751);
             giftMessage.J = i2;
             giftMessage.h.setText(giftMessage.c(obj.mComboCount));
             giftMessage.h.setScaleX(str);
             giftMessage.h.setScaleY(str);
             giftMessage.h.setPivotX(str);
             obj1 = giftMessage.h;
             obj1.setPivotY((float)obj1.getMeasuredHeight());
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             int i4 = i2;
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(giftMessage.g, View.ROTATION, new float[2]{0,0x41400000});
             objectAnimat1.setStartDelay(120);
             objectAnimat1.setDuration(180);
             objectAnimat1.setInterpolator(new f());
             m = giftMessage.g;
             m.setPivotX((float)(m.getWidth() / 2));
             m = giftMessage.g;
             m.setPivotY((float)m.getHeight());
             ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(giftMessage.g, View.ROTATION, new float[2]{0x41400000,0});
             objectAnimat2.setStartDelay(l);
             objectAnimat2.setDuration(200);
             objectAnimat1.setInterpolator(new f());
             ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(giftMessage.h, View.SCALE_X, new float[2]{0,0x3f99999a});
             ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(giftMessage.h, View.SCALE_Y, new float[2]{0,0x3f99999a});
             objectAnimat3.setStartDelay(180);
             objectAnimat4.setStartDelay(180);
             objectAnimat3.setDuration(220);
             objectAnimat4.setDuration(220);
             ObjectAnimator objectAnimat5 = ObjectAnimator.ofFloat(giftMessage.h, View.SCALE_X, new float[2]{0x3f99999a,0x3f800000});
             ObjectAnimator objectAnimat6 = ObjectAnimator.ofFloat(giftMessage.h, View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000});
             objectAnimat5.setStartDelay(400);
             objectAnimat6.setStartDelay(400);
             ObjectAnimator objectAnimat7 = objectAnimat3;
             objectAnimat5.setDuration(100);
             objectAnimat6.setDuration(100);
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             valueAnimato.setStartDelay(400);
             valueAnimato.setDuration(100);
             objectAnimat3 = objectAnimat6;
             ObjectAnimator objectAnimat8 = objectAnimat5;
             this = i4;
             ObjectAnimator objectAnimat9 = objectAnimat2;
             ObjectAnimator objectAnimat10 = objectAnimat1;
             m om = new m(this, new ArgbEvaluator(), this, a1.a(0x7f061f86), p0);
             valueAnimato.addUpdateListener(b);
             uAnimatorArr = new Animator[]{f.d(this, (float)(- this.getWidth()), 0, 500, new g()),objectAnimat10,objectAnimat9,objectAnimat7,objectAnimat4,objectAnimat8,objectAnimat3,valueAnimato};
             uAnimatorSet1.playTogether(uAnimatorArr);
             j.g(uAnimatorSet1, LiveDegradeBiz.GiftSlot);
          }else {
             i1 = 2;
          }
          Gift gift = a.a(obj.mGiftId);
          v1 = obj instanceof LiveGiftToAudienceMessage;
          Boolean uBoolean = 0x7f104649;
          str = "";
          if (v1) {
             str1 = b.c(obj.mGiftReceiverUserInfo);
             str2 = (gift == null)? str: gift.mName;
             giftMessage.e.setText(giftMessage.d(str1, str2));
          }else {
             Object[] objArray2 = new Object[]{str};
             str2 = this.getResources().getString(uBoolean, objArray2);
             str1 = (gift == null)? str: gift.mName;
             giftMessage.e.setText(str2+str1);
          }
          str1 = (gift != null && gift.isFansGroupGift())? 1: 0;
          if (str1) {
             f0.a(giftMessage.f, LiveGiftResourcePathConstant.LIVE_FANS_GROUP_GIFT_TYPE_ICON);
             giftMessage.f.setVisibility(0);
          }else {
             giftMessage.f.setVisibility(8);
          }
          GiftAnimItemView e = giftMessage.e;
          i2 = (str1)? 0x7f070782: 0x7f070780;
          e.setMaxWidth(a1.d(i2));
          if (!p1) {
             Bitmap uBitmap = a.b(obj.mGiftId);
             if (uBitmap != null) {
                giftMessage.g.setImageBitmap(uBitmap);
             }else if(gift != null){
                gift = gift.mImageUrl;
                if (gift != null) {
                   giftMessage.g.P(gift);
                }
             }
             giftMessage.g.setImageResource(R.drawable.arg_RES_7f080355);
          }
          if (!PatchProxy.applyVoidOneRefs(obj, giftMessage, GiftAnimItemView.class, "27")) {
             giftMessage.s(obj, obj.mComboCount);
             if (obj.mIsDrawingGift != null) {
                giftMessage.h.setVisibility(8);
                giftMessage.g.setVisibility(8);
                giftMessage.k.setVisibility(0);
                giftMessage.i.setVisibility(8);
                b1 = 0x7f100aed;
                if (v1) {
                   obj2 = giftMessage.d(b.c(obj.mGiftReceiverUserInfo), this.getContext().getString(b1));
                }else {
                   Object[] objArray1 = new Object[]{str};
                   giftSlotComo = this.getContext().getString(uBoolean, objArray1)+this.getContext().getString(b1);
                }
                giftMessage.e.setText(obj2);
             }else {
                giftMessage.h.setVisibility(0);
                giftMessage.g.setVisibility(0);
                giftMessage.k.setVisibility(8);
                giftMessage.l.setBackgroundDrawable(null);
                if (!PatchProxy.applyVoidOneRefs(obj, giftMessage, GiftAnimItemView.class, "30")) {
                   if (!this.h(p0)) {
                      giftMessage.i.setVisibility(8);
                   }else {
                      giftMessage.i.setVisibility(0);
                      giftMessage.i.setText("x"+obj.mCount);
                   }
                }
             }
          }
          i = giftMessage.k(obj, obj.mComboCount);
          if (!PatchProxy.isSupport(GiftAnimItemView.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(i), Boolean.valueOf(p1), this, GiftAnimItemView.class, "14")) {
             if (PatchProxy.isSupport(GiftAnimItemView.class)) {
                obj2 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p1), giftMessage, GiftAnimItemView.class, "16");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else if(LiveGiftSlotSpringNamingView.c(giftMessage.P, obj) && !p1){
                   this.g();
                   this.p();
                   this.m();
                   giftMessage.w.setStyle(LiveGiftSlotSpringNamingView$SpringNamingStyle.NormalStyle);
                   giftMessage.w.d(giftMessage.P);
                   b1 = true;
                }else {
                   b1 = false;
                }
             }else {
                goto label_042c ;
             }
             if (!b1) {
                if (obj.mIsNaming == null) {
                   this.p();
                }else if(i){
                   giftMessage.q(LiveGiftNamingAnimationState.AFTER_DISPLAY);
                }else if(giftMessage.N == LiveGiftNamingAnimationState.NOT_DISPLAY){
                   giftMessage.N = LiveGiftNamingAnimationState.DISPLAYING;
                   giftMessage.y.setController(giftMessage.Q.get());
                   giftMessage.removeCallbacks(giftMessage.O);
                   if (p1) {
                      giftMessage.O.run();
                   }else {
                      giftMessage.postDelayed(giftMessage.O, 500);
                   }
                }
             }
          }
       label_048f :
          if (!PatchProxy.isSupport(GiftAnimItemView.class) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), giftMessage, GiftAnimItemView.class, "28")) {
             mNewGiftSlot = obj.mNewGiftSlotStyle;
             if (!p1 && mNewGiftSlot >= null) {
                int[] ointArray = giftMessage.G.l(obj);
                giftMessage.p.b(ointArray, giftMessage.G.a(ointArray.length));
             }
          }
          Boolean uBoolean1 = 0xbf800000;
          if (!PatchProxy.applyVoidOneRefs(obj, giftMessage, GiftAnimItemView.class, "33") && (obj.mNewGiftSlotStyle >= 3 && (giftMessage.o.getVisibility() && (!giftMessage.k(obj, obj.mComboCount) && !l.i(giftMessage.v))))) {
             obj1 = giftMessage.o;
             obj1.setTarget(this.getShimmerTarget());
             obj1.setVisibility(0);
             obj1.setAlpha(0x3f800000);
             obj1.setTranslationX(0);
             if (obj.mNewGiftSlotStyle == 3) {
                f0.a(obj1, LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_GRADE_3_HALO);
             }else {
                f0.a(obj1, LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_GRADE_4_HALO);
             }
             float[] uofloatArray1 = new float[i1];
             uofloatArray1[0] = (float)obj1.getWidth() * uBoolean1;
             uofloatArray1[1] = (float)giftMessage.l.getWidth() * 0x3f4ccccd;
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.setDuration(800);
             uAnimatorSet.addListener(new o(giftMessage, obj1));
             uAnimatorArr = new Animator[i1];
             uAnimatorArr[0] = j.a(obj1, new float[i1]{0x3f800000,0});
             uAnimatorArr[1] = ObjectAnimator.ofFloat(obj1, View.TRANSLATION_X, uofloatArray1);
             uAnimatorSet.playTogether(uAnimatorArr);
             j.g(uAnimatorSet, LiveDegradeBiz.GiftSlot);
          }else {
             f = 0;
          }
          giftSlotComo = this.getGiftSlotComoBackgroundUrl();
          if (!PatchProxy.applyVoidTwoRefs(obj, giftSlotComo, giftMessage, GiftAnimItemView.class, "31") && (!(obj.mComboCount % 10) && (a0.g(p0) && (giftMessage.m != null && (!giftMessage.k(obj, obj.mComboCount) && obj.mNewGiftSlotStyle < 3))))) {
             giftMessage.m.setTarget(this.getShimmerTarget());
             if (!PatchProxy.applyVoidOneRefs(giftSlotComo, giftMessage, GiftAnimItemView.class, "32")) {
                m = giftMessage.m;
                m.setVisibility(0);
                m.setAlpha(0x3f800000);
                m.setTranslationX(f);
                m.L(giftSlotComo);
                float[] uofloatArray = new float[i1];
                float f1 = (float)m.getWidth();
                uofloatArray[0] = uBoolean1 * f1;
                uofloatArray[1] = f1 * 0x3f99999a;
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(m, View.TRANSLATION_X, uofloatArray);
                objectAnimat.setDuration(1100);
                objectAnimat.setInterpolator(new LinearInterpolator());
                objectAnimat.start();
                objectAnimat.addListener(new n(giftMessage, m));
             }
          }
       label_05dd :
          if (!PatchProxy.isSupport(GiftAnimItemView.class) || (!PatchProxy.applyVoidThreeRefs(p0, Boolean.TRUE, Boolean.valueOf(p1), this, GiftAnimItemView.class, "26") && !p1)) {
             giftMessage.s.setVisibility(8);
             giftMessage.t.setVisibility(8);
             RoundingParams roundingPara = giftMessage.b.getHierarchy().n();
             int i3 = a1.e(0x3f800000);
             if (a0.g(p0)) {
                roundingPara.l((float)i3);
             }else if(this.n(p0)){
                roundingPara.l((float)i3);
                giftMessage.s.setVisibility(0);
             }else {
                roundingPara.l(f);
             }
          }
          if (!p1) {
             obj1 = giftMessage.K;
             if (obj1 != null) {
                GiftAnimItemView e1 = giftMessage.E;
                obj1.c(e1, true, giftMessage.n(e1));
             label_0648 :
                return true;
             }
          }
          this = true;
          goto label_0648 ;
       }else {
          throw new IllegalArgumentException("Can\'t bind to a not empty view!");
       }
    }
    public SpannableString c(int p0){
       if (PatchProxy.isSupport(GiftAnimItemView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, GiftAnimItemView.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.G.d(p0, this.J);
    }
    public final CharSequence d(String p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SpannableStringBuilder obj = PatchProxy.applyTwoRefs(p0, p1, this, GiftAnimItemView.class, "35");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, GiftAnimItemView.class, "36");
       int i = 1;
       int i1 = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
          b = (liveVoicePar != null && liveVoicePar.mEnableToAudienceGiftShowUserName != null)? true: false;
       }
       if (!b) {
          return a1.p(0x7f102542);
       }else {
          Object[] objArray = new Object[i];
          objArray[i1] = "";
          obj = new SpannableStringBuilder(this.getResources().getString(0x7f104649, objArray));
          obj.append(p0);
          obj.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f060751)), obj.length(), obj.length(), 33);
          obj.append(p1);
          return i.j(obj);
       }
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimItemView.class, "1")) {
          return;
       }
       if (this.S != null && this.getVisibility()) {
          return;
       }
       super.dispatchDraw(p0);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimItemView.class, "2")) {
          return;
       }
       if (this.S != null && this.getVisibility()) {
          return;
       }
       super.draw(p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "21")) {
          return;
       }
       GiftAnimItemView tL = this.L;
       if (tL != null) {
          int i = tL.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             AnimatorSet uAnimatorSet = this.L.get(i1);
             uAnimatorSet.removeAllListeners();
             uAnimatorSet.end();
             uAnimatorSet.cancel();
          }
          this.L.clear();
       }
       return;
    }
    public final Runnable f(KwaiImageView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GiftAnimItemView.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(p0);
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "13")) {
          return;
       }
       this.x.setVisibility(8);
       return;
    }
    public GiftAnimItemView$c getDisplayConfig(){
       return this.F;
    }
    public int getDisplayDuration(){
       Object obj = PatchProxy.apply(null, this, GiftAnimItemView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(System.currentTimeMillis() - this.D);
    }
    public GiftMessage getGiftMessage(){
       return this.E;
    }
    public String getGiftSlotComoBackgroundUrl(){
       Object obj = PatchProxy.apply(null, this, GiftAnimItemView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c0.a.b(LiveGiftResourcePathConstant.LIVEPAGE_GIFTSLOT_COMBO_STAR_BACKGROUND.getResourcePath());
    }
    public int getLastCombo(){
       return this.I;
    }
    public final View getShimmerTarget(){
       Object obj = PatchProxy.apply(null, this, GiftAnimItemView.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.G.c()) {
          return this.p;
       }
       return this.l;
    }
    public final boolean h(GiftMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GiftAnimItemView.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.c(p0);
    }
    public boolean i(){
       return this.C;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, GiftAnimItemView.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.i() && !this.getVisibility())? true: false;
       return b;
    }
    public final boolean k(GiftMessage p0,int p1){
       if (PatchProxy.isSupport(GiftAnimItemView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, GiftAnimItemView.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.M != null) {
          int i = (p1 == 1 && (this.h(p0) && a0.g(p0)))? 1: 0;
          boolean b1 = c.b.d(p1);
          if (i || b1) {
             b = true;
          }
       }
       return b;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "24")) {
          return;
       }
       this.q(LiveGiftNamingAnimationState.NOT_DISPLAY);
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "41")) {
          return;
       }
       if (this.z == null) {
          this.z = this.f(this.u);
       }
       this.u.removeCallbacks(this.z);
       return;
    }
    public boolean n(GiftMessage p0){
       return p0.mShouldDisplayFriendTagInGiftSlot;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.o = this.findViewById(0x7f0a1095);
       this.p = this.findViewById(0x7f0a1094);
       this.q = this.findViewById(0x7f0a3fe5);
       this.s = this.findViewById(0x7f0a1093);
       this.t = this.findViewById(0x7f0a1096);
       this.b = this.findViewById(0x7f0a0333);
       this.c = this.findViewById(0x7f0a1d6c);
       this.d = this.findViewById(0x7f0a4381);
       this.e = this.findViewById(0x7f0a0945);
       this.r = this.findViewById(0x7f0a2a54);
       this.f = this.findViewById(0x7f0a1d81);
       this.g = this.findViewById(0x7f0a10aa);
       this.h = this.findViewById(0x7f0a083c);
       KwaiImageView kwaiImageVie = this.findViewById(R.id.drawing_gift_icon);
       this.k = kwaiImageVie;
       f0.a(kwaiImageVie, LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_DRAWING_GIFT_ICON);
       this.l = this.findViewById(0x7f0a0953);
       this.i = this.findViewById(0x7f0a03f2);
       this.j = this.findViewById(0x7f0a0923);
       this.m = this.findViewById(0x7f0a03f0);
       this.n = this.findViewById(0x7f0a03f1);
       this.u = this.findViewById(0x7f0a1d75);
       this.v = this.findViewById(0x7f0a1d76);
       this.x = this.findViewById(0x7f0a1d41);
       this.y = this.findViewById(0x7f0a1d3e);
       this.w = this.findViewById(0x7f0a20f7);
       this.l.setOnClickListener(new GiftAnimItemView$a(this));
       f0.a(this.o, LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_GRADE_3_HALO);
       f0.a(this.m, LiveGiftResourcePathConstant.LIVEPAGE_GIFTSLOT_COMBO_MIDDLE_BACKGROUND);
       f0.a(this.t, LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_USER_NAME_FRIEND_TAG);
       f0.a(this.s, LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_FRIEND_TAG);
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "15")) {
          return;
       }
       LiveGiftNamingAnimationState nOT_DISPLAY = LiveGiftNamingAnimationState.NOT_DISPLAY;
       if (this.N == nOT_DISPLAY) {
          this.q(nOT_DISPLAY);
       }else {
          this.q(LiveGiftNamingAnimationState.AFTER_DISPLAY);
       }
       return;
    }
    public final void q(LiveGiftNamingAnimationState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimItemView.class, "17")) {
          return;
       }
       this.removeCallbacks(this.O);
       this.y.setVisibility(4);
       if (this.y.getController() != null && this.y.getController().getAnimatable() != null) {
          this.y.getController().getAnimatable().stop();
       }
       this.N = p0;
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, GiftAnimItemView.class, "22")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(null, this, GiftAnimItemView.class, "23")) {
          this.E = null;
          this.C = false;
          int i = (this.R != null)? 8: 4;
          this.setVisibility(i);
          this.e();
       }
       return;
    }
    public void s(GiftMessage p0,int p1){
       File uFile;
       int i;
       if (PatchProxy.isSupport(GiftAnimItemView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GiftAnimItemView.class, "19")) {
          return;
       }
       GiftAnimItemView tE = this.E;
       if (tE != null && (p0 != null && tE != p0)) {
          b.B(LiveLogTag.GIFT, "[updateComboCount]same message false return,view:"+this+",comboCount:"+p1+",message:"+p0.toString()+",item message:"+this.E.toString());
          return;
       }else if(!LiveGiftSlotSpringNamingView.c(this.P, p0) && (PatchProxy.isSupport(GiftAnimItemView.class) && (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GiftAnimItemView.class, "40") && this.k(p0, p1)))){
          if (!c.b.c(p1)) {
             p0 = (p1 == 1)? p0.mCount: p1;
             uFile = LiveGiftComboButtonAnimationUtils.h.b(this.G.b(p0));
             String str = "2";
             if (b.S(uFile)) {
                this.m();
                GiftAnimItemView.o(this.u, uFile, this.z, 920);
                a.b(str);
             }else {
                a.a(str, "res_failed");
                b.B(LiveLogTag.GIFT, "[showSpecialComboEffectIfNeeded] textFile no valid,comboCount:"+p0);
             }
          }
          LiveGiftComboButtonAnimationUtils$a h = LiveGiftComboButtonAnimationUtils.h;
          uFile = h.b("special_number_sweep.webp");
          if (b.S(uFile) && !h.e()) {
             if (l.i(this.v)) {
                b.B(LiveLogTag.GIFT, "[showSpecialComboEffectIfNeeded] sweepFile is playing now ,comboCount:"+p1);
             }else {
                GiftAnimItemView tv = this.v;
                GiftAnimItemView.o(tv, uFile, this.f(tv), 500);
             }
          }else {
             b.B(LiveLogTag.GIFT, "[showSpecialComboEffectIfNeeded] sweepFile no valid or is lowPhone,comboCount:"+p1);
          }
       }
    label_0121 :
       this.h.setText(this.c(p1));
       this.I = p1;
       return;
    }
    public void setCanShowHintTextEffect(boolean p0){
       this.M = p0;
    }
    public void setClickable(boolean p0){
       if (PatchProxy.isSupport(GiftAnimItemView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GiftAnimItemView.class, "4")) {
          return;
       }
       this.l.setClickable(p0);
       return;
    }
    public void setDisplayConfig(GiftAnimItemView$c p0){
       this.F = p0;
    }
    public void setGiftAnimConfigurator(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimItemView.class, "5")) {
          return;
       }
       this.G = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, GiftAnimItemView.class, "7") && this.G != null) {
          if (!PatchProxy.applyVoid(objArray, this, GiftAnimItemView.class, "8")) {
             i oi = new i(this);
             GiftAnimItemView tg = this.g;
             if (tg != null) {
                tg.setOnClickListener(oi);
             }
             tg = this.k;
             if (tg != null) {
                tg.setOnClickListener(oi);
             }
          }
          this.i.setBackground(this.G.g());
       }
       return;
    }
    public void setIsGoneWhenUnbind(boolean p0){
       this.R = p0;
    }
    public void setIsGzone(boolean p0){
       this.B = p0;
    }
    public void setIsVoiceParty(boolean p0){
       this.A = p0;
    }
    public void setOnItemClickListener(GiftAnimContainerView$n p0){
       this.H = p0;
    }
    public void setOnItemLogListener(GiftAnimContainerView$o p0){
       this.K = p0;
    }
    public void setTopEmptyViewHeight(int p0){
       if (PatchProxy.isSupport(GiftAnimItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GiftAnimItemView.class, "9")) {
          return;
       }
       n0.p(this.q, p0);
       return;
    }
    public void t(SCLiveGiftTitleChangeInfo p0){
       this.P = p0;
    }
}
