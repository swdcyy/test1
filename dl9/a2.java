package dl9.a2;
import android.animation.AnimatorListenerAdapter;
import dl9.u1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class a2 extends AnimatorListenerAdapter	// class@001f47
{
    public final u1 a;

    public void a2(u1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a2.class, "1")) {
          return;
       }
       this.a.t.setVisibility(8);
       return;
    }
}
