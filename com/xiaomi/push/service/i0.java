package com.xiaomi.push.service.i0;
import android.os.SystemClock;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.xiaomi.push.service.i0$c;
import com.xiaomi.push.service.i0$a;
import java.lang.StringBuilder;
import rs8.c;
import com.xiaomi.push.service.i0$c$a;
import com.xiaomi.push.service.i0$b;
import java.lang.Thread;
import java.util.concurrent.RejectedExecutionException;
import com.xiaomi.push.service.XMPushService$j;
import java.lang.IllegalArgumentException;
import com.xiaomi.push.service.i0$d;
import java.lang.IllegalStateException;

public class i0	// class@001176
{
    public final i0$c a;
    public final i0$a b;
    public static long c;
    public static long d;
    public static long e;

    static {
       long l = 0;
       if (SystemClock.elapsedRealtime() - l > 0) {
          l = SystemClock.elapsedRealtime();
       }
       i0.c = l;
       i0.d = l;
    }
    public void i0(){
       super(false);
    }
    public void i0(String p0){
       super(p0, false);
    }
    public void i0(String p0,boolean p1){
       super();
       Objects.requireNonNull(p0, "name == null");
       i0$c uoc = new i0$c(p0, p1);
       this.a = uoc;
       this.b = new i0$a(uoc);
    }
    public void i0(boolean p0){
       super("Timer-"+i0.i(), p0);
    }
    public static synchronized long a(){
       _monitor_enter(i0.class);
       long l = SystemClock.elapsedRealtime();
       long d = i0.d;
       if (l - d > 0) {
          i0.c = i0.c + (l - d);
       }
       i0.d = l;
       _monitor_exit(i0.class);
       return i0.c;
    }
    public static synchronized long i(){
       _monitor_enter(i0.class);
       long e = i0.e;
       i0.e = 1 + e;
       _monitor_exit(i0.class);
       return e;
    }
    public void b(){
       c.l("quit. finalizer:"+this.b);
       this.a.b();
    }
    public void c(int p0){
       i0 ta = this.a;
       _monitor_enter(ta);
       i0$c.a(this.a).e(p0);
       _monitor_exit(ta);
    }
    public void d(int p0,i0$b p1){
       i0 ta = this.a;
       _monitor_enter(ta);
       i0$c.a(this.a).f(p0, p1);
       _monitor_exit(ta);
    }
    public void e(i0$b p0){
       if (c.a() >= 1 || Thread.currentThread() == this.a) {
          p0.run();
          return;
       }else {
          c.u("run job outside job job thread");
          throw new RejectedExecutionException("Run job outside job thread");
       }
    }
    public void f(i0$b p0,long p1){
       if (p1 - null < 0) {
          throw new IllegalArgumentException("delay < 0: "+p1);
       }
       this.k(p0, p1);
       return;
    }
    public boolean g(){
       return this.a.e();
    }
    public boolean h(int p0){
       i0 ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return i0$c.a(this.a).i(p0);
    }
    public void j(){
       i0 ta = this.a;
       _monitor_enter(ta);
       i0$c.a(this.a).d();
       _monitor_exit(ta);
    }
    public final void k(i0$b p0,long p1){
       i0 ta = this.a;
       _monitor_enter(ta);
       if (i0$c.f(this.a)) {
          throw new IllegalStateException("Timer was canceled");
       }
       p1 = p1 + i0.a();
       if (p1 - null < 0) {
          throw new IllegalArgumentException("Illegal delay to start the TimerTask: "+p1);
       }
       i0$d uod = new i0$d();
       uod.e = p0.b;
       uod.d = p0;
       uod.c = p1;
       i0$c.c(this.a, uod);
       _monitor_exit(ta);
       return;
    }
}
