package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView$b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView;
import java.lang.Object;
import android.view.View;
import ya1.f0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Number;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.widget.ViewFlipper;

public final class LiveMerchantHourlyRankPendantView$b implements LiveViewFlipper$a	// class@000cc9
{
    public final LiveMerchantHourlyRankPendantView b;

    public void LiveMerchantHourlyRankPendantView$b(LiveMerchantHourlyRankPendantView p0){
       this.b = p0;
       super();
    }
    public void a(View p0,int p1){
       f0.a(this, p0, p1);
    }
    public final void b(View p0,int p1){
       LiveMerchantHourlyRankPendantView$b uob = LiveMerchantHourlyRankPendantView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (q.f(this.b.c)) {
          return;
       }
       if (p1 < this.b.c.size() && p1 >= 0) {
          p1 = (int)this.b.c.get(p1).longValue();
          if (p1 <= 0) {
             LiveMerchantHourlyRankPendantView.a(this.b).setFlipInterval((int)this.b.b);
          }else {
             LiveMerchantHourlyRankPendantView.a(this.b).setFlipInterval(p1);
          }
       }
       return;
    }
}
