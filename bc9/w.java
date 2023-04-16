package bc9.w;
import android.view.animation.Animation$AnimationListener;
import bc9.l;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class w implements Animation$AnimationListener	// class@000408
{
    public final l b;

    public void w(l p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       w tb = this.b;
       if (tb.x != null) {
          l z = tb.z;
          if (z != null) {
             z.startAnimation(tb.I);
          }
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
