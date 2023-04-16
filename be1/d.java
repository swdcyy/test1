package be1.d;
import java.lang.Object;
import be1.d$a;
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

public class d	// class@000358
{
    public static d$a a;

    public void d(){
       super();
    }
    public static d$a a(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.a == null) {
          d.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), d$a.class);
       }
       return d.a;
    }
}
