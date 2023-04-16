package com.kuaishou.merchant.marketing.shop.auction.start.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$c;
import com.kuaishou.merchant.marketing.shop.auction.start.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.marketing.shop.auction.start.e;
import com.kuaishou.merchant.marketing.shop.auction.start.f;
import com.kuaishou.merchant.marketing.shop.auction.start.g;
import com.kuaishou.merchant.marketing.shop.auction.start.h;
import com.kuaishou.merchant.marketing.shop.auction.start.i;
import com.kuaishou.merchant.marketing.shop.auction.start.j;
import com.kuaishou.merchant.marketing.shop.auction.start.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@001bd5
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUCTION_START_CONFIG", new d(this, p1));
       p0.i("AUCTION_PUBLISH", new e(this, p1));
       p0.i("AUCTION_PUBLISH_HELPER", new f(this, p1));
       p0.i("MERCHANT_FRAGMENT", new g(this, p1));
       p0.i("LIVE_MERCHANT_AUCTION_SERVICE", new h(this, p1));
       p0.i("LIVE_MERCHANT_ANCHOR_SANDEABIZ_SERVICE", new i(this, p1));
       j oj = new j(this, p1);
       String str = "LIVE_BASE_CONTEXT";
       try{
          p0.i(str, oj);
          p0.h(LiveAnchorStartAuctionFragment$c.class, new k(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
