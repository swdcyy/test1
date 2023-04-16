package cx8.i;
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
import cx8.h;
import com.yxcorp.retrofit.e;

public class i extends Factory	// class@002018
{

    public void i(){
       super();
    }
    public Object newInstance(){
       h oh = PatchProxy.apply(null, this, i.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = e.b(b.a(-1961311520).a(RouteType.API, d.b), h.class);
       }
       return oh;
    }
}
