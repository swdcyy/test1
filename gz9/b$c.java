package gz9.b$c;
import erd.g;
import gz9.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import q87.c;

public final class b$c implements g	// class@002516
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          a.p(p0, "throwable");
          this.b.c();
          o.C().z("PayCoursePaymentController", " checkPayResult ", p0);
          this.b.e();
       }
       return;
    }
}
