package a7a.c$h;
import erd.g;
import a7a.c;
import java.lang.Object;
import rd5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;

public final class c$h implements g	// class@000049
{
    public final c b;

    public void c$h(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$h.class, "1")) {
       }else if(p0.a == ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED){
          PatchProxy.onMethodExit(c$h.class, "1");
       }else if(p0.b != null){
          this.b.b9(9);
       }else {
          this.b.c9(9);
       }
       PatchProxy.onMethodExit(c$h.class, "1");
       return;
    }
}
