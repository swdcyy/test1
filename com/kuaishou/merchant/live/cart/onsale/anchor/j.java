package com.kuaishou.merchant.live.cart.onsale.anchor.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.onsale.anchor.q;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;

public class j extends Accessor	// class@00190c
{
    public final LiveAnchorOnSaleFragment$c c;
    public final q d;

    public void j(q p0,LiveAnchorOnSaleFragment$c p1){
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
