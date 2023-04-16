package n9a.y;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;

public final class y implements ValueAnimator$AnimatorUpdateListener	// class@003120
{
    public final ScaleAnimSeekBar a;

    public void y(ScaleAnimSeekBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       y ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ta.o = ta.d((int)f);
       ta.h(f);
    }
}
