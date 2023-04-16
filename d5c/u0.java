package d5c.u0;
import qh7.b;
import d5c.v0$a;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import d5c.v0;

public final class u0 implements b	// class@002111
{
    public final v0$a a;

    public void u0(v0$a p0){
       this.a = p0;
       super();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, u0.class, "1")) {
          return;
       }
       a.p(p0, "result");
       if (p0.a == 200) {
          this.a.b.P8();
       }
       PatchProxy.onMethodExit(u0.class, "1");
       return;
    }
}
