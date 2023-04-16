package lu1.b;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$c;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lu1.v$g;
import lu1.v;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;

public final class b implements LiveMultiPkDuetContinuousWinView$c	// class@00303a
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public final void onClick(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       this.a.c.E0(v$g.a);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
