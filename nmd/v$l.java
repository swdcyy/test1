package nmd.v$l;
import android.animation.Animator$AnimatorListener;
import nmd.v;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class v$l implements Animator$AnimatorListener	// class@001e84
{
    public final v a;
    public final float b;
    public final boolean c;

    public void v$l(v p0,float p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v$l.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       this.a.h(this.c);
       PatchProxy.onMethodExit(v$l.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v$l.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       this.a.h(this.c);
       PatchProxy.onMethodExit(v$l.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v$l.class, "4")) {
          return;
       }
       a.p(p0, "animation");
       this.a.h(this.c);
       PatchProxy.onMethodExit(v$l.class, "4");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v$l.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       PatchProxy.onMethodExit(v$l.class, "1");
       return;
    }
}
