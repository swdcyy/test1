package n9a.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class o implements ValueAnimator$AnimatorUpdateListener	// class@003116
{
    public final NasaFeaturedSeekBar a;

    public void o(NasaFeaturedSeekBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       o ta = this.a;
       Objects.requireNonNull(ta);
       ta.i(p0.getAnimatedValue().floatValue());
       ta.invalidate();
    }
}
