package i91.m;
import java.lang.Object;
import java.lang.String;
import jw4.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tr.d;
import jw4.e;
import tr.a;
import tr.c;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public class m	// class@002872
{

    public void m(){
       super();
    }
    public static a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.a(p0, m.b());
    }
    public static d b(){
       Object obj = PatchProxy.apply(null, null, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a(a.e());
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableSnowVideoFrameByteBufferObjectPoolOpt", false);
    }
}
