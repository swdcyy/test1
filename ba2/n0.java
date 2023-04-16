package ba2.n0;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import android.net.Uri;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class n0 implements g	// class@00039f
{
    public final h b;

    public void n0(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.V0 = p0.mIsCityRankEnable;
       tb.W0 = p0.mIsHourlyQuarterRankEnable;
       tb.Y0 = p0.mIsNewHourlyRankResultEnable;
       tb.n9();
       tb.X0 = true;
       p0 = tb.E;
       if (p0 != null) {
          tb.k9(p0);
          tb.E = null;
       }
       b.e0(LiveLogTag.HOURLY_RANK, "fetch audience config", "isCityRankEnable", Boolean.valueOf(tb.V0), "isHeadLineEnable", Boolean.valueOf(tb.W0), "mIsNewHourlyRankResultEnable", Boolean.valueOf(tb.Y0));
       return;
    }
}
