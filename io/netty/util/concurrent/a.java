package io.netty.util.concurrent.a;
import yqd.f;
import java.lang.Object;
import io.netty.util.concurrent.f;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import yqd.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import yqd.m;
import java.util.concurrent.Callable;
import java.util.Collections;
import java.util.concurrent.Future;

public abstract class a implements f	// class@001101
{

    public void a(){
       super();
    }
    public f H1(){
       return this.H3(2, 15, TimeUnit.SECONDS);
    }
    public void execute(Runnable p0){
       this.next().execute(p0);
    }
    public List invokeAll(Collection p0){
       return this.next().invokeAll(p0);
    }
    public List invokeAll(Collection p0,long p1,TimeUnit p2){
       return this.next().invokeAll(p0, p1, p2);
    }
    public Object invokeAny(Collection p0){
       return this.next().invokeAny(p0);
    }
    public Object invokeAny(Collection p0,long p1,TimeUnit p2){
       return this.next().invokeAny(p0, p1, p2);
    }
    public ScheduledFuture schedule(Runnable p0,long p1,TimeUnit p2){
       return this.schedule(p0, p1, p2);
    }
    public ScheduledFuture schedule(Callable p0,long p1,TimeUnit p2){
       return this.schedule(p0, p1, p2);
    }
    public m schedule(Runnable p0,long p1,TimeUnit p2){
       return this.next().schedule(p0, p1, p2);
    }
    public m schedule(Callable p0,long p1,TimeUnit p2){
       return this.next().schedule(p0, p1, p2);
    }
    public ScheduledFuture scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.scheduleAtFixedRate(p0, p1, p2, p3);
    }
    public m scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.next().scheduleAtFixedRate(p0, p1, p2, p3);
    }
    public ScheduledFuture scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.scheduleWithFixedDelay(p0, p1, p2, p3);
    }
    public m scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.next().scheduleWithFixedDelay(p0, p1, p2, p3);
    }
    public abstract void shutdown();
    public List shutdownNow(){
       this.shutdown();
       return Collections.emptyList();
    }
    public f submit(Runnable p0){
       return this.next().submit(p0);
    }
    public f submit(Runnable p0,Object p1){
       return this.next().submit(p0, p1);
    }
    public f submit(Callable p0){
       return this.next().submit(p0);
    }
    public Future submit(Runnable p0){
       return this.submit(p0);
    }
    public Future submit(Runnable p0,Object p1){
       return this.submit(p0, p1);
    }
    public Future submit(Callable p0){
       return this.submit(p0);
    }
}
