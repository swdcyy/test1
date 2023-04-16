package nf0.c$c;
import nyc.e;
import nf0.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c$c implements e	// class@003300
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       a.p(p0, "state");
       if (a.g(p0, "yoda_init_end")) {
          c$c tb = this.b;
          tb.s = true;
          if (tb.t != null) {
             tb.P8();
          }
       }else {
          a.g(p0, "yoda_init_start");
       }
       return;
    }
}
