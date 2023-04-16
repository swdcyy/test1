package ba2.l;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAnchorStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveHourlyRankPendantPriorityInfo;

public final class l implements g	// class@00039c
{
    public final e b;

    public void l(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          l tb = this.b;
          p0 = (p0 != null)? p0.mLeftTopHourlyRankPendantPriorityInfo: null;
          tb.b(p0);
       }
       return;
    }
}
