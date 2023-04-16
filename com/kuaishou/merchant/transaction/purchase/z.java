package com.kuaishou.merchant.transaction.purchase.z;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.util.List;

public class z extends Accessor	// class@0009cc
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void z(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l;
    }
    public void set(Object p0){
       this.c.l = p0;
    }
}
