package fia.a0;
import android.animation.AnimatorListenerAdapter;
import fia.z;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bia.d;

public final class a0 extends AnimatorListenerAdapter	// class@0028ed
{
    public final z a;

    public void a0(z p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a0.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       z.R8(this.a).d(false);
       this.a.Z8();
       PatchProxy.onMethodExit(a0.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a0.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       z.R8(this.a).d(true);
       PatchProxy.onMethodExit(a0.class, "1");
       return;
    }
}
