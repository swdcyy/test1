package com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog;
import ml8.d;
import ht3.c;
import o84.a;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallModel;
import android.content.Context;
import java.util.ArrayList;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$mCdnHostGroupManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.Window;
import android.app.Dialog;
import android.view.View;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import xm4.a;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PopUpStyleInfo;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$AfterOpen;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$BeforeOpen;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.JumpTextView;
import java.lang.CharSequence;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$ButtonStyle;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import java.util.Objects;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.CouponDisplayTitleView;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import o1.f;
import android.graphics.drawable.GradientDrawable;
import d84.b;
import d84.b$a;
import android.graphics.Color;
import n84.c;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import n84.d;
import n84.e;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.FloatBezierImageView;
import java.util.Iterator;
import ac.a;
import android.graphics.drawable.Animatable;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorSet;
import ekd.m1;
import com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import ot3.p0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.fragment.app.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import l84.u;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformLogBiz;
import java.lang.Exception;
import p74.a;
import o74.a;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import com.kwai.robust.PatchProxyResult;
import ub.a;
import x74.h;
import com.airbnb.lottie.LottieAnimationView;
import w4.e;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$b;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$c;

public final class DynamicSkyFallCouponDialog extends c implements d	// class@001b3d
{
    public AnimatorSet A;
    public final ArrayList B;
    public a C;
    public int D;
    public boolean E;
    public final p F;
    public LiveMerchantSkyFallModel G;
    public String e;
    public ViewGroup f;
    public KwaiFixedSimpleDraweeView g;
    public KwaiCDNImageView h;
    public KwaiCDNImageView i;
    public KwaiCDNImageView j;
    public ViewGroup k;
    public KwaiCDNImageView l;
    public KwaiFixedSimpleDraweeView m;
    public CouponDisplayTitleView n;
    public JumpTextView o;
    public TextView p;
    public ViewGroup q;
    public KwaiFixedSimpleDraweeView r;
    public TextView s;
    public View t;
    public View u;
    public View v;
    public FloatBezierImageView w;
    public MerchantLottieAnimationView x;
    public View y;
    public AnimatorSet z;

