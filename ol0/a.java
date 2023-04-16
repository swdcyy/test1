package ol0.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.yxcorp.gifshow.model.ReportAdLogActionParam;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.StringBuilder;
import yx.j0;
import tl9.g;
import lp3.c;

public final class a extends AbstractLiveJsCommand	// class@003529
{

    public void a(){
       super();
    }
    public Class a(){
       return ReportAdLogActionParam.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof ReportAdLogActionParam) {
          return m.g.c("invalid params");
       }
       int i = 0;
       if (p0.mAdActionType <= null) {
          Object[] objArray = new Object[i];
          j0.f("LiveJsReportAdLogInvitation", "invalid actionType "+p0.mAdActionType, objArray);
          return m.g.c("invalid actionType");
       }else {
          p0.afterDeserialize();
          g og = this.i(g.class);
          if (og != null) {
             og.Dk(p0);
          }
          return m$a.g(m.g, null, i, 3, null);
       }
    }
}
