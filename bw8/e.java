package bw8.e;
import bw8.b;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import zv8.l;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageBaseConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import ekd.q;

public class e implements b	// class@00046d
{

    public void e(){
       super();
    }
    public String a(){
       return "RealActionFilterType";
    }
    public boolean b(RealActionBaseFeed p0,l p1,FeedRealActionsPageBaseConfig p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       boolean b = (p2 != null && (!q.f(p2.getActions()) && p2.getActions().contains(String.valueOf(p0.mActionTypeStr))))? true: false;
       return b;
    }
}
