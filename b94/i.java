package b94.i;
import erd.g;
import b94.m;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionInfoSignal;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class i implements g	// class@00032f
{
    public final m b;
    public final LiveRoomSignalMessage$AuctionInfoSignal c;

    public void i(m p0,LiveRoomSignalMessage$AuctionInfoSignal p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       a.s(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "send finishAuction");
       tb.S8(4, this.c);
    }
}
