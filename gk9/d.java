package gk9.d;
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
import gk9.b;
import com.yxcorp.retrofit.e;

public class d extends Factory	// class@0024bd
{

    public void d(){
       super();
    }
    public Object newInstance(){
       b uob = PatchProxy.apply(null, this, d.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = e.b(b.a(-1961311520).a(RouteType.API, d.b), b.class);
       }
       return uob;
    }
}
