package com.kuaishou.merchant.transaction.purchase.x;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipInfo;

public class x extends Accessor	// class@0009ca
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void x(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p;
    }
    public void set(Object p0){
       this.c.p = p0;
    }
}
