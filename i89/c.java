package i89.c;
import com.smile.gifshow.annotation.plugin.Factory;
import i89.d;
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

public class c extends Factory	// class@00264b
{

    public void c(){
       super();
    }
    public static d a(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x2c66a15d);
    }
    public Object newInstance(){
       d uod = PatchProxy.apply(null, this, c.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = e.b(b.a(-1961311520).a(RouteType.API, d.b), d.class);
       }
       return uod;
    }
}
