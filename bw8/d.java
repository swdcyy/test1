package bw8.d;
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
import ekd.j;

public class d implements b	// class@00046c
{

    public void d(){
       super();
    }
    public String a(){
       return "RealActionFilterSource";
    }
    public boolean b(RealActionBaseFeed p0,l p1,FeedRealActionsPageBaseConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p1.disableSourceFilter() || (p2 != null && (!j.h(p2.mSources) && j.d(p2.mSources, p0.mSource))))? true: false;
       return b;
    }
}
