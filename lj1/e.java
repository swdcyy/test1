package lj1.e;
import pj1.b$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import pj1.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class e	// class@002f80
{
    public final b$a a;

    public void e(b$a p0){
       a.p(p0, "chain");
       super();
       this.a = p0;
    }
    public final void a(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "callback");
       this.a.b(p0);
       return;
    }
}
