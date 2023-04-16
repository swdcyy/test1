package com.kuaishou.merchant.transaction.live.orderconfirmpanel.z;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;

public class z extends Accessor	// class@000856
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void z(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
