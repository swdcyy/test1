package nl0.a$e;
import erd.g;
import nl0.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class a$e implements g	// class@003353
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a$e tb = this.b;
          tb.d = tb.d + 1;
          tb.c(0);
          j0.b("AdLogTrackHelper", "requestTrackData error", p0);
       }
       return;
    }
}
