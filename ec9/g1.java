package ec9.g1;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cc9.c;
import sa6.b;
import cc9.q;
import java.util.List;
import java.util.HashMap;

public final class g1 extends k	// class@002176
{
    public final int b;
    public final f1 c;

    public void g1(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
       this.b = 1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "1")) {
       }else {
          a.p(p0, "action");
          this.c.w0(new c(4));
          b uob = this.a().j();
          int i = (p0.b().isEmpty())? -1: p0.c;
          uob.i().clear();
          this.a().h(q.a(uob, null, -1, i, p0.b(), p0.d, false, false, p0.e, 65, null));
       }
       return;
    }
}
