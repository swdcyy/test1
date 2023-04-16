package cg5.e;
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
import cg5.d;
import com.yxcorp.retrofit.e;

public class e extends Factory	// class@0006b7
{

    public void e(){
       super();
    }
    public Object newInstance(){
       d uod = PatchProxy.apply(null, this, e.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = e.b(b.a(-1961311520).a(RouteType.API, d.b), d.class);
       }
       return uod;
    }
}
