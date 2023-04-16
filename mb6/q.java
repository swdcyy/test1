package mb6.q;
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

public class q extends a	// class@001e7c
{

    public void q(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"hb.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.LIVE_RED_PACKET_GRAB;
    }
    public String d(){
       return "redPack";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("live_redpack_idc");
    }
}
