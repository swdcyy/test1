package mb6.t;
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

public class t extends a	// class@001e7f
{

    public void t(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"api1.kwaixiaodian.com","api2.kwaixiaodian.com","api1.kwaishop.com","api2.kwaishop.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.MERCHANT;
    }
    public String d(){
       return "merchant";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.g();
    }
}
