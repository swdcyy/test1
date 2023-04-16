package bc9.x$h;
import android.view.animation.Animation$AnimationListener;
import bc9.x;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class x$h implements Animation$AnimationListener	// class@000410
{
    public final x b;

    public void x$h(x p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$h.class, "1")) {
          return;
       }
       x w = this.b.w;
       if (w != null) {
          w.setVisibility(4);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
