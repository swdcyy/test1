package com.kuaishou.merchant.transaction.purchase.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.model.PaymentInfo;

public class e extends Accessor	// class@00092c
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void e(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.n;
    }
    public void set(Object p0){
       this.c.n = p0;
    }
}
