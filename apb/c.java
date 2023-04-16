package apb.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import apb.m;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@0002a5
{
    public final m a;

    public void c(m p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       ta.Y8(p0.getAnimatedValue().floatValue());
    }
}
