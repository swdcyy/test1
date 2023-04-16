package b4d.o0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class o0 implements ValueAnimator$AnimatorUpdateListener	// class@000383
{
    public final Drawable a;

    public void o0(Drawable p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       o0 ta = this.a;
       if (ta != null) {
          ta.setVisible(true, false);
       }
       return;
    }
}
