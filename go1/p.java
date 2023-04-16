package go1.p;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class p extends AnimatorListenerAdapter	// class@00253e
{
    public final i a;

    public void p(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p ta = this.a;
       ta.q = true;
       ta.r = false;
       ta.w = false;
       ta.s = false;
       ta.D.setVisibility(8);
       return;
    }
}
