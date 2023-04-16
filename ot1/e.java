package ot1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.recommendgift.LivePkScoreBarSprintAnimView;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.tools.l;
import com.kuaishou.live.common.core.component.recommendgift.a;
import lnc.c3$a;
import lnc.c3;

public final class e implements Observer	// class@003580
{
    public final LiveMultiPkProgressBarDefaultController b;

    public void e(LiveMultiPkProgressBarDefaultController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          p0 = this.b.p;
          if (p0 != null && !PatchProxy.applyVoid(null, p0, LivePkScoreBarSprintAnimView.class, "2")) {
             p0.setVisibility(8);
             p0.B.setVisibility(8);
             l.j(p0.C);
             c3.c(p0.E, a.a);
          }
       }
       return;
    }
}
