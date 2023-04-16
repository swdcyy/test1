package com.kuaishou.merchant.customerservice.live.size.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.customerservice.live.size.m;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class i extends Accessor	// class@00167c
{
    public final LiveCustomerServiceSizeFragment$b c;
    public final m d;

    public void i(m p0,LiveCustomerServiceSizeFragment$b p1){
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
