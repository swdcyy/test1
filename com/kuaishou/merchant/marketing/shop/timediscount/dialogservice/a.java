package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class a implements g	// class@001c14
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantContainerServicePresenter", "registerDialogMessage failed ", p0);
    }
}
