package com.kuaishou.merchant.marketing.shop.auction.setting.a;
import oj0.a;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import c94.a;
import java.lang.Runnable;
import ekd.k1;

public final class a implements a	// class@001bb6
{
    public final AuctionSettingFragment b;

    public void a(AuctionSettingFragment p0){
       this.b = p0;
    }
    public final void W(Map p0){
       a tb = this.b;
       AuctionSettingFragment q = tb.q;
       q.g = true;
       q.f = true;
       a uoa = new a(tb);
       k1.p(uoa, AuctionSettingFragment.u);
    }
}
