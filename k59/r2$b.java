package k59.r2$b;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class r2$b implements g	// class@002b0c
{
    public final int b;

    public void r2$b(int p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r2$b.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0 = p0.F;
          p0.C = this.b;
          p0.D1 = 2;
       }
       return;
    }
}
