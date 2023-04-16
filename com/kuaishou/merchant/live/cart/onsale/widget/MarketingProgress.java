package com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$b;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Animatable;
import java.util.List;
import i24.f;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import java.util.Objects;
import m54.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$a;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$d;
import android.animation.Animator$AnimatorListener;

public final class MarketingProgress extends ConstraintLayout	// class@0019c0
{
    public float B;
    public View C;
    public KwaiImageView D;
    public boolean E;
    public Animatable F;
    public boolean G;
    public HashMap H;
    public static final MarketingProgress$b I;

    static {
       MarketingProgress.I = new MarketingProgress$b(null);
    }
    public void MarketingProgress(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void MarketingProgress(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void MarketingProgress(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MarketingProgress.class, "1")) {
       }else {
          a.b(this.getContext(), R.layout.arg_RES_7f0d0810, this);
          this.C = this.findViewById(0x7f0a32db);
          this.D = this.findViewById(0x7f0a130c);
          boolean b = false;
          this.setClipChildren(b);
          this.setClipToPadding(b);
          if (!PatchProxy.applyVoid(objArray, this, MarketingProgress.class, "3")) {
             MarketingProgress tF = this.F;
             if (tF != null) {
                tF.stop();
             }
             tF = this.D;
             if (tF != null) {
                CDNUrl[] uCDNUrlArray = new CDNUrl[b];
                Object[] objArray1 = f.a("udata/pkg/ks-merchant/kwaishop-11-full-giving/the_final_version/live_merchant_full_giving_task_anchor.webp").toArray(uCDNUrlArray);
                Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                tF.a0(objArray1, new c(this));
             }
          }
       }
       return;
    }
    public void MarketingProgress(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int L(int p0){
       float f = 0.16f;
       if (this.G != null) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 == 4) {
                   label_0028 :
                      f = 0x3f75c28f;
                   }
                }else {
                   f = 0x3f4f5c29;
                }
             }else {
                f = 0x3f000000;
             }
          }
       }else if(p0 != 1){
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   f = 0;
                }else {
                   goto label_0028 ;
                }
             }else {
                f = 0x3f547ae1;
             }
          }else {
             f = 0x3f19999a;
          }
       }else {
          f = 0.31f;
       }
       p0 = (int)(this.B * f);
       if (!p0) {
          return 1;
       }else {
          return p0;
       }
    }
    public final void M(int p0,int p1,boolean p2,MarketingProgress$a p3){
       MarketingProgress tC1;
       if (PatchProxy.isSupport(MarketingProgress.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, MarketingProgress.class, "5")) {
          return;
       }
       if (p1 >= 0 && p1 <= 4) {
          p0 = this.L(p0);
          int i = this.L(p1);
          MarketingProgress tC = this.C;
          ViewGroup$LayoutParams layoutParams = (tC != null)? tC.getLayoutParams(): null;
          if (!p2) {
             if (layoutParams != null) {
                layoutParams.width = this.L(p1);
             }
             tC1 = this.C;
             if (tC1 != null) {
                tC1.setLayoutParams(layoutParams);
             }
             return;
          }else if(this.E == null){
             int[] ointArray = new int[]{p0,i};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             if (valueAnimato != null) {
                valueAnimato.setInterpolator(new DecelerateInterpolator());
             }
             if (valueAnimato != null) {
                valueAnimato.setDuration((long)((float)((long)(i - p0) * 3000) / this.B));
             }
             if (valueAnimato != null) {
                valueAnimato.addUpdateListener(new MarketingProgress$c(this, layoutParams));
             }
             if (valueAnimato != null) {
                valueAnimato.addListener(new MarketingProgress$d(p3));
             }
             if (valueAnimato != null) {
                valueAnimato.start();
             }
             this.E = true;
          }else if(layoutParams != null){
             layoutParams.width = i;
          }
          tC1 = this.C;
          if (tC1 != null) {
             tC1.setLayoutParams(layoutParams);
          }
       }
    label_009e :
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MarketingProgress.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       MarketingProgress tF = this.F;
       if (tF != null) {
          tF.start();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MarketingProgress.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       MarketingProgress tF = this.F;
       if (tF != null) {
          tF.stop();
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(MarketingProgress.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, MarketingProgress.class, "4")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.B = (float)p0;
       return;
    }
}
