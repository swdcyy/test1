package mb6.d;
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

public class d extends a	// class@001e68
{

    public void d(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"api.e.kuaishou.com","api2.e.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.AD;
    }
    public String d(){
       return "apie";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("ad_test_idc");
    }
}
