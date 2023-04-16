package ngd.b$b;
import erd.g;
import ngd.b;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b$b implements g	// class@001e32
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.q = p0.floatValue();
       }
       return;
    }
}
