package com.kuaishou.merchant.transaction.live.orderconfirmpanel.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import java.lang.Boolean;

public class g extends Accessor	// class@0007f7
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void g(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.s);
    }
    public void set(Object p0){
       this.c.s = p0.booleanValue();
    }
}
