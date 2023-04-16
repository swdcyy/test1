package com.kuaishou.merchant.live.cart.onsale.audience.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.String;
import java.util.Map;
import o74.a;

public final class h implements g	// class@00193f
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       a.C(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveAudienceShopWrapperFragment", "load fail", null, p0);
    }
}
