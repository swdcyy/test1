package k11.g;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.b;
import java.lang.Object;
import android.widget.ProgressBar;
import ekd.y0;
import k11.a;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;

public final class g implements Runnable	// class@002c62
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       int progress = tb.d.getProgress();
       if (progress <= 0) {
          tb.e.e();
          tb.b.c(3, 0);
       }else {
          tb.d.setProgress((progress - 1));
       }
       return;
    }
}
