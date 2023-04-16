package com.kuaishou.merchant.marketing.shop.auction.setting.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.marketing.shop.auction.setting.f;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import java.lang.Object;
import mrd.a;

public class b extends Accessor	// class@001bb7
{
    public final AuctionSettingFragment$b c;
    public final f d;

    public void b(f p0,AuctionSettingFragment$b p1){
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
