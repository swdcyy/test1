package ftd.p0;
import java.lang.Runnable;
import ftd.h1;
import ftd.g1;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Long;
import java.lang.Thread;
import java.lang.System;
import ftd.j3;
import ftd.k3;
import java.util.concurrent.locks.LockSupport;
import ftd.c1;
import ftd.f3;
import usd.q;

public final class p0 extends h1 implements Runnable	// class@001667
{
    public static Thread _thread;
    public static int debugStatus;
    public static final long h;
    public static final p0 i;

    static {
       Long longx;
       p0 op0 = new p0();
       p0.i = op0;
       g1.h0(op0, false, 1, null);
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       try{
          int i = 1000;
          longx = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", i);
       }catch(java.lang.SecurityException e0){
          longx = Long.valueOf(longx);
       }
       p0.h = e0.toNanos(longx.longValue());
    }
    public void p0(){
       super();
    }
    public static void G0(){
    }
    public synchronized final void H0(){
       if (!this.L0()) {
          return;
       }
       p0.debugStatus = 3;
       this.A0();
       this.notifyAll();
       return;
    }
    public synchronized final Thread I0(){
       Thread _thread = p0._thread;
       if (_thread != null) {
       }else {
          _thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
          p0._thread = _thread;
          _thread.setDaemon(true);
          _thread.start();
       }
       return _thread;
    }
    public synchronized final void J0(){
       p0.debugStatus = 0;
       this.I0();
       while (!p0.debugStatus) {
          this.wait();
       }
       return;
    }
    public final boolean L0(){
       boolean debugStatus = p0.debugStatus;
       debugStatus = (debugStatus == 2 || debugStatus == 3)? true: false;
       return debugStatus;
    }
    public final boolean M0(){
       boolean b = (p0._thread != null)? true: false;
       return b;
    }
    public synchronized final boolean N0(){
       if (this.L0()) {
          return false;
       }
       p0.debugStatus = 1;
       this.notifyAll();
       return 1;
    }
    public synchronized final void O0(long p0){
       long l = System.currentTimeMillis() + p0;
       if (!this.L0()) {
          p0.debugStatus = 2;
       }
       while (p0.debugStatus != 3 && p0._thread != null) {
          Thread _thread = p0._thread;
          if (_thread != null) {
             j3 oj3 = k3.b();
             if (oj3 != null) {
                oj3.h(_thread);
             }else {
                LockSupport.unpark(_thread);
             }
          }
          long l1 = l - System.currentTimeMillis();
          if (l1 <= 0) {
             break ;
          }
          this.wait(p0);
       }
       p0.debugStatus = 0;
       return;
    }
    public c1 k(long p0,Runnable p1){
       return this.D0(p0, p1);
    }
    public Thread p0(){
       Thread _thread = p0._thread;
       if (_thread != null) {
       }else {
          _thread = this.I0();
       }
       return _thread;
    }
    public void run(){
       f3.b.d(this);
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.d();
       }
       Thread thread = null;
       if (!this.N0()) {
          p0._thread = thread;
          this.H0();
          oj3 = k3.b();
          if (oj3 != null) {
             oj3.f();
          }
          if (!this.i0()) {
             this.p0();
          }
          return;
       }else {
          long l = Long.MAX_VALUE;
          while (true) {
             Thread.interrupted();
             long l1 = this.l0();
             boolean b = false;
             if (!l1 - Long.MAX_VALUE) {
                j3 oj31 = k3.b();
                long l2 = (oj31 != null)? oj31.a(): System.nanoTime();
                if (!l - Long.MAX_VALUE) {
                   l = p0.h + l2;
                }
                l2 = l - l2;
                if (l2 - b <= 0) {
                   p0._thread = thread;
                   this.H0();
                   oj3 = k3.b();
                   if (oj3 != null) {
                      oj3.f();
                   }
                   if (!this.i0()) {
                      this.p0();
                      break ;
                   }
                   break ;
                }else {
                   l1 = q.v(l1, l2);
                label_007a :
                   if (l1 - b > 0) {
                      if (this.L0()) {
                         p0._thread = thread;
                         this.H0();
                         oj3 = k3.b();
                         if (oj3 != null) {
                            oj3.f();
                         }
                         if (!this.i0()) {
                            this.p0();
                         }
                         return;
                      }else {
                         j3 oj32 = k3.b();
                         if (oj32 != null) {
                            oj32.c(this, l1);
                         }else {
                            LockSupport.parkNanos(this, l1);
                         }
                      }
                   }
                }
             }else {
                l = Long.MAX_VALUE;
                goto label_007a ;
             }
          }
          return;
       }
    }
}
