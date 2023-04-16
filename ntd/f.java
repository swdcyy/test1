package ntd.f;
import ntd.j;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ntd.d;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlin.coroutines.CoroutineContext;

public final class f extends ExecutorCoroutineDispatcher implements j, Executor	// class@001f80
{
    public final ConcurrentLinkedQueue d;
    public final d e;
    public final int f;
    public final int g;
    public int inFlightTasks;
    public static final AtomicIntegerFieldUpdater h;

    static {
       f.h = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");
    }
    public void f(d p0,int p1,int p2){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.d = new ConcurrentLinkedQueue();
       this.inFlightTasks = 0;
    }
    public Executor A(){
       return this;
    }
    public final void T(Runnable p0,boolean p1){
       while (true) {
          AtomicIntegerFieldUpdater h = f.h;
          if (h.incrementAndGet(this) <= this.f) {
             this.e.f0(p0, this, p1);
             return;
          }else {
             this.d.add(p0);
             if (h.decrementAndGet(this) >= this.f) {
                return;
             }
             p0 = this.d.poll();
             if (p0 != null) {
                continue ;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public final d Y(){
       return this.e;
    }
    public final int b0(){
       return this.f;
    }
    public void close(){
       throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }
    public void execute(Runnable p0){
       this.T(p0, false);
    }
    public void f(){
       Runnable runnable = this.d.poll();
       if (runnable != null) {
          this.e.f0(runnable, this, true);
          return;
       }else {
          f.h.decrementAndGet(this);
          runnable = this.d.poll();
          if (runnable != null) {
             this.T(runnable, true);
          }
          return;
       }
    }
    public int r(){
       return this.g;
    }
    public String toString(){
       return super.toString()+"[dispatcher = "+this.e+']';
    }
    public void u(CoroutineContext p0,Runnable p1){
       this.T(p1, false);
    }
    public void v(CoroutineContext p0,Runnable p1){
       this.T(p1, true);
    }
}
