package com.kuaishou.merchant.live.cart.salemanager.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import java.lang.Object;
import r54.b;

public class i extends Accessor	// class@0019df
{
    public final LiveAnchorShopFragment$b c;
    public final e0 d;

    public void i(e0 p0,LiveAnchorShopFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
