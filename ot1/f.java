package ot1.f;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;

public final class f implements Runnable	// class@003581
{
    public final LiveMultiPkProgressBarDefaultController b;
    public final long c;
    public final long d;

    public void f(LiveMultiPkProgressBarDefaultController p0,long p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       f uof = null;
       if (!tc - uof && !this.d - uof) {
          tc = this.b;
          tc.y = true;
          LiveMultiPkProgressBarDefaultController.V2(tc).setSelfScoreProgress(50);
       }else {
          uof = this.b;
          uof.y = false;
          LiveMultiPkProgressBarDefaultController.V2(uof).setSelfScoreProgress((int)(((long)100 * tc) / (tc + this.d)));
       }
       tc = this.b;
       tc.s = this.c;
       tc.t = this.d;
       return;
    }
}
