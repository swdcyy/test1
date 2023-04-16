package com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class b extends Accessor	// class@0007ee
{
    public final LiveAudienceDiscountPanelFragment$a c;
    public final g d;

    public void b(g p0,LiveAudienceDiscountPanelFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
