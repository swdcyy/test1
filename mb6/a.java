package mb6.a;
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

public class a extends a	// class@001e62
{

    public void a(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"acg.gifshow.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.ACG;
    }
    public String d(){
       return "acg";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("key_acg_test_idc", "");
    }
}
