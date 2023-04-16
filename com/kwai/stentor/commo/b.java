package com.kwai.stentor.commo.b;
import com.kwai.stentor.commo.a;
import java.lang.String;
import xt7.b;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.stentor.commo.LogListener$StentorLogLevel;
import java.lang.Runnable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class b extends a	// class@00190b
{
    public HandlerThread h;
    public Handler i;
    public Runnable j;

    public void b(String p0){
       super(p0);
       this.j = new b(this);
    }
    public void destroy(){
       this.c.lock();
       this.f("release", LogListener$StentorLogLevel.DEBUG);
       b ti = this.i;
       if (ti != null) {
          ti.removeCallbacks(this.j);
          this.i = null;
       }
       ti = this.h;
       if (ti != null) {
          ti.quit();
          this.h = null;
       }
       this.c.unlock();
       return;
    }
    public void e(int p0,int p1){
       this.c.lock();
       if (this.h == null) {
          HandlerThread handlerThrea = new HandlerThread("StentorTimerHT");
          this.h = handlerThrea;
          handlerThrea.start();
          this.i = new Handler(this.h.getLooper());
       }
       this.i.removeCallbacks(this.j);
       this.f("startTime", LogListener$StentorLogLevel.DEBUG);
       this.i.postDelayed(this.j, (long)(this.d * 1000));
       this.c.unlock();
       return;
    }
    public void stopTimer(){
       this.c.lock();
       this.f("stopTimer", LogListener$StentorLogLevel.DEBUG);
       b ti = this.i;
       if (ti != null) {
          ti.removeCallbacks(this.j);
       }
       this.c.unlock();
       return;
    }
}
