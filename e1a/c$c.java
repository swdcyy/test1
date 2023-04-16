package e1a.c$c;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$c extends AnimatorListenerAdapter	// class@002043
{
    public final ViewGroup a;

    public void c$c(ViewGroup p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$c.class, "1")) {
          return;
       }
       this.a.setAlpha(0);
       PatchProxy.onMethodExit(c$c.class, "1");
       return;
    }
}
