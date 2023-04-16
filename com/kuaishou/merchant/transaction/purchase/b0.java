package com.kuaishou.merchant.transaction.purchase.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo;

public class b0 extends Accessor	// class@0008f4
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void b0(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
