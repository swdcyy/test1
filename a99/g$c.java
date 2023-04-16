package a99.g$c;
import android.animation.AnimatorListenerAdapter;
import a99.g;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class g$c extends AnimatorListenerAdapter	// class@000062
{
    public final g a;

    public void g$c(g p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c.class, "1")) {
          return;
       }
       this.a.r.setVisibility(0);
       p0.F = true;
       return;
    }
}
