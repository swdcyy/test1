package d5a.u;
import androidx.lifecycle.ViewModel;
import d5a.u$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import d5a.v;
import j1b.e;
import java.lang.Runnable;
import t45.c;

public final class u extends ViewModel	// class@001e91
{
    public final List a;
    public e b;
    public boolean c;
    public static final u$a d;

    static {
       u.d = new u$a(null);
    }
    public void u(){
       super();
       this.a = new ArrayList();
    }
    public void onCleared(){
       u ou = u.class;
       if (PatchProxy.applyVoid(null, this, ou, "6")) {
          return;
       }
       super.onCleared();
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("WindowOrientationManager", "onCleared", objArray);
       u tb = this.b;
       if (tb != null && !PatchProxy.applyVoidOneRefs(tb, this, ou, "3")) {
          Object[] objArray1 = new Object[i];
          o.C().w("WindowOrientationManager", "disableWindowOrientationListener", objArray1);
          this.c = true;
          c.a(new v(tb));
       }
       this.b = null;
       return;
    }
}
