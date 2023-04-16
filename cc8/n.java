package cc8.n;
import android.animation.AnimatorListenerAdapter;
import cc8.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cc8.j;

public class n extends AnimatorListenerAdapter	// class@0003ee
{
    public final o a;

    public void n(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       o d = this.a.d;
       if (d != null) {
          d.onShow();
       }
       return;
    }
}
