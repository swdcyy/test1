package com.kuaishou.merchant.transaction.purchase.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import java.lang.String;

public class f extends Accessor	// class@00092e
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void f(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.r;
    }
    public void set(Object p0){
       this.c.r = p0;
    }
}
