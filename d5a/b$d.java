package d5a.b$d;
import erd.g;
import d5a.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b$d implements g	// class@001e7a
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.E = p0.booleanValue();
       }
       return;
    }
}
