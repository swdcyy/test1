package com.kuaishou.merchant.transaction.purchase.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.UpgradeAddressGuideModel;

public class t extends Accessor	// class@0009c6
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void t(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
