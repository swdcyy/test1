package b94.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class b implements g	// class@000328
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionSuspendResumeSignal", p0);
    }
}
