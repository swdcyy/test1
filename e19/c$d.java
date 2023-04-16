package e19.c$d;
import android.animation.AnimatorListenerAdapter;
import e19.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$d extends AnimatorListenerAdapter	// class@002120
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.S8();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.S8();
       return;
    }
}
