package com.kuaishou.merchant.marketing.shop.auction.setting.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.marketing.shop.auction.setting.f;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends Accessor	// class@001bb9
{
    public final AuctionSettingFragment$b c;
    public final f d;

    public void d(f p0,AuctionSettingFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
