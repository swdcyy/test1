package am0.e;
import android.animation.AnimatorListenerAdapter;
import am0.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import am0.a;

public final class e extends AnimatorListenerAdapter	// class@0000d7
{
    public final b a;

    public void e(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       b f = this.a.f;
       if (f != null) {
          f.c3();
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
