package fg9.d;
import android.animation.AnimatorListenerAdapter;
import fg9.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class d extends AnimatorListenerAdapter	// class@002315
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       c q = this.a.q;
       if (q != null) {
          q.setClickable(true);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       c q = this.a.q;
       if (q != null) {
          q.setClickable(true);
       }
       return;
    }
    public void onAnimationPause(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       c q = this.a.q;
       if (q != null) {
          q.setClickable(true);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       c q = this.a.q;
       if (q != null) {
          q.setClickable(false);
       }
       return;
    }
}
