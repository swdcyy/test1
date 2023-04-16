package com.kuaishou.merchant.transaction.purchase.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.model.BuyButton;

public class y extends Accessor	// class@0009cb
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void y(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.z;
    }
    public void set(Object p0){
       this.c.z = p0;
    }
}