    public void DynamicSkyFallCouponDialog(a p0,LiveMerchantSkyFallModel p1){
       DynamicSkyFallCouponDialog n;
       a uoa1;
       Integer integer1;
       int i2;
       int i3;
       ViewGroup$LayoutParams layoutParams;
       CouponDisplayTitleView d;
       LiveMerchantSkyFallModel mLiveMerchan1;
       LiveMerchantSkyFallStyleConfig$PopUpStyleInfo popUpStyleIn1;
       LiveMerchantSkyFallStyleConfig$AfterOpen afterOpen1;
       CouponDisplayTitleView h;
       String mSubtitleCol;
       CouponDisplayTitleView c;
       CouponDisplayTitleView m;
       int i4;
       float f1;
       int i6;
       CouponDisplayTitleView m1;
       float f2;
       CouponDisplayTitleView h1;
       float f3;
       Drawable uDrawable;
       boolean i7;
       float f4;
       float[] uofloatArray;
       CouponDisplayTitleView f5;
       ViewGroup$LayoutParams layoutParams1;
       Object[] objArray1;
       Object[] objArray2;
       Object[] objArray3;
       a uoa = p0;
       super(uoa.a, 0x7f1103bd);
       this.G = p1;
       this.e = "LiveMerchantAudienceSkyFallDialog";
       this.B = new ArrayList();
       this.C = uoa;
       this.D = uoa.b;
       this.F = s.c(DynamicSkyFallCouponDialog$mCdnHostGroupManager$2.INSTANCE);
       Object[] objArray = null;
       int i = 0;
       Integer integer = Integer.valueOf(i);
       if (PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog.class, "4")) {
       }else {
          Window window1 = this.getWindow();
          if (window1 != null) {
             View decorView = window1.getDecorView();
             if (decorView != null) {
                decorView.setBackgroundDrawable(new ColorDrawable(i));
                decorView.setPadding(i, i, i, i);
             }
          }
          window1 = this.getWindow();
          WindowManager$LayoutParams attributes = (window1 != null)? window1.getAttributes(): objArray;
          if (attributes != null) {
             int i5 = -1;
             attributes.width = i5;
             attributes.height = i5;
          }
          Window window2 = this.getWindow();
          if (window2 != null) {
             window2.setAttributes(attributes);
          }
       }
       View view = a.a(uoa.a, R.layout.arg_RES_7f0d02d3);
       this.v = view;
       this.setContentView(view);
       Window window = this.getWindow();
       if (window != null) {
          view = window.getDecorView();
          if (view != null) {
             this.doBindView(view);
             if (!PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog.class, "5")) {
                DynamicSkyFallCouponDialog g = this.G;
                if (!PatchProxy.applyVoidOneRefs(g, this, DynamicSkyFallCouponDialog.class, "6")) {
                   LiveMerchantSkyFallModel mAfterPopSub = g.mLiveMerchantSkyFallStyleConfig;
                   if (mAfterPopSub != null) {
                      LiveMerchantSkyFallStyleConfig$PopUpStyleInfo popUpStyleIn2 = mAfterPopSub.getPopUpStyleInfo();
                      if (popUpStyleIn2 != null) {
                         LiveMerchantSkyFallStyleConfig$AfterOpen afterOpen2 = popUpStyleIn2.getAfterOpen();
                         if (afterOpen2 != null) {
                            i7 = afterOpen2.getMAnimationSwitch();
                         label_00b9 :
                            this.E = i7;
                         }
                      }
                   }
                   i7 = false;
                   goto label_00b9 ;
                }
                g = this.G;
                String str = "7";
                if (!PatchProxy.applyVoidOneRefs(g, this, DynamicSkyFallCouponDialog.class, str)) {
                   LiveMerchantSkyFallModel mLiveMerchan = g.mLiveMerchantSkyFallStyleConfig;
                   if (mLiveMerchan != null) {
                      LiveMerchantSkyFallStyleConfig$PopUpStyleInfo popUpStyleIn = mLiveMerchan.getPopUpStyleInfo();
                      if (popUpStyleIn != null) {
                         LiveMerchantSkyFallStyleConfig$BeforeOpen beforeOpen = popUpStyleIn.getBeforeOpen();
                      label_00d9 :
                         DynamicSkyFallCouponDialog g1 = this.g;
                         if (g1 == null) {
                            a.S("mDialogBeforeTitle");
                         }
                         List mMainTitleIm = (beforeOpen != null)? beforeOpen.getMMainTitleImgUrls(): objArray;
                         this.g(g1, mMainTitleIm, R.drawable.arg_RES_7f082072);
                         g1 = this.h;
                         if (g1 == null) {
                            a.S("mDialogBeforeBg");
                         }
                         List mTopImgUrls = (beforeOpen != null)? beforeOpen.getMTopImgUrls(): objArray;
                         this.h(g1, mTopImgUrls, R.string.arg_RES_7f10331b);
                         mLiveMerchan = g.mLiveMerchantSkyFallStyleConfig;
                         if (mLiveMerchan != null) {
                            popUpStyleIn = mLiveMerchan.getPopUpStyleInfo();
                            if (popUpStyleIn != null) {
                               LiveMerchantSkyFallStyleConfig$AfterOpen afterOpen = popUpStyleIn.getAfterOpen();
                            label_0117 :
                               g1 = this.m;
                               if (g1 == null) {
                                  a.S("mDialogMainTitleIv");
                               }
                               mMainTitleIm = (afterOpen != null)? afterOpen.getMMainTitleUrls(): objArray;
                               this.g(g1, mMainTitleIm, R.drawable.arg_RES_7f082071);
                               g1 = this.l;
                               if (g1 == null) {
                                  a.S("mDialogContentBg");
                               }
                               mMainTitleIm = (afterOpen != null)? afterOpen.getMTopImgUrl(): objArray;
                               this.h(g1, mMainTitleIm, R.string.arg_RES_7f103318);
                               g1 = this.i;
                               if (g1 == null) {
                                  a.S("mDialogMediumBg");
                               }
                               mMainTitleIm = (afterOpen != null)? afterOpen.getMMediumImgUrls(): objArray;
                               this.h(g1, mMainTitleIm, R.string.arg_RES_7f103319);
                               g1 = this.j;
                               if (g1 == null) {
                                  a.S("mDialogBottomBg");
                               }
                               mMainTitleIm = (afterOpen != null)? afterOpen.getMBottomImgUrls(): objArray;
                               this.h(g1, mMainTitleIm, R.string.arg_RES_7f103359);
                               g1 = this.o;
                               String str1 = "mDialogPriceTv";
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               String mPriceColor = (afterOpen != null)? afterOpen.getMPriceColor(): objArray;
                               int i1 = 0x7f061dd5;
                               g1.setTextColor(TextUtils.J(mPriceColor, a1.a(i1)));
                               g1 = this.o;
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               g1.setNumber(g.mCouponPrice);
                               g1 = this.p;
                               str1 = "mDialogContentMessageTv";
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               mPriceColor = (afterOpen != null)? afterOpen.getMUseConditionTitleColor(): objArray;
                               g1.setTextColor(TextUtils.J(mPriceColor, a1.a(i1)));
                               g1 = this.p;
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               g1.setText(g.mUseConditionTitle);
                               LiveMerchantSkyFallStyleConfig$ButtonStyle mButtonStyle = (afterOpen != null)? afterOpen.getMButtonStyle(): objArray;
                               g1 = this.s;
                               str1 = "mDialogReceiveButtonTv";
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               mPriceColor = (mButtonStyle != null)? mButtonStyle.getMTitle(): objArray;
                               g1.setText(mPriceColor);
                               g1 = this.s;
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               str1 = (mButtonStyle != null)? mButtonStyle.getMTitleColor(): objArray;
                               g1.setTextColor(TextUtils.J(str1, a1.a(R.color.arg_RES_7f061e52)));
                               g1 = this.r;
                               if (g1 == null) {
                                  a.S("mDialogReceiveButtonBgIv");
                               }
                               mTopImgUrls = (mButtonStyle != null)? mButtonStyle.getMButtonImgUrls(): objArray;
                               this.g(g1, mTopImgUrls, R.drawable.arg_RES_7f082070);
                               mLiveMerchan = g.mCouponUseType;
                               g1 = this.n;
                               str1 = "mDisplayTitleView";
                               if (g1 == null) {
                                  a.S(str1);
                               }
                               CouponDisplayTitleView uCouponDispl = 1;
                               if (PatchProxy.isSupport(DynamicSkyFallCouponDialog.class) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(mLiveMerchan), g1, this, DynamicSkyFallCouponDialog.class, "10") && mLiveMerchan != uCouponDispl)) {
                                  n = this.n;
                                  if (n == null) {
                                     a.S(str1);
                                  }
                                  ViewGroup$LayoutParams layoutParams2 = n.getLayoutParams();
                                  if (layoutParams2 != null && layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                                     g1 = this.n;
                                     if (g1 == null) {
                                        a.S(str1);
                                     }
                                     if (g1.getContext() != null) {
                                        g1 = this.n;
                                        if (g1 == null) {
                                           a.S(str1);
                                        }
                                        layoutParams2.topMargin = n.c(g1.getContext(), 73.00f);
                                     }
                                  }
                               }
                            label_026e :
                               n = this.n;
                               if (n == null) {
                                  a.S(str1);
                               }
                               a f = this.C.f;
                               Objects.requireNonNull(n);
                               if (PatchProxy.isSupport(CouponDisplayTitleView.class)) {
                                  uoa1 = f;
                                  if (!PatchProxy.applyVoidFourRefs(g, f, null, integer, n, CouponDisplayTitleView.class, "2")) {
                                  }
                               }else {
                                  uoa1 = f;
                               }
                            }
                         }
                         objArray1 = objArray;
                         goto label_0117 ;
                      }
                   }
                   objArray1 = objArray;
                   goto label_00d9 ;
                }
             label_054a :
                g = this.q;
                if (g == null) {
                   a.S("mDialogReceiveButton");
                }
                g.setOnClickListener(new c(this));
                g = this.t;
                if (g == null) {
                   a.S("mDialogCloseButton");
                }
                g.setOnClickListener(new d(this));
                g = this.y;
                if (g == null) {
                   a.S("mDialogContainer");
                }
                g.setOnClickListener(new e(this));
             }
          }
       }
       return;
    }
    public static final JumpTextView e(DynamicSkyFallCouponDialog p0){
       p0 = p0.o;
       if (p0 == null) {
          a.S("mDialogPriceTv");
       }
       return p0;
    }
    public static final FloatBezierImageView f(DynamicSkyFallCouponDialog p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mFloatView");
       }
       return p0;
    }
    public void dismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog.class, "11")) {
          return;
       }
       super.dismiss();
       DynamicSkyFallCouponDialog tw = this.w;
       if (tw == null) {
          a.S("mFloatView");
       }
       tw.setAlpha(0);
       if (!PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog.class, "27")) {
          Iterator iterator = this.B.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.getAnimatable() != null && uoa.getAnimatable().isRunning()) {
                uoa.getAnimatable().stop();
             }
          }
       }
       tw = this.u;
       if (tw == null) {
          a.S("mContentRootView");
       }
       if (tw != null) {
          objArray = tw.animate();
       }
       objArray.cancel();
       tw = this.f;
       if (tw == null) {
          a.S("mDialogBeforeContainer");
       }
       tw.animate().cancel();
       tw = this.k;
       if (tw == null) {
          a.S("mDialogContent");
       }
       tw.animate().cancel();
       tw = this.q;
       if (tw == null) {
          a.S("mDialogReceiveButton");
       }
       tw.animate().cancel();
       tw = this.t;
       if (tw == null) {
          a.S("mDialogCloseButton");
       }
       tw.animate().cancel();
       tw = this.m;
       if (tw == null) {
          a.S("mDialogMainTitleIv");
       }
       tw.animate().cancel();
       tw = this.A;
       if (tw != null) {
          tw.cancel();
       }
       tw = this.z;
       if (tw != null) {
          a.m(tw);
          if (tw.isRunning()) {
             tw = this.z;
             a.m(tw);
             tw.cancel();
          }
       }
       this.i();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicSkyFallCouponDialog.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.root_view);
       this.u = view;
       String str = "mContentRootView";
       if (view == null) {
          a.S(str);
       }
       view.setRotationY(-270.00f);
       DynamicSkyFallCouponDialog tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       tu.setScaleY(0.10f);
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       tu.setScaleX(0.10f);
       this.y = m1.f(p0, 0x7f0a0b72);
       this.w = m1.f(p0, 0x7f0a0f1c);
       this.x = m1.f(p0, 0x7f0a046e);
       this.f = m1.f(p0, 0x7f0a0b5a);
       this.g = m1.f(p0, 0x7f0a0b95);
       this.h = m1.f(p0, 0x7f0a0b59);
       this.i = m1.f(p0, 0x7f0a0b82);
       this.j = m1.f(p0, 0x7f0a0b60);
       this.k = m1.f(p0, 0x7f0a0b73);
       this.m = m1.f(p0, 0x7f0a0b75);
       this.l = m1.f(p0, 0x7f0a0b74);
       this.n = m1.f(p0, 0x7f0a43b3);
       JumpTextView jumpTextView = m1.f(p0, R.id.dialog_price_tv);
       this.o = jumpTextView;
       if (jumpTextView == null) {
          a.S("mDialogPriceTv");
       }
       jumpTextView.setTypeface(p0.l());
       m1.f(p0, R.id.dialog_price_tag).setTypeface(p0.l());
       this.p = m1.f(p0, 0x7f0a0b76);
       this.q = m1.f(p0, 0x7f0a0b88);
       this.r = m1.f(p0, 0x7f0a0b89);
       this.s = m1.f(p0, 0x7f0a0b8a);
       this.t = m1.f(p0, 0x7f0a0b6b);
       DynamicSkyFallCouponDialog tf = this.f;
       if (tf == null) {
          a.S("mDialogBeforeContainer");
       }
       tf.setVisibility(0);
       tf = this.q;
       if (tf == null) {
          a.S("mDialogReceiveButton");
       }
       int i = 8;
       tf.setVisibility(i);
       tf = this.t;
       if (tf == null) {
          a.S("mDialogCloseButton");
       }
       tf.setVisibility(i);
       tf = this.m;
       if (tf == null) {
          a.S("mDialogMainTitleIv");
       }
       tf.setVisibility(4);
       return;
    }
    public final void g(KwaiImageView p0,List p1,int p2){
       if (PatchProxy.isSupport(DynamicSkyFallCouponDialog.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, DynamicSkyFallCouponDialog.class, "8")) {
          return;
       }
       if (p1 != null) {
          p0.P(p1);
       }else {
          p0.y(p2, 0, 0);
       }
       return;
    }
    public void g4(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DynamicSkyFallCouponDialog.class, "30")) {
          return;
       }
       try{
          super.g4(p0, p1);
          this.l();
          u.i(this.C.c.getLiveStreamPackage(), this.G);
       }catch(java.lang.Exception e3){
          a.A(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, this.e, e3.getMessage());
       }
       return;
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, DynamicSkyFallCouponDialog.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = this.e;
       return obj;
    }
    public final void h(KwaiCDNImageView p0,List p1,int p2){
       if (PatchProxy.isSupport(DynamicSkyFallCouponDialog.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, DynamicSkyFallCouponDialog.class, "9")) {
          return;
       }
       if (p1 != null) {
          p0.P(p1);
       }else {
          KwaiCDNImageView.q0(p0, p2, 0, null, 4, null);
       }
       return;
    }
    public final void i(){
       DynamicSkyFallCouponDialog tx;
       if (PatchProxy.applyVoid(null, this, DynamicSkyFallCouponDialog.class, "15")) {
          return;
       }
       if (!h.a()) {
          tx = this.x;
          if (tx == null) {
             a.S("mDialogBackgroundView");
          }
          tx.f();
       }else {
          tx = this.x;
          if (tx == null) {
             a.S("mDialogBackgroundView");
          }
          if (tx.getComposition() != null) {
             tx = this.x;
             if (tx == null) {
                a.S("mDialogBackgroundView");
             }
             tx.f();
          }
       }
       return;
    }
    public final void j(boolean p0){
       if (PatchProxy.isSupport(DynamicSkyFallCouponDialog.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicSkyFallCouponDialog.class, "28")) {
          return;
       }
       k1.o(new DynamicSkyFallCouponDialog$a(this, p0));
       return;
    }
    public final LiveMerchantSkyFallModel k(){
       return this.G;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, DynamicSkyFallCouponDialog.class, "13")) {
          return;
       }
       DynamicSkyFallCouponDialog tu = this.u;
       String str = "mContentRootView";
       if (tu == null) {
          a.S(str);
       }
       tu.animate().cancel();
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       tu.animate().rotationY(0).scaleX(0x3f800000).scaleY(0x3f800000).setDuration(500).withStartAction(new DynamicSkyFallCouponDialog$b(this)).withEndAction(new DynamicSkyFallCouponDialog$c(this)).start();
       return;
    }
}
