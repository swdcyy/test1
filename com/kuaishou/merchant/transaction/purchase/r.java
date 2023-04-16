package com.kuaishou.merchant.transaction.purchase.r;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class r extends Accessor	// class@0009c4
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void r(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.y);
    }
    public void set(Object p0){
       this.c.y = p0.intValue();
    }
}
