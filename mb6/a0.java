package mb6.a0;
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

public class a0 extends a	// class@001e61
{

    public void a0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, a0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"push.gifshow.com","push.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.PUSH;
    }
    public String d(){
       return "push";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("push_idc");
    }
}