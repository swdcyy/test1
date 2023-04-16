package dy8.b;
import java.lang.Object;
import dy8.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import dy8.b$c;
import dy8.b$a;
import dy8.b$b;

public class b	// class@0020fb
{

    public void b(){
       super();
    }
    public static g a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.t().d("enableAdNeoNetworkRetry", false)) {
          return new b$c(null);
       }
       return new b$b(null);
    }
}
