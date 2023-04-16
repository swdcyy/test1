package io.netty.util.internal.chmv8.ForkJoinTask$AdaptedCallable;
import java.util.concurrent.RunnableFuture;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.Objects;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class ForkJoinTask$AdaptedCallable extends ForkJoinTask implements RunnableFuture	// class@001174
{
    public final Callable callable;
    public Object result;
    public static final long serialVersionUID = 0x2763fe86dcb18e30;

    public void ForkJoinTask$AdaptedCallable(Callable p0){
       super();
       Objects.requireNonNull(p0);
       this.callable = p0;
    }
    public final boolean exec(){
       try{
          this.result = this.callable.call();
          return true;
       }catch(java.lang.Error e0){
          throw e0;
       }catch(java.lang.RuntimeException e0){
          throw e0;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(e0);
       }
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
