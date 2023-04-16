package ff0.a;
import erd.g;
import java.lang.Object;
import dg0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ff0.b;

public final class a implements g	// class@00230e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "event");
          b.b.onPageChangeEvent(p0);
       }
       return;
    }
}
