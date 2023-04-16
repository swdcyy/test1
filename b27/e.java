package b27.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@0003bb
{
    public final LoadingCircle a;

    public void e(LoadingCircle p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       ta.p = p0.getAnimatedValue().intValue();
    }
}
