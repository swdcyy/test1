package com.kuaishou.merchant.transaction.purchase.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class g extends Accessor	// class@000930
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void g(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.s);
    }
    public void set(Object p0){
       this.c.s = p0.intValue();
    }
}
