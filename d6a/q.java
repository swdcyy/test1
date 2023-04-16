package d6a.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayMarqueeV2TextView;
import java.lang.Object;
import android.widget.TextView;

public final class q implements Runnable	// class@001eab
{
    public final SlidePlayMarqueeV2TextView b;

    public void q(SlidePlayMarqueeV2TextView p0){
       this.b = p0;
    }
    public final void run(){
       q tb = this.b;
       float f = tb.i + tb.d;
       tb.i = f;
       float f1 = (float)SlidePlayMarqueeV2TextView.l + tb.h;
       if (f - f1 > 0) {
          tb.i = f - f1;
       }
       tb.postInvalidate();
       return;
    }
}
