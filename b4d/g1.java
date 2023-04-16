package b4d.g1;
import android.animation.Animator$AnimatorListener;
import b4d.f1;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d4d.a;
import com.yxcorp.plugin.emotion.append.AppendedWidget;

public final class g1 implements Animator$AnimatorListener	// class@00036e
{
    public final f1 a;

    public void g1(f1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g1.class, "2")) {
          return;
       }
       a.g.f(this.a.w);
       PatchProxy.onMethodExit(g1.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g1.class, "1")) {
          return;
       }
       a.g.f(this.a.w);
       PatchProxy.onMethodExit(g1.class, "1");
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
