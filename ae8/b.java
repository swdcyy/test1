package ae8.b;
import ae8.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b	// class@000085
{
    public Map a;
    public static x b;

    static {
       b.b = Suppliers.a(a.b);
    }
    public void b(){
       super();
       this.a = new HashMap();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b.get();
    }
}
