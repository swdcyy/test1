package com.kuaishou.merchant.transaction.live.orderconfirmpanel.s;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import z1.k;

public class s extends Accessor	// class@00084f
{
    public final MerchantLivePurchasePanelFragment$b c;
    public final a0 d;

    public void s(a0 p0,MerchantLivePurchasePanelFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.t;
    }
    public void set(Object p0){
       this.c.t = p0;
    }
}
