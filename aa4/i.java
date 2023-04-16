package aa4.i;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import android.widget.ImageView;

public class i extends AnimatorListenerAdapter	// class@000056
{
    public final LiveMerchantDiscountDialogGrabButtonView a;

    public void i(LiveMerchantDiscountDialogGrabButtonView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "show grab status, animator start");
       this.a.l.setAlpha(0);
       this.a.l.setVisibility(0);
       return;
    }
}
