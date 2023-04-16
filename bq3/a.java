package bq3.a;
import java.lang.Object;
import bq3.b;
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

public class a	// class@000417
{
    public static b a;

    public void a(){
       super();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          a.a = e.b(b.a(-1961311520).a(RouteType.AD, d.b), b.class);
       }
       return a.a;
    }
}
