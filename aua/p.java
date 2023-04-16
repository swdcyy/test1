package aua.p;
import android.animation.AnimatorListenerAdapter;
import aua.n;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class p extends AnimatorListenerAdapter	// class@00031b
{
    public final n a;

    public void p(n p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p ta = this.a;
       if (ta.L != null) {
          return;
       }
       if (ta.K != null) {
          k1.o(ta.P);
       }
       return;
    }
}
