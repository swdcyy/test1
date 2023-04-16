package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$b$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$b;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.NullPointerException;

public final class LiveMerchantHourlyRankPendantPresenterV2$b$b$a implements ValueAnimator$AnimatorUpdateListener	// class@000cba
{
    public final LiveMerchantHourlyRankPendantPresenterV2$b$b a;

    public void LiveMerchantHourlyRankPendantPresenterV2$b$b$a(LiveMerchantHourlyRankPendantPresenterV2$b$b p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveMerchantHourlyRankPendantPresenterV2$b$b$a.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.c.getLayoutParams();
       a.o(p0, "animation");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          layoutParams.width = p0.intValue();
          this.a.c.setLayoutParams(layoutParams);
          PatchProxy.onMethodExit(LiveMerchantHourlyRankPendantPresenterV2$b$b$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(LiveMerchantHourlyRankPendantPresenterV2$b$b$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
