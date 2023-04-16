package dl9.z1;
import android.animation.AnimatorListenerAdapter;
import dl9.u1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class z1 extends AnimatorListenerAdapter	// class@001fc8
{
    public final u1 a;

    public void z1(u1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z1.class, "1")) {
          return;
       }
       this.onAnimationEnd(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z1.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       z1 ta = this.a;
       ta.M = null;
       ta.s.setScaleX(0x3f800000);
       this.a.s.setScaleY(0x3f800000);
       this.a.s.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z1.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.s.setVisibility(0);
       this.a.s.setAlpha(0);
       return;
    }
}
