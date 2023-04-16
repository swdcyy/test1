package bra.i$b$a;
import android.animation.AnimatorListenerAdapter;
import bra.i$b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i$b$a extends AnimatorListenerAdapter	// class@000435
{
    public final i$b a;

    public void i$b$a(i$b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$b$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.a();
       PatchProxy.onMethodExit(i$b$a.class, "1");
       return;
    }
}
