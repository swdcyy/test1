package dlb.g;
import com.smile.gifshow.annotation.plugin.Factory;
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
import dlb.f;
import com.yxcorp.retrofit.e;

public class g extends Factory	// class@0024c4
{

    public void g(){
       super();
    }
    public Object newInstance(){
       f uof = PatchProxy.apply(null, this, g.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = e.b(b.a(-1961311520).a(RouteType.API, d.b), f.class);
       }
       return uof;
    }
}
