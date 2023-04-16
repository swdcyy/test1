package ba2.u;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka2.a$a;

public class u extends f$j	// class@0003ae
{
    public final LiveHourlyRankTempViewV2 a;

    public void u(LiveHourlyRankTempViewV2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       u ta = this.a;
       ta.i = null;
       LiveHourlyRankTempViewV2 k = ta.k;
       if (k != null) {
          k.onDismiss();
       }
       return;
    }
}
