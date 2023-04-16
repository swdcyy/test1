package aw8.d;
import aw8.e;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.config.live.d;
import java.util.Map;
import zv8.b;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;
import sp.d;

public class d extends e	// class@000325
{

    public void d(){
       super();
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(d.a);
       return obj;
    }
    public Map availableActionConfig(){
       return this.a;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.a = uConcurrentH;
       uConcurrentH.put("LIVE_MORE_SQUARE", this.d());
       this.a.put(d.I, this.d());
       return;
    }
    public String subBiz(){
       return "LIVE_MORE_SQUARE";
    }
}
