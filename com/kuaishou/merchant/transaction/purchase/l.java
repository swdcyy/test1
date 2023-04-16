package com.kuaishou.merchant.transaction.purchase.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;

public class l extends Accessor	// class@00093a
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void l(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
