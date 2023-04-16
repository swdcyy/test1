package d59.v$c;
import x49.q;
import d59.v;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;

public final class v$c implements q	// class@002062
{
    public final v a;

    public void v$c(v p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$c.class, "2")) {
          return;
       }
       a.p(p0, "e");
       Object[] objArray = new Object[0];
       j0.c("adtkLoadPresenter", "render failed "+this.a.B+' '+p0+' ', objArray);
       this.a.V8(0);
       this.a.S8(true);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, v$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("adtkLoadPresenter", "render success "+this.a.B, objArray);
       return;
    }
}
