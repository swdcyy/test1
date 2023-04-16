package com.kuaishou.merchant.live.cart.onsale.anchor.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.onsale.anchor.q;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class l extends Accessor	// class@00190e
{
    public final LiveAnchorOnSaleFragment$c c;
    public final q d;

    public void l(q p0,LiveAnchorOnSaleFragment$c p1){
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
