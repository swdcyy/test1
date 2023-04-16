package fa2.x;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class x extends f$j	// class@002916
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void x(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       this.a.setVisibility(8);
       p0.l = 0;
       return;
    }
}
