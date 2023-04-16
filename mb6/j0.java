package mb6.j0;
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

public class j0 extends a	// class@001e73
{

    public void j0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, j0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"app.kwaixiaodian.com","app2.kwaixiaodian.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.WEB_MERCHANT;
    }
    public String d(){
       return "web_merchant";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, j0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.m();
    }
}
