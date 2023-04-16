package b3d.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public final class z	// class@00034b
{
    public static final z a;

    static {
       z.a = new z();
    }
    public void z(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("ugLoginButtonBubble", false);
    }
}
