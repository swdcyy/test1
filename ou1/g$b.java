package ou1.g$b;
import z0.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.util.Map;
import ut1.l;
import cu1.d;
import java.lang.Boolean;

public final class g$b implements a	// class@003594
{
    public final String a;

    public void g$b(String p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = d.d(this.a, p0.l());
       boolean b = (p0 != null)? p0.a(): 1;
       return Boolean.valueOf((b ^ 1));
    }
}
