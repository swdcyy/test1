package djc.j0;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public final class j0 implements Animator$AnimatorListener	// class@0021fe
{
    public final ForwardGridSectionFragment a;
    public final View b;

    public void j0(ForwardGridSectionFragment p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       this.b.setTranslationY(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       this.b.setTranslationY(0);
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "4")) {
          return;
       }
       a.p(p0, "animation");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       j0 ta = this.a;
       ta.Y = true;
       if (ta.isVisible() && this.a.ci()) {
          Iterator iterator = this.a.Th().iterator();
          while (iterator.hasNext()) {
             iterator.next().start();
          }
       }
       return;
    }
}
