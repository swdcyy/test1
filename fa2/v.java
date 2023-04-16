package fa2.v;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class v extends f$j	// class@002914
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void v(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       this.a.h();
       this.a.d();
       return;
    }
}
