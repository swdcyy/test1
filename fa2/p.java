package fa2.p;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$e;

public final class p implements View$OnClickListener	// class@00290e
{
    public final LiveHourlyRankStrengthNoticeView b;

    public void p(LiveHourlyRankStrengthNoticeView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String currentNarro;
       p tb = this.b;
       LiveHourlyRankStrengthNoticeView l = tb.l;
       boolean b = true;
       if (l == b) {
          currentNarro = tb.getCurrentNarrowItemViewExtraInfo();
          tb.l(b);
       }else if(l == 2){
          currentNarro = tb.d.getCurrentItemViewExtraInfo();
          tb.m();
       }else {
          currentNarro = "";
       }
       LiveHourlyRankStrengthNoticeView o = tb.o;
       if (o != null && o.b() != null) {
          tb.o.b().a(tb.l, currentNarro);
       }
       return;
    }
}
