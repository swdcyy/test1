package eqb.c;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eqb.a;
import eqb.b;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class c extends Factory	// class@0027aa
{

    public void c(){
       super();
    }
    public Object newInstance(){
       a uoa = PatchProxy.apply(null, this, c.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = e.b(new b(RouteType.API, d.b), a.class);
       }
       return uoa;
    }
}
