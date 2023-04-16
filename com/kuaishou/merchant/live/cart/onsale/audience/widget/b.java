package com.kuaishou.merchant.live.cart.onsale.audience.widget.b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$b;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView;
import android.animation.ObjectAnimator;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import lnc.a1;

public class b extends AnimatorListenerAdapter	// class@0019aa
{
    public final LiveShopOrderInfoView$d a;
    public final LiveShopOrderInfoView$b b;

    public void b(LiveShopOrderInfoView$b p0,LiveShopOrderInfoView$d p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       b ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, LiveShopOrderInfoView$b.class, "7")) {
          LiveShopOrderInfoView$b c = tb.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoid(null, c, LiveShopOrderInfoView.class, "3")) {
             c.C.setInAnimation(c.getFlipperInAnimator());
             c.C.setOutAnimation(c.getFlipperOutAnimator());
             c.C.startFlipping();
          }
          ta.e.setVisibility(8);
          tb.c.C.setBackgroundColor(a1.a(R.color.arg_RES_7f061d6b));
       }
       return;
    }
}
