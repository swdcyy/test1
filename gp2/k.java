package gp2.k;
import op2.b;
import xw2.d;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import msd.p;

public final class k implements b	// class@002b7c
{
    public a a;
    public b b;
    public final d c;
    public final l d;

    public void k(d p0,l p1){
       a.p(p0, "syncCommandDispatcher");
       a.p(p1, "playerControllerFactory");
       super();
       this.c = p0;
       this.d = p1;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       k tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       tb = this.a;
       if (tb != null) {
          this.c.c(tb);
       }
       return;
    }
}
