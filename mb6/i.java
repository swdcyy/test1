package mb6.i;
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

public class i extends a	// class@001e72
{

    public void i(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"center-api.game.kuaishou.com","center-api.gamekuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.GAMECENTER;
    }
    public String d(){
       return "kwaiGameCenter";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.b();
    }
}
