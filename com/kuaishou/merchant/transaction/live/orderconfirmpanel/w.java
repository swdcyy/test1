package com.kuaishou.merchant.transaction.live.orderconfirmpanel.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class w extends Accessor	// class@000853
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void w(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
