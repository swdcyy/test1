package ae4.c;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ae4.b;
import ia4.e;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class c extends Factory	// class@0000aa
{

    public void c(){
       super();
    }
    public Object newInstance(){
       b uob = PatchProxy.apply(null, this, c.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = e.b(new e(RouteType.MERCHANT, d.b), b.class);
       }
       return uob;
    }
}
