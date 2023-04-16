package mt1.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;

public final class c implements Observer	// class@003214
{
    public final LiveMultiPkCohesionVoteBangsVC b;

    public void c(LiveMultiPkCohesionVoteBangsVC p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       b.Z(LiveCommonLogTag.MULTI_PK, "resetCountDownTexView");
       p0 = this.b.k;
       if (p0 != null) {
          p0.b();
       }
       return;
    }
}
