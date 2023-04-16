package com.kuaishou.merchant.marketing.shop.auction.setting.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.marketing.shop.auction.setting.f;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@001bb8
{
    public final AuctionSettingFragment$b c;
    public final f d;

    public void c(f p0,AuctionSettingFragment$b p1){
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
