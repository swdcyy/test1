package mb6.w;
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

public class w extends a	// class@001e82
{

    public void w(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"app.m.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.NEW_WEB;
    }
    public String d(){
       return "newWeb";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("new_web_test_idc", "");
    }
}
