package aw8.f;
import aw8.e;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.config.live.e;
import java.util.Map;
import zv8.b;
import java.util.concurrent.ConcurrentHashMap;
import sp.d;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;

public class f extends e	// class@000327
{

    public void f(){
       super();
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(e.a);
       return obj;
    }
    public Map availableActionConfig(){
       return this.a;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.a = uConcurrentH;
       uConcurrentH.put(d.I, this.d());
       return;
    }
    public String subBiz(){
       return "LIVE_SQUARE";
    }
}
