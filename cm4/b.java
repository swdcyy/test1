package cm4.b;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.order.orderlist.widget.MerchantOrderShadowLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class b implements Runnable	// class@00048e
{
    public final MerchantOrderShadowLayout b;

    public void b(MerchantOrderShadowLayout p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       MerchantOrderShadowLayout g = tb.g;
       if (g != null) {
          g.removeAllUpdateListeners();
          tb.g.removeAllListeners();
       }
       float[] uofloatArray = new float[]{(float)(- tb.getWidth()),(float)tb.getWidth()};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       tb.g = valueAnimato;
       valueAnimato.setDuration(1000);
       tb.g.addUpdateListener(tb.k);
       tb.g.setRepeatCount(tb.j);
       tb.g.start();
       return;
    }
}
