package ff0.d;
import erd.g;
import java.lang.Object;
import dg0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ff0.f;

public final class d implements g	// class@002311
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.p(p0, "event");
          f.b.onEventMainThread(p0);
       }
       return;
    }
}
