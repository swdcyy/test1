package mb6.b0;
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

public class b0 extends a	// class@001e63
{

    public void b0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"live-redpackrain.gifshow.com","live-redpackrain.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.RED_PACK_RAIN;
    }
    public String d(){
       return "redPackRain";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, b0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.f();
    }
}
