package b27.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;

public final class f implements ValueAnimator$AnimatorUpdateListener	// class@0003bc
{
    public final LoadingCircle a;

    public void f(LoadingCircle p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       ta.q = (float)p0.getAnimatedValue().intValue();
    }
}
