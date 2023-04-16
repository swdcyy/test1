package u37.j;
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

public class j extends a	// class@0025ab
{

    public void j(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"sports.gifshow.com","sports.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.SPORTS;
    }
    public String d(){
       return "sports";
    }
    public String e(){
       return null;
    }
}
