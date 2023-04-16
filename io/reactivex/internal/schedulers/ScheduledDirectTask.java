package io.reactivex.internal.schedulers.ScheduledDirectTask;
import java.util.concurrent.Callable;
import io.reactivex.internal.schedulers.AbstractDirectTask;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Void;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

public final class ScheduledDirectTask extends AbstractDirectTask implements Callable	// class@001932
{
    public static final long serialVersionUID = 0x1924f211b909b42f;

    public void ScheduledDirectTask(Runnable p0){
       super(p0);
    }
    public Object call(){
       return this.call();
    }
    public Void call(){
       this.runner = Thread.currentThread();
       this.runnable.run();
       this.lazySet(AbstractDirectTask.FINISHED);
       this.runner = null;
       return null;
    }
    public Runnable getWrappedRunnable(){
       return super.getWrappedRunnable();
    }
}
