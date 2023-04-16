package bc2.r;
import java.lang.Runnable;
import bc2.t;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultFragmentV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultPanelState;
import brd.y;

public final class r implements Runnable	// class@0003dd
{
    public final t b;

    public void r(t p0){
       this.b = p0;
    }
    public final void run(){
       r tb = this.b;
       t e = tb.e;
       if (e != null && e.isAdded()) {
          t e1 = tb.e;
          Objects.requireNonNull(e1);
          if (!PatchProxy.applyVoid(null, e1, LiveLuckyStarOpenResultFragmentV2.class, "5") && e1.E != null) {
             LiveLuckyStarOpenResultPanelState oPENED = LiveLuckyStarOpenResultPanelState.OPENED;
             e1.C = oPENED;
             e1.F.onNext(oPENED);
          }
       }else {
          tb.j(true);
       }
       return;
    }
}
