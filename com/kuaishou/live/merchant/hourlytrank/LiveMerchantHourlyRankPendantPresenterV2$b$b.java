package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$b;
import java.lang.Runnable;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.animation.ValueAnimator;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$b$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qrd.l1;
import android.animation.Animator;

public final class LiveMerchantHourlyRankPendantPresenterV2$b$b implements Runnable	// class@000cbb
{
    public final LiveMerchantHourlyRankPendantPresenterV2$b b;
    public final LiveMerchantHourlyRankPendantView c;

    public void LiveMerchantHourlyRankPendantPresenterV2$b$b(LiveMerchantHourlyRankPendantPresenterV2$b p0,LiveMerchantHourlyRankPendantView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2$b$b.class, "1")) {
          return;
       }
       this.c.setVisibility(0);
       int[] ointArray = new int[]{0,this.c.getMeasuredWidth()};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.setDuration(500);
       valueAnimato.addUpdateListener(new LiveMerchantHourlyRankPendantPresenterV2$b$b$a(this));
       this.b.b = valueAnimato;
       LiveMerchantHourlyRankPendantPresenterV2$b b = this.b.b;
       if (b != null) {
          b.start();
       }
       return;
    }
}
