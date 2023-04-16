package im1.g;
import android.animation.AnimatorListenerAdapter;
import im1.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import s81.a;

public class g extends AnimatorListenerAdapter	// class@002950
{
    public final e a;

    public void g(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       g ta = this.a;
       if (ta.Q == 2) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, e.class, "32")) {
             a.N((ta.V8() + 1));
          }
          this.a.Y8();
       }
       this.a.c9();
       return;
    }
}
