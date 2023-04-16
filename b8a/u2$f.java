package b8a.u2$f;
import erd.g;
import b8a.u2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s4a.g;

public final class u2$f implements g	// class@000404
{
    public final u2 b;

    public void u2$f(u2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u2$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             u2 z = this.b.z;
             if (z != null) {
                z.b0();
             }
          }
          this.b.B = p0.booleanValue();
       }
       return;
    }
}
