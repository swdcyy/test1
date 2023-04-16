package b94.k;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class k implements g	// class@000331
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionBidSignal", p0);
    }
}
