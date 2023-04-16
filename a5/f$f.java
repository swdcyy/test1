package a5.f$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a5.f;
import java.lang.Object;
import android.animation.ValueAnimator;
import m5.c;
import com.airbnb.lottie.ex.model.layer.b;

public class f$f implements ValueAnimator$AnimatorUpdateListener	// class@0000db
{
    public final f a;

    public void f$f(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       f$f ta = this.a;
       f o = ta.o;
       if (o != null) {
          o.s(ta.d.d());
       }
       return;
    }
}
