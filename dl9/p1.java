package dl9.p1;
import java.lang.Runnable;
import dl9.u1;
import java.lang.Object;
import android.widget.ImageView;
import dl9.x1;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;

public final class p1 implements Runnable	// class@001f92
{
    public final u1 b;

    public void p1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       p1 tb = this.b;
       u1 t = tb.t;
       if (t == null) {
       }else {
          t.setVisibility(0);
          tb.t.a(new x1(tb));
          tb.t.s();
       }
       return;
    }
}
