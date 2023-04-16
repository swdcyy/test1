package jk9.e;
import android.animation.Animator$AnimatorListener;
import jk9.c;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class e implements Animator$AnimatorListener	// class@002afc
{
    public final c a;

    public void e(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(e.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       p0.a = null;
       PatchProxy.onMethodExit(e.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(e.class, "4");
       return;
    }
}
