package io.netty.util.internal.chmv8.ForkJoinTask$AdaptedRunnableAction;
import java.util.concurrent.RunnableFuture;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Runnable;
import java.lang.Object;
import java.util.Objects;
import java.lang.Void;

public final class ForkJoinTask$AdaptedRunnableAction extends ForkJoinTask implements RunnableFuture	// class@001176
{
    public final Runnable runnable;
    public static final long serialVersionUID = 0x489d6925990d6e4e;

    public void ForkJoinTask$AdaptedRunnableAction(Runnable p0){
       super();
       Objects.requireNonNull(p0);
       this.runnable = p0;
    }
    public final boolean exec(){
       this.runnable.run();
       return true;
    }
    public Object getRawResult(){
       return this.getRawResult();
    }
    public final Void getRawResult(){
       return null;
    }
    public final void run(){
       this.invoke();
    }
    public void setRawResult(Object p0){
       this.setRawResult(p0);
    }
    public final void setRawResult(Void p0){
    }
}
