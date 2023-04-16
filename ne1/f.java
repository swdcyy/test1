package ne1.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.comments.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

public final class f implements ValueAnimator$AnimatorUpdateListener	// class@0032ed
{
    public final a a;
    public final float b;
    public final float c;

    public void f(a p0,float p1,float p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       f ta = this.a;
       f tb = this.b;
       if (tb - this.c > 0) {
          ta.b.setAlpha((tb - p0.getAnimatedFraction()));
       }else {
          ta.b.setAlpha(p0.getAnimatedFraction());
       }
       return;
    }
}
