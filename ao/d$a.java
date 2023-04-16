package ao.d$a;
import nyc.e;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import brd.g;

public final class d$a implements e	// class@000208
{
    public final v b;

    public void d$a(v p0){
       this.b = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "state");
       if (a.g(p0, "yoda_init_end")) {
          this.b.onNext(Boolean.TRUE);
          this.b.onComplete();
       }
       return;
    }
}
