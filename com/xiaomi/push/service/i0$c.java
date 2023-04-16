package com.xiaomi.push.service.i0$c;
import java.lang.Thread;
import java.lang.String;
import com.xiaomi.push.service.i0$c$a;
import ys8.c1;
import com.xiaomi.push.service.i0$d;
import java.lang.Object;
import android.os.SystemClock;
import com.xiaomi.push.service.i0;
import java.lang.Runnable;

public final class i0$c extends Thread	// class@001174
{
    public long b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public i0$c$a g;

    public void i0$c(String p0,boolean p1){
       super();
       this.b = 0;
       this.c = false;
       this.d = 50;
       this.g = new i0$c$a(null);
       this.setName(p0);
       this.setDaemon(p1);
       this.start();
    }
    public static i0$c$a a(i0$c p0){
       return p0.g;
    }
    public static void c(i0$c p0,i0$d p1){
       p0.d(p1);
    }
    public static boolean f(i0$c p0){
       return p0.e;
    }
    public static boolean g(i0$c p0,boolean p1){
       p0.f = p1;
       return p1;
    }
    public synchronized void b(){
       this.e = true;
       this.g.d();
       this.notify();
    }
    public final void d(i0$d p0){
       this.g.g(p0);
       this.notify();
    }
    public boolean e(){
       boolean b = (this.c != null && (SystemClock.uptimeMillis() - this.b) - 0x927c0 > 0)? true: false;
       return b;
    }
    public void run(){
       while (true) {
          _monitor_enter(this);
          if (this.e != null) {
             _monitor_exit(this);
             return;
          }else if(this.g.h()){
             if (this.f != null) {
                break ;
             }else {
                this.wait();
             }
          }else {
             long l = i0.a();
             i0$d uod = this.g.c();
             i0$d a = uod.a;
             _monitor_enter(a);
             if (uod.b != null) {
                this.g.k(0);
                _monitor_exit(a);
             }else {
                long l1 = uod.c - l;
                _monitor_exit(a);
                l = 50;
                a = null;
                if (l1 - a > 0) {
                   i0$c td = this.d;
                   if (l1 - td > 0) {
                      l1 = td;
                   }
                   long l2 = td + l;
                   this.d = l2;
                   l = 500;
                   if (l2 - l > 0) {
                      this.d = l;
                   }
                   this.wait(l1);
                }else {
                   this.d = l;
                   i0$d a1 = uod.a;
                   _monitor_enter(a1);
                   int i = (this.g.c().c - uod.c)? i0$c$a.a(this.g, uod): null;
                   if (uod.b != null) {
                      i0$c tg = this.g;
                      tg.k(i0$c$a.a(tg, uod));
                      _monitor_exit(a1);
                   }else {
                      uod.a(uod.c);
                      this.g.k(i);
                      uod.c = a;
                      _monitor_exit(a1);
                      _monitor_exit(this);
                      this.b = SystemClock.uptimeMillis();
                      this.c = true;
                      uod.d.run();
                      this.c = false;
                   }
                }
             }
          }
          _monitor_exit(this);
       }
       _monitor_exit(this);
       return;
    }
}
