package k99.r$c$a;
import android.animation.AnimatorListenerAdapter;
import k99.r$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k99.r;
import android.widget.TextView;

public final class r$c$a extends AnimatorListenerAdapter	// class@002b90
{
    public final r$c a;

    public void r$c$a(r$c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$c$a.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       this.a.b.X8();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$c$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       r.W8(this.a.b).setVisibility(0);
       return;
    }
}
