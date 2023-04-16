package i6a.p$a;
import android.animation.AnimatorListenerAdapter;
import i6a.p;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i6a.o;
import android.widget.TextView;

public final class p$a extends AnimatorListenerAdapter	// class@0027a7
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p$a.class, "2")) {
          return;
       }
       o.W8(this.a.a).setClickable(true);
       PatchProxy.onMethodExit(p$a.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p$a.class, "1")) {
          return;
       }
       o.W8(this.a.a).setClickable(true);
       PatchProxy.onMethodExit(p$a.class, "1");
       return;
    }
}
