package aa4.j;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Long;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class j implements g	// class@000057
{
    public final b b;
    public final Animator c;

    public void j(b p0,Animator p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j tc = this.c;
       if (this.b.a.x != null) {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "manually cancel water wave animator, without repeat in timer");
       }else {
          tc.start();
       }
       return;
    }
}
