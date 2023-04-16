package androidx.recyclerview.widget.j$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.recyclerview.widget.j;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;

public class j$d implements ValueAnimator$AnimatorUpdateListener	// class@000917
{
    public final j a;

    public void j$d(j p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       int i = (int)(p0.getAnimatedValue().floatValue() * 0x437f0000);
       this.a.d.setAlpha(i);
       this.a.e.setAlpha(i);
       this.a.r();
    }
}
