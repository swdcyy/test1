package mt1.b;
import android.view.View$OnClickListener;
import java.lang.String;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ps1.e;
import zs1.b;
import du1.d;

public final class b implements View$OnClickListener	// class@003213
{
    public final String b;
    public final LiveMultiPkCohesionVoteBangsVC c;

    public void b(String p0,LiveMultiPkCohesionVoteBangsVC p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
          return;
       }
       this.c.r.k().T(this.b);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
