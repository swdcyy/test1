package com.kuaishou.merchant.live.cart.salemanager.c;
import z1.a;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$a;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment;
import java.lang.String;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import o54.k;

public final class c implements a	// class@0019d6
{
    public final LiveAnchorShopFragment$a a;

    public void c(LiveAnchorShopFragment$a p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c ta = this.a;
       p0.put("liveStreamId", ta.r.M.b());
       p0.put("sellerId", ta.r.M.a());
       p0.put("isTrust", String.valueOf(ta.r.M.d()));
       String str = (ta.r.M.c())? "1": "2";
       p0.put("sourceChannel", str);
       p0.put("KEY_HALF_CONTAINER_CALLBACK", new k(ta));
       return;
    }
}
