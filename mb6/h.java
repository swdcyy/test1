package mb6.h;
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

public class h extends a	// class@001e70
{

    public void h(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"effect-api.gifshow.com","effect-api.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.EFFECT_PLATFORM;
    }
    public String d(){
       return "effect";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("effect_platform_idc");
    }
}
