package e8a.r$a;
import erd.g;
import e8a.r;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e8a.t;

public final class r$a implements g	// class@0020d2
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.P8(p0.intValue());
       }
       return;
    }
}
