package kt1.j;
import erd.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import msd.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j implements g	// class@002dfd
{
    public final a b;
    public final a c;

    public void j(a p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          this.b.V2(2, this.c);
       }
       return;
    }
}
