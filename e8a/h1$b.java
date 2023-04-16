package e8a.h1$b;
import com.kwai.framework.player.core.b$b;
import e8a.h1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class h1$b implements b$b	// class@0020ad
{
    public final h1 b;

    public void h1$b(h1 p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       h1$b uob = h1$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0 == 3) {
          this.b.S8();
       }
       return;
    }
}
