package dr.f;
import dr.b;
import java.lang.Object;
import com.kuaishou.android.vader.type.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.vader.type.b;

public class f implements b	// class@0014df
{

    public void f(){
       super();
    }
    public e a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Number) {
          return new e(p0);
       }
       return null;
    }
    public b accept(Object p0){
       return this.a(p0);
    }
}
