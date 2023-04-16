package nmd.q$f;
import qvc.b;
import nmd.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ttc.e;

public final class q$f implements b	// class@001e6f
{
    public final q a;

    public void q$f(q p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q$f.class, "1")) {
          return;
       }
       a.p(p0, "oldString");
       a.p(p1, "newString");
       q x = this.a.x;
       if (x != null && x instanceof e) {
          x.c(p1);
       }
       return;
    }
}
