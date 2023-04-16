package g59.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class j	// class@002407
{

    public void j(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disablePlayFailView", false);
    }
}
