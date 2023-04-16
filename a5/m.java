package a5.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.LinkedHashSet;
import android.os.Handler;
import android.os.Looper;
import a5.m$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import a5.h;
import java.lang.Throwable;
import a5.k;
import java.util.Set;
import a5.l;
import java.lang.IllegalStateException;
import java.lang.String;

public class m	// class@0000ed
{
    public final Set a;
    public final Set b;
    public final Handler c;
    public k d;
    public static Executor e;

    static {
       m.e = Executors.newCachedThreadPool();
    }
    public void m(Callable p0){
       super();
       this.a = new LinkedHashSet(1);
       this.b = new LinkedHashSet(1);
       this.c = new Handler(Looper.getMainLooper());
       this.d = null;
       m.e.execute(new m$a(this, p0));
    }
    public synchronized m a(h p0){
       if (this.d != null && this.d.a() != null) {
          p0.onResult(this.d.a());
       }
       this.b.add(p0);
       return this;
    }
    public synchronized m b(h p0){
       if (this.d != null && this.d.b() != null) {
          p0.onResult(this.d.b());
       }
       this.a.add(p0);
       return this;
    }
    public void c(k p0){
       if (this.d != null) {
          throw new IllegalStateException("A task may only be set once.");
       }
       this.d = p0;
       this.c.post(new l(this));
       return;
    }
}
