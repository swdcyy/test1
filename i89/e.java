package i89.e;
import com.smile.gifshow.annotation.plugin.Factory;
import i89.f;
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

public class e extends Factory	// class@00264d
{

    public void e(){
       super();
    }
    public static f a(){
       Object obj = PatchProxy.apply(null, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x48954a07);
    }
    public Object newInstance(){
       f uof = PatchProxy.apply(null, this, e.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = e.b(b.a(-1961311520).a(RouteType.API, d.b), f.class);
       }
       return uof;
    }
}
