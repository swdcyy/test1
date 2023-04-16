package ct2.b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ct2.b$a;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.b9;

public final class b	// class@0023da
{
    public b a;

    public void b(Runnable p0,long p1){
       a.p(p0, "action");
       super();
       this.a = t.timer(p1, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b$a(p0));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b9.a(this.a);
       return;
    }
}
