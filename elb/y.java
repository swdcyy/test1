package elb.y;
import java.lang.Object;
import elb.z;
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
import kotlin.jvm.internal.a;

public final class y	// class@00276f
{
    public static z a;
    public static final y b;

    static {
       y.b = new y();
    }
    public void y(){
       super();
    }
    public synchronized final z a(){
       z obj = PatchProxy.apply(null, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (y.a == null) {
          y.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), z.class);
       }
       obj = y.a;
       a.m(obj);
       return obj;
    }
}
