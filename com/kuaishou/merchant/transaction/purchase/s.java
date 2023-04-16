package com.kuaishou.merchant.transaction.purchase.s;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.String;

public class s extends Accessor	// class@0009c5
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void s(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
