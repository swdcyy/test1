package ec9.r;
import ec9.k;
import ec9.b1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.List;
import ac9.g;
import ac9.l;
import cc9.r;
import nsd.u;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;

public final class r extends k	// class@002195
{

    public void r(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (uob.f().get(p0.b()) instanceof l) {
             uob.i().put(Integer.valueOf(p0.b()), new r(false, false, 1, null));
             this.a().h(q.a(uob, null, 0, false, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}
