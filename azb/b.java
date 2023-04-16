package azb.b;
import java.lang.Object;
import azb.a;
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

public final class b	// class@000366
{
    public static a a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public static final a a(){
       a obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a == null) {
          b.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
       }
       obj = b.a;
       a.m(obj);
       return obj;
    }
}
