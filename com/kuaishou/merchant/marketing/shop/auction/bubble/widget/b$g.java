package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble;
import android.view.View;
import android.widget.LinearLayout;

public class b$g extends AnimatorListenerAdapter	// class@001b97
{
    public final b a;

    public void b$g(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "2")) {
          return;
       }
       this.a.U0.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "1")) {
          return;
       }
       int i = 0;
       this.a.q.setVisibility(i);
       b$g ta = this.a;
       AbstractAuctionBubble v = ta.v;
       if (ta.o1 == null) {
          i = 8;
       }
       v.setVisibility(i);
       return;
    }
}
