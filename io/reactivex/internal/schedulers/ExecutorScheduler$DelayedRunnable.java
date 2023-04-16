package io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable;
import java.lang.Runnable;
import crd.b;
import lrd.a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ExecutorScheduler$DelayedRunnable extends AtomicReference implements Runnable, b, a	// class@0014a1
{
    public final SequentialDisposable direct;
    public final SequentialDisposable timed;
    public static final long serialVersionUID = 0xc7152072562d4b14;

    public void ExecutorScheduler$DelayedRunnable(Runnable p0){
       super(p0);
       this.timed = new SequentialDisposable();
       this.direct = new SequentialDisposable();
    }
    public void dispose(){
       if (this.getAndSet(null) != null) {
          this.timed.dispose();
          this.direct.dispose();
       }
       return;
    }
    public Runnable getWrappedRunnable(){
       Runnable runnable = this.get();
       if (runnable != null) {
       }else {
          runnable = Functions.b;
       }
       return runnable;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
    public void run(){
       Runnable runnable = this.get();
       if (runnable != null) {
          runnable.run();
          this.lazySet(null);
          DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
          this.timed.lazySet(dISPOSED);
          this.direct.lazySet(dISPOSED);
       }
       return;
    }
}
