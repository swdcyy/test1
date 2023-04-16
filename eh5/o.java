package eh5.o;
import eh5.u;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import eh5.u$b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class o implements u	// class@002434
{
    public final AtomicInteger b;

    public void o(){
       super();
       this.b = new AtomicInteger(0);
    }
    public void a(long[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       a.p(p0, "taskIds");
       u$b.b(this, p0);
       return;
    }
    public final AtomicInteger b(){
       return this.b;
    }
    public void j(long p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oo, "4")) {
          return;
       }
       u$b.a(this, p0);
       return;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.get() == -1)? true: false;
       return b;
    }
}
