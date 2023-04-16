package com.kuaishou.merchant.transaction.live.orderconfirmpanel.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.DefaultObservable;

public class u extends Accessor	// class@000851
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void u(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
