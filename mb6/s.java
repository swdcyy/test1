package mb6.s;
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

public class s extends a	// class@001e7e
{

    public void s(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"l.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.LOCAL_LIFE;
    }
    public String d(){
       return "local_life";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("tuna_local_life_poi_test_idc", "");
    }
}
