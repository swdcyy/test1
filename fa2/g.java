package fa2.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import java.util.Objects;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandItemView;
import android.content.Context;
import android.view.ViewGroup;

public final class g implements f$a	// class@002905
{
    public final LiveHourlyRankStrengthNoticeExpandView a;

    public void g(LiveHourlyRankStrengthNoticeExpandView p0){
       this.a = p0;
    }
    public final LiveHourlyRankStrengthNoticeBaseFlipperItemView a(){
       g ta = this.a;
       Objects.requireNonNull(ta);
       return new LiveHourlyRankStrengthNoticeExpandItemView(ta.getContext());
    }
}
