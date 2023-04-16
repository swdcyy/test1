package com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress;
import android.view.ViewGroup$LayoutParams;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import android.view.View;

public final class MarketingProgress$c implements ValueAnimator$AnimatorUpdateListener	// class@0019be
{
    public final MarketingProgress a;
    public final ViewGroup$LayoutParams b;

    public void MarketingProgress$c(MarketingProgress p0,ViewGroup$LayoutParams p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarketingProgress$c.class, "1")) {
          return;
       }
       Integer animatedValu = p0.getAnimatedValue();
       if (animatedValu == null) {
          animatedValu = Integer.valueOf(0);
       }
       Objects.requireNonNull(animatedValu, "null cannot be cast to non-null type kotlin.Int");
       int i = animatedValu.intValue();
       if (i <= 0) {
          return;
       }else {
          MarketingProgress$c tb = this.b;
          if (tb != null) {
             tb.width = i;
          }
          MarketingProgress c = this.a.C;
          if (c != null) {
             c.setLayoutParams(tb);
          }
          return;
       }
    }
}
