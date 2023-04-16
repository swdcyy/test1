package com.kuaishou.merchant.transaction.purchase.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.String;

public class h extends Accessor	// class@000932
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void h(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.B;
    }
    public void set(Object p0){
       this.c.B = p0;
    }
}
