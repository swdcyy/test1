package fg0.c;
import erd.g;
import java.lang.Object;
import zt5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg0.d;

public final class c implements g	// class@00231f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "event");
          d.c.onTaskPendantHideEvent(p0);
       }
       return;
    }
}
