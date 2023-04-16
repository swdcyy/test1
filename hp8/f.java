package hp8.f;
import java.lang.Runnable;
import com.tachikoma.core.component.text.MarqueeTextView;
import java.lang.Object;
import android.widget.TextView;

public final class f implements Runnable	// class@0025cd
{
    public final MarqueeTextView b;

    public void f(MarqueeTextView p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       if (tb.i != null) {
       }else {
          float f = tb.g + tb.b;
          tb.g = f;
          float f1 = (float)MarqueeTextView.k + tb.f;
          if (f - f1 > 0) {
             tb.g = f - f1;
          }
          tb.postInvalidate();
       }
       return;
    }
}
