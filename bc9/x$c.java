package bc9.x$c;
import cc9.i;
import bc9.x;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class x$c implements i	// class@00040b
{
    public final x a;

    public void x$c(x p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$c.class, "1")) {
       }else {
          a.p(p0, "newState");
          if (this.a.F != p0.e()) {
             this.a.F = p0.e();
             p0 = this.a;
             if (p0.F == null) {
                if (p0.t != null) {
                   p0.k2(Boolean.TRUE, true);
                }
             }else if(p0.t != null){
                p0.g2(true);
             }
          }
       }
       return;
    }
}
