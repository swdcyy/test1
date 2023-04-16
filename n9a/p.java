package n9a.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class p implements ValueAnimator$AnimatorUpdateListener	// class@003117
{
    public final NasaFeaturedSeekBar a;

    public void p(NasaFeaturedSeekBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       p ta = this.a;
       Objects.requireNonNull(ta);
       ta.i(p0.getAnimatedValue().floatValue());
       ta.invalidate();
    }
}
