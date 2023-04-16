package b27.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@0003ba
{
    public final LoadingCircle a;

    public void d(LoadingCircle p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       ta.n = (float)p0.getAnimatedValue().intValue();
    }
}
