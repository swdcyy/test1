package c3.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import c3.a;
import c3.a$c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.graphics.drawable.Drawable;

public class a$a implements ValueAnimator$AnimatorUpdateListener	// class@000cc5
{
    public final a$c a;
    public final a b;

    public void a$a(a p0,a$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       float f = p0.getAnimatedValue().floatValue();
       this.b.q(f, this.a);
       this.b.e(f, this.a, false);
       this.b.invalidateSelf();
    }
}
