package lu1.i;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lu1.v$d;
import lu1.v;
import lu1.v$e;

public final class i implements View$OnClickListener	// class@003041
{
    public final boolean b;
    public final LiveMultiPkRenderCellViewModel c;

    public void i(boolean p0,LiveMultiPkRenderCellViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       if (this.b != null) {
          this.c.E0(v$d.a);
       }else {
          this.c.E0(v$e.a);
       }
       return;
    }
}
