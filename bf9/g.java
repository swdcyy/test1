package bf9.g;
import sfc.a;
import bf9.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;

public class g extends a	// class@000491
{
    public final h c;

    public void g(h p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.b(p0);
       a.D().e("PlatformMagicController", "requestMagicFace error", p0);
       return;
    }
}
