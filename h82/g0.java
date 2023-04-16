package h82.g0;
import android.animation.AnimatorListenerAdapter;
import h82.k0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g0 extends AnimatorListenerAdapter	// class@002cd1
{
    public final k0 a;

    public void g0(k0 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       g0 ta = this.a;
       ta.u = null;
       ta.k();
       return;
    }
}
