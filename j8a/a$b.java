package j8a.a$b;
import ekd.f$j;
import j8a.a;
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

public final class a$b extends f$j	// class@00293a
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       View view = this.a.P();
       a.m(view);
       view.animate().setListener(null);
       this.a.V();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.a.V();
       View view = this.a.P();
       a.m(view);
       view.animate().setListener(null);
       return;
    }
}
