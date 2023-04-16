package com.kuaishou.merchant.transaction.purchase.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class c extends Accessor	// class@0008f7
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void c(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.t);
    }
    public void set(Object p0){
       this.c.t = p0.booleanValue();
    }
}
