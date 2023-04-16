package bwc.b;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import java.lang.Object;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public final class b implements Runnable	// class@0004a4
{
    public final View b;
    public final MixImporterActivity c;

    public void b(View p0,MixImporterActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       if (tb.isLayoutRequested()) {
       }else {
          int[] ointArray = new int[2];
          tb.getLocationOnScreen(ointArray);
          if (ointArray[1] < n.A(tc)) {
             RelativeLayout$LayoutParams layoutParams = tb.getLayoutParams();
             layoutParams.topMargin = (layoutParams.topMargin + n.A(tc)) - ointArray[1];
             tb.requestLayout();
          }
       }
       return;
    }
}
