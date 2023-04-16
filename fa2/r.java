package fa2.r;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;

public final class r implements Runnable	// class@002910
{
    public final LiveHourlyRankStrengthNoticeView b;

    public void r(LiveHourlyRankStrengthNoticeView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.m();
    }
}
