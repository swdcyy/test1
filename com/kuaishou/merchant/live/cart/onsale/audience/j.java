package com.kuaishou.merchant.live.cart.onsale.audience.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class j implements g	// class@001945
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveShopCommodityDataSourceController", "register CommodityCardChange sc message error", p0);
    }
}
