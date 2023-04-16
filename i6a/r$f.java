package i6a.r$f;
import erd.g;
import i6a.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class r$f implements g	// class@0027b1
{
    public final r b;

    public void r$f(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.V8();
          }
          PatchProxy.onMethodExit(r$f.class, "1");
       }
       return;
    }
}
