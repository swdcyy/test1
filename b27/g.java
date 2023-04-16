package b27.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;

public final class g implements ValueAnimator$AnimatorUpdateListener	// class@0003bd
{
    public final LoadingCircle a;

    public void g(LoadingCircle p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       g ta = this.a;
       Objects.requireNonNull(ta);
       ta.t = p0.getAnimatedValue().intValue();
    }
}
