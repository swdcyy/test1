package y4d.a;
import jjd.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import jjd.b;
import com.kwai.framework.model.router.RouteType;
import xf6.h;

public class a extends a	// class@002841
{

    public void a(){
       super();
    }
    public List b(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add("game-channel.gamed.kuaishou.com");
       return obj;
    }
    public b c(){
       return RouteType.ZtGameChannel;
    }
    public String d(){
       return "ztGameChannel";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("sogame_channel_test_idc");
    }
}
