package ftd.m1;
import ftd.s0;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import java.util.concurrent.Executor;
import ltd.e;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;
import java.lang.Object;
import ftd.k;
import ftd.u2;
import kotlinx.coroutines.CoroutineDispatcher;
import java.util.concurrent.Future;
import ftd.c2;
import ftd.p0;
import ftd.h1;
import asd.c;
import ftd.s0$a;
import java.lang.System;
import ftd.c1;
import ftd.b1;
import java.lang.String;
import kotlin.coroutines.CoroutineContext;
import ftd.j3;
import ftd.k3;

public abstract class m1 extends ExecutorCoroutineDispatcher implements s0	// class@00165a
{
    public boolean d;

    public void m1(){
       super();
    }
    public final void T(){
       this.d = e.c(this.A());
    }
    public final ScheduledFuture Y(Runnable p0,long p1,TimeUnit p2){
       ScheduledFuture scheduledFut = null;
       try{
          Executor uExecutor = this.A();
          if (!uExecutor instanceof ScheduledExecutorService) {
             uExecutor = scheduledFut;
          }
          if (uExecutor != null) {
             scheduledFut = uExecutor.schedule(p0, p1, p2);
          }
          return e0;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
    public void close(){
       Executor uExecutor = this.A();
       if (!uExecutor instanceof ExecutorService) {
          uExecutor = null;
       }
       if (uExecutor != null) {
          uExecutor.shutdown();
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof m1 && p0.A() == this.A())? true: false;
       return b;
    }
    public void g(long p0,k p1){
       ScheduledFuture scheduledFut = (this.d != null)? this.Y(new u2(this, p1), p0, TimeUnit.MILLISECONDS): null;
       if (scheduledFut != null) {
          c2.x(p1, scheduledFut);
          return;
       }else {
          p0.i.g(p0, p1);
          return;
       }
    }
    public Object h(long p0,c p1){
       return s0$a.a(this, p0, p1);
    }
    public int hashCode(){
       return System.identityHashCode(this.A());
    }
    public c1 k(long p0,Runnable p1){
       ScheduledFuture scheduledFut = (this.d != null)? this.Y(p1, p0, TimeUnit.MILLISECONDS): null;
       b1 uob1 = (scheduledFut != null)? new b1(scheduledFut): p0.i.k(p0, p1);
       return uob1;
    }
    public String toString(){
       return this.A().toString();
    }
    public void u(CoroutineContext p0,Runnable p1){
       Runnable runnable;
       try{
          Executor uExecutor = this.A();
          j3 oj3 = k3.b();
          if (oj3 != null) {
             runnable = oj3.i(p1);
             if (runnable != null) {
             label_0012 :
                uExecutor.execute(runnable);
             }
          }
          runnable = p1;
          goto label_0012 ;
       }catch(java.util.concurrent.RejectedExecutionException e0){
          j3 oj31 = k3.b();
          if (oj31 != null) {
             oj31.b();
          }
          p0.i.w0(p1);
       }
       return;
    }
}
