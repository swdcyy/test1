package com.kuaishou.merchant.transaction.purchase.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.transaction.purchase.d0;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import java.lang.Object;
import androidx.fragment.app.Fragment;

public class a extends Accessor	// class@0008f3
{
    public final MerchantPurchaseFragment$a c;
    public final d0 d;

    public void a(d0 p0,MerchantPurchaseFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
