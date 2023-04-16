package com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.live.cart.onsale.widget.MarketingProgress$a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MarketingProgress$d extends AnimatorListenerAdapter	// class@0019bf
{
    public final MarketingProgress$a a;

    public void MarketingProgress$d(MarketingProgress$a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarketingProgress$d.class, "1")) {
          return;
       }
       MarketingProgress$d ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
}
