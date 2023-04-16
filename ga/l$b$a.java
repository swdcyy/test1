package ga.l$b$a;
import android.animation.AnimatorListenerAdapter;
import ga.l$b;
import android.animation.Animator;
import ga.l;

public class l$b$a extends AnimatorListenerAdapter	// class@00206f
{
    public final l$b a;

    public void l$b$a(l$b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.b.b();
    }
}
