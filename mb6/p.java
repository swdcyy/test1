package mb6.p;
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

public class p extends a	// class@001e7b
{

    public void p(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"livep2p.gifshow.com","livep2p.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.LIVE_P2P;
    }
    public String d(){
       return "livep2p";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("live_p2p_test_tracker_host");
    }
}
