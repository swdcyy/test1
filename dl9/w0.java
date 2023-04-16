package dl9.w0;
import sfc.a;
import dl9.x0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dl9.v0;
import java.lang.Runnable;
import ekd.k1;

public class w0 extends a	// class@001fbe
{
    public final x0 c;

    public void w0(x0 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "1")) {
          return;
       }
       super.b(p0);
       k1.o(new v0(this));
       return;
    }
}
