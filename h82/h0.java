package h82.h0;
import android.animation.AnimatorListenerAdapter;
import h82.k0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h0 extends AnimatorListenerAdapter	// class@002cd3
{
    public final k0 a;

    public void h0(k0 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
          return;
       }
       this.a.j();
       p0.s = null;
       return;
    }
}
