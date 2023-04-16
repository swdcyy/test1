package bc9.b0$c;
import cc9.i;
import bc9.b0;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b0$c implements i	// class@0003da
{
    public final b0 a;

    public void b0$c(b0 p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$c.class, "1")) {
       }else {
          a.p(p0, "newState");
          if (this.a.q != p0.e()) {
             this.a.q = p0.e();
             p0 = this.a;
             if (p0.q == null && p0.o != null) {
                p0.h2();
             }
          }
       }
       return;
    }
}
