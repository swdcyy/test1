package aua.n$b;
import android.animation.AnimatorListenerAdapter;
import aua.n;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class n$b extends AnimatorListenerAdapter	// class@000318
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       n$b ta = this.a;
       if (ta.L != null) {
          return;
       }
       if (ta.K != null) {
          k1.o(ta.O);
       }
       return;
    }
}
