package b3d.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class d0	// class@000323
{

    public void d0(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("newUser", false);
    }
}
