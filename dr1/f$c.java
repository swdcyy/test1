package dr1.f$c;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dr1.d;

public final class f$c implements a	// class@001fff
{

    public void f$c(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 != null)? p0.b(): null;
       return p0;
    }
}
