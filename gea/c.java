package gea.c;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import com.yxcorp.retrofit.a;
import gea.b;
import com.yxcorp.retrofit.e;

public class c extends Factory	// class@002abe
{

    public void c(){
       super();
    }
    public Object newInstance(){
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, this, c.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = e.b(b.a(-1961311520).a(RouteType.API, objArray), b.class);
       }
       return uob;
    }
}
