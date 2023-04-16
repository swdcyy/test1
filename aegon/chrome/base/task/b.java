package aegon.chrome.base.task.b;
import aegon.chrome.base.task.a;
import g0.h;
import aegon.chrome.base.task.b$c;
import aegon.chrome.base.task.b$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import aegon.chrome.base.task.b$b;
import java.util.concurrent.Callable;
import g0.b;
import g0.a;
import java.lang.Runnable;
import aegon.chrome.base.ThreadUtils;

public abstract class b	// class@000177
{
    public final Callable a;
    public final b$b b;
    public int c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public static final Executor f;
    public static final Executor g;
    public static final b$c h;

    static {
       b.f = a.b;
       b.g = new h();
       b.h = new b$c(null);
    }
    public void b(){
       super();
       this.c = 0;
       this.d = new AtomicBoolean();
       this.e = new AtomicBoolean();
       b$a uoa = new b$a(this);
       this.a = uoa;
       this.b = new b$b(this, uoa);
    }
    public abstract Object a();
    public abstract void b(Object p0);
    public void c(Object p0){
       if (this instanceof b) {
          this.c = 2;
       }else {
          ThreadUtils.c(new a(this, p0));
       }
       return;
    }
    public void d(Object p0){
       if (!this.e.get()) {
          this.c(p0);
       }
       return;
    }
}
