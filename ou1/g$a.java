package ou1.g$a;
import z0.a;
import ou1.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.util.Map;
import ut1.k;
import ut1.l;

public final class g$a implements a	// class@003593
{
    public final g a;
    public final String b;

    public void g$a(g p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.l().get(this.a.g);
       if (p0 != null) {
          p0 = p0.f();
          if (p0 != null) {
             p0 = p0.get(this.b);
             if (p0 != null) {
                p0 = p0.d;
             label_0033 :
                return p0;
             }
          }
       }
       p0 = null;
       goto label_0033 ;
    }
}
