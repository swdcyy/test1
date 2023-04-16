package com.kuaishou.merchant.transaction.purchase.v;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2;

public class v extends Accessor	// class@0009c8
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void v(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
