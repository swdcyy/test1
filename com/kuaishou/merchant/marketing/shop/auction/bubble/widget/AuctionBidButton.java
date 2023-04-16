package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidButton;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.marketing.shop.auction.widget.RedRectSweepingButtonView;
import android.widget.ImageView;
import z84.m;
import java.lang.Runnable;
import android.widget.TextView;
import com.kwai.library.widget.specific.misc.KwaiLoadingCircle;
import lnc.a1;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import bh.d;
import bh.o;
import com.kuaishou.merchant.basic.widget.sweeping.RectSweepingButtonView;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidButton$a;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public class AuctionBidButton extends FrameLayout	// class@001b86
{
    public RedRectSweepingButtonView b;
    public TextView c;
    public KwaiLoadingCircle d;
    public AnimatorSet e;
    public o f;
    public o g;
    public boolean h;
    public static final int i;

    public void AuctionBidButton(Context p0){
       super(p0);
       this.a(p0);
    }
    public void AuctionBidButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionBidButton.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d00cc, this, true);
       RedRectSweepingButtonView redRectSweep = this.findViewById(R.id.auction_bid_button_sweep);
       this.b = redRectSweep;
       redRectSweep.setVisibility(8);
       View view = this.findViewById(R.id.bid_button_background);
       view.post(new m(this, view));
       this.c = this.findViewById(0x7f0a028e);
       KwaiLoadingCircle kwaiLoadingC = this.findViewById(R.id.auction_bid_button_loading);
       this.d = kwaiLoadingC;
       kwaiLoadingC.setProgressWidth(a1.d(R.dimen.arg_RES_7f07030a));
       this.d.setProgressColor(a1.a(R.color.arg_RES_7f0620c7));
       this.d.setProgressShadowColor(a1.a(R.color.arg_RES_7f062057));
       this.setClipChildren(false);
       this.setClipToPadding(false);
       return;
    }
    public void b(long p0,long p1,boolean p2){
       AuctionBidButton tf;
       if (PatchProxy.isSupport(AuctionBidButton.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), this, AuctionBidButton.class, "5")) {
          return;
       }
       this.b.setVisibility(0);
       if (a.t().d("merchantAttributeAnimationUseAE", 0)) {
          AuctionBidButton uAuctionBidB = -1;
          String str = "lottie/auction.json";
          Object[] objArray = null;
          if (p2) {
             if (!PatchProxy.applyVoid(objArray, this, AuctionBidButton.class, "8")) {
                if (this.f == null) {
                   this.f = d.c().b(this.b, str, "btn_breathe_group");
                }
                tf = this.f;
                if (tf != null) {
                   tf.f(uAuctionBidB);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, this, AuctionBidButton.class, "9")){
             if (this.g == null) {
                this.g = d.c().b(this.b, str, "btn_breathe");
             }
             tf = this.g;
             if (tf != null) {
                tf.f(uAuctionBidB);
             }
          }
          this.b.j();
          return;
       }else {
          this.h = false;
          if (this.e == null) {
             this.e = new AnimatorSet();
          }
          this.e.cancel();
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[3]{0x3f800000,0x3f8ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[3]{0x3f800000,0x3f8ccccd,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
          objectAnimat.setDuration(p0);
          if (p2) {
             objectAnimat.setRepeatCount(2);
          }
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f800000})};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu1);
          objectAnimat1.setDuration(p1);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
          this.e.playSequentially(uAnimatorArr);
          this.e.removeAllListeners();
          this.e.addListener(new AuctionBidButton$a(this));
          this.b.j();
          this.e.start();
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AuctionBidButton.class, "6")) {
          return;
       }
       AuctionBidButton te = this.e;
       if (te != null) {
          this.h = true;
          te.cancel();
       }
       te = this.b;
       if (te != null) {
          te.k();
       }
       te = this.g;
       if (te != null) {
          te.c();
       }
       te = this.f;
       if (te != null) {
          te.c();
       }
       return;
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, AuctionBidButton.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getText().toString();
    }
    public void setLoading(boolean p0){
       if (PatchProxy.isSupport(AuctionBidButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AuctionBidButton.class, "4")) {
          return;
       }
       int i = (p0)? 0: 8;
       this.d.setVisibility(i);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       if (p0) {
          this.d.e();
       }else {
          this.d.g();
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionBidButton.class, "2")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
