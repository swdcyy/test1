package com.kuaishou.merchant.live.cart.onsale.anchor.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.onsale.anchor.q;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import java.lang.Object;
import r54.a;

public class i extends Accessor	// class@00190b
{
    public final LiveAnchorOnSaleFragment$c c;
    public final q d;

    public void i(q p0,LiveAnchorOnSaleFragment$c p1){
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
