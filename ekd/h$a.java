package ekd.h$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ekd.h;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.View;

public class h$a implements ValueAnimator$AnimatorUpdateListener	// class@000d4c
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.b.setTranslationY(p0.getAnimatedValue().floatValue());
    }
}
