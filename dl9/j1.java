package dl9.j1;
import java.lang.Runnable;
import dl9.u1;
import java.lang.Object;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import dl9.y1;
import android.animation.Animator$AnimatorListener;

public final class j1 implements Runnable	// class@001f6f
{
    public final u1 b;
    public final boolean c;

    public void j1(u1 p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j1 tb = this.b;
       j1 tc = this.c;
       tb.s.setVisibility(4);
       if (tc != null) {
          tb.t.setSpeed(0x3f99999a);
       }
       tb.t.setVisibility(0);
       tb.t.a(new y1(tb, tc));
       tb.t.s();
       return;
    }
}
