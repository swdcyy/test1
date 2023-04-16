package n9a.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.view.LikeView;
import java.lang.Object;
import android.widget.FrameLayout;

public final class k implements Runnable	// class@003112
{
    public final LikeView b;
    public final Runnable c;

    public void k(LikeView p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.post(this.c);
    }
}
