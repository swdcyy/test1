package bm4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class b	// class@0003a1
{

    public void b(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enablePreloadMerchantOrderDetailRnBundle", false);
    }
}
