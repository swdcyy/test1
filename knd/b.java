package knd.b;
import knd.a;
import java.lang.Object;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import java.lang.Class;
import com.yxcorp.retrofit.e;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b implements a	// class@0017d5
{
    public a a;

    public void b(){
       super();
       this.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
    }
    public t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a(p0);
    }
}
