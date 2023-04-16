package io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable;
import java.lang.Runnable;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ExecutorScheduler$ExecutorWorker$BooleanRunnable extends AtomicBoolean implements Runnable, b	// class@00192a
{
    public final Runnable actual;
    public static final long serialVersionUID = 0xde657a0f3a4d2514;

    public void ExecutorScheduler$ExecutorWorker$BooleanRunnable(Runnable p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.lazySet(true);
    }
    public boolean isDisposed(){
       return this.get();
    }
    public void run(){
       if (this.get()) {
          return;
       }
       this.actual.run();
       this.lazySet(true);
       return;
    }
}
