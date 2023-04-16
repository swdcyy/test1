package iq8.r;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import no8.e;
import java.util.Objects;
import oo8.t;

public class r	// class@00271e
{

    public void r(){
       super();
    }
    public static boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, objArray, r.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (e.b().e()) {
          obj = e.b();
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, e.class, "8");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a().isDebugMode();
          if (b) {
             b = true;
          label_0043 :
             return b;
          }
       }
       b = false;
       goto label_0043 ;
    }
}
