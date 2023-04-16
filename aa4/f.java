package aa4.f;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.widget.ProgressBar;
import crd.b;
import lnc.b9;

public final class f implements g	// class@000053
{
    public final LiveMerchantDiscountDialogGrabButtonView b;

    public void f(LiveMerchantDiscountDialogGrabButtonView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       long l = p0.longValue();
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(LiveMerchantDiscountDialogGrabButtonView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, LiveMerchantDiscountDialogGrabButtonView.class, "12")) {
          tb.b.setProgress((int)((long)tb.w - l));
          if (l <= 0) {
             b9.a(tb.t);
             tb.t = null;
          }
       }
       return;
    }
}
