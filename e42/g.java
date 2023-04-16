package e42.g;
import java.lang.Runnable;
import android.animation.ValueAnimator;
import java.lang.Object;
import android.animation.Animator;
import z12.x;

public final class g implements Runnable	// class@002619
{
    public final ValueAnimator b;

    public void g(ValueAnimator p0){
       this.b = p0;
    }
    public final void run(){
       x.I(this.b);
    }
}
