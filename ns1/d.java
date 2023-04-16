package ns1.d;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;

public final class d	// class@0033b3
{
    public Animator a;
    public final LifecycleOwner b;

    public void d(LifecycleOwner p0){
       a.p(p0, "lifecycleOwner");
       super();
       this.b = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d ta = this.a;
       if (ta != null && ta.isRunning()) {
          ta.cancel();
       }
       return;
    }
}
