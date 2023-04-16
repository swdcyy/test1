package a2.m0$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a2.m0;
import a2.p0;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;

public class m0$b implements ValueAnimator$AnimatorUpdateListener	// class@00008c
{
    public final p0 a;
    public final View b;
    public final m0 c;

    public void m0$b(m0 p0,p0 p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.a(this.b);
    }
}
