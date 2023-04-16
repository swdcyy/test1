package lu1.q$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lu1.v$i;
import lu1.v;

public final class q$a implements View$OnClickListener	// class@003049
{
    public final LiveMultiPkRenderCellViewModel b;

    public void q$a(LiveMultiPkRenderCellViewModel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "1")) {
          return;
       }
       this.b.E0(v$i.a);
       return;
    }
}
