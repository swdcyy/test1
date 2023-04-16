package a2.r0$c$a$b;
import android.animation.AnimatorListenerAdapter;
import a2.r0$c$a;
import a2.r0;
import android.view.View;
import android.animation.Animator;
import a2.r0$c;

public class r0$c$a$b extends AnimatorListenerAdapter	// class@00009c
{
    public final r0 a;
    public final View b;
    public final r0$c$a c;

    public void r0$c$a$b(r0$c$a p0,r0 p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.e(0x3f800000);
       r0$c.h(this.b, this.a);
    }
}
