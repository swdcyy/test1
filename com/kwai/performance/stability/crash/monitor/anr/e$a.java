package com.kwai.performance.stability.crash.monitor.anr.e$a;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.anr.e$a$a;
import android.os.Looper;
import android.os.Message;
import java.lang.System;
import android.os.Handler;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.e$b;

public class e$a extends Thread	// class@0011c7
{
    public Handler b;
    public int c;
    public int d;
    public int e;
    public Message f;
    public e$b g;
    public AnrMonitorConfig h;

    public void e$a(AnrMonitorConfig p0){
       super();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.setName("AnrSyncBarrierCheck");
       this.h = p0;
       this.b = new e$a$a(this, Looper.getMainLooper());
    }
    public final boolean a(Message p0){
       p0.getWhen();
       Message arg1 = p0.arg1;
       System.currentTimeMillis();
       int i = 0;
       while (true) {
          if (i >= this.h.syncBarrierCheckTimes) {
             return false;
          }
          if (arg1 != this.b()) {
             break ;
          }else {
             Message message = this.b.obtainMessage(2);
             if (Build$VERSION.SDK_INT >= 22) {
                message.setAsynchronous(true);
             }
             Message message1 = this.b.obtainMessage(true);
             this.b.sendMessage(message);
             e$a tb = this.b;
             try{
                tb.sendMessage(message1);
                Thread.sleep((long)this.h.syncBarrierCheckSleep);
             }catch(java.lang.InterruptedException e3){
                StringBuilder str = "checkSyncBarrier\(\) sleep error, "+e3;
             }
             if (this.c >= this.h.syncBarrierCheckThreshold) {
                p0.getWhen();
                System.currentTimeMillis();
                return true;
             }else {
                i = i + 1;
             }
          }
       }
       return false;
    }
    public final int b(){
       return this.d;
    }
    public void run(){
       e$a tf = this.f;
       while (tf != null) {
          int i = this.e + 1;
          this.e = i;
          if (this.a(tf)) {
             e$a tg = this.g;
             if (tg != null) {
                tg.a(tf);
             }
          }
          if (tf == this.f) {
             this.f = null;
             break ;
          }
          _monitor_exit(this);
       }
       _monitor_enter(this);
       try{
          this.wait();
          goto label_0025 ;
       }catch(java.lang.InterruptedException e0){
       }
    }
}
