package apb.m$d;
import android.animation.AnimatorListenerAdapter;
import apb.m;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.specific.misc.SpectrumView;

public class m$d extends AnimatorListenerAdapter	// class@0002b2
{
    public final boolean a;
    public final m b;

    public void m$d(m p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.b.w.b();
       }
       return;
    }
}
