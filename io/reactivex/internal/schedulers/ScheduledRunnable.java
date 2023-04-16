package io.reactivex.internal.schedulers.ScheduledRunnable;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import crd.b;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.Object;
import io.reactivex.internal.disposables.a;
import java.lang.Thread;
import java.util.concurrent.Future;
import java.lang.Throwable;
import ird.a;

public final class ScheduledRunnable extends AtomicReferenceArray implements Runnable, Callable, b	// class@0014a7
{
    public final Runnable actual;
    public static final Object ASYNC_DISPOSED;
    public static final Object DONE;
    public static final Object PARENT_DISPOSED;
    public static final Object SYNC_DISPOSED;
    public static final long serialVersionUID;

    static {
       ScheduledRunnable.PARENT_DISPOSED = new Object();
       ScheduledRunnable.SYNC_DISPOSED = new Object();
       ScheduledRunnable.ASYNC_DISPOSED = new Object();
       ScheduledRunnable.DONE = new Object();
    }
    public void ScheduledRunnable(Runnable p0,a p1){
       super(3);
       this.actual = p0;
       this.lazySet(0, p1);
    }
    public Object call(){
       this.run();
       return null;
    }
    public void dispose(){
       boolean b;
       int i = 1;
       Object obj = this.get(i);
       while (obj != ScheduledRunnable.DONE) {
          Object sYNC_DISPOSE = ScheduledRunnable.SYNC_DISPOSED;
          if (obj != sYNC_DISPOSE) {
             Object aSYNC_DISPOS = ScheduledRunnable.ASYNC_DISPOSED;
             if (obj == aSYNC_DISPOS) {
                break ;
             }else if(this.get(2) != Thread.currentThread()){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                sYNC_DISPOSE = aSYNC_DISPOS;
             }
             if (this.compareAndSet(i, obj, sYNC_DISPOSE)) {
                if (obj != null) {
                   obj.cancel(b);
                   break ;
                }else {
                   break ;
                }
             }
          }else {
             break ;
          }
       }
       Object obj1 = this.get(0);
       while (obj1 != ScheduledRunnable.DONE) {
          obj = ScheduledRunnable.PARENT_DISPOSED;
          if (obj1 == obj || obj1 == null) {
             break ;
          }
       }
    label_004b :
       return;
    }
    public boolean isDisposed(){
       int i = 0;
       Object obj = this.get(i);
       if (obj == ScheduledRunnable.PARENT_DISPOSED || obj == ScheduledRunnable.DONE) {
          i = true;
       }
       return i;
    }
    public void run(){
       int i = 2;
       this.lazySet(i, Thread.currentThread());
       Object obj = null;
       this.actual.run();
       this.lazySet(i, obj);
       obj = this.get(0);
       if (obj != ScheduledRunnable.PARENT_DISPOSED && (this.compareAndSet(0, obj, ScheduledRunnable.DONE) && obj != null)) {
          obj.b(this);
       }
       do {
          obj = this.get(1);
       } while (obj != ScheduledRunnable.SYNC_DISPOSED && (obj == ScheduledRunnable.ASYNC_DISPOSED || this.compareAndSet(1, obj, ScheduledRunnable.DONE)));
       return;
    }
    public void setFuture(Future p0){
       while (true) {
          int i = 1;
          Object obj = this.get(i);
          if (obj == ScheduledRunnable.DONE) {
             return;
          }
          if (obj == ScheduledRunnable.SYNC_DISPOSED) {
             p0.cancel(false);
             return;
          }else if(obj == ScheduledRunnable.ASYNC_DISPOSED){
             p0.cancel(i);
             return;
          }else if(this.compareAndSet(i, obj, p0)){
             break ;
          }
       }
       return;
    }
}
