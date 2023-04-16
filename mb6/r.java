package mb6.r;
import jjd.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import jjd.b;
import com.kwai.framework.model.router.RouteType;
import xf6.h;

public class r extends a	// class@001e7d
{

    public void r(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"live.gifshow.com","live.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.LIVE;
    }
    public String d(){
       return "live";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.f();
    }
}
