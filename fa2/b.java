package fa2.b;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@0028fe
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       tb.r = p0.mIsHourlyRankStrengthNoticeEnable;
       b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "[district strength] audience fetch strength notice : "+tb.r);
    }
}
