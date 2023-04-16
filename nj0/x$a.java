package nj0.x$a;
import java.lang.Runnable;
import nj0.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lj0.c;
import zj0.v;
import ik0.m;

public final class x$a implements Runnable	// class@003345
{
    public final x b;

    public void x$a(x p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, x$a.class, "1")) {
          return;
       }
       c uoc = this.b.D();
       if (uoc != null) {
          m om = uoc.l();
          if (om != null) {
             om.x();
          }
       }
       return;
    }
}
