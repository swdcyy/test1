package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidderSwitcher;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import android.animation.AnimatorSet;
import z84.r;
import android.widget.ViewSwitcher$ViewFactory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bs3.a$a;
import java.lang.Integer;
import ekd.k1;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import z84.q;
import android.view.View$OnClickListener;
import z84.p;
import lnc.a1;
import z84.s;
import java.lang.Runnable;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import ekd.r;
import z84.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import z84.o;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble$a;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidderSwitcher$a;

public class AuctionBidderSwitcher extends ViewSwitcher	// class@001b88
{
    public AbstractAuctionBubble$a b;
    public AuctionBidderSwitcher$a c;
    public AnimatorSet d;
    public int e;
    public static final int f;

    public void AuctionBidderSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new AnimatorSet();
       this.e = 10;
       this.setFactory(new r(p0));
       this.setInAnimation(p0, R.anim.arg_RES_7f01001c);
       this.setOutAnimation(p0, R.anim.arg_RES_7f01001d);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, AuctionBidderSwitcher.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.getCurrentView().findViewById(0x7f0a02a1).getText().toString()) ^ 0x01);
    }
    public void b(a$a p0,int p1){
       if (PatchProxy.isSupport(AuctionBidderSwitcher.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AuctionBidderSwitcher.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!PatchProxy.isSupport(AuctionBidderSwitcher.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AuctionBidderSwitcher.class, "5")) {
          View nextView = this.getNextView();
          if (!PatchProxy.isSupport(AuctionBidderSwitcher.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), nextView, this, AuctionBidderSwitcher.class, "7")) {
             k1.n(this);
             nextView.findViewById(R.id.auction_bid_current_avatar_border).setVisibility(8);
             KwaiImageView kwaiImageVie = nextView.findViewById(R.id.auction_bid_current_avatar);
             kwaiImageVie.U(p0.e);
             kwaiImageVie.setOnClickListener(new q(this, p0));
             nextView.findViewById(R.id.auction_current_bidder_name).setText(p0.b);
             TextView textView = nextView.findViewById(R.id.auction_current_bidder_status);
             textView.setOnClickListener(new p(this));
             if (p1 == 2) {
                Object[] objArray = new Object[]{Integer.valueOf(this.e)};
                textView.setText(String.format(a1.p(R.string.arg_RES_7f100271), objArray));
                textView.setTextColor(a1.a(R.color.arg_RES_7f061dfb));
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f08012c, 0);
                k1.s(new s(this, textView, p0), this, 3000);
             }else {
                this.c(textView, p0.c);
             }
          }
          this.showNext();
       }
       return;
    }
    public final void c(TextView p0,int p1){
       if (PatchProxy.isSupport(AuctionBidderSwitcher.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AuctionBidderSwitcher.class, "8")) {
          return;
       }
       int i = 1;
       if (p1 > i) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p1);
          p0.setText(String.format(a1.p(R.string.arg_RES_7f10027c), objArray));
          p0.setTextColor(a1.a(R.color.arg_RES_7f061dfb));
          p0.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f08012c, 0);
       }else {
          p0.setText(a1.p(R.string.arg_RES_7f100286));
          p0.setTextColor(a1.a(R.color.arg_RES_7f061d7c));
          p0.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f08012b, 0);
       }
       return;
    }
    public Animator getSurpassedAnimation(){
       Object[] objArray = null;
       SelectShapeView obj = PatchProxy.apply(objArray, this, AuctionBidderSwitcher.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.a()) {
          return objArray;
       }
       obj = this.getCurrentView().findViewById(R.id.auction_bid_current_avatar_border);
       obj.setVisibility(0);
       TextView textView = this.getCurrentView().findViewById(R.id.auction_current_bidder_name);
       TextView textView1 = this.getCurrentView().findViewById(R.id.auction_current_bidder_status);
       int currentTextC = textView.getCurrentTextColor();
       int currentTextC1 = textView1.getCurrentTextColor();
       int i = a1.a(R.color.arg_RES_7f061dfb);
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[5]{0,0x3f800000,0,0x3f800000,0})};
       int[] ointArray = new int[]{currentTextC,i,currentTextC,i,currentTextC};
       ValueAnimator valueAnimato = r.c(ointArray);
       valueAnimato.addUpdateListener(new n(textView));
       int[] ointArray1 = new int[]{currentTextC1,i,currentTextC1,i,currentTextC1};
       ValueAnimator valueAnimato1 = r.c(ointArray1);
       valueAnimato1.addUpdateListener(new o(textView1));
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofPropertyValuesHolder(obj, propertyValu),valueAnimato,valueAnimato1};
       this.d.playTogether(uAnimatorArr);
       this.d.setDuration(1600);
       return this.d;
    }
    public void setDelayEndDuration(int p0){
       this.e = p0;
    }
    public void setOnAvatarClickListener(AbstractAuctionBubble$a p0){
       this.b = p0;
    }
    public void setOnBidderStatusClickListener(AuctionBidderSwitcher$a p0){
       this.c = p0;
    }
}
