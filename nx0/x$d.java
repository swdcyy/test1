package nx0.x$d;
import androidx.lifecycle.Observer;
import nx0.x;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zh3.c;
import yh3.a;
import qrd.l1;

public final class x$d implements Observer	// class@003406
{
    public final x b;

    public void x$d(x p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$d.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.s0(p0.u0()).q(l1.a);
             p0.a = null;
          }
       }
       return;
    }
}
