package b56.x;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feed.player.ui.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class x extends AnimatorListenerAdapter	// class@000417
{
    public final e a;

    public void x(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       this.a.b();
       return;
    }
}
