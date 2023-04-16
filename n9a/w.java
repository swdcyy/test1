package n9a.w;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class w implements ValueAnimator$AnimatorUpdateListener	// class@00311e
{
    public final ScaleAnimSeekBar a;

    public void w(ScaleAnimSeekBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       w ta = this.a;
       Objects.requireNonNull(ta);
       ta.N = p0.getAnimatedValue().floatValue();
       ta.invalidate();
    }
}
