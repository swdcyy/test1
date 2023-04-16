package io.netty.util.internal.chmv8.ForkJoinTask$AdaptedRunnable;
import java.util.concurrent.RunnableFuture;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Runnable;
import java.lang.Object;
import java.util.Objects;

public final class ForkJoinTask$AdaptedRunnable extends ForkJoinTask implements RunnableFuture	// class@001175
{
    public Object result;
    public final Runnable runnable;
    public static final long serialVersionUID = 0x489d6925990d6e4e;

    public void ForkJoinTask$AdaptedRunnable(Runnable p0,Object p1){
       super();
       Objects.requireNonNull(p0);
       this.runnable = p0;
       this.result = p1;
    }
    public final boolean exec(){
       this.runnable.run();
       return true;
    }
    public final Object getRawResult(){
       return this.result;
    }
    public final void run(){
       this.invoke();
    }
    public final void setRawResult(Object p0){
       this.result = p0;
    }
}
