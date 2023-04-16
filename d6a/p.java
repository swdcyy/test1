package d6a.p;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayMarqueeTextView;
import java.lang.Object;
import android.widget.TextView;

public final class p implements Runnable	// class@001eaa
{
    public final SlidePlayMarqueeTextView b;

    public void p(SlidePlayMarqueeTextView p0){
       this.b = p0;
    }
    public final void run(){
       p tb = this.b;
       float f = tb.i + tb.b;
       tb.i = f;
       float f1 = (float)SlidePlayMarqueeTextView.l + tb.h;
       if (f - f1 > 0) {
          tb.i = f - f1;
       }
       tb.postInvalidate();
       return;
    }
}
