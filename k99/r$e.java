package k99.r$e;
import erd.g;
import k99.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class r$e implements g	// class@002b93
{
    public final r b;

    public void r$e(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$e.class, "1")) {
       }else {
          p0 = this.b;
          p0.u = true;
          p0.Y8();
       }
       return;
    }
}
