package b94.e;
import erd.g;
import b94.m;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionInfoSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import crd.b;
import lnc.b9;

public final class e implements g	// class@00032b
{
    public final m b;

    public void e(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "12")) {
       }else {
          a.s(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionDealSignal");
          b9.a(tb.t);
          tb.S8(3, p0);
       }
       return;
    }
}
