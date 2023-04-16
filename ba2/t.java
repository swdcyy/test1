package ba2.t;
import ekd.f$i;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public class t extends f$i	// class@0003ac
{
    public final LiveHourlyRankTempViewV2 b;

    public void t(LiveHourlyRankTempViewV2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.b.setAlpha(0x3f800000);
       return;
    }
}
