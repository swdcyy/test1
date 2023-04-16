package b5a.p;
import android.animation.AnimatorListenerAdapter;
import b5a.q;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class p extends AnimatorListenerAdapter	// class@000375
{
    public final q a;

    public void p(q p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       if (!this.a.h.getVisibility()) {
          this.a.h.setVisibility(8);
       }
       return;
    }
}
