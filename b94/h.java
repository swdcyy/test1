package b94.h;
import erd.g;
import b94.m;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionInfoSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;
import java.util.Map;
import java.lang.Long;

public final class h implements g	// class@00032e
{
    public final m b;

    public void h(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "11")) {
       }else {
          MerchantMarketingShopLogBiz aUCTION = MerchantMarketingShopLogBiz.AUCTION;
          a.s(aUCTION, "LiveAuctionPresenter", "handleAuctionBidSignal endRetainTime:"+tb.R8(p0));
          String str = null;
          long l = 0;
          if (p0 != null) {
             LiveRoomSignalMessage$AuctionInfoSignal itemInfo = p0.itemInfo;
             if (itemInfo != null) {
                LiveRoomSignalMessage$ItemInfo itemId = itemInfo.itemId;
                if (itemId != null) {
                   Long longx = tb.w.get(itemId);
                   if (longx == null) {
                      longx = Long.valueOf(l);
                   }
                   if (longx.longValue() - l > 0) {
                      str = 1;
                   }
                   l = longx.longValue();
                }
             }
          }
          if (str) {
             p0.endTime = l;
             p0.realEndTime = -1000;
             a.s(aUCTION, "LiveAuctionPresenter", "handleAuctionBidSignal,now is suspend status ");
          }else {
             tb.P8(p0);
          }
          tb.S8(2, p0);
       }
       return;
    }
}
