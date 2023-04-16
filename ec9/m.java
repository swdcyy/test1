package ec9.m;
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
import ac9.i;
import java.util.HashMap;

public final class m extends k	// class@002189
{

    public void m(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (uob.f().get(p0.b()) instanceof i) {
             this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}
