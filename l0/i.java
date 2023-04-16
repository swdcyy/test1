package l0.i;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;
import java.lang.Throwable;
import java.util.concurrent.RejectedExecutionException;
import java.lang.IllegalArgumentException;

public class i implements Executor	// class@0024e9
{
    public final BlockingQueue b;
    public boolean c;
    public boolean d;
    public InterruptedIOException e;
    public RuntimeException f;
    public long g;
    public static final boolean h;

    static {
    }
    public void i(){
       super();
       this.g = -1;
       this.b = new LinkedBlockingQueue();
    }
    public void a(){
       this.b(0);
    }
    public void b(int p0){
       boolean b;
       long l2;
       long l = System.nanoTime();
       long l1 = TimeUnit.NANOSECONDS.convert((long)p0, TimeUnit.MILLISECONDS);
       if (this.d != null) {
          i te = this.e;
          if (te != null) {
             throw te;
          }
          throw this.f;
       }else if(this.c == null){
          this.c = true;
          while (this.c != null) {
             try{
                b = false;
                if (!p0) {
                   l2 = 0;
                   this.c(b, l2).run();
                }else {
                   l2 = l1 - System.nanoTime();
                   l2 = l2 + l;
                   this.c(true, l2).run();
                }
             }catch(java.io.InterruptedIOException e9){
                this.c = b;
                this.d = true;
                this.e = e9;
                throw e9;
             }catch(java.lang.RuntimeException e9){
                this.c = b;
                this.d = true;
                this.f = e9;
                throw e9;
             }
          }
          return;
       }else {
          throw new IllegalStateException("Cannot run loop when it is already running.");
       }
    }
    public final Runnable c(boolean p0,long p1){
       try{
          Runnable runnable = (!p0)? this.b.take(): this.b.poll(p1, TimeUnit.NANOSECONDS);
          if (runnable != null) {
             return runnable;
          }else {
             throw new SocketTimeoutException();
          }
       }catch(java.lang.InterruptedException e2){
          InterruptedIOException interruptedI = new InterruptedIOException();
          interruptedI.initCause(e2);
          throw interruptedI;
       }
    }
    public void execute(Runnable p0){
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       try{
          this.b.put(p0);
          return;
       }catch(java.lang.InterruptedException e2){
          throw new RejectedExecutionException(e2);
       }
    }
    public void l(){
       this.c = false;
    }
}
