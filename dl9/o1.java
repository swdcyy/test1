package dl9.o1;
import java.lang.Runnable;
import dl9.u1;
import java.lang.Object;
import android.widget.ImageView;
import dl9.w1;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;

public final class o1 implements Runnable	// class@001f8c
{
    public final u1 b;

    public void o1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       o1 tb = this.b;
       u1 s = tb.s;
       if (s != null && tb.t != null) {
          s.setVisibility(4);
          tb.t.setVisibility(0);
          tb.t.a(new w1(tb));
          tb.t.s();
       }
       return;
    }
}
