package dl9.w1;
import android.animation.AnimatorListenerAdapter;
import dl9.u1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class w1 extends AnimatorListenerAdapter	// class@001fbf
{
    public final u1 a;

    public void w1(u1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w1.class, "2")) {
          return;
       }
       this.a.t.setVisibility(8);
       this.a.s.setVisibility(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w1.class, "1")) {
          return;
       }
       this.a.t.setVisibility(8);
       this.a.s.setVisibility(0);
       return;
    }
}
