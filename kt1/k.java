package kt1.k;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k extends AnimatorListenerAdapter	// class@002dfe
{
    public final a a;
    public final a b;

    public void k(a p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.a.V2(4, this.b);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.a.V2(4, this.b);
       return;
    }
}
