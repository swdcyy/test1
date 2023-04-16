package com.kuaishou.merchant.transaction.live.orderconfirmpanel.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class t extends Accessor	// class@000850
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void t(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.p);
    }
    public void set(Object p0){
       this.c.p = p0.intValue();
    }
}
