package mb6.n;
import jjd.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import jjd.b;
import com.kwai.framework.model.router.RouteType;
import xf6.h;

public class n extends a	// class@001e79
{

    public void n(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.t().d("merchantPayHostSwitch", false)) {
          obj = new String[]{"api1.kuaishoupay.com","api2.kuaishoupay.com","api1.kspays.com","api2.kspays.com"};
          return Lists.e(obj);
       }else {
          obj = new String[]{"www.kuaishoupay.com"};
          return Lists.e(obj);
       }
    }
    public b c(){
       return RouteType.KWAIPAY_SDK;
    }
    public String d(){
       return "kwaipay_sdk";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.c();
    }
}
