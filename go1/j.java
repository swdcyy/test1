package go1.j;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ProgressBar;

public class j extends AnimatorListenerAdapter	// class@002538
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.C.setVisibility(8);
       return;
    }
}
