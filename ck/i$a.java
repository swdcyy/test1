package ck.i$a;
import android.animation.AnimatorListenerAdapter;
import ck.i;
import android.animation.Animator;

public class i$a extends AnimatorListenerAdapter	// class@000d29
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       i$a ta = this.a;
       if (ta.c == p0) {
          ta.c = null;
       }
       return;
    }
}
