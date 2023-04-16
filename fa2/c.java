package fa2.c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;

public final class c implements Runnable	// class@002900
{
    public final a$f b;
    public final LiveHourlyRankStrengthNoticeView c;

    public void c(a$f p0,LiveHourlyRankStrengthNoticeView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.d.c(this.c);
    }
}
