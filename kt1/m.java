package kt1.m;
import hc.c;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import msd.a;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class m extends c	// class@002e00
{
    public final a a;
    public final a b;

    public void m(a p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       this.a.V2(1, this.b);
       return;
    }
}
