package mb6.e;
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

public class e extends a	// class@001e6a
{

    public void e(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"apissl.gifshow.com","apissl.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.API;
    }
    public String d(){
       return "api";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.a();
    }
}
