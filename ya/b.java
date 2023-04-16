package ya.b;
import java.util.concurrent.AbstractExecutorService;
import java.lang.String;
import java.util.concurrent.Executor;
import java.util.concurrent.BlockingQueue;
import ya.b$a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Class;
import java.lang.Object;
import cb.a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.lang.UnsupportedOperationException;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.lang.StringBuilder;
import java.util.List;

public class b extends AbstractExecutorService	// class@002869
{
    public final String b;
    public final Executor c;
    public int d;
    public final BlockingQueue e;
    public final b$a f;
    public final AtomicInteger g;
    public final AtomicInteger h;
    public static final Class i;

    static {
       b.i = b.class;
    }
    public void b(String p0,int p1,Executor p2,BlockingQueue p3){
       super();
       if (p1 <= 0) {
          throw new IllegalArgumentException("max concurrency must be > 0");
       }
       this.b = p0;
       this.c = p2;
       this.d = p1;
       this.e = p3;
       this.f = new b$a(this);
       this.g = new AtomicInteger(0);
       this.h = new AtomicInteger(0);
       return;
    }
    public void a(){
       for (int i = this.g.get(); i < this.d; i = this.g.get()) {
          int i1 = i + 1;
          if (this.g.compareAndSet(i, i1)) {
             a.p(b.i, "%s: starting worker %d of %d", this.b, Integer.valueOf(i1), Integer.valueOf(this.d));
             this.c.execute(this.f);
             break ;
          }else {
             a.n(b.i, "%s: race in startWorkerIfNeeded; retrying", this.b);
          }
       }
       return;
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       throw new UnsupportedOperationException();
    }
    public void execute(Runnable p0){
       Objects.requireNonNull(p0, "runnable parameter is null");
       if (!this.e.offer(p0)) {
          throw new RejectedExecutionException(this.b+" queue is full, size="+this.e.size());
       }
       int i = this.e.size();
       int i1 = this.h.get();
       if (i > i1 && this.h.compareAndSet(i1, i)) {
          a.o(b.i, "%s: max pending work in queue = %d", this.b, Integer.valueOf(i));
       }
       this.a();
       return;
    }
    public boolean isShutdown(){
       return false;
    }
    public boolean isTerminated(){
       return false;
    }
    public void shutdown(){
       throw new UnsupportedOperationException();
    }
    public List shutdownNow(){
       throw new UnsupportedOperationException();
    }
}
