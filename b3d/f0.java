package b3d.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public final class f0	// class@000327
{
    public static final f0 a;

    static {
       f0.a = new f0();
    }
    public void f0(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("loginReason", false);
    }
}
