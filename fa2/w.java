package fa2.w;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class w extends f$j	// class@002915
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void w(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       this.a.setVisibility(8);
       p0.l = 0;
       return;
    }
}
