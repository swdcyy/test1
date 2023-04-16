package bq1.e;
import xd1.g$a;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yh3.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import zp1.b;
import zp1.q$g;
import zp1.q;
import xd1.f;
import zp1.q$e;
import zp1.q$f;
import zp1.q$h;

public final class e implements g$a	// class@0003e2
{
    public final LiveMultiChatAudienceBaseCellController a;

    public void e(LiveMultiChatAudienceBaseCellController p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.a.b3().x0(q$g.a);
       this.a.J3("BEAUTIFY");
       return;
    }
    public void b(){
       f.a(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.a.b3().x0(q$e.a);
       this.a.J3("CLOSE");
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.a.b3().x0(q$f.a);
       this.a.J3("MUTE");
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.a.b3().x0(q$h.a);
       this.a.J3("TURN_OVER");
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.a.J3("CANCEL");
       return;
    }
    public void onDismiss(){
       this.a.I = null;
    }
}
