package com.kuaishou.merchant.transaction.live.orderconfirmpanel.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import java.lang.Boolean;

public class h extends Accessor	// class@0007f8
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void h(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.k);
    }
    public void set(Object p0){
       this.c.k = p0.booleanValue();
    }
}
