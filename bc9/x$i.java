package bc9.x$i;
import android.view.animation.Animation$AnimationListener;
import bc9.x;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class x$i implements Animation$AnimationListener	// class@000411
{
    public final x b;

    public void x$i(x p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$i.class, "1")) {
          return;
       }
       x w = this.b.w;
       if (w != null) {
          w.setVisibility(0);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
