package com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public class d extends Accessor	// class@0007f0
{
    public final LiveAudienceDiscountPanelFragment$a c;
    public final g d;

    public void d(g p0,LiveAudienceDiscountPanelFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
