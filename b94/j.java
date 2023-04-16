package b94.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class j implements g	// class@000330
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionStartSignal", p0);
    }
}
