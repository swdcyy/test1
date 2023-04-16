package fg0.b;
import erd.g;
import java.lang.Object;
import zt5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg0.d;

public final class b implements g	// class@00231e
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "event");
          d.c.onTaskPendantShowEvent(p0);
       }
       return;
    }
}
