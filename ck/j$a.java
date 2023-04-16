package ck.j$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ck.j;
import android.widget.TextView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public class j$a implements ValueAnimator$AnimatorUpdateListener	// class@000d2c
{
    public final TextView a;
    public final j b;

    public void j$a(j p0,TextView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       float f = p0.getAnimatedValue().floatValue();
       this.a.setScaleX(f);
       this.a.setScaleY(f);
    }
}
