package com.yxcorp.gifshow.util.audiorecord.b;
import java.lang.Runnable;
import android.os.Handler;
import com.yxcorp.gifshow.util.audiorecord.b$b;
import java.lang.Object;
import com.yxcorp.gifshow.util.audiorecord.b$a;
import java.lang.Thread;
import java.lang.String;
import java.lang.System;
import java.lang.Math;
import android.os.Looper;
import java.util.Objects;
import nnc.e;

public class b implements Runnable	// class@001f52
{
    public Handler b;
    public b$b c;
    public long d;
    public long e;
    public long f;
    public Object g;
    public boolean h;
    public boolean i;
    public Thread j;
    public boolean k;
    public Runnable l;

    public void b(Handler p0,b$b p1){
       super();
       this.d = -1;
       this.e = 0;
       this.f = -1;
       this.g = new Object();
       this.k = true;
       this.l = new b$a(this);
       this.b = p0;
       this.c = p1;
    }
    public void a(){
       if (this.h == null && this.j == null) {
          this.h = true;
          Thread thread = new Thread(this, "audio-timer");
          this.j = thread;
          thread.start();
       }
       return;
    }
    public final void b(){
       long l = System.currentTimeMillis() - this.d;
       b tf = this.f;
       if (tf - null >= 0) {
          long l1 = Math.min(tf, l);
          this.e = l1;
          if (l1 - this.f >= 0) {
             this.stop();
             return;
          }
       }
       this.e = l;
       return;
    }
    public void run(){
       b tg;
       this.d = System.currentTimeMillis();
       while (this.h != null) {
          this.b();
          tg = this.g;
          try{
             _monitor_enter(tg);
             if (this.i != null) {
                this.g.wait();
             }else {
                this.g.wait(33);
             }
             _monitor_exit(e0);
             this.b();
             if (this.h != null && this.i == null) {
                tg = this.g;
                _monitor_enter(tg);
                try{
                   while (this.h != null && this.k == null) {
                      this.g.wait();
                   }
                   _monitor_exit(tg);
                   if (Looper.myLooper() == this.b.getLooper()) {
                      this.l.run();
                   }else {
                      this.b.post(this.l);
                   }
                }catch(java.lang.InterruptedException e0){
                }
             }
          }catch(java.lang.InterruptedException e0){
          }
       }
       tg = this.c;
       if (tg != null) {
          tg.b();
       }
       return;
    }
    public void stop(){
       this.h = false;
       this.i = false;
       b tg = this.g;
       _monitor_enter(tg);
       this.g.notify();
       _monitor_exit(tg);
       if (this.c != null) {
          if (Looper.myLooper() == this.b.getLooper()) {
             this.c.onStop();
          }else {
             b tc = this.c;
             Objects.requireNonNull(tc);
             this.b.post(new e(tc));
          }
       }
       return;
    }
}
