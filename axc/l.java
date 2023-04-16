package axc.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.MarqueeTextView;
import java.lang.Object;

public final class l implements Runnable	// class@0002ee
{
    public final MarqueeTextView b;

    public void l(MarqueeTextView p0){
       this.b = p0;
    }
    public final void run(){
       MarqueeTextView.p(this.b);
    }
}
