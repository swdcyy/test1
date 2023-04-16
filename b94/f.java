package b94.f;
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

public final class f implements g	// class@00032c
{
    public final m b;

    public void f(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "10")) {
       }else {
          a.s(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionStartSignal endRetainTime:"+tb.R8(p0));
          if (p0 != null) {
             LiveRoomSignalMessage$AuctionInfoSignal itemInfo = p0.itemInfo;
             if (itemInfo != null) {
                tb.w.remove(itemInfo.itemId);
             }
          }
          tb.P8(p0);
          tb.S8(1, p0);
       }
       return;
    }
}
