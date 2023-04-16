package apb.n;
import android.animation.AnimatorListenerAdapter;
import apb.m;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class n extends AnimatorListenerAdapter	// class@0002b4
{
    public final m a;

    public void n(m p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       n ta = this.a;
       if (ta.J != null) {
          m g = ta.G;
          if (g != null && (g.getVisibility() || !this.a.G.getAlpha())) {
             this.a.G.setVisibility(0);
          }
       }
       return;
    }
}
