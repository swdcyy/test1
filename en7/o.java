package en7.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class o	// class@002317
{
    public AtomicInteger a;

    public void o(){
       super();
       this.a = new AtomicInteger(0);
    }
    public abstract void a();
    public final void b(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       if (!this.a.decrementAndGet()) {
          this.a();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.a.incrementAndGet();
       return;
    }
}
