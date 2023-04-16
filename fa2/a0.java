package fa2.a0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;

public final class a0 implements Runnable	// class@0028fb
{
    public final i$f b;
    public final LiveHourlyRankStrengthNoticeView c;

    public void a0(i$f p0,LiveHourlyRankStrengthNoticeView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.e.c(this.c);
    }
}
