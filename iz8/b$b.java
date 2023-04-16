package iz8.b$b;
import erd.g;
import iz8.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cm9.a;

public final class b$b implements g	// class@00273d
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          if (p0 == FragmentEvent.PAUSE) {
             p0 = this.b.t;
             if (p0 != null) {
                p0.stop();
             }
          }
       }
       return;
    }
}
