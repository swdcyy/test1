package ab0.r$b;
import erd.g;
import ab0.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fb0.e;

public final class r$b implements g	// class@00004a
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$b.class, "1")) {
       }else {
          a.o(p0, "enable");
          if (p0.booleanValue()) {
             this.b.P8();
          }else {
             this.b.R8();
             e.d((this.b.u ^ 0x01));
          }
       }
       return;
    }
}
