package ep2.e$b;
import erd.g;
import ep2.e;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import msd.l;
import qrd.l1;

public final class e$b implements g	// class@0027b2
{
    public final e b;
    public final long c;

    public void e$b(e p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       long l = p0.longValue();
       p0 = e$b.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, p0, "1")) {
          long l1 = this.c + (l * 100);
          p0 = this.b;
          p0.e = l1;
          p0 = p0.d;
          if (p0 != null) {
             p0.invoke(Long.valueOf(l1));
          }
       }
       return;
    }
}
