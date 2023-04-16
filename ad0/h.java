package ad0.h;
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
import ad0.h$a;
import java.lang.Runnable;

public final class h implements Animator$AnimatorListener	// class@000066
{
    public final View a;
    public final List b;

    public void h(View p0,List p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       boolean b = true;
       this.a.setEnabled(b);
       h ta = this.a;
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
             view.post(new h$a(parent, view));
          }
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
}
