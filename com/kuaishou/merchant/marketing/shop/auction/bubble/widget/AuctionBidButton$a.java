package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidButton$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidButton;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.animation.AnimatorSet;

public class AuctionBidButton$a extends AnimatorListenerAdapter	// class@001b85
{
    public final AuctionBidButton a;

    public void AuctionBidButton$a(AuctionBidButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionBidButton$a.class, "1")) {
          return;
       }
       this.a.b.setScaleX(0x3f800000);
       this.a.b.setScaleY(0x3f800000);
       AuctionBidButton$a ta = this.a;
       if (ta.h == null) {
          ta.e.start();
       }
       return;
    }
}
