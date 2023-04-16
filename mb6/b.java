package mb6.b;
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

public class b extends a	// class@001e64
{

    public void b(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"adim.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.AD_IM;
    }
    public String d(){
       return "ad_im";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("ad_im_idc", "");
    }
}
