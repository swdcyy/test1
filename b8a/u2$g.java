package b8a.u2$g;
import erd.g;
import b8a.u2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s4a.g;

public final class u2$g implements g	// class@000405
{
    public final u2 b;

    public void u2$g(u2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u2$g.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b.z;
             if (p0 != null) {
                p0.b0();
             }
          }
       }
       return;
    }
}
