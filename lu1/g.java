package lu1.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lu1.v$b;
import lu1.v;

public final class g implements View$OnClickListener	// class@00303f
{
    public final LiveMultiPkRenderCellViewModel b;

    public void g(LiveMultiPkRenderCellViewModel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b.E0(v$b.a);
       return;
    }
}
