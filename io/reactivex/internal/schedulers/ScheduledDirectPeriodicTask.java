package io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import java.lang.Runnable;
import io.reactivex.internal.schedulers.AbstractDirectTask;
import java.lang.Thread;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import ird.a;

public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable	// class@0014a6
{
    public static final long serialVersionUID = 0x1924f211b909b42f;

    public void ScheduledDirectPeriodicTask(Runnable p0){
       super(p0);
    }
    public Runnable getWrappedRunnable(){
       return super.getWrappedRunnable();
    }
    public void run(){
       this.runner = Thread.currentThread();
       this.runnable.run();
       this.runner = null;
       return;
    }
}
