package androidx.transition.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorPauseListener;

public class a	// class@0009e1
{

    public static void a(Animator p0,AnimatorListenerAdapter p1){
       p0.addPauseListener(p1);
    }
    public static void b(Animator p0){
       p0.pause();
    }
    public static void c(Animator p0){
       p0.resume();
    }
}
