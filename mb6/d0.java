package mb6.d0;
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

public class d0 extends a	// class@001e67
{

    public void d0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"open.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.SOGAME_OPEN_GROUND;
    }
    public String d(){
       return "ztGameOpen";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, d0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("sogame_middle_idc");
    }
}
