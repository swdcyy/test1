package bc9.e0$a;
import cc9.i;
import bc9.e0;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ac9.g;
import ac9.k;

public final class e0$a implements i	// class@0003e4
{
    public final e0 a;

    public void e0$a(e0 p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          p0 = p0.d();
          if (!p0 instanceof k) {
             p0 = null;
          }
          if (p0 != null && !a.g(p0, this.a.w)) {
             this.a.w = p0;
          }
       }
       return;
    }
}
