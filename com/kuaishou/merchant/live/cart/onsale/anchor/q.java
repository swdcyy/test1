package com.kuaishou.merchant.live.cart.onsale.anchor.q;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import com.kuaishou.merchant.live.cart.onsale.anchor.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.onsale.anchor.i;
import com.kuaishou.merchant.live.cart.onsale.anchor.j;
import com.kuaishou.merchant.live.cart.onsale.anchor.k;
import com.kuaishou.merchant.live.cart.onsale.anchor.l;
import com.kuaishou.merchant.live.cart.onsale.anchor.m;
import com.kuaishou.merchant.live.cart.onsale.anchor.n;
import com.kuaishou.merchant.live.cart.onsale.anchor.o;
import com.kuaishou.merchant.live.cart.onsale.anchor.p;
import com.kuaishou.merchant.live.cart.onsale.anchor.a;
import com.kuaishou.merchant.live.cart.onsale.anchor.model.LiveMerchantAnchorOnSaleCommodityResponse;
import com.kuaishou.merchant.live.cart.onsale.anchor.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.kuaishou.merchant.live.cart.onsale.anchor.c;
import com.kuaishou.merchant.live.cart.onsale.anchor.d;
import com.kuaishou.merchant.live.cart.onsale.anchor.e;
import fs3.c$a;
import com.kuaishou.merchant.live.cart.onsale.anchor.f;
import com.kuaishou.merchant.live.cart.onsale.anchor.g;
import mm8.a;

public final class q implements b	// class@001915
{

    public void q(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_ANCHOR_TOOLS_NEED_CALL_BACKEND", new h(this, p1));
       p0.i("LIVE_SHOP_AUCTION_PRE_LIVE_INFO", new i(this, p1));
       p0.i("LIVE_MERCHANT_ANCHOR_ON_SALE_FRAGMENT", new j(this, p1));
       p0.i("LIVE_MERCHANT_GOODS_FRAGMENT_ITEM_LISTS", new k(this, p1));
       p0.i("LIVE_BASE_CONTEXT", new l(this, p1));
       p0.i("LIVE_MERCHANT_ANCHOR_CONTAINER_FRAGMENT_SERVICE", new m(this, p1));
       p0.i("LIVE_MERCHANT_AUCTION_STATE_SERVICE", new n(this, p1));
       p0.i("LIVE_MERCHANT_AUCTION_SERVICE", new o(this, p1));
       p0.i("LIVE_MERCHANT_COMMODITY_AND_SCROLL_SERVICE", new p(this, p1));
       p0.i("LIVE_MERCHANT_SIGNAL_SERVICE", new a(this, p1));
       p0.h(LiveMerchantAnchorOnSaleCommodityResponse.class, new b(this, p1));
       if (p1.c != null) {
          Accessors.d().b(p1.c).a(p0, p1.c);
       }
       p0.i("LIVE_MERCHANT_SALE_COMMODITY_FRAGMENT_MANAGER_SERVICE", new c(this, p1));
       p0.i("LIVE_MERCHANT_GOODS_FRAGMENT_RECYCLERVIEW", new d(this, p1));
       p0.i("LIVE_SHOP_SANDEAGO_INFO", new e(this, p1));
       c$a uoa = c$a.class;
       f uof = new f(this, p1);
       try{
          p0.h(uoa, uof);
          p0.h(LiveAnchorOnSaleFragment$c.class, new g(this, p1));
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
