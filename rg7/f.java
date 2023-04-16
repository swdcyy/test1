package rg7.f;
import java.lang.Thread;
import java.lang.String;
import java.lang.Object;
import android.os.SystemClock;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.anr.b;

public abstract class f extends Thread	// class@00238b
{
    public boolean b;
    public long c;
    public long d;

    public void f(){
       super();
       this.b = false;
       this.c = 0;
       this.d = 0;
    }
    public abstract void a();
    public abstract long b();
    public abstract boolean c();
    public void d(){
       if (!this.c()) {
          this.getName();
          return;
       }else {
          this.b = true;
          this.getName();
          return;
       }
    }
    public void e(){
       if (!this.c()) {
          this.getName();
          return;
       }else {
          this.b = false;
          this.getName();
          try{
             _monitor_enter(this);
             this.notifyAll();
             _monitor_exit(this);
             return;
          }catch(java.lang.IllegalMonitorStateException e0){
          }
       }
    }
    public abstract void f(long p0,long p1);
    public void run(){
       long l1;
       long l2;
       this.a();
       while (this.c()) {
          long l = -1;
          if (this.b != null) {
             this.getName();
             if (this.d >= 0) {
                l1 = SystemClock.elapsedRealtime() - this.d;
                l1 = l1 - this.b();
             }else {
                l1 = l;
             }
             _monitor_enter(this);
             try{
                this.wait();
                _monitor_exit(this);
                this.d = SystemClock.elapsedRealtime();
                this.getName();
             }catch(java.lang.InterruptedException e0){
             }
          }else {
             l1 = l;
          }
          Thread.sleep(this.b());
       }
       return;
    }
}
