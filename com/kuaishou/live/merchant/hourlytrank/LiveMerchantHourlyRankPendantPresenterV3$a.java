package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV3$a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveMerchantHourlyRankPendantPresenterV3$a implements g	// class@000cc5
{
    public static final LiveMerchantHourlyRankPendantPresenterV3$a b;

    static {
       LiveMerchantHourlyRankPendantPresenterV3$a.b = new LiveMerchantHourlyRankPendantPresenterV3$a();
    }
    public void LiveMerchantHourlyRankPendantPresenterV3$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantPresenterV3$a.class, "1")) {
       }else {
          b.I(LiveLogTag.MERCHANT, "SellerMerchantRankSignalV2", p0);
       }
       return;
    }
}
