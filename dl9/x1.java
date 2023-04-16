package dl9.x1;
import android.animation.AnimatorListenerAdapter;
import dl9.u1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class x1 extends AnimatorListenerAdapter	// class@001fc2
{
    public final u1 a;

    public void x1(u1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x1.class, "1")) {
          return;
       }
       this.a.t.setVisibility(8);
       return;
    }
}
