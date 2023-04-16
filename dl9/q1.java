package dl9.q1;
import java.lang.Runnable;
import dl9.u1;
import java.lang.Object;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import dl9.a2;
import android.animation.Animator$AnimatorListener;

public final class q1 implements Runnable	// class@001f96
{
    public final u1 b;

    public void q1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       q1 tb = this.b;
       tb.t.setSpeed(0x3f99999a);
       tb.t.setVisibility(0);
       tb.t.a(new a2(tb));
       tb.t.s();
    }
}
