package ec9.a1;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ec9.z;
import java.util.Objects;
import ec9.z$a;
import ec9.a;
import ec9.e0;
import ec9.e0$a;
import ec9.w;
import ec9.w$a;

public final class a1 extends k	// class@002163
{
    public final f1 b;

    public void a1(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "1")) {
       }else {
          a.p(p0, "action");
          z$a d = z.d;
          a1 tb = this.b;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(tb, d, z$a.class, "2")) {
             a.p(tb, "viewModel");
             z oz = tb.t0().b(13);
             if (oz != null) {
                oz.d();
             }
          }
          e0$a d1 = e0.d;
          tb = this.b;
          Objects.requireNonNull(d1);
          if (!PatchProxy.applyVoidOneRefs(tb, d1, e0$a.class, "2")) {
             a.p(tb, "viewModel");
             e0 uoe0 = tb.t0().b(22);
             if (uoe0 != null) {
                uoe0.d();
             }
          }
          w$a d2 = w.d;
          tb = this.b;
          Objects.requireNonNull(d2);
          if (!PatchProxy.applyVoidOneRefs(tb, d2, w$a.class, "2")) {
             a.p(tb, "viewModel");
             w ow = tb.t0().b(31);
             if (ow != null) {
                ow.d();
             }
          }
       }
       return;
    }
}
