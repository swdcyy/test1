package fa2.q;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$e;

public final class q implements LiveHourlyRankStrengthNoticeExpandView$b	// class@00290f
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void q(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
    }
    public final void a(String p0){
       q ta = this.a;
       LiveHourlyRankStrengthNoticeView o = ta.o;
       if (o != null && o.c() != null) {
          ta.o.c().a(p0);
       }
       return;
    }
}
