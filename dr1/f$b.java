package dr1.f$b;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dr1.d;
import com.kuaishou.live.common.core.component.multiline.model.a;

public final class f$b implements a	// class@001ffe
{

    public void f$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.a();
          if (p0 != null) {
             p0 = p0.a();
          label_001d :
             return p0;
          }
       }
       p0 = null;
       goto label_001d ;
    }
}
