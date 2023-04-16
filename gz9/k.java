package gz9.k;
import sfc.a;
import gz9.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class k extends a	// class@002520
{
    public final b c;

    public void k(b p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       this.c.c();
       return;
    }
}
