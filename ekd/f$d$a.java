package ekd.f$d$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ekd.f$d;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.View;

public class f$d$a implements ValueAnimator$AnimatorUpdateListener	// class@000d39
{
    public final int a;
    public final f$d b;

    public void f$d$a(f$d p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.b.b.setTranslationY((p0.getAnimatedValue().floatValue() + (float)this.a));
    }
}
