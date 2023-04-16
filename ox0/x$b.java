package ox0.x$b;
import sfc.a;
import ox0.x;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import be1.k;

public class x$b extends a	// class@0035d4
{
    public final x c;

    public void x$b(x p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$b.class, "1")) {
          return;
       }
       k.b("n/live/interactiveChat/accept", p0);
       this.c.close(10);
       return;
    }
}
