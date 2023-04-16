package bm5.g$b;
import java.lang.Object;
import nsd.u;
import android.app.Activity;
import bm5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import bm5.g$a;
import bm5.g$a$a;

public final class g$b	// class@0004ed
{

    public void g$b(){
       super();
    }
    public void g$b(u p0){
       super();
    }
    public final void a(Activity p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$b.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "landscapeConfig");
       g.Q.put(String.valueOf(p0.hashCode()), p1);
       return;
    }
    public final void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "3")) {
          return;
       }
       if (p0 != null) {
          g.Q.remove(String.valueOf(p0.hashCode()));
       }
       return;
    }
    public final g c(Activity p0){
       g og;
       Object obj = PatchProxy.applyOneRefs(p0, this, g$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          og = g$a.R.a().a();
       }else {
          og = g.Q.get(String.valueOf(p0.hashCode()));
          if (og == null) {
             og = g$a.R.a().a();
          }
       }
       return og;
    }
}
