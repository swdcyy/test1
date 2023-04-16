package o02.i;
import java.lang.Object;
import o02.j;
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

public class i	// class@003452
{
    public static j a;

    public void i(){
       super();
    }
    public static j a(){
       Object obj = PatchProxy.apply(null, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i.a == null) {
          i.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), j.class);
       }
       return i.a;
    }
}
