package com.kuaishou.merchant.live.cart.salemanager.e0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import com.kuaishou.merchant.live.cart.salemanager.r;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.w;
import com.kuaishou.merchant.live.cart.salemanager.x;
import com.kuaishou.merchant.live.cart.salemanager.y;
import com.kuaishou.merchant.live.cart.salemanager.z;
import com.kuaishou.merchant.live.cart.salemanager.a0;
import com.kuaishou.merchant.live.cart.salemanager.b0;
import com.kuaishou.merchant.live.cart.salemanager.c0;
import com.kuaishou.merchant.live.cart.salemanager.d0;
import com.kuaishou.merchant.live.cart.salemanager.h;
import com.kuaishou.merchant.live.cart.salemanager.i;
import com.kuaishou.merchant.live.cart.salemanager.j;
import com.kuaishou.merchant.live.cart.salemanager.k;
import com.kuaishou.merchant.live.cart.salemanager.l;
import com.kuaishou.merchant.live.cart.salemanager.m;
import com.kuaishou.merchant.live.cart.salemanager.n;
import com.kuaishou.merchant.live.cart.salemanager.o;
import com.kuaishou.merchant.live.cart.salemanager.p;
import com.kuaishou.merchant.live.cart.salemanager.q;
import com.kuaishou.merchant.live.cart.salemanager.s;
import com.kuaishou.merchant.live.cart.salemanager.t;
import com.kuaishou.merchant.live.cart.salemanager.u;
import com.kuaishou.merchant.live.cart.salemanager.v;
import java.lang.Class;
import mm8.a;

public final class e0 implements b	// class@0019d9
{

    public void e0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_SHOP_LIST_GOODS", new r(this, p1));
       p0.i("LIVE_ANCHOR_MANAGER_ALL_TOOLS", new w(this, p1));
       p0.i("LIVE_ANCHOR_TOOLS_NEED_CALL_BACKEND", new x(this, p1));
       p0.i("LIVE_SHOP_AUCTION_PRE_LIVE_INFO", new y(this, p1));
       p0.i("LIVE_ANCHOR_PRELOAD_CACHE", new z(this, p1));
       p0.i("LIVE_SHOP_LISTENER", new a0(this, p1));
       p0.i("LIVE_SHOP_CHOSEN_GOODS_INFO", new b0(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_COMMODITY_GROUP_ID", new c0(this, p1));
       p0.i("LIVE_ANCHOR_EXCELLENT_COMMODITY_INFO", new d0(this, p1));
       p0.i("LIVE_BASE_CONTEXT", new h(this, p1));
       p0.i("LIVE_SHOP_LIVE_PLAN_INFO", new i(this, p1));
       p0.i("LIVE_ANCHOR_EXCELLENT_COMMODITY_CHOOSE_URL", new j(this, p1));
       p0.i("LIVE_SHOP_BACK_PRESSABLE", new k(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_RECYCLERVIEW", new l(this, p1));
       p0.i("LIVE_SHOP_SANDEAGO_INFO", new m(this, p1));
       p0.i("LIVE_ANCHOR_SANDEAGO_SWITCH_INFO", new n(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_TAB_BAR", new o(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_TAB_LAYOUT", new p(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_TAB_SELECTED_EVENT", new q(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_TAB_VISIBLE_EVENT", new s(this, p1));
       p0.i("LIVE_ANCHOR_SHOP_TOP_NOTICE_BAR", new t(this, p1));
       u ou = new u(this, p1);
       String str = "LIVE_ANCHOR_TOP_TOOL_BAR";
       try{
          p0.i(str, ou);
          p0.h(LiveAnchorShopFragment$b.class, new v(this, p1));
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
