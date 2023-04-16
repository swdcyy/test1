package io.reactivex.internal.schedulers.ExecutorScheduler$a;
import java.lang.Runnable;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable;
import java.lang.Object;
import crd.b;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class ExecutorScheduler$a implements Runnable	// class@0014a4
{
    public final ExecutorScheduler$DelayedRunnable b;
    public final ExecutorScheduler c;

    public void ExecutorScheduler$a(ExecutorScheduler p0,ExecutorScheduler$DelayedRunnable p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       ExecutorScheduler$a tb = this.b;
       tb.direct.replace(this.c.d(tb));
    }
}
