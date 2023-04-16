package apb.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.List;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Iterator;
import android.view.View;
import java.lang.Float;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@0002a7
{
    public final List a;

    public void e(List p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().setAlpha(p0.getAnimatedValue().floatValue());
       }
       return;
    }
}
