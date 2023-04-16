package dr.a;
import dr.b;
import java.lang.Object;
import com.kuaishou.android.vader.type.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.vader.type.b;

public class a implements b	// class@0014da
{

    public void a(){
       super();
    }
    public a a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Boolean) {
          return new a(p0.booleanValue());
       }
       return null;
    }
    public b accept(Object p0){
       return this.a(p0);
    }
}
