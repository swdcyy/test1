package mb6.j;
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

public class j extends a	// class@001e74
{

    public void j(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"interaction.game.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.GAMEINTERACTION;
    }
    public String d(){
       return "gameInteraction";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("gameinteraction_test_idc", "");
    }
}
