package ff0.h;
import erd.g;
import java.lang.Object;
import zt5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ff0.i;

public final class h implements g	// class@002315
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          a.p(p0, "event");
          i.c.onTaskPendantHideEvent(p0);
       }
       return;
    }
}
