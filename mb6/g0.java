package mb6.g0;
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

public class g0 extends a	// class@001e6d
{

    public void g0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"ulog.gifshow.com","ulog.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.ULOG;
    }
    public String d(){
       return "ulog";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, g0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("ulog_idc");
    }
}
