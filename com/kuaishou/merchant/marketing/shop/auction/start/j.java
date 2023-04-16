package com.kuaishou.merchant.marketing.shop.auction.start.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.marketing.shop.auction.start.l;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$c;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class j extends Accessor	// class@001bd3
{
    public final LiveAnchorStartAuctionFragment$c c;
    public final l d;

    public void j(l p0,LiveAnchorStartAuctionFragment$c p1){
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
