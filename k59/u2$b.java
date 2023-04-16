package k59.u2$b;
import erd.g;
import k59.u2;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import vq4.d;

public final class u2$b implements g	// class@002b23
{
    public final u2 b;

    public void u2$b(u2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u2$b.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0.e2 = System.currentTimeMillis() - this.b.q;
       }
       return;
    }
}
