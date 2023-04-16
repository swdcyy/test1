package ec9.t0;
import erd.g;
import ec9.v0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.util.List;

public final class t0 implements g	// class@002198
{
    public final v0 b;

    public void t0(v0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "1")) {
       }else {
          b uob = this.b.a().j();
          this.b.a().h(q.a(uob, null, 0, 0, null, false, false, uob.j(), false, 191, null));
       }
       return;
    }
}
