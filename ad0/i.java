package ad0.i;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.util.List;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import ed0.b;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.ViewParent;
import android.view.ViewGroup;
import ad0.i$a;
import java.lang.Runnable;

public final class i implements Animator$AnimatorListener	// class@000068
{
    public final View a;
    public final List b;

    public void i(View p0,List p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       boolean b = true;
       this.a.setEnabled(b);
       i ta = this.a;
       if (!ta instanceof KemPendantV2) {
          ta = null;
       }
       if (ta != null) {
          ta.getMBuilder().q(b);
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          ViewParent parent = view.getParent();
          if (!parent instanceof ViewGroup) {
             parent = null;
          }
          if (parent != null) {
             view.post(new i$a(parent, view));
          }
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
}
