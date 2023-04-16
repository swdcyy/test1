package gka.y;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.CharSequence;
import java.lang.Object;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class y implements Runnable	// class@002b1e
{
    public final ProgressFragment b;
    public final CharSequence c;

    public void y(ProgressFragment p0,CharSequence p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ProgressFragment m;
       y tb = this.b;
       y tc = this.c;
       tb.K.setText(tc);
       int i = TextUtils.isEmpty(tc) ^ 0x01;
       ProgressFragment k = tb.K;
       int i1 = (i)? 0: 8;
       k.setVisibility(i1);
       ViewGroup$MarginLayoutParams layoutParams = tb.r.getLayoutParams();
       i = (i)? ProgressFragment.U0: tb.M;
       layoutParams.topMargin = i;
       tb.r.requestLayout();
       return;
    }
}
