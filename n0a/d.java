package n0a.d;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n0a.c;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import n0a.a;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class d extends Factory	// class@0030af
{

    public void d(){
       super();
    }
    public Object newInstance(){
       a uoa = PatchProxy.apply(null, this, d.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = e.b(new c(RouteType.API, d.b), a.class);
       }
       return uoa;
    }
}
