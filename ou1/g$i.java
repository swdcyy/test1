package ou1.g$i;
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
import java.lang.Boolean;

public final class g$i implements a	// class@00359b
{
    public final g a;

    public void g$i(g p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.l().get(this.a.g);
       boolean b = (p0 != null)? p0.d(): 0;
       return Boolean.valueOf((b ^ 0x01));
    }
}
