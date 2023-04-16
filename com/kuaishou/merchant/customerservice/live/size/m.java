package com.kuaishou.merchant.customerservice.live.size.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import com.kuaishou.merchant.customerservice.live.size.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.customerservice.live.size.h;
import com.kuaishou.merchant.customerservice.live.size.i;
import com.kuaishou.merchant.customerservice.live.size.j;
import com.kuaishou.merchant.customerservice.live.size.k;
import com.kuaishou.merchant.customerservice.live.size.l;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@001680
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_CUSTOMER_SERVICE_SIZE", new g(this, p1));
       p0.i("MERCHANT_FRAGMENT", new h(this, p1));
       p0.i("LIVE_BASE_CONTEXT", new i(this, p1));
       p0.i("LIVE_MERCHANT_SIGNAL_SERVICE", new j(this, p1));
       k ok = new k(this, p1);
       String str = "LIVE_CUSTOMER_SERVICE_SIZE_LOGGER";
       try{
          p0.i(str, ok);
          p0.h(LiveCustomerServiceSizeFragment$b.class, new l(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
