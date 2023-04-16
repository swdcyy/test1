package androidx.recyclerview.widget.m$g$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.recyclerview.widget.m$g;
import java.lang.Object;
import android.animation.ValueAnimator;

public class m$g$a implements ValueAnimator$AnimatorUpdateListener	// class@000926
{
    public final m$g a;

    public void m$g$a(m$g p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.c(p0.getAnimatedFraction());
    }
}
