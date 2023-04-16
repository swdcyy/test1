package mb6.k;
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

public class k extends a	// class@001e76
{

    public void k(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"gzone.gifshow.com","gzone.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.GZONE;
    }
    public String d(){
       return "gzone";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("gzone_idc", "");
    }
}
