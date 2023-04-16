package b57.b;
import java.lang.Object;
import b57.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class b	// class@0003c7
{
    public static c a;

    public void b(){
       super();
    }
    public static c a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a == null) {
          b.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), c.class);
       }
       return b.a;
    }
}
