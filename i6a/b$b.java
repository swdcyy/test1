package i6a.b$b;
import erd.g;
import i6a.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b$b implements g	// class@002789
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.C = p0.booleanValue();
          PatchProxy.onMethodExit(b$b.class, "1");
       }
       return;
    }
}
