package mb6.l;
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

public class l extends a	// class@001e77
{

    public void l(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"apissl.ksapisrv.com","apissl.gifshow.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.HTTPS;
    }
    public String d(){
       return "https";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.a();
    }
}
