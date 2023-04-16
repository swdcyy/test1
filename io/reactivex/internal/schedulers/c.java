package io.reactivex.internal.schedulers.c;
import java.util.concurrent.Callable;
import crd.b;
import java.util.concurrent.FutureTask;
import io.reactivex.internal.functions.Functions;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Future;
import java.lang.Thread;
import java.lang.Throwable;
import ird.a;

public final class c implements Callable, b	// class@0014a9
{
    public final Runnable b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final ExecutorService e;
    public Thread f;
    public static final FutureTask g;

    static {
       c.g = new FutureTask(Functions.b, null);
    }
    public void c(Runnable p0,ExecutorService p1){
       super();
       this.b = p0;
       this.d = new AtomicReference();
       this.c = new AtomicReference();
       this.e = p1;
    }
    public void a(Future p0){
       boolean b;
       while (true) {
          Future uFuture = this.d.get();
          if (uFuture == c.g) {
             b = (this.f != Thread.currentThread())? true: false;
             break ;
          }else {
             if (this.d.compareAndSet(uFuture, p0)) {
                return;
             }
             continue ;
          }
       }
       p0.cancel(b);
       return;
    }
    public Object call(){
       this.f = Thread.currentThread();
       this.b.run();
       Future uFuture = this.e.submit(this);
       while (true) {
          Future uFuture1 = this.c.get();
          if (uFuture1 == c.g) {
             boolean b = (this.f != Thread.currentThread())? true: false;
             uFuture.cancel(b);
          }else {
             if (!this.c.compareAndSet(uFuture1, uFuture)) {
                continue ;
             }
          }
          this.f = null;
          break ;
       }
       return null;
    }
    public void dispose(){
       FutureTask g = c.g;
       Future andSet = this.d.getAndSet(g);
       boolean b = true;
       if (andSet != null && andSet != g) {
          boolean b1 = (this.f != Thread.currentThread())? true: false;
          andSet.cancel(b1);
       }
       andSet = this.c.getAndSet(g);
       if (andSet != null && andSet != g) {
          if (this.f == Thread.currentThread()) {
             b = false;
          }
          andSet.cancel(b);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.d.get() == c.g)? true: false;
       return b;
    }
}
