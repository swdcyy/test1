package ci2.a;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ci2.b;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public final class a implements x	// class@000540
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object get(){
       b uob = PatchProxy.apply(null, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), b.class);
       }
       return uob;
    }
}
