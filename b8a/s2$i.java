package b8a.s2$i;
import erd.g;
import b8a.s2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s4a.g;

public final class s2$i implements g	// class@0003ee
{
    public final s2 b;

    public void s2$i(s2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s2$i.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             s2.R8(this.b).b0();
          }
          this.b.I = p0.booleanValue();
       }
       return;
    }
}
