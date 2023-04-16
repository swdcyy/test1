package elb.o;
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

public class o extends a	// class@00275f
{

    public void o(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"mediacloud.kuaishou.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.MEDIA_CLOUD;
    }
    public String d(){
       return "mediacloud.kuaishou";
    }
}
