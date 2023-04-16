package fa2.j;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.constraintlayout.widget.Group;

public class j extends f$j	// class@002908
{
    public final LiveHourlyRankStrengthNoticeExpandView a;

    public void j(LiveHourlyRankStrengthNoticeExpandView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.a.F.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.a.F.setVisibility(0);
       return;
    }
}
