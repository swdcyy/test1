package mn4.a;
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

public class a extends a	// class@001eb2
{

    public void a(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"lbs.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.LBS;
    }
    public String d(){
       return "lbs";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("key_lbs_test_idc");
    }
}
