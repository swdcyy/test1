package a2.m0$a;
import android.animation.AnimatorListenerAdapter;
import a2.m0;
import a2.n0;
import android.view.View;
import android.animation.Animator;

public class m0$a extends AnimatorListenerAdapter	// class@00008b
{
    public final n0 a;
    public final View b;
    public final m0 c;

    public void m0$a(m0 p0,n0 p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.a.c(this.b);
    }
    public void onAnimationEnd(Animator p0){
       this.a.a(this.b);
    }
    public void onAnimationStart(Animator p0){
       this.a.b(this.b);
    }
}
