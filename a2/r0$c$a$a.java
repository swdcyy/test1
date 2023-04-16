package a2.r0$c$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a2.r0$c$a;
import a2.r0;
import a2.u0;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import a2.r0$c;
import java.util.List;
import java.util.Collections;

public class r0$c$a$a implements ValueAnimator$AnimatorUpdateListener	// class@00009b
{
    public final r0 a;
    public final u0 b;
    public final u0 c;
    public final int d;
    public final View e;
    public final r0$c$a f;

    public void r0$c$a$a(r0$c$a p0,r0 p1,u0 p2,u0 p3,int p4,View p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.e(p0.getAnimatedFraction());
       r0$c.j(this.e, r0$c.n(this.b, this.c, this.a.c(), this.d), Collections.singletonList(this.a));
    }
}
