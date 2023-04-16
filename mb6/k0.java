package mb6.k0;
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

public class k0 extends a	// class@001e75
{

    public void k0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, k0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"api.kuaishouzt.com","api.kwaizt.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.ZT;
    }
    public String d(){
       return "zhongtai";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, k0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("zt_test_idc");
    }
}
