package com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import n24.b;
import com.kuaishou.merchant.live.bottombar.view.a;
import erd.g;
import crd.b;

public class LiveMerchantAudienceBottomBarView$a extends AnimatorListenerAdapter	// class@0018dc
{
    public final LiveMerchantAudienceBottomBarView a;
    public static final int b;

    public void LiveMerchantAudienceBottomBarView$a(LiveMerchantAudienceBottomBarView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAudienceBottomBarView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.e = a0.Y(5, TimeUnit.SECONDS).G(d.a).R(new b(this), a.b);
       return;
    }
}
