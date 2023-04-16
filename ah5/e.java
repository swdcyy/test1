package ah5.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import yg5.b0;
import ah5.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.util.List;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;

public class e extends PresenterV2	// class@0000a4
{
    public List p;
    public TabsPanelHostFragment q;
    public b0 r;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.X7(this.r.a().subscribe(new d(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(List.class);
       this.q = this.q8(TabsPanelHostFragment.class);
       this.r = this.r8("COMMENT_PANEL_PANEL_CONTROLLER");
       return;
    }
}
