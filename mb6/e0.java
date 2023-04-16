package mb6.e0;
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

public class e0 extends a	// class@001e69
{

    public void e0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"allin.kuaishoupay.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.SOGAME_PAY;
    }
    public String d(){
       return "ztGamePay";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("sogame_pay_test_idc");
    }
}
