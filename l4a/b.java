package l4a.b;
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
import l4a.a;
import com.yxcorp.retrofit.e;

public class b extends Factory	// class@002d4b
{

    public void b(){
       super();
    }
    public Object newInstance(){
       a uoa = PatchProxy.apply(null, this, b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
       }
       return uoa;
    }
}
