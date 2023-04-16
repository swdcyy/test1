package jk.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.a;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@00241d
{
    public final a a;

    public void b(a p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a.b(this.a, p0);
    }
}
