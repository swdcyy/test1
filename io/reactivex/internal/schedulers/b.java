package io.reactivex.internal.schedulers.b;
import java.util.concurrent.Future;
import crd.b;
import java.lang.Object;
import java.util.concurrent.TimeUnit;

public final class b implements Future	// class@0014a8
{
    public final b b;

    public void b(b p0){
       super();
       this.b = p0;
    }
    public boolean cancel(boolean p0){
       this.b.dispose();
       return false;
    }
    public Object get(){
       return null;
    }
    public Object get(long p0,TimeUnit p1){
       return null;
    }
    public boolean isCancelled(){
       return false;
    }
    public boolean isDone(){
       return false;
    }
}
