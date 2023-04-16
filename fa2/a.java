package fa2.a;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import iy1.l;
import iy1.g;
import lf3.f;

public final class a implements g	// class@0028fc
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       tb.r = p0.districtRankBattleVisible;
       b.S(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "[district strength] receive strength visible msg", "districtRankBattleVisible", Boolean.valueOf(p0.districtRankBattleVisible));
       if (tb.r == null && tb.c != null) {
          a n = tb.n;
          if (n != null) {
             tb.c(n);
             tb.c.rj(l.d);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
