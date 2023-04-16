package fj9.c;
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
import fj9.a;
import com.yxcorp.retrofit.e;

public class c extends Factory	// class@00231f
{

    public void c(){
       super();
    }
    public Object newInstance(){
       a uoa = PatchProxy.apply(null, this, c.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
       }
       return uoa;
    }
}
