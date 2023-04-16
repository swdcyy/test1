package dfc.x$a;
import java.lang.Runnable;
import dfc.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy6.a;

public class x$a implements Runnable	// class@0021b9
{
    public final x b;

    public void x$a(x p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, x$a.class, "1")) {
          return;
       }
       x$a tb = this.b;
       x p = tb.p;
       int i = (p != null)? p.j(): -1;
       tb.R8(i);
       return;
    }
}
