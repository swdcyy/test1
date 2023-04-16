package ad0.j;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import ed0.b;

public final class j implements Animator$AnimatorListener	// class@000069
{
    public final View a;

    public void j(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       this.a.setEnabled(false);
       j ta = this.a;
       if (!ta instanceof KemPendantV2) {
          ta = null;
       }
       if (ta != null) {
          ta.getMBuilder().q(false);
       }
       return;
    }
}
