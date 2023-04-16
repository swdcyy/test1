package com.kuaishou.merchant.live.cart.salemanager.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class h extends Accessor	// class@0019de
{
    public final LiveAnchorShopFragment$b c;
    public final e0 d;

    public void h(e0 p0,LiveAnchorShopFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
