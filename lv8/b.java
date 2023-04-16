package lv8.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@002daa
{
    public final View a;
    public final int b;

    public void b(View p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationY((p0.getAnimatedValue().floatValue() + (float)this.b));
    }
}
