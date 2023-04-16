package ff0.g;
import erd.g;
import java.lang.Object;
import zt5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ff0.i;

public final class g implements g	// class@002314
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.p(p0, "event");
          i.c.onTaskPendantShowEvent(p0);
       }
       return;
    }
}
