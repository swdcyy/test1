package x7a.b;
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

public class b extends a	// class@0027bf
{

    public void b(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"healthy.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.HEALTHY_SERVER;
    }
    public String d(){
       return "healthy-server";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("key_healthy_test_idc");
    }
}
