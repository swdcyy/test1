package aa4.c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class c extends AnimatorListenerAdapter	// class@000050
{
    public final LiveMerchantDiscountDialogCoverView a;

    public void c(LiveMerchantDiscountDialogCoverView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setTranslationY(0);
       this.a.setVisibility(4);
       p0.J = null;
       return;
    }
}
