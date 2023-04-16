package b27.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.CleanUpView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public class a implements ValueAnimator$AnimatorUpdateListener	// class@0003b7
{
    public final CleanUpView a;

    public void a(CleanUpView p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.setSweepAngle(p0.getAnimatedValue().intValue());
    }
}
