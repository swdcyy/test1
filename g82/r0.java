package g82.r0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public class r0	// class@002ab4
{

    public void r0(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, r0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("liveFansGroupEntryScreenOrientation", true);
    }
}
