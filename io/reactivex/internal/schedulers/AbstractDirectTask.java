package io.reactivex.internal.schedulers.AbstractDirectTask;
import crd.b;
import lrd.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.FutureTask;
import io.reactivex.internal.functions.Functions;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.Future;
import java.lang.Thread;

public abstract class AbstractDirectTask extends AtomicReference implements b, a	// class@001928
{
    public final Runnable runnable;
    public Thread runner;
    public static final FutureTask DISPOSED;
    public static final FutureTask FINISHED;
    public static final long serialVersionUID;

    static {
       Runnable b = Functions.b;
       AbstractDirectTask.FINISHED = new FutureTask(b, null);
       AbstractDirectTask.DISPOSED = new FutureTask(b, null);
    }
    public void AbstractDirectTask(Runnable p0){
       super();
       this.runnable = p0;
    }
    public final void dispose(){
       Future uFuture = this.get();
       if (uFuture != AbstractDirectTask.FINISHED) {
          FutureTask dISPOSED = AbstractDirectTask.DISPOSED;
          if (uFuture != dISPOSED && (this.compareAndSet(uFuture, dISPOSED) && uFuture != null)) {
             boolean b = (this.runner != Thread.currentThread())? true: false;
             uFuture.cancel(b);
          }
       }
       return;
    }
    public Runnable getWrappedRunnable(){
       return this.runnable;
    }
    public final boolean isDisposed(){
       Future uFuture = this.get();
       boolean b = (uFuture == AbstractDirectTask.FINISHED || uFuture == AbstractDirectTask.DISPOSED)? true: false;
       return b;
    }
    public final void setFuture(Future p0){
       Future uFuture = this.get();
       while (uFuture != AbstractDirectTask.FINISHED) {
          if (uFuture == AbstractDirectTask.DISPOSED) {
             boolean b = (this.runner != Thread.currentThread())? true: false;
             p0.cancel(b);
             break ;
          }else if(this.compareAndSet(uFuture, p0)){
             break ;
          }
       }
       return;
    }
}
