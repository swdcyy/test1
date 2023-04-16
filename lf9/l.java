package lf9.l;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import lf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lf9.e;
import java.util.Objects;
import lf9.e$a;
import lf9.a;

public final class l extends b	// class@002dd8
{
    public final q b;

    public void l(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          a.p(p0, "action");
          e$a c = e.c;
          l tb = this.b;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(tb, c, e$a.class, "2")) {
             a.p(tb, "viewModel");
             e uoe = tb.t0().b(7);
             if (uoe != null) {
                uoe.d();
             }
          }
       }
       return;
    }
}
