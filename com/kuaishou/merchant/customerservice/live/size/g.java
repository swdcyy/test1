package com.kuaishou.merchant.customerservice.live.size.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.customerservice.live.size.m;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.customerservice.model.CustomerServiceSize;

public class g extends Accessor	// class@00167a
{
    public final LiveCustomerServiceSizeFragment$b c;
    public final m d;

    public void g(m p0,LiveCustomerServiceSizeFragment$b p1){
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
