package j8a.e1;
import android.animation.AnimatorListenerAdapter;
import j8a.d1;
import w4.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class e1 extends AnimatorListenerAdapter	// class@00294d
{
    public final d1 a;
    public final e b;

    public void e1(d1 p0,e p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e1.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.a.h();
       PatchProxy.onMethodExit(e1.class, "1");
       return;
    }
}
