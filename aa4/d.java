package aa4.d;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.a;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import androidx.constraintlayout.widget.Group;

public final class d implements Runnable	// class@000051
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void run(){
       this.b.a.L.setVisibility(0);
    }
}
