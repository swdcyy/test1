package ou1.g$h;
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
import java.lang.Long;

public final class g$h implements a	// class@00359a
{
    public final g a;
    public final String b;

    public void g$h(g p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       l obj = PatchProxy.applyOneRefs(p0, this, g$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.l().get(this.a.g);
       if (p0 != null) {
          p0 = p0.f();
          if (p0 != null) {
             p0 = p0.get(this.b);
             if (p0 != null) {
                obj = p0.c;
             label_0034 :
                p0 = this.a;
                p0.o = obj;
                return Long.valueOf((obj - p0.o));
             }
          }
       }
       long l = 0;
       goto label_0034 ;
    }
}
