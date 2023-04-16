package c66.l;
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
import c66.k;
import com.yxcorp.retrofit.e;

public class l extends Factory	// class@00065e
{

    public void l(){
       super();
    }
    public Object newInstance(){
       k ok = PatchProxy.apply(null, this, l.class, "1");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = e.b(b.a(-1961311520).a(RouteType.HTTPS, d.b), k.class);
       }
       return ok;
    }
}
