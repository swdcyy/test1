package hj9.a;
import com.smile.gifshow.annotation.plugin.Factory;
import hj9.b;
import java.lang.Object;
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

public class a extends Factory	// class@002691
{

    public void a(){
       super();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x66a0bb26);
    }
    public Object newInstance(){
       b uob = PatchProxy.apply(null, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = e.b(b.a(-1961311520).a(RouteType.API, d.b), b.class);
       }
       return uob;
    }
}
