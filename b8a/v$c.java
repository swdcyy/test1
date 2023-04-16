package b8a.v$c;
import erd.g;
import b8a.v;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class v$c implements g	// class@00040b
{
    public final v b;

    public void v$c(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.P8(p0.booleanValue(), "MorePanel");
       }
       return;
    }
}
