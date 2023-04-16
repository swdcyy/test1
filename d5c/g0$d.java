package d5c.g0$d;
import android.animation.AnimatorListenerAdapter;
import d5c.g0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class g0$d extends AnimatorListenerAdapter	// class@0020f4
{
    public final g0 a;

    public void g0$d(g0 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$d.class, "1")) {
          return;
       }
       this.onAnimationEnd(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$d.class, "2")) {
          return;
       }
       g0 y0 = this.a.Y0;
       if (y0 != null) {
          y0.clearAnimation();
          this.a.Y0.setVisibility(8);
       }
       return;
    }
}
