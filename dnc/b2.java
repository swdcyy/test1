package dnc.b2;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gnc.b;
import dnc.w2;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class b2 extends Factory	// class@00228c
{

    public void b2(){
       super();
    }
    public Object newInstance(){
       b uob = PatchProxy.apply(null, this, b2.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = e.b(new w2(RouteType.UPLOAD, d.d), b.class);
       }
       return uob;
    }
}
