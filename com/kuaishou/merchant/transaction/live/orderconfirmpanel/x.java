package com.kuaishou.merchant.transaction.live.orderconfirmpanel.x;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;

public class x extends Accessor	// class@000854
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void x(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
