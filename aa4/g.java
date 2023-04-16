package aa4.g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class g extends AnimatorListenerAdapter	// class@000054
{
    public final LiveMerchantDiscountDialogGrabButtonView a;

    public void g(LiveMerchantDiscountDialogGrabButtonView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.l.setRotationY(0);
       return;
    }
}
