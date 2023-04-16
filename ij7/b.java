package ij7.b;
import sj7.b;
import java.util.concurrent.Executor;
import ij7.c;
import java.lang.Object;
import com.kwai.plugin.dva.work.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ij7.b$a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class b implements b	// class@0017f9
{
    public final Executor a;
    public final c b;

    public void b(Executor p0,c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       Objects.requireNonNull(p0);
       String str = p0.e();
       this.a.execute(new b$a(this, p0));
       return;
    }
    public boolean equals(Object p0){
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || uob != p0.getClass()) {
          return false;
       }
       return p0.b.equals(this.b);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.hashCode();
    }
}
