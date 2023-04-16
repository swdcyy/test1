package aw8.a;
import aw8.e;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.config.live.a;
import java.util.Map;
import zv8.b;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;
import sp.d;

public class a extends e	// class@000322
{

    public void a(){
       super();
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(a.a);
       return obj;
    }
    public Map availableActionConfig(){
       return this.a;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.a = uConcurrentH;
       uConcurrentH.put("FEATURED_LIVE", this.d());
       this.a.put(d.I, this.d());
       return;
    }
    public String subBiz(){
       return "FEATURED_LIVE";
    }
}
