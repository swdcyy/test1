package ja1.b;
import ka1.a;
import ja1.e;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import la1.a;

public final class b extends a	// class@002a65
{
    public final e c;

    public void b(e p0,a p1){
       this.c = p0;
       super(null);
    }
    public void b(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "throwable");
       a.p(p1, "failedReason");
       a uoa = this.c.a();
       if (uoa != null) {
          uoa.c(p0);
       }
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "task");
       return;
    }
}
