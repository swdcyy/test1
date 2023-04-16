package com.kuaishou.merchant.live.cart.onsale.audience.preload.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class c implements g	// class@001975
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantCommonLogBiz.PERFMONITOR, "LiveAudiencePerfPresenter", "LiveAudienceShop preload fail", p0);
    }
}
