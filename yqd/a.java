package yqd.a;
import yqd.e;
import java.util.concurrent.AbstractExecutorService;
import yqd.f;
import java.lang.Object;
import java.util.Set;
import java.util.Collections;
import io.netty.util.concurrent.f;
import java.util.concurrent.TimeUnit;
import io.netty.util.concurrent.k;
import io.netty.util.concurrent.d;
import java.lang.Throwable;
import yqd.g;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.DefaultPromise;
import java.util.Iterator;
import yqd.a$a;
import java.lang.Runnable;
import java.util.concurrent.RunnableFuture;
import yqd.l;
import java.util.concurrent.Callable;
import java.lang.Thread;
import java.util.concurrent.ScheduledFuture;
import yqd.m;
import java.lang.UnsupportedOperationException;
import java.util.List;
import java.util.concurrent.Future;
import yqd.o;

public abstract class a extends AbstractExecutorService implements e	// class@002a8e
{
    public final f b;
    public final Collection c;

    public void a(){
       super(null);
    }
    public void a(f p0){
       super();
       this.c = Collections.singleton(this);
       this.b = p0;
    }
    public f H1(){
       return this.H3(2, 15, TimeUnit.SECONDS);
    }
    public f J(){
       return this.b;
    }
    public k W(){
       return new d(this);
    }
    public f X(Throwable p0){
       return new g(this, p0);
    }
    public l Z(){
       return new DefaultPromise(this);
    }
    public Set children(){
       return this.c;
    }
    public Iterator iterator(){
       return new a$a(this);
    }
    public final RunnableFuture newTaskFor(Runnable p0,Object p1){
       return new l(this, l.Q0(p0, p1));
    }
    public final RunnableFuture newTaskFor(Callable p0){
       return new l(this, p0);
    }
    public e next(){
       return this;
    }
    public boolean q0(){
       return this.U3(Thread.currentThread());
    }
    public ScheduledFuture schedule(Runnable p0,long p1,TimeUnit p2){
       return this.schedule(p0, p1, p2);
    }
    public ScheduledFuture schedule(Callable p0,long p1,TimeUnit p2){
       return this.schedule(p0, p1, p2);
    }
    public m schedule(Runnable p0,long p1,TimeUnit p2){
       throw new UnsupportedOperationException();
    }
    public m schedule(Callable p0,long p1,TimeUnit p2){
       throw new UnsupportedOperationException();
    }
    public ScheduledFuture scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.scheduleAtFixedRate(p0, p1, p2, p3);
    }
    public m scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3){
       throw new UnsupportedOperationException();
    }
    public ScheduledFuture scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       return this.scheduleWithFixedDelay(p0, p1, p2, p3);
    }
    public m scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3){
       throw new UnsupportedOperationException();
    }
    public abstract void shutdown();
    public List shutdownNow(){
       this.shutdown();
       return Collections.emptyList();
    }
    public f submit(Runnable p0){
       return super.submit(p0);
    }
    public f submit(Runnable p0,Object p1){
       return super.submit(p0, p1);
    }
    public f submit(Callable p0){
       return super.submit(p0);
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
    public f t0(Object p0){
       return new o(this, p0);
    }
}
