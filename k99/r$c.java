package k99.r$c;
import java.lang.Runnable;
import k99.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import k99.r$c$a;
import android.animation.Animator$AnimatorListener;

public final class r$c implements Runnable	// class@002b91
{
    public final r b;

    public void r$c(r p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, r$c.class, "1")) {
          return;
       }
       r v = this.b.v;
       if (v != null) {
          a.m(v);
          if (v.isRunning()) {
             return;
          }
       }
       r$c tb = this.b;
       float[] uofloatArray = new float[]{r.W8(this.b).getAlpha(),0};
       tb.v = ObjectAnimator.ofFloat(r.W8(tb), "alpha", uofloatArray);
       v = this.b.v;
       if (v != null) {
          v.setDuration(300);
       }
       v = this.b.v;
       if (v != null) {
          v.addListener(new r$c$a(this));
       }
       v = this.b.v;
       if (v != null) {
          v.start();
       }
       return;
    }
}
