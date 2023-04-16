package ff0.c;
import erd.g;
import java.lang.Object;
import ujc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ff0.f;

public final class c implements g	// class@002310
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
          f.b.onEventMainThread(p0);
       }
       return;
    }
}
