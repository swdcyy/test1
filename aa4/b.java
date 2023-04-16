package aa4.b;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import da4.a;
import java.lang.CharSequence;
import android.widget.TextView;
import crd.b;
import lnc.b9;

public final class b implements g	// class@00004f
{
    public final LiveMerchantDiscountDialogCoverView b;

    public void b(LiveMerchantDiscountDialogCoverView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveMerchantDiscountDialogCoverView.class, "12")) {
       }else {
          tb.G.setText(tb.M.e());
          b9.a(tb.K);
       }
       return;
    }
}
