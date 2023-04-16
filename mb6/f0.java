package mb6.f0;
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

public class f0 extends a	// class@001e6b
{

    public void f0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"game.kuaishouzt.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.SOGAME;
    }
    public String d(){
       return "ztGame";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, f0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("sogame_test_idc");
    }
}
