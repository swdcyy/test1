package com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopPopCommodityNewStyleView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.merchant.live.SellingNumberScrollLayout;
import android.widget.LinearLayout;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.graphics.drawable.Animatable;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import java.util.List;
import i24.f;
import java.util.Collection;

public final class LiveShopPopCommodityNewStyleView extends ConstraintLayout	// class@0019a4
{
    public View B;
    public KwaiImageView C;
    public TextView D;
    public SellingNumberScrollLayout E;
    public int F;
    public int G;
    public AnimatorSet H;
    public ValueAnimator I;
    public Animatable J;
    public CDNUrl[] K;
    public HashMap L;

    public void LiveShopPopCommodityNewStyleView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveShopPopCommodityNewStyleView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveShopPopCommodityNewStyleView(Context p0,AttributeSet p1,int p2){
       LiveShopPopCommodityNewStyleView tB;
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveShopPopCommodityNewStyleView.class, "1")) {
       }else {
          a.b(this.getContext(), R.layout.arg_RES_7f0d0f52, this);
          this.B = this.findViewById(0x7f0a2b36);
          this.C = this.findViewById(0x7f0a2b37);
          TextView textView = this.findViewById(R.id.merchant_pop_volume_prefix);
          this.D = textView;
          if (textView == null) {
             a.S("mVolumePrefix");
          }
          p2 = 4;
          textView.setVisibility(p2);
          SellingNumberScrollLayout sellingNumbe = this.findViewById(R.id.merchant_shop_pop_volume);
          this.E = sellingNumbe;
          String str = "mVolumeView";
          if (sellingNumbe == null) {
             a.S(str);
          }
          sellingNumbe.setTextViewResId(R.layout.arg_RES_7f0d167c);
          LiveShopPopCommodityNewStyleView tE = this.E;
          if (tE == null) {
             a.S(str);
          }
          tE.setVisibility(p2);
          tE = this.B;
          str = "mBackgroundView";
          if (tE == null) {
             a.S(str);
          }
          float f = 0;
          tE.setPivotX(f);
          this.setClipChildren(false);
          this.setClipToPadding(false);
          if (!PatchProxy.applyVoid(objArray, this, LiveShopPopCommodityNewStyleView.class, "2")) {
             GradientDrawable gradientDraw = new GradientDrawable();
             int[] ointArray = new int[]{a1.a(0x7f062057),a1.a(0x7f06057e),a1.a(0x7f06057f),a1.a(0x7f061df6),a1.a(0x7f061df6)};
             gradientDraw.setColors(ointArray);
             gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
             gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042c));
             tB = this.B;
             if (tB == null) {
                a.S(str);
             }
             tB.setBackground(gradientDraw);
          }
          if (!PatchProxy.applyVoid(objArray, this, LiveShopPopCommodityNewStyleView.class, "3") && this.H == null) {
             LiveShopPopCommodityNewStyleView tC = this.C;
             String str1 = "mPopView";
             if (tC == null) {
                a.S(str1);
             }
             tC.setAlpha(f);
             tC = this.C;
             if (tC == null) {
                a.S(str1);
             }
             tC.setScaleX(f);
             tC = this.C;
             if (tC == null) {
                a.S(str1);
             }
             tC.setScaleY(f);
             tC = this.B;
             if (tC == null) {
                a.S(str);
             }
             tC.setScaleX(f);
             tC = this.C;
             if (tC == null) {
                a.S(str1);
             }
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tC, propertyValu);
             objectAnimat.setDuration(400);
             tB = this.B;
             if (tB == null) {
                a.S(str);
             }
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(tB, propertyValu1);
             objectAnimat1.setDuration(300);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.H = uAnimatorSet;
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
             uAnimatorSet.playSequentially(uAnimatorArr);
          }
       }
       return;
    }
    public void LiveShopPopCommodityNewStyleView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, LiveShopPopCommodityNewStyleView.class, "8")) {
          return;
       }
       LiveShopPopCommodityNewStyleView tJ = this.J;
       if (tJ != null && !tJ.isRunning()) {
          tJ.start();
       }
       return;
    }
    public final void M(int p0,int p1){
       if (PatchProxy.isSupport(LiveShopPopCommodityNewStyleView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveShopPopCommodityNewStyleView.class, "9")) {
          return;
       }
       if (p1 > 0 && p0 <= p1) {
          LiveShopPopCommodityNewStyleView tF = this.F;
          if (tF < p1) {
             if (tF <= null) {
                this.F = p0;
             }
             this.G = p1;
             LiveShopPopCommodityNewStyleView tE = this.E;
             if (tE == null) {
                a.S("mVolumeView");
             }
             String str = String.valueOf(this.G);
             long l = 500;
             Objects.requireNonNull(tE);
             if (!PatchProxy.isSupport(SellingNumberScrollLayout.class) || !PatchProxy.applyVoidTwoRefs(str, Long.valueOf(l), tE, SellingNumberScrollLayout.class, "4")) {
                tE.e(str, 500, tE.d, tE.c, false);
             }
             LiveShopPopCommodityNewStyleView tD = this.D;
             if (tD == null) {
                a.S("mVolumePrefix");
             }
             tD.setVisibility(0);
             tD = this.E;
             if (tD == null) {
                a.S("mVolumeView");
             }
             tD.setVisibility(0);
          }
       }
       return;
    }
    public final CDNUrl[] getImageArray(){
       LiveShopPopCommodityNewStyleView obj = PatchProxy.apply(null, this, LiveShopPopCommodityNewStyleView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!j.h(this.K)) {
          obj = this.K;
          a.m(obj);
          return obj;
       }else {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          Object[] objArray = f.a("udata/pkg/ks-merchant/weak_bubble_with_interpretation/small_weak_bubble_hot.webp").toArray(uCDNUrlArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          return objArray;
       }
    }
}
