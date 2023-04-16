package apb.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import apb.m;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@0002a6
{
    public final m a;

    public void d(m p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       ta.Y8(p0.getAnimatedValue().floatValue());
    }
}
