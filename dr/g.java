package dr.g;
import dr.b;
import java.lang.Object;
import com.kuaishou.android.vader.type.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.type.b;

public class g implements b	// class@0014e0
{

    public void g(){
       super();
    }
    public f a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return new f(p0);
       }
       return null;
    }
    public b accept(Object p0){
       return this.a(p0);
    }
}
