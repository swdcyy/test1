package gh9.f$f;
import erd.g;
import gh9.f;
import java.lang.Object;
import gh9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;

public final class f$f implements g	// class@002499
{
    public final f b;

    public void f$f(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$f.class, "1")) {
       }else {
          a.p(p0, "event");
          f$f tb = this.b;
          p0 = p0.a;
          Objects.requireNonNull(tb);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tb, uof, "4")) {
             if (p0 != null) {
                tb.k2(false, false);
                tb.s = true;
             }else {
                tb.s = false;
             }
          }
       }
       return;
    }
}
