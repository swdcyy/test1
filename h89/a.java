package h89.a;
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

public class a extends a	// class@001731
{

    public void a(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"app.m.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.BIOLOGY_SERVER;
    }
    public String d(){
       return "biology-server";
    }
    public String e(){
       return null;
    }
}
