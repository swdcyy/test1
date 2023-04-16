package com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$c;

public class LiveShopOrderInfoView$a extends AnimatorListenerAdapter	// class@00199f
{
    public final LiveShopOrderInfoView a;

    public void LiveShopOrderInfoView$a(LiveShopOrderInfoView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopOrderInfoView$a.class, "1")) {
          return;
       }
       LiveShopOrderInfoView f = this.a.F;
       if (f != null) {
          f.a();
       }
       return;
    }
}
