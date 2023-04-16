package ni9.b;
import java.lang.Object;
import ni9.a;
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

public final class b	// class@00318d
{
    public static a a;

    public void b(){
       super();
    }
    public static synchronized a a(){
       _monitor_enter(b.class);
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b.class);
          return obj;
       }else if(b.a == null){
          b.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
       }
       _monitor_exit(b.class);
       return b.a;
    }
}
