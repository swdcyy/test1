package com.kuaishou.merchant.live.cart.onsale.audience.widget.a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$b;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class a extends AnimatorListenerAdapter	// class@0019a9
{
    public final View a;
    public final View b;
    public final LiveShopOrderInfoView$b c;

    public void a(LiveShopOrderInfoView$b p0,View p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.setTranslationX((float)(- a1.e(40.00f)));
       this.a.setVisibility(0);
       this.b.setVisibility(8);
       return;
    }
}
