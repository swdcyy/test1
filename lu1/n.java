package lu1.n;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lu1.v$f;
import lu1.v;

public final class n implements View$OnClickListener	// class@003046
{
    public final LiveMultiPkRenderCellViewModel b;

    public void n(LiveMultiPkRenderCellViewModel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.b.E0(v$f.a);
       return;
    }
}
