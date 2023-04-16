package f4b.k$a;
import sfc.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import java.lang.StringBuilder;
import ekd.k1;
import q87.c;

public class k$a extends a	// class@00289e
{
    public final long c;

    public void k$a(long p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       super.b(p0);
       b.D().z("refresh_magic", "complete at error. total cost "+k1.t(this.c), p0);
       return;
    }
}
