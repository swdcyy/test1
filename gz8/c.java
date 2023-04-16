package gz8.c;
import com.kwai.framework.player.core.b$b;
import gz8.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class c implements b$b	// class@002526
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.b.d(p0);
       return;
    }
}
