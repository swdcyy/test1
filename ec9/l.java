package ec9.l;
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
import ac9.h;
import cc9.f;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;

public final class l extends k	// class@002186
{

    public void l(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (uob.f().get(p0.b()) instanceof h) {
             uob.i().put(Integer.valueOf(p0.b()), new f(false));
             this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}
