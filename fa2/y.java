package fa2.y;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAnchorStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveHourlyRankConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;

public final class y implements g	// class@002917
{
    public final i b;

    public void y(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          p0 = p0.mLivePopularityRankConfig;
          if (p0 != null) {
             tb.s = p0.mIsBattlePopularityEnabled;
          }
       }
       b.S(LiveLogTag.HOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController"), "anchor fetch strength notice", "mIsPopularityStrengthNoticeEnable", Boolean.valueOf(tb.s));
       return;
    }
}
