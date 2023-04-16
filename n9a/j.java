package n9a.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.view.LikeView;
import java.lang.Object;
import com.airbnb.lottie.LottieAnimationView;

public final class j implements Runnable	// class@003111
{
    public final LikeView b;

    public void j(LikeView p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       if (!tb.c.p()) {
          tb.c.s();
       }
       return;
    }
}
