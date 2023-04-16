package androidx.transition.Transition$c;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

public class Transition$c extends AnimatorListenerAdapter	// class@0009d2
{
    public final Transition a;

    public void Transition$c(Transition p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.p();
       p0.removeListener(this);
    }
}
