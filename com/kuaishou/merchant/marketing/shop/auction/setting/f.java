package com.kuaishou.merchant.marketing.shop.auction.setting.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import com.kuaishou.merchant.marketing.shop.auction.setting.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.marketing.shop.auction.setting.c;
import com.kuaishou.merchant.marketing.shop.auction.setting.d;
import com.kuaishou.merchant.marketing.shop.auction.setting.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@001bbb
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_MERCHANT_AUCTION_SETTING_ENTRY_STATUS_SUBJECT", new b(this, p1));
       p0.i("LIVE_MERCHANT_AUCTION_SETTING_CONFIG_SUBJECT", new c(this, p1));
       d uod = new d(this, p1);
       String str = "FRAGMENT";
       try{
          p0.i(str, uod);
          p0.h(AuctionSettingFragment$b.class, new e(this, p1));
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
