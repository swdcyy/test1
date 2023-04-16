package com.kuaishou.merchant.live.cart.onsale.audience.preload.b;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import d44.c;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopFragmentV2;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class b implements g	// class@001974
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       c.p = true;
       p0 = new LiveAudienceShopWrapperFragment();
       p0 = new LiveAudienceShopFragmentV2();
       p0 = new LiveYellowCartUltronFragment();
       a.s(MerchantCommonLogBiz.PERFMONITOR, "LiveAudiencePerfPresenter", "LiveAudienceShop preload success");
    }
}
