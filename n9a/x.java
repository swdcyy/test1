package n9a.x;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class x implements ValueAnimator$AnimatorUpdateListener	// class@00311f
{
    public final ScaleAnimSeekBar a;

    public void x(ScaleAnimSeekBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       x ta = this.a;
       Objects.requireNonNull(ta);
       ta.P = p0.getAnimatedValue().floatValue();
       ta.invalidate();
    }
}
