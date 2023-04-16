package ob6.p$a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import ob6.p$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class p$a	// class@001ff5
{
    public static final ConcurrentLinkedQueue a;
    public static final p$a b;

    static {
       p$a.b = new p$a();
       p$a.a = new ConcurrentLinkedQueue();
    }
    public void p$a(){
       super();
    }
    public final void a(p$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       p$a.a.add(p0);
       return;
    }
}
