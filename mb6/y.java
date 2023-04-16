package mb6.y;
import jjd.a;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import com.google.common.collect.o;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import jjd.b;
import com.kwai.framework.model.router.RouteType;
import xf6.h;

public class y extends a	// class@001e84
{

    public void y(){
       super();
    }
    public Set a(){
       String[] obj = PatchProxy.apply(null, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"apissl.ksapisrv.com","apissl.kuaishou.com","apissl.gifshow.com"};
       return o.k(obj);
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"apissl.ksapisrv.com","apissl.gifshow.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.PAY_CHECK;
    }
    public String d(){
       return "pay_check";
    }
    public String e(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (h.t()) {
          objArray = h.a();
       }
       return objArray;
    }
}
