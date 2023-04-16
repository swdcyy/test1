package aw8.c;
import aw8.e;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.config.live.c;
import java.util.Map;
import zv8.b;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;

public class c extends e	// class@000324
{
    public final int b;

    public void c(int p0){
       super();
       this.b = p0;
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(c.a);
       return obj;
    }
    public Map availableActionConfig(){
       return this.a;
    }
    public int[] e(){
       return new int[12]{4,13,14,15,1,5,8,7,2,3,9,12};
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.a = uConcurrentH;
       uConcurrentH.put("THANOS_FIND", this.d());
       this.a.put("THANOS_HOT", this.d());
       this.a.put("LIVE_WATCH", this.d());
       return;
    }
    public int maxActions(){
       return this.b;
    }
    public String subBiz(){
       return "BIZ_LIVE_HOT_RERANK";
    }
}
