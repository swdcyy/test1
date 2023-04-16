package ou1.g$c;
import z0.a;
import ou1.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.util.Map;
import ut1.k;

public final class g$c implements a	// class@003595
{
    public final g a;

    public void g$c(g p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.l().get(this.a.g);
       p0 = (p0 != null)? p0.b(): null;
       return p0;
    }
}
