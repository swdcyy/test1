package mb6.x;
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
import xf6.l;

public class x extends a	// class@001e83
{

    public void x(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"open.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.OPENSDK;
    }
    public String d(){
       return "opensdk";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("opensdk_platform_idc", "");
    }
}
