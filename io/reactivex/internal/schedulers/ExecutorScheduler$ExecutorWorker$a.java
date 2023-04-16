package io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$a;
import java.lang.Runnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Object;
import crd.b;

public final class ExecutorScheduler$ExecutorWorker$a implements Runnable	// class@0014a2
{
    public final SequentialDisposable b;
    public final Runnable c;
    public final ExecutorScheduler$ExecutorWorker d;

    public void ExecutorScheduler$ExecutorWorker$a(ExecutorScheduler$ExecutorWorker p0,SequentialDisposable p1,Runnable p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       this.b.replace(this.d.b(this.c));
    }
}
