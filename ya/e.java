package ya.e;
import ya.d;
import java.util.concurrent.AbstractExecutorService;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.Object;
import ya.f;
import java.util.concurrent.TimeUnit;
import java.lang.UnsupportedOperationException;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.Objects;
import android.os.Looper;
import java.util.concurrent.RunnableFuture;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Future;

public class e extends AbstractExecutorService implements d	// class@00286c
{
    public final Handler b;

    public void e(Handler p0){
       super();
       this.b = p0;
    }
    public f a(Runnable p0,Object p1){
       return new f(this.b, p0, p1);
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       throw new UnsupportedOperationException();
    }
    public f b(Callable p0){
       return new f(this.b, p0);
    }
    public ScheduledFuture c(Runnable p0,Object p1){
       Objects.requireNonNull(p0);
       f uof = this.a(p0, p1);
       this.execute(uof);
       return uof;
    }
    public void execute(Runnable p0){
       this.b.post(p0);
    }
    public boolean isShutdown(){
       return false;
    }
    public boolean isTerminated(){
       return false;
    }
    public void l(){
       this.b.getLooper().quit();
    }
    public RunnableFuture newTaskFor(Runnable p0,Object p1){
       return this.a(p0, p1);
    }
    public RunnableFuture newTaskFor(Callable p0){
       return this.b(p0);
    }
    public boolean s(){
       boolean b = (Thread.currentThread() == this.b.getLooper().getThread())? true: false;
       return b;
    }
    public ScheduledFuture schedule(Runnable p0,long p1,TimeUnit p2){
       f uof = this.a(p0, null);
       this.b.postDelayed(uof, p2.toMillis(p1));
       return uof;
    }
    public ScheduledFuture schedule(Callable p0,long p1,TimeUnit p2){
       f uof = this.b(p0);
       this.b.postDelayed(uof, p2.toMillis(p1));
       return uof;
    }
    public ScheduledFuture scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       throw new UnsupportedOperationException();
    }
    public ScheduledFuture scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       throw new UnsupportedOperationException();
    }
    public void shutdown(){
       throw new UnsupportedOperationException();
    }
    public List shutdownNow(){
       throw new UnsupportedOperationException();
    }
    public Future submit(Runnable p0){
       return this.c(p0, null);
    }
    public Future submit(Runnable p0,Object p1){
       return this.c(p0, p1);
    }
    public Future submit(Callable p0){
       Objects.requireNonNull(p0);
       f uof = this.b(p0);
       this.execute(uof);
       return uof;
    }
}
