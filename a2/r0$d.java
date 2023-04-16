package a2.r0$d;
import a2.r0$e;
import android.view.animation.Interpolator;
import android.view.WindowInsetsAnimation;
import a2.r0$a;
import android.view.WindowInsetsAnimation$Bounds;
import p1.b;
import android.graphics.Insets;
import android.view.View;
import a2.r0$b;
import a2.r0$d$a;
import android.view.WindowInsetsAnimation$Callback;

public class r0$d extends r0$e	// class@0000a1
{
    public final WindowInsetsAnimation f;

    public void r0$d(int p0,Interpolator p1,long p2){
       super(new WindowInsetsAnimation(p0, p1, p2));
    }
    public void r0$d(WindowInsetsAnimation p0){
       super(0, null, 0);
       this.f = p0;
    }
    public static WindowInsetsAnimation$Bounds e(r0$a p0){
       return new WindowInsetsAnimation$Bounds(p0.a().e(), p0.b().e());
    }
    public static b f(WindowInsetsAnimation$Bounds p0){
       return b.d(p0.getUpperBound());
    }
    public static b g(WindowInsetsAnimation$Bounds p0){
       return b.d(p0.getLowerBound());
    }
    public static void h(View p0,r0$b p1){
       r0$d$a uod$a = (p1 != null)? new r0$d$a(p1): null;
       p0.setWindowInsetsAnimationCallback(uod$a);
       return;
    }
    public long a(){
       return this.f.getDurationMillis();
    }
    public float b(){
       return this.f.getFraction();
    }
    public float c(){
       return this.f.getInterpolatedFraction();
    }
    public void d(float p0){
       this.f.setFraction(p0);
    }
}
