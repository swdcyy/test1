package cm4.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.transaction.order.orderlist.widget.MerchantOrderShadowLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.View;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@00048d
{
    public final MerchantOrderShadowLayout a;

    public void a(MerchantOrderShadowLayout p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.invalidate();
    }
}
