package com.google.common.util.concurrent.AbstractFuture$h;
import com.google.common.util.concurrent.AbstractFuture;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public abstract class AbstractFuture$h extends AbstractFuture	// class@00192a
{

    public void AbstractFuture$h(){
       super();
    }
    public final boolean cancel(boolean p0){
       return super.cancel(p0);
    }
    public final Object get(){
       return super.get();
    }
    public final Object get(long p0,TimeUnit p1){
       return super.get(p0, p1);
    }
    public final boolean isCancelled(){
       return super.isCancelled();
    }
    public final boolean isDone(){
       return super.isDone();
    }
    public final void u(Runnable p0,Executor p1){
       super.u(p0, p1);
    }
}
