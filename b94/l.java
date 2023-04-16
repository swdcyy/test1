package b94.l;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class l implements g	// class@000332
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionDealSignal", p0);
    }
}
