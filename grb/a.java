package grb.a;
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
import grb.b;
import com.yxcorp.retrofit.e;

public class a extends Factory	// class@002bd6
{

    public void a(){
       super();
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
