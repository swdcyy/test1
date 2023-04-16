package a66.g;
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
import a66.e;
import com.yxcorp.retrofit.e;

public class g extends Factory	// class@000030
{

    public void g(){
       super();
    }
    public Object newInstance(){
       e uoe = PatchProxy.apply(null, this, g.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = e.b(b.a(-1961311520).a(RouteType.API, d.b), e.class);
       }
       return uoe;
    }
}
