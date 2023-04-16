package mb6.z;
import jjd.a;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.util.HashSet;
import com.google.common.collect.o;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import jjd.b;
import com.kwai.framework.model.router.RouteType;
import xf6.h;
import xf6.l;

public class z extends a	// class@001e85
{

    public void z(){
       super();
    }
    public Set a(){
       String[] obj = PatchProxy.apply(null, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.t().d("merchantPayHostSwitch", false)) {
          obj = new String[]{"api1.kuaishoupay.com","api2.kuaishoupay.com","api1.kspays.com","api2.kspays.com"};
          return o.k(obj);
       }else {
          obj = new String[]{"api1.kuaishoupay.com","api2.kuaishoupay.com","pay.ssl.kuaishou.com","apigray.kuaishoupay.com"};
          return o.k(obj);
       }
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, z.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.t().d("merchantPayHostSwitch", false)) {
          obj = new String[]{"api1.kuaishoupay.com","api2.kuaishoupay.com","api1.kspays.com","api2.kspays.com"};
          return Lists.e(obj);
       }else {
          obj = new String[]{"api1.kuaishoupay.com","api2.kuaishoupay.com","pay.ssl.kuaishou.com"};
          return Lists.e(obj);
       }
    }
    public b c(){
       return RouteType.PAY;
    }
    public String d(){
       return "pay";
    }
    public String e(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, z.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (h.t()) {
          objArray = l.g("pay_test_url", "pay.test.gifshow.com");
       }
       return objArray;
    }
    public boolean f(){
       return true;
    }
}
