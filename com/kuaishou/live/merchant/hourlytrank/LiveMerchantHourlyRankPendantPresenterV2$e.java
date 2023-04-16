package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveMerchantHourlyRankPendantPresenterV2$e implements g	// class@000cc0
{
    public static final LiveMerchantHourlyRankPendantPresenterV2$e b;

    static {
       LiveMerchantHourlyRankPendantPresenterV2$e.b = new LiveMerchantHourlyRankPendantPresenterV2$e();
    }
    public void LiveMerchantHourlyRankPendantPresenterV2$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantPresenterV2$e.class, "1")) {
       }else {
          b.I(LiveLogTag.MERCHANT, "SellerMerchantRankSignal", p0);
       }
       return;
    }
}
