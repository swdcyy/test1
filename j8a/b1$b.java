package j8a.b1$b;
import ekd.f$j;
import j8a.b1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import j8a.d1;
import kotlin.jvm.internal.a;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;

public final class b1$b extends f$j	// class@002940
{
    public final b1 a;

    public void b1$b(b1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1$b.class, "2")) {
          return;
       }
       View view = this.a.P();
       a.m(view);
       view.animate().setListener(null);
       this.a.V();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1$b.class, "1")) {
          return;
       }
       this.a.V();
       View view = this.a.P();
       a.m(view);
       view.animate().setListener(null);
       return;
    }
}
