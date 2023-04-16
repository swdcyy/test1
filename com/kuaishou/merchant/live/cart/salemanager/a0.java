package com.kuaishou.merchant.live.cart.salemanager.a0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import java.lang.Object;
import fs3.c$a;

public class a0 extends Accessor	// class@0019d1
{
    public final LiveAnchorShopFragment$b c;
    public final e0 d;

    public void a0(e0 p0,LiveAnchorShopFragment$b p1){
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
