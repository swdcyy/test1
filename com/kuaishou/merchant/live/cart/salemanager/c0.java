package com.kuaishou.merchant.live.cart.salemanager.c0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class c0 extends Accessor	// class@0019d5
{
    public final LiveAnchorShopFragment$b c;
    public final e0 d;

    public void c0(e0 p0,LiveAnchorShopFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.t);
    }
    public void set(Object p0){
       this.c.t = p0.intValue();
    }
}
