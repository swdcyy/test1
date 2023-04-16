package com.kuaishou.merchant.transaction.purchase.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class b extends Accessor	// class@0008f5
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void b(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.o);
    }
    public void set(Object p0){
       this.c.o = p0.booleanValue();
    }
}
