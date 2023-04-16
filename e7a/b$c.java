package e7a.b$c;
import erd.g;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e7a.b;
import e7a.b$a;

public final class b$c implements g	// class@00207e
{
    public static final b$c b;

    static {
       b$c.b = new b$c();
    }
    public void b$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          a.p(p0, "event");
          if (p0 == ActivityEvent.DESTROY) {
             b.t.a(false);
          }
       }
       return;
    }
}
