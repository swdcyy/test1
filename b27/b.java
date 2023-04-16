package b27.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.CleanUpView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public class b implements ValueAnimator$AnimatorUpdateListener	// class@0003b8
{
    public final CleanUpView a;

    public void b(CleanUpView p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.setDrawingPathLength(p0.getAnimatedValue().floatValue());
    }
}
