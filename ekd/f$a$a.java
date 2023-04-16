package ekd.f$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ekd.f$a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.View;

public class f$a$a implements ValueAnimator$AnimatorUpdateListener	// class@000d35
{
    public final f$a a;

    public void f$a$a(f$a p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.b.setTranslationY(p0.getAnimatedValue().floatValue());
    }
}
