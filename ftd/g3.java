package ftd.g3;
import ftd.m1;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import ftd.g3$a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.TypeCastException;
import java.lang.StringBuilder;

public final class g3 extends m1	// class@000e8a
{
    public final AtomicInteger e;
    public final Executor f;
    public final int g;
    public final String h;

    public void g3(int p0,String p1){
       super();
       this.g = p0;
       this.h = p1;
       this.e = new AtomicInteger();
       this.f = Executors.newScheduledThreadPool(p0, new g3$a(this));
       this.T();
    }
    public Executor A(){
       return this.f;
    }
    public void close(){
       Executor uExecutor = this.A();
       if (uExecutor == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.ExecutorService");
       }
       uExecutor.shutdown();
       return;
    }
    public String toString(){
       return "ThreadPoolDispatcher["+this.g+", "+this.h+']';
    }
}
