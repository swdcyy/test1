package c75.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h75.e;

public class e	// class@000427
{

    public void e(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a("log_control_mydao");
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.b("log_control_mydao");
    }
}
