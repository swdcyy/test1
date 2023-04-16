package ba2.m;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class m implements g	// class@00039e
{
    public final e b;

    public void m(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager"), "anchorStatus fetch failed e = "+p0);
          p0.b = true;
       }
       return;
    }
}
