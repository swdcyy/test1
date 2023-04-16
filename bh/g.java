package bh.g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.LinkedHashSet;
import android.os.Handler;
import android.os.Looper;
import bh.e;
import java.lang.Throwable;
import bh.g$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import bh.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import bh.f;
import java.lang.IllegalStateException;

public class g	// class@000b34
{
    public final Set a;
    public final Set b;
    public final Handler c;
    public e d;
    public static Executor e;

    static {
       g.e = Executors.newCachedThreadPool();
    }
    public void g(Callable p0){
       super(p0, false);
    }
    public void g(Callable p0,boolean p1){
       super();
       this.a = new LinkedHashSet(1);
       this.b = new LinkedHashSet(1);
       this.c = new Handler(Looper.getMainLooper());
       this.d = null;
       if (p1) {
          this.c(p0.call());
       }else {
          g.e.execute(new g$a(this, p0));
       }
       return;
    }
    public synchronized g a(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null && this.d.a() != null) {
          p0.onResult(this.d.a());
       }
       this.b.add(p0);
       return this;
    }
    public synchronized g b(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null && this.d.b() != null) {
          p0.onResult(this.d.b());
       }
       this.a.add(p0);
       return this;
    }
    public void c(e p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "1")) {
          return;
       }
       if (this.d != null) {
          throw new IllegalStateException("A task may only be set once.");
       }
       this.d = p0;
       if (!PatchProxy.applyVoid(null, this, og, "6")) {
          this.c.post(new f(this));
       }
       return;
    }
}
