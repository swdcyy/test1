package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$c;
import java.lang.Runnable;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.LinearLayout;
import android.animation.ValueAnimator;
import fg3.e;
import android.animation.Animator$AnimatorListener;
import fg3.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qrd.l1;
import android.animation.Animator;

public final class LiveMerchantHourlyRankPendantPresenterV2$b$c implements Runnable	// class@000cbc
{
    public final LiveMerchantHourlyRankPendantPresenterV2$b b;
    public final LiveMerchantHourlyRankPendantView c;

    public void LiveMerchantHourlyRankPendantPresenterV2$b$c(LiveMerchantHourlyRankPendantPresenterV2$b p0,LiveMerchantHourlyRankPendantView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2$b$c.class, "1")) {
          return;
       }
       LiveMerchantHourlyRankPendantPresenterV2$b$c tb = this.b;
       LiveMerchantHourlyRankPendantPresenterV2$b$c tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, LiveMerchantHourlyRankPendantPresenterV2$b.class, "4")) {
          b.Z(LiveLogTag.MERCHANT, "hideGuideView hourlyRankGuide");
          int[] ointArray = new int[]{tc.getMeasuredWidth(),0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(500);
          valueAnimato.addListener(new e(tc));
          valueAnimato.addUpdateListener(new f(tc));
          tb.c = valueAnimato;
          valueAnimato.start();
       }
       return;
    }
}
