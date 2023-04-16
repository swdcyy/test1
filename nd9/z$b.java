package nd9.z$b;
import erd.g;
import nd9.z;
import java.lang.Object;
import vf9.f0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j8c.a;
import q87.c;
import nd9.a0;
import java.lang.Runnable;
import android.view.View;

public final class z$b implements g	// class@003164
{
    public final z b;

    public void z$b(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$b.class, "1")) {
       }else {
          a.p(p0, "event");
          z$b tb = this.b;
          Object[] objArray = new Object[0];
          a.D().w(tb.o, "music apply event", objArray);
          z r = tb.r;
          if (r != null) {
             r.post(new a0(tb, p0));
          }
       }
       return;
    }
}
