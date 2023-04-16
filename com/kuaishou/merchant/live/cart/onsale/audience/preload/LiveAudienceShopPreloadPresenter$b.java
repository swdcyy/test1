package com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter$b;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import qa4.f;

public class LiveAudienceShopPreloadPresenter$b implements MessageQueue$IdleHandler	// class@00196d
{

    public void LiveAudienceShopPreloadPresenter$b(){
       super();
    }
    public void LiveAudienceShopPreloadPresenter$b(LiveAudienceShopPreloadPresenter$a p0){
       super();
    }
    public boolean queueIdle(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopPreloadPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveAudienceShopPreloadPresenter", "preloadViewForDetailv2InCart");
       f.a.b("MERCHANT_ITEMSELF_DETAIL_V2");
       return false;
    }
}
