package aw8.g;
import aw8.e;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.config.live.f;
import java.util.Map;
import zv8.b;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;
import java.util.concurrent.ConcurrentHashMap;
import sp.d;

public class g extends e	// class@000328
{

    public void g(){
       super();
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(f.a);
       return obj;
    }
    public Map availableActionConfig(){
       return this.a;
    }
    public FeedRealActionsPageConfig d(){
       FeedRealActionsPageConfig obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FeedRealActionsPageConfig();
       int[] ointArray = new int[]{15};
       obj.mActions = ointArray;
       return obj;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.a = uConcurrentH;
       uConcurrentH.put(d.I, this.d());
       return;
    }
    public String subBiz(){
       return "BIZ_LIVE_VOICE_PARTY_SQUARE";
    }
}
