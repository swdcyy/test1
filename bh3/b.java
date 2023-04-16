package bh3.b;
import java.lang.Object;
import bh3.b$a;
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

public class b	// class@0003b9
{
    public static b$a a;

    public void b(){
       super();
    }
    public static b$a a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a == null) {
          b.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), b$a.class);
       }
       return b.a;
    }
}
