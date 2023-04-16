package com.kuaishou.merchant.live.cart.onsale.anchor.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.onsale.anchor.q;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.anchor.model.LiveMerchantAnchorOnSaleCommodityResponse;

public class b extends Accessor	// class@001904
{
    public final LiveAnchorOnSaleFragment$c c;
    public final q d;

    public void b(q p0,LiveAnchorOnSaleFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
