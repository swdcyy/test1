package com.loc.cl;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.loc.cl$1;
import com.loc.ck;
import java.lang.Throwable;
import java.lang.String;
import com.loc.an;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Runnable;

public abstract class cl	// class@0013c1
{
    public ThreadPoolExecutor a;
    public ck$a b;
    public ConcurrentHashMap c;

    public void cl(){
       super();
       this.c = new ConcurrentHashMap();
       this.b = new cl$1(this);
    }
    public synchronized final void a(ck p0){
       this.c.remove(p0);
    }
    public synchronized final void a(ck p0,Future p1){
       this.c.put(p0, p1);
    }
    public final Executor b(){
       return this.a;
    }
    public final void b(ck p0){
       if (this.c(p0)) {
          return;
       }
       try{
          cl ta = this.a;
          if (ta == null || ta.isShutdown()) {
          }else {
             p0.e = this.b;
             Future uFuture = this.a.submit(p0);
             if (uFuture == null) {
                return;
             }
             this.a(p0, uFuture);
             return;
          }
       }catch(java.util.concurrent.RejectedExecutionException e3){
          an.b(e3, "TPool", "addTask");
       }
       return;
    }
    public synchronized final boolean c(ck p0){
       boolean b = this.c.containsKey(p0);
       return b;
    }
}
