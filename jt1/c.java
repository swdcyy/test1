package jt1.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.viewcontroller.ViewController;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import zs1.b;
import hu1.c;
import com.kuaishou.live.common.core.component.multipk.game.vc.a;
import ut1.d;
import du1.d;
import ws1.c;
import ht1.a;
import qrd.l1;

public final class c implements Observer	// class@002c06
{
    public final LiveMultiPkGameController b;

    public void c(LiveMultiPkGameController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(!p0.booleanValue()){
          b.P(LiveMultiPkDebugLogKt.c(), "unload progress bar");
          p0 = this.b;
          LiveMultiPkGameController q = p0.q;
          if (q != null) {
             p0.O2(q);
             p0.q = null;
          }
       }else {
          a.o(p0, "progressBarEnabled");
          if (p0.booleanValue()) {
             b.P(LiveMultiPkDebugLogKt.c(), "load progress bar");
             p0 = this.b;
             c tb = this.b;
             c uoc = tb.a3();
             tb = this.b;
             a uoa = tb.X2();
             LiveMultiPkProgressBarDefaultController liveMultiPkP = new LiveMultiPkProgressBarDefaultController(p0.Y2(), tb.u, uoc, tb.t, uoa, this.b.x);
             this.b.z2(v7);
             p0.q = v7;
          }
       }
       return;
    }
}
