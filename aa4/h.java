package aa4.h;
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
import android.widget.FrameLayout;

public class h extends AnimatorListenerAdapter	// class@000055
{
    public final LiveMerchantDiscountDialogGrabButtonView a;

    public void h(LiveMerchantDiscountDialogGrabButtonView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "button hide animator end");
       this.a.setVisibility(4);
       this.a.setScaleX(0x3f800000);
       this.a.setScaleY(0x3f800000);
       this.a.setAlpha(0x3f800000);
       return;
    }
}
