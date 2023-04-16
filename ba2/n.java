package ba2.n;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveHourlyRankPendantPriorityInfo;

public final class n implements g	// class@0003a0
{
    public final e b;

    public void n(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          List list = LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager");
          LiveTimeConsumingUserStatusResponse liveTimeCons = null;
          Boolean uBoolean = (p0 != null)? Boolean.valueOf(p0.mIsHourlyRankEntryEnable): liveTimeCons;
          b.S(list, "[district] audience got hourlyrank config", "isHourlyRankEntryEnable", uBoolean);
          n tb = this.b;
          b = true;
          if (p0 != null && p0.mIsHourlyRankEntryEnable == b) {
             b = false;
          }
          tb.h = b;
          if (p0 != null) {
             liveTimeCons = p0.mLeftTopHourlyRankPendantPriorityInfo;
          }
          tb.b(liveTimeCons);
       }
       return;
    }
}
