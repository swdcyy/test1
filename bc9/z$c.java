package bc9.z$c;
import cc9.i;
import bc9.z;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class z$c implements i	// class@000416
{
    public final z a;

    public void z$c(z p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$c.class, "1")) {
       }else {
          a.p(p0, "newState");
          z$c ta = this.a;
          ta.o = p0;
          if (ta.r != p0.e()) {
             this.a.r = p0.e();
             p0 = this.a;
             if (p0.r == null && p0.p != null) {
                p0.i2(false);
             }
          }
       }
       return;
    }
}
